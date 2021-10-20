# [11718] 그대로 출력하기

## 분류
> 구현
>
> 문자열

## 코드
```java
import java.util.Scanner;

public class Q11718 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in); 
		
		while(sc.hasNext()) {
			String str = sc.nextLine();
			
			System.out.println(str);
		}
		
		
		
	}
}

```

## 문제풀이

hasNext()를 이용해 Scanner에  다음 입력값이 존재한다면 반복문이 진행되도록 설정하였다. 반복문 안에서 입력과 출력을 담당해주었다.