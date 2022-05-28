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

public class Q1929_1 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int[] arr = new int[M+1];
		arr[0]=arr[1]=1;
		for(int i = 1;i<=M;i++) {
			if(arr[i]==0) {
				for(int j = i*2;j<=M;j+=i) {
					arr[j]=1;
				}
			}
		}
		for(int i=N;i<=M;i++) {
			if(arr[i]==0) bw.write(i+"\n");
		}
		br.close();
		bw.flush();
		bw.close();
	}
}

```

## 문제풀이

N과 M을 입력받고 N~M사이에 있는 소수를 출력하는 문제이다.

arr[i]가 0일 때 i의 배수를 반복문을 통해 다 제거해준다.

그렇게 M까지 작업을 마치고 나서 arr[i]=0인 수를 출력해준다.