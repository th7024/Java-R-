# [14495] 피보나치 비스무리한 수열

## 분류
> 다이나믹 프로그래밍

## 코드
```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Q14495 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		if(n<4) System.out.println(1);
		else {
			BigInteger[] arr = new BigInteger[n+1];
			arr[1]=arr[2]=arr[3]=BigInteger.ONE;
		for(int i=4;i<=n;i++) {
			arr[i]=arr[i-1].add(arr[i-3]);
		}
		System.out.println(arr[n]);
		
		}
		br.close();
	}

}
```

## 문제풀이

피보나치 수랑 비슷한 수이다. 기존의 피보나치 수는 i-1 + i-2를 더해 피보나치수를 만들지만 이 문제는  i-1과 i-3을 더해 피보나치수 비슷한 수를 구하는 것이다.

때문에 피보나치수를 저장할 배열 arr을 선언하고 정수 n을 입력받는다.

 arr[1],[2],[3] 모두 1로 초기화를 해주고 4부터 반복문을 시작해 n번째 피보나치수를 구해준다.