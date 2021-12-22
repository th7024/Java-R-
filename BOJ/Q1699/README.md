# [1699] 제곱수의 합

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

public class Q1699 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int num = Integer.parseInt(br.readLine());
		int[] numlist=new int[num+2];
		for(int i=1;i<=num;i++) {
			for(int j=1;j*j<=i;j++) {
				if(numlist[i]>numlist[i-j*j]+1||numlist[i]==0) {
					numlist[i]=numlist[i-j*j]+1;
				}
			}
		}
		bw.write(numlist[num]+"\n");
		br.close();
		bw.flush();
		bw.close();

	}

}

```

## 문제풀이

숫자 num이 주어지면 제곱수로 구할 수 있는 경우의수 중 최소인 경우를 푸는 문제이다.

numlist의 i위치에 제곱수를 뺀 위치에 있는 값 즉 i-j*j 값에 +1를 해준 값보다 큰 경우 혹은 numlist[i]가 0인 경우(초기상태)에 numlist[i]=numlist[i-j*j]+1;을 넣어준다. +1을 해주는 이유는 제곱수를 빼주었기 때문에 그 경우의 수가 하나 증가한 것이다. 

7의 경우에는 

횟수가 가장 작은 경우는 7-4(2*2) = 3(2회) +1 총 3회이다. 

7에서 제곱수인 4를 빼주고 numlist[3]의 위치에 있는 값에 +1를 해준 값이 나온다.