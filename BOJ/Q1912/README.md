# [1912] 연속합

## 분류
> 다이나믹 프로그래밍

## 코드
```java
import java.util.*;
public class Q1912 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N+1];
		int[] dp = new int[N+1];
		for(int i=1;i<=N;i++) {
			arr[i]=sc.nextInt();
		}
		int max =Integer.MIN_VALUE;
		for(int i=1;i<=N;i++) {
			dp[i]=Math.max(dp[i-1]+arr[i], arr[i]);
			
			if(max<dp[i]) {
				max=dp[i];
			}
		}
		System.out.print(max);
	}
}

```

## 문제풀이

N개의 정수를 입력하고 연속된 몇 개의 수를 골라 가장 큰 합을 구하는 문제이다.<br>
arr배열에 정수를 입력받고 최대값을 구하기 위한 변수 dp를 선언하였다.<br>
점화식은 현재 값과 그 직전 값(dp에 저장되어 있는 값 + 현재값)을 비교하여 더 큰 값을 dp에 넣어준다.<br>
만약 직전 값이 더 크다고 하면 그 값을 dp에 넣어주고 연속합이 이어지게 되는 것이다.<br>
현재 i값이 더 크다면 dp에 i값을 넣어주고 다시 연속합을 구하게 된다.<br>
최대값을 구하기 위한 변수max를 선언하고 dp[i]값과 비교하여 최대값을 구해준다.<br>
10<br>
arr          0 10 -4 3   1    5   6  -35 12 21  -1<br>
result     0 10   6 9 10  15 21   -6   12 33 32 <br><br>

10<br>
arr          0 2 1 -4 3 4 -4 6   5 -5   1<br>
result     0 2 3 -1 3 7   3 9 14    9 10<br><br>

점화식 : dp[i] = max(dp[i-1] + arr[i] / arr[i])<br>