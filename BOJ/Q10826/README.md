# [10826] 피보나치 수 4

## 분류
> 다이나믹 프로그래밍
>
> 임의 정밀도 / 큰 수 연산

## 코드
```java
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

public class Q10826 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		BigInteger pn = BigInteger.ZERO;
		BigInteger nn = BigInteger.ONE;
		BigInteger ans = BigInteger.ZERO;
		for(int i=2;i<=n;i++) {
			ans= pn.add(nn);
			pn = nn;
			nn = ans;
		}
		if(n<2)bw.write(n+"\n");
		else bw.write(ans+"\n");
		br.close();
		bw.flush();
		bw.close();

	}

}

```

## 문제풀이

n번째 피보나치 수를 구하는 문제이다. 피보나치 수란 0 과 1로 시작해서 앞 두자리 수의 합을 구해 계속 증가하는 수이다.

숫자 n을 입력받고 n번째 피보나치 수를 구해야 한다. n의 범위가 10000까지라서 int가 아닌 BigInteger로 자료형을 선언해 구현해주었다.