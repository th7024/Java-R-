# [11721] 열 개씩 끊어 출력하기

## 분류
> 구현
>
> 문자열

## 코드
```java
import java.util.*;

public class Q11721 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		char[] str = new char[100]; 
		String s = sc.next();
		for(int i=0;i<s.length();i++) {
			str[i]=s.charAt(i);
		}
		int cnt=0;
		for(int i =0;i<s.length();i++) {
			System.out.print(str[i]);
			cnt++;
			if(cnt%10==0) System.out.println();
		}
		
	}
}

```

## 문제풀이

문자열을 입력받고 10개씩 짤라서 출력하면 되는 문제이다. cnt 변수를 만들어서  cnt를 문자하나 출력할 때마다 증가시켜 10의 배수이면 개행을 시켜 출력해주었다.

