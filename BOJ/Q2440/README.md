# [1149] RGB거리

## 분류
> 구현

## 코드
```java
import java.util.Scanner;
public class Q2440 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		for(int i=0;i<N;i++) {
			for(int j=i;j<N;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

```

## 문제풀이

N을 입력받고 N부터 1까지 차례대로 별을 출력하는 문제이다.

5를 입력한 경우

```
*****
****
***
**
*
```

이런 식으로 출력된다.

코드는 이중 for문으로 구현하였고, 첫번째 for문은 개행을 두번째 for문은 별을 담당하였다. 

별의 개수는 개행이 될 때  마다 하나씩 줄어들기 때문에 i부터 N만큼 출력시켜 주었다.