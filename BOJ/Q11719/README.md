# [11719] 그대로 출력하기2

## 분류
> 구현
>
> 문자열

## 코드
```java
import java.util.Scanner;

public class Q11719 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str;
		while(sc.hasNext()) {
			str = sc.nextLine();
			System.out.println(str);
		}
		

	}

}

```

## 문제풀이

말 그대로 입력 받은대로 출력하는 문제이다. 

100줄의 입력을 받을 수 있는데 for문을 통해 100번 돌린경우 입력 횟수가 100번보다 작을 때 런타임에러가 발생한다. 

때문에 스캐너의 hasNext()를 이용해 입력이 있을 때까지만 입력을 받아준다.