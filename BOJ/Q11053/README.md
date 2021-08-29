# [11053] 가장 긴 증가하는 부분 수열

## 분류
> 다이나믹 프로그래밍

## 코드
```java
import java.util.*;
public class Q11053 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N+1];
		int[] dp = new int[N+1];
		int max = 0;
		for(int i=1;i<=N;i++) {
			arr[i]=sc.nextInt();
		}
		
		for(int i=0;i<=N;i++) { //선택한 값
			for(int j=0;j<=N;j++) { // 처음부터 비교
				if(arr[j]<arr[i]&&dp[i]<dp[j]+1) {
					dp[i]= dp[j]+1;
				}
				if(max<dp[i]) {
					max=dp[i];
				}
			}
		}
		System.out.print(max);
	}
}

```

## 문제풀이

수열 arr을 입력하고 가장 길게 증가하는 부분 수열을 구하는 문제이다.<br>
부분 수열은 i-1위치보다 i값이 크다면 하나씩 증가한다.<br>
이중 반복문으로 구성하였고 현재 값(i)이 j값보다 큰 경우에 dp배열의 카운트를 늘려준다.<br>
조건문에 dp[i]<dp[j]+1 를 넣은 이유는 가장 큰 값이 반복문을 도는 경우 부분수열로 이어지려면 가장 큰 dp값을 가져와야 하는데 이 조건을 넣지 않으면 마지막 dp[j]값이 들어가기 때문에 원하는 값이 나오지 않는다.<br>
배열을 N+1로 선언한 이유는 점화식을 하나만 쓰기 위해서 맨 처음 값은 0과 비교하기 위해 N+1로 선언하고 1번째 인덱스부터 값을 넣어주었다.