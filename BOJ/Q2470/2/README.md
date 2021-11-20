# [2470] 두 용액

## 분류
> 정렬
>
> 이분 탐색
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

public class Q2470 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) {
			arr[i]=Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		int s=0,e=N-1,min=0,max=0,ans=Integer.MAX_VALUE;
		while(s<e) {
			int c = arr[s] + arr[e];
			if( Math.abs(c)<ans) {
				min = arr[s];
				max = arr[e];
				ans =  Math.abs(c);
			}
			if(c>0) e--;
			else s++;
			
		}
		System.out.println(min +" " +max);
	}
}

```

## 문제풀이

배열에 있는 수 중에 두 숫자를 더해서 0에 가깝게 만드는 숫자를 구하는 문제이다. 시간제한이 1초이기 때문에 O(N)으로 풀어야한다.

배열의 크기만큼 숫자를 입력받고 오름차순으로 정렬해 두 인덱스 씩 비교해 0이란 가까운 숫자를 찾아나가면 된다.

기존의 투 포인터 문제는 같은 위치에서 시작했지만 이건 큰 수와 작은 수를 더해서 0에 가까운 수를 찾아주면 된다.

때문에 s의 시작위치는 0번째 인덱스를 E의 시작위치는 배열의 끝인 N-1의 위치로 시작하였다.

두 숫자를 더한 값을 C에 담아주었고, C의 절대값이 최소값보다 작은 경우 min,max,ans를 초기화 해주었다.

그 다음 인덱스의 위치를 이동하여야 하는데,  C의 값이 0보다 크다면 절대값(arr[s]) < 절대값(arr[e]) 이기 때문에 e를 줄여 0에 다시 연산을 진행한다.

0보다 큰 경우가 아니라면 s를 증가시켜 연산을 진행한다.

