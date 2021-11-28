# [1026] 보물

## 분류
> 수학
>
> 그리디 알고리즘
>
> 정렬

## 코드
```java
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Q1026 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		int[] arr1 = new int[N];
		Integer[] arr2 = new Integer[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) {
			arr1[i]=Integer.parseInt(st.nextToken());
		}
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) {
			arr2[i]=Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr1);
		
		Arrays.sort(arr2, Collections.reverseOrder());
		
		int sum = 0;
		for(int i=0;i<N;i++) {
			sum+= arr1[i]*arr2[i];
		}
		bw.write(sum + "\n");
		bw.flush();
		br.close();
		
		bw.close();
		
		
	}
}

```

## 문제풀이 

길이가 N인 정수 배열 A와 B가 있다. 다음과 같이 함수 S를 정의하자.

S = A[0] × B[0] + ... + A[N-1] × B[N-1]

S의 값을 가장 작게 만들기 위해 A의 수를 재배열하자. 단, B에 있는 수는 재배열하면 안 된다.

이 때 S의 최솟값을 구하는 문제이다.

S값이 최소가 되려면 가장 큰 수가 가장 작은수와 곱해지면 된다. 때문에 N의 크기를 가진 배열 두 개를 선언하고 A는 오름차순으로 B는 내림차순으로 정렬해준다. 그 다음 sum이라는 변수를 만들어 A[i]*B[i]를 진행해주면 S가 최소인 경우가 나온다.