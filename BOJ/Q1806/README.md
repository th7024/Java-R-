# [1806] 부분합

## 분류
> 두 포인터

## 코드
```java
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q1806 {
	static int N,S;
	static int[] arr;
	static int sw=0,min=Integer.MAX_VALUE,sum=0;
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		S = Integer.parseInt(st.nextToken());
		arr = new int[N];
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) arr[i] = Integer.parseInt(st.nextToken());
		
		int sidx=0,eidx=0;
		while(true) {
			if(sum>= S) {
				sum -= arr[sidx]; // sidx가 오른쪽으로 이동했다.
				min = Math.min(min, (eidx-sidx));
				sidx++;
			}
			else if(eidx==N) break;
			else sum += arr[eidx++];
		}
		if(min==Integer.MAX_VALUE)
			bw.write("0");
		else bw.write(min + "\n");
		bw.flush();
		br.close();
		bw.close();
		
	}
}

```

## 문제풀이

투포인터로 푸는 문제이지만 시간 복잡도를 고려해 연산해야 하는 문제이다. 시간제한이 1초이기 때문에 연산을 많이 애먹었던 문제이다.

```
//		while(true) {
//			int ssum = 0, len=0;	
//			for(int i =sidx;i<=eidx;i++) {
//				ssum +=arr[i];
//				len++;
//			}
//			if(ssum>=S) {
//				sw=1;
//				if(len<min) min = len;
//				if(ssum>S) sidx++;
//				else {
//					if(eidx<N-1) eidx++;
//					else sidx++;	
//				}
//			}
//			else if(ssum<S) {
//				if(eidx<N-1) eidx++;
//				else sidx++;
//				if(eidx==N-1) break;
//			}
//			else sidx++;
//		}  while - for는 시간복잡도가 너무 크기 때문에 반복문 하나로 더하기 연산을 수행해야함.
```

기존에 구현하였던 코드인데 while문 안에서 덧셈연산을 for문으로 따로 구현해 시간복잡도가 커졌다.

때문에 덧셈연산을 반복문을 사용하지 않고 while문에서 바로 구현하였다.

N크기의 수열이 주어지면 수열에서 연속되는 부분합을 구하여 합이 S이상이 되는 수 중, 길이가 가장 짧은 것을 구하는 문제이다.

먼저 배열을 입력받고 부분합을 구해야하기 때문에  부분수열의 시작 좌표를 담당하는 sidx와 끝 좌표를 담당하는 eidx를 선언하였다.

앞서 풀었던 투 포인터는 좌표 연산을 수행하는 while문 안에 부분수열의 합을 구하는 for문으로 구현하였었다.

while문은 다음과 같이 구현되었다.

만약 sum(합을 저장하는 변수)가 S보다 크거나 같다면 sidx를 이동시켜 주어야하기 때문에 sum에서 sidx에 있는 값을 빼준다.

그 후 최소값 연산을 통해 최소 경우의 수를 구해주고, sidx를 오른쪽으로 이동시켜준다. 

sum이 S보다 작은 경우에는 sum에 eidx값을 증가시켜(좌표를 오른쪽으로 이동) sum에 넣어주어야하는데,  그 전에 eidx가 N과 같은 경우 즉, 배열의 끝에 도착한 경우에는 break문을 통해 while문에서 벗어나게 한다.

조건을 sum이 S보다 큰 경우가 아닌 경우에 잡은 이유는 어차피 S보다 크거나 같지 못하면 sidx값을 줄이더라도 연산의 결과가 S가 될수 없기 때문이다.

때문에 먼저 sum이 S보다 크거나 같은지 비교하고, 아니라면  eidx값이 배열의 끝에 도달했는지 확인하고, 그 경우도 아니라면 eidx값을 증가시켜 sum에 담아준다.

