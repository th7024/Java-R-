# [1094] 01타일

## 분류
> 다이나믹 프로그래밍

## 코드
```java
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q1904 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		if(N>2) {
			int num1 = 1;
			int num2 = 2;
			int ans = 0;
			for(int i= 2 ;i<N;i++) {
				ans = (num1+num2)%15746;
				num1 = num2;
				num2 = ans;
			}
			bw.write(ans+"\n");
		}
		else {
			bw.write(N+"\n");
		}
		
		br.close();
		bw.flush();
		bw.close();

	}

}

```

## 문제풀이

00 타일과 1타일로 만들 수 있는 타일의 개수를 구하는 문제이다. 

N이 1일 때는 1, N이 2일 때는 00, 11 이런식으로 증가한다.

5까지 연산을 진행해보면

N = 1 -> 1

N = 2 -> 2

N = 3 -> 3

N = 4 -> 5

N = 5 -> 8

이런식으로 진행이 되는데,

N = (N-1) + (N-2)인 점화식이 나온다.

때문에 N을 입력받고 N이 2보다 크다면 반복문을 통해 개수를 구해주면 된다. 