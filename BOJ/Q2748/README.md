# [1149] RGB거리

## 분류
> 수학
> 다이나믹 프로그래밍

## 코드
```java
import java.util.*;
public class Q2748 {
	static int N;
	static long[] arr;
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		if(N==0||N==1) {
			System.out.print(N);
		}
		else {
		arr = new long[N+1];
		arr[0]=0;
		arr[1]=1;
		for(int i=2;i<=N;i++) {
			arr[i] = arr[i-2] + arr[i-1];
		}
			System.out.print(arr[N]);
		}
		
	}

}

```

## 문제풀이

기본적인 피보나치 수 문제이다.<br>
N을 입력받고 N번째 피보나치 수를 구하는 문제이다.<br>
기본적으로 피보나치 수는 arr[i] = arr[i-2] + arr[i-1]로 구성된다.<br>
0번째 수는 0이고, 1번째 수는 1이며 그 다음부터는 위에 재귀식으로 구성된다.<br>
N번째까지의 값을 구해야 하기 때문에 배열의 크기를 N+1로 선언해준다.<br>
배열의 크기를 long으로 선언한 이유는 N이 입력될 수 있는 값이 90인데 int로는 90번째 피보나치 수의 범위를 담을 수 없다.<br>
때문에 int보다 범위가 큰 long으로 배열을 선언해주었다.