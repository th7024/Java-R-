# [1920] 수 찾기

## 분류
> 이분 탐색

## 코드
```java
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q1920 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		
		int[] arr1 = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			arr1[i] = Integer.parseInt(st.nextToken());
		}
		
		int M = Integer.parseInt(br.readLine());
		int[] arr2 = new int[M];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < M; i++) {
			arr2[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr1);
		
		for(int i=0;i<M;i++) {
			int tmp = arr2[i];
			int cnt=0;
			for(int j=0;j<N;j++) {
				if(tmp==arr1[j]) {
					cnt=1;
					break;
				}
			}
			if(cnt==1) bw.write("1\n");
			else bw.write("0\n");
		}

		br.close();
		bw.flush();
		bw.close();
	}
}

```

## 문제풀이

이분탐색 문제이지만 이중 반복문으로 구현했음.

배열 두개를 입력받아 두번째 배열에 있는 값이 첫번째 배열에 있는지 찾는 문제이다.

첫번째 반복문은 두번째 배열 크기만큼 돌며 tmp에 현재 배열 값을 담아준 뒤 결과를 출력할 변수 cnt를 선언해준다.

그 후 첫번째 배열을 순회하며 같은 값이 존재한다면 cnt를 1로 만들어주고 반복문을 탈출하여 cnt를 출력하였다.