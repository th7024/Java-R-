# [11728] 배열 합치기

## 분류
> 정렬
>
> 두 포인터

## 코드
```java
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q11728 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int[] arr = new int[N+M];
		
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<arr.length;i++) {
			if(i==N) {
				st = new StringTokenizer(br.readLine());
			}
			arr[i] = Integer.parseInt(st.nextToken());
			
		}
		
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++) bw.write(arr[i] + " ");
		 bw.flush();
		 br.close();
		 bw.close();
	}
}

```

## 문제풀이

N + M 크기의 배열 arr을 선언해주고  배열 arr을 sort함수를 통해 오름차순으로 정렬해준 뒤 출력해주면 된다.