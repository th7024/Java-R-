# [2230] 수 고르기

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

public class Q2230 {
	static int[] arr;
	static int N, M,min=Integer.MAX_VALUE;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		arr = new int[N];
		for(int i=0;i<N;i++) {
			arr[i]=Integer.parseInt(br.readLine());
		}
		Arrays.sort(arr);
		int s = 0, e=1;
		while(s<N) {
			int num = arr[e]-arr[s];
			if(num>=M) {
				if(num<min) min = num;
				s++;
			}
			else {
				if(e==N-1) s++;
				else e++;
			}
		}
		System.out.println(min);

	}

}

```

## 문제풀이

N개의 정수로 이루어진 수열 A[1], A[2], …, A[N]이 있다. 이 수열에서 두 수를 골랐을 때(같은 수일 수도 있다), 그 차이가 M 이상이면서 제일 작은 경우를 구하는 프로그램을 작성하시오.

예를 들어 수열이 {1, 2, 3, 4, 5}라고 하자. 만약 M = 3일 경우, 1 4, 1 5, 2 5를 골랐을 때 그 차이가 M 이상이 된다. 이 중에서 차이가 가장 작은 경우는 1 4나 2 5를 골랐을 때의 3이 된다.

이 문제는 투 포인터로 풀면 쉬운 문제이다. 그게 아니면 시간초과가 발생할거 같은 느낌...?

배열을 입력받고 투 포인터 정렬을 하기 위해 오름차순으로 정렬해주었다.  

정렬을 하고 난 후 시작 인덱스를 나타내는 s와 끝 인덱스를 나타내는 e를 선언하고 s가 N보다 작을 동안 반복문을 돌려준다.

arr[e] - arr[s]의 값을 num이라는 변수에 저장하고 num이 min과 같거나 min보다 크다면 min에 num을 저장해준다. 

그게 아니라면 e를 증가시켜 주는데 e가 마지막 인덱스에 위치한다면 s를 증가시켜 준다.