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
		BigInteger pn = BigInteger.ZERO,nn = BigInteger.ONE,sum=BigInteger.ZERO;
		BigInteger a = BigInteger.valueOf(1000000000);
		if(n>0)bw.write("1\n");
		else if(n<0) {
			if(n%2==0)
				bw.write("-1\n");
			else
			bw.write("1\n");
		}
		else bw.write("0\n");
		n = Math.abs(n);
		for(int i=2;i<=n;i++) {
			BigInteger s = pn.add(nn);
			sum = s.mod(a);
			pn = nn;
			nn = sum;
		}
		
		bw.write(sum.mod(a)+"\n");
		br.close();
		bw.flush();
		bw.close();
	}

}

```

## 문제풀이

int로 해서 풀었다가 1000000000 범위의 수를 못 잡나 해서 BigInteger로 다시 풀었지만 틀린 문제.

반례 찾아서 다시 풀어봐야함