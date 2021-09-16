# [1149] RGB거리

## 분류
> 그래프 이론
> 그래프 탐색
> 너비 우선 탐색
> 깊이 우선 탐색

## 코드
```java
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
public class Q2606 {
	static int[][] arr;
	static boolean[] visit;
	static int N,M,cnt=0;
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		N = Integer.parseInt(br.readLine());
		M = Integer.parseInt(br.readLine());
		arr = new int[N+1][N+1];
		visit = new boolean[N+1];
		visit[1] = true;
		for(int i=0;i<M;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			arr[a][b]=1;arr[b][a]=1;
		}
		dfs(1);
		System.out.print(cnt);		
		}
	
	static void dfs(int X) {		
		for(int j=1;j<=N;j++) {
			if(arr[X][j]==1&&!visit[j]) {
				visit[j]=true;
				cnt++;
				dfs(j);
			}
		}
	}
}


```

## 문제풀이

예를 들어 7대의 컴퓨터가 <그림 1>과 같이 네트워크 상에서 연결되어 있다고 하자. 1번 컴퓨터가 웜 바이러스에 걸리면 웜 바이러스는 2번과 5번 컴퓨터를 거쳐 3번과 6번 컴퓨터까지 전파되어 2, 3, 5, 6 네 대의 컴퓨터는 웜 바이러스에 걸리게 된다. 하지만 4번과 7번 컴퓨터는 1번 컴퓨터와 네트워크상에서 연결되어 있지 않기 때문에 영향을 받지 않는다.<br>

![zmMEZZ8ioN6rhCdHmcIT4a7](https://user-images.githubusercontent.com/50985719/133579095-7ba7f6e4-41fb-411b-bfb3-268e6434ae99.png)

어느 날 1번 컴퓨터가 웜 바이러스에 걸렸다. 컴퓨터의 수와 네트워크 상에서 서로 연결되어 있는 정보가 주어질 때, 1번 컴퓨터를 통해 웜 바이러스에 걸리게 되는 컴퓨터의 수를 출력하는 프로그램을 작성하시오.<br>

컴퓨터의 개수 N을 입력받고 간선의 개수 M을 입력받는다. 배열 arr을 만들어 1-N까지의 연결관계를 저장하고 N+1 크기의 배열 visit를 만들어 방문체크를 해준다.<br>
함수는 dfs로 구현하였고 int X(시작 V)를 받아와 1부터 N까지 반복을 돌리며 arr[X][j] 중 연결이 되어있으며(arr[X][j]==1) 아직 방문을 하지 않은 노드(!visit[j])가 존재한다면 방문체크를 해주고 컴퓨터 개수를 증가시켜준다.<br>
반복문 내에서 cnt값을 증가시켜준 이유는 1을 제외하고 감염이 되는 컴퓨터를 구해야하기 때문이다.<br>
cnt 값이 증가가 되었다면 j로 dfs함수를 호출해준다. 함수가 다 끝나면 cnt 값을 출력해주면 된다.