# [1149] 가장 큰 증가 부분 수열

## 분류
> 다이나믹 프로그래밍

## 코드
```java
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q11055 {
	static int[] arr;
	static int[] dp;
	static int N;
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		N = Integer.parseInt(br.readLine());
		arr = new int[N];
		dp = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			dp[i]=arr[i];
		}
		dp[0]=arr[0];
		for(int i=1;i<N;i++) {
			for(int j=0;j<=i;j++) {
				if(arr[j]<arr[i]) {
					dp[i]=Math.max(dp[i], dp[j]+arr[i]);
				}
			}
		}
		int max=Integer.MIN_VALUE;
		for(int i=0;i<N;i++) {
			if(max<dp[i]) max=dp[i];
		}
		bw.write(max+"\n");
		br.close();
		bw.flush();
		bw.close();
	}
}


```

## 문제풀이

N개의 수열 arr이 주어지면 가장 큰 증가 부분수열의 합을 구하는 문제이다. 증가 부분수열이란 i-n보다 i가 큰 경우 합을 더해 최대로 더해지는 수열을 말한다.

입력받는 배열 arr과 계산과정이 저장되는 dp배열을 만들고, 이중 반복문으로 연산을 진행해줬다.

첫번 째로 체크해야하는 부분은 arr[i]가 arr[j]보다 큰 경우이다. 이 경우가 만족되어야 증가하는 수열이기 때문이다.

첫번 째 경우를 만족했다면 현재 최대 부분수열이 저장되어 있는 dp[i]와 dp[j]+arr[i]값 중 큰 값을 dp[i]로 초기화 해준다. 더 큰 부분수열의 합을 찾는다면 dp[i]는 초기화 된다.

반복문이 모두 끝나면 dp배열에서 최대값을 찾은 후 출력해주면 된다.