# [1149] RGB거리

## 분류
> 구현

## 코드
```java
import java.util.Scanner;
public class Q2441 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i=0;i<n;i++) {
			for(int z=0;z<i;z++) {
				System.out.print(' ');
			}
			for(int j=i;j<n;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

```

## 문제풀이

N을 입력받고 피라미드를 출력하는 문제이다.

5을 입력했을 때

```
*****
 ****
  ***
   **
    *
```

이런식으로 공백 피라미드를 출력해주고 그 다음 N부터 1까지 별을 출력해주면 된다.

코드 구현은 다음과 같다. 반복문을 3개 만들고

1번째 for문은 개행, 2번째 for문은 빈 피라미드를 3번째 피라미드는 별을 출력한다. 

공백 피라미드는 0부터 n-1까지 출력되어야 하기 때문에 초기값을 0으로 설정해주고 i만큼 돌게 설정해주었다.

피라미드는 n부터 1까지 돌아야하기 때문에 i부터 n까지 *을 출력해주었다.