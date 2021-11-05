# [1259] 팰린드롬수

## 분류
> 구현
>
> 문자열

## 코드
```java
import java.util.Scanner;

public class Q1259 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(true) {
			String s = sc.next();
			StringBuffer sb = new StringBuffer(s);
			String rs = sb.reverse().toString();
			
			if(s.equals("0")) {
				sc.close();
				return;
			}
			
			if(s.equals(rs)) {
				System.out.println("yes");
			}
			else {
				System.out.println("no");
			}
			
		}
		
		
	}
}

```

## 문제풀이

어떤 단어를 뒤에서부터 읽어도 똑같다면 그 단어를 팰린드롬이라고 한다. 'radar', 'sees'는 팰린드롬이다.

정수를 입력받고 그 정수가 팰린드롬수라면 yes를 아니라면 no를 출력하는 문제이다.

입력의 개수는 정해지지 않으며 0을 입력하면 프로그램이 종료된다.

정수를 입력받는 거지만 reverse함수를 사용하기 위해 문자열로 입력을 받았다. 

reverse를 통해 뒤집은 값을 변수 rs에 넣어주고 equals문을 통해 문자열 비교를 해준다.

값이 같다면 yes를 아니라면 no를 출력해주고 0이 입력되었을 때 return문을 실행시켜준다.