# [1788] 피보나치 수의 확장

## 분류
> 수학 
>
> 다이나믹 프로그래밍

## 코드
```java
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

public class Q1788 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		if(n>0)bw.write("1\n");
		else if(n<0) {
			if(n%2==0)
				bw.write("-1\n");
			else
			bw.write("1\n");
		}
		else bw.write("0\n");
		n = Math.abs(n);
		if(n!=0) {
			int [] dp = new int[n+1];
			dp[0]=0;dp[1]=1;
			for(int i=2;i<=n;i++) {
				dp[i] = (dp[i-2]+dp[i-1])%1000000000;
			}
			bw.write(dp[n]+"\n");
		}
		else bw.write("0\n");
		
		br.close();
		bw.flush();
		bw.close();
	}

}

```

## 문제풀이

피보나치 수를 음수 범위까지 확장하여 구하는 문제이다. 

숫자 n을 입력받고 n 피보나치 값을 구하면 되는데, F(n)(피보나치값)이 음수라면 -1를 0이라면 0을 양수라면 1를 출력한다.

다음줄에는 F(n)의 절대값을 출력해준다. 

F(n)의 음수양수 판별의 경우 n이 양수인 경우와 0인 경우에는 그대로 출력해주면 되지만, 음수일 때를 고려해주어야 한다.

n이 음수라면 n이 짝수인지 홀수인지에 따라 달라진다. n이 짝수라면 F(n)값이 음수이고, 홀수이면 F(n)값이 양수이다.

피보나치 수를 구하는 것은 원래 구하는 방식과 동일하다. 

배열을 선언하고 n의 절대값만큼 피보나치수를 구해주면 된다.

