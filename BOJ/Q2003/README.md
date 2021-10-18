# [2003] 수들의 합 2

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

public class Q2003 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int sum = Integer.parseInt(st.nextToken());
		int cnt=0;
		int[] arr = new int[N];
		int sidx=0,eidx=0;
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) {
			arr[i]=Integer.parseInt(st.nextToken());
		}
		while(sidx<=N-1) {
			int ssum=0;
			for(int i=sidx;i<=eidx;i++) {
				ssum += arr[i];
			}
			if(ssum==sum) {
				cnt++;
				if(eidx<N-1)
					eidx++;
				else sidx++;
			}
			else if(ssum<sum) {
				if(eidx<N-1)
					eidx++;
				else sidx++;
			}
			else sidx++;
		}
		System.out.println(cnt);
	}
	

}

```

## 문제풀이

N개로 이루어진 1차원 배열이 존재할 때 부분합이 sum인 값이 몇개가 존재하는지 구하는 문제이다.

sidx 와 eidx를 선언해 sidx부터 eidx의 범위에 있는 좌표들의 합을 구해주며 연산을 하였다.

경우의 수는 총 3가지가 존재하는데 각각의 경우의 수마다 다르게 작동한다.

- sidx~eidx의 합이 sum인 경우 :  cnt값을 증가시키고 eidx를 증가시킨다.
- sidx~eidx의 합이 sum보다 큰 경우 :  sidx를 증가시킨다.(더 작은 범위를 조사하기 위해)
- sidx~eidx의 합이 sum보다 작은 경우 : eidx를 증가시킨다.

eidx를 증가시킬 때 고려해야하는 사항이 있는데 배열의 크기가 N이기 때문에 인덱스는 N-1이 최대값이다. 때문에 eidx를 증가시킬 때는 N-1보다 작은 경우에만 증가를 시켜야하고 N-1과 같거나 큰 경우에는 sidx를 증가시킨다.

값을 비교하는 것은 몇번 돌지 모르기 때문에 while문을 통해 구현하였고, while조건식에서 sidx가 N-1보다 같을 때까지 돌 수 있도록 설정하였기 때문에 sidx에 대한 조건은 따로 잡지 않았다.

