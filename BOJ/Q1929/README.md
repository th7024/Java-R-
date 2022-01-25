# [1929] 소수 구하기

## 분류
> 수학
>
> 정수론
>
> 소수 판정
>
> 에라토스테네스의 체

## 코드
```java
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q1929 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n  = Integer.parseInt(st.nextToken());
		int m  = Integer.parseInt(st.nextToken());
		int[] arr = new int[m+1];
		arr[0] = arr[1] = 1;
		for(int i = 1; i<=m/2;i++) {
			if(arr[i]==0) {
				for(int j = i*2 ; j<=m;j+=i) {
					arr[j]=1;
				}
			}
		}
		for(int i=n;i<=m;i++) {
			if(arr[i]==0)
				bw.write(i+"\n");
		}
		br.close();
		bw.flush();
		bw.close();
	}

}

```

## 문제풀이

n부터 m사이의 정수 중 소수를 판별하는 문제이다.

처음에는 이중 반복문을 통해 구현하였지만 시간초과가 떠서 에라토스테네스의 체를 이용하여 구현하였다.

에라토스테네스의 체란 배열을 만들어 2부터 해당 숫자까지 중  각 수의 배수를 없애나가는 소거형 방식으로 진행된다. 

예를 들어  i가 2인 경우 2, 4, 6, 8, 10 ... 이런식으로 수를 찾게 되고 나온 배수들은 모두 배열에서 1로 표시된다. 

이런식으로 소거가 다 끝났으면 반복문을 통해 배열의 값이 0인 경우만 출력해주면 된다.