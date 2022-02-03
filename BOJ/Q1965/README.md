# [1965] 상자넣기

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

public class Q1965 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		int [] arr = new int[n];
		int [] dp = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0;i<n;i++) {
			arr[i]=Integer.parseInt(st.nextToken());
			dp[i]=1;
		}
		int max = 1;
		for(int i=1;i<n;i++) {
			for(int j=0;j<i;j++) {
				if(arr[j]<arr[i]) {
					int sum = dp[j]+1;
					if(sum>dp[i]) dp[i]=sum;
					if(dp[i]>max) max = dp[i];
				}
			}
		}
		bw.write(max+"\n");
		br.close();
		bw.flush();
		bw.close();

	}

}

```

## 문제풀이

n개의 상자가 주어졌을 때, 한번에 넣을 수 있는 최대의 상자 개수를 출력하는 문제이다.

각 상자는 사이즈가 다른데 앞에서부터 작은 상자가 큰 상자 안에 들어간다. 

상자가 하나도 안 들어간 경우를 고려하여 dp 배열을 다 1로 초기화 해주었다. (1은 자기 자신을 의미한다.)

arr에는 상자의 사이즈가 입력되어 있는데 i번째 상자의 경우 0~i까지의 상자 사이즈를 다 비교하여 사이즈가 작은 상자가 있을 때 상자를 넣어준다.

상자가 몇개 들어있는지에 대한 정보는 dp배열이 저장한다. 

최대 상자 개수를 구해야하기 때문에 사이즈가 작은 상자가 있는 경우 dp배열을 확인해 현재 최대 값dp[i]와 새로 찾은 값 dp[j]+1를 비교해 더 큰 값을 dp배열에 담아준다.

max는 최대값을 구해야하기 때문에 하나의 반복문에서 해결하였다. 

반복문이 다 끝나면 max를 출력해준다.

