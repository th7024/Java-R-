# [2491] 수열

## 분류
> 구현
>
> 다이나믹 프로그래밍

## 코드
```java
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q2491 {

	public static void main(String[] args) throws  IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		int add = 1,sub=1;
		int max =0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i =0;i<n;i++) arr[i]=Integer.parseInt(st.nextToken());
		int a =0;
		if(n==1)bw.write("1\n");
		else
		{
			for(int i=1;i<n;i++) {
				if(arr[i-1]<=arr[i]) add++;
				else add=1;
				if(arr[i-1]>=arr[i]) sub++;
				else sub=1;
				a = (sub<add)?add:sub;
				max = (a>max)?a:max;
		}
			bw.write(max+"\n");
		}
		br.close();
		bw.flush();
		bw.close();
	}

}

```

## 문제풀이

수열이 주어졌을 때, 증가 부분수열과 감소 부분수열을 구해 가장 긴 수열의 길이를 출력하는 문제이다.

하나의 반복문에서 해결하였으며, 두개의 조건문을 이용해 해결하였다. arr[i]가 이전값보다 크다면 add를 작다면 sub를 증가시켜주었다. 예외인 경우에는 두 변수를 초기화 해주었으며, 비교가 한번 끝나면 a=라는 변수에 증가 감소 수열 중 큰 값을 담고 최대 값을 담고 있는 max와 비교해주었다. a가 max보다 더 크다면 가장 긴 길이가 바뀐것이기 때문에 max를 a로 바꾸어 줬다. 

배열의 길이가 1인 경우에는 따로 예외를 잡아주었다. 배열의 크기가 1인 경우에는 1이 가장 긴 길이이기 때문이다.