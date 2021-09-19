# [7576] 토마토

## 분류
> 그래프 이론
>
> 그래프 탐색
>
> 너비 우선 탐색

## 코드
```java
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
import java.util.stream.IntStream;

public class Q7576 {
	static int M,N,max=0;
	static int[][] arr;
	static boolean[][] visit;
	static Queue<Tomato> q = new LinkedList<>();
	static int[] dx = {0,0,1,-1};
	static int[] dy = {-1,1,0,0};
	
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		arr = new int [M][N];
		visit = new boolean [M][N];
		
		for(int i=0;i<M;i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0;j<N;j++) {
				arr[i][j]= Integer.parseInt(st.nextToken());
				if(arr[i][j]==1) {
					q.add(new Tomato(i,j));
					visit[i][j]=true;
				}
				else if(arr[i][j]==-1) visit[i][j]=true;
			}
		}
		bfs();
		int max=0;
		for(int i=0;i<M;i++) {
			for(int j=0;j<N;j++) {
				if(max<arr[i][j]) max = arr[i][j];
				if(visit[i][j]==false) {
					System.out.print(-1);
					return;
				}
			}
		}
		System.out.print(max-1);
		br.close();
	}
	static void bfs() {
		while(!q.isEmpty()) {
			Tomato t = q.poll();
			for(int i=0;i<4;i++) {
				int X = t.x + dx[i];
				int Y = t.y + dy[i];
				if(Y>=0&&X>=0&&Y<N&&X<M) {
					if(visit[X][Y]==false) {
						arr[X][Y]=arr[t.x][t.y]+1;
						visit[X][Y]= true;
						q.add(new Tomato(X,Y));
					}
				}
			}
		}
		
	}
	static class Tomato {
		int x, y;
		
		Tomato(int x, int y){
			this.x = x;
			this.y = y;
		}
	}
}

```

## 문제풀이

창고에 보관되는 토마토들 중에는 잘 익은 것도 있지만, 아직 익지 않은 토마토들도 있을 수 있다. 보관 후 하루가 지나면, 익은 토마토들의 인접한 곳에 있는 익지 않은 토마토들은 익은 토마토의 영향을 받아 익게 된다. 하나의 토마토의 인접한 곳은 왼쪽, 오른쪽, 앞, 뒤 네 방향에 있는 토마토를 의미한다. 대각선 방향에 있는 토마토들에게는 영향을 주지 못하며, 토마토가 혼자 저절로 익는 경우는 없다고 가정한다. 철수는 창고에 보관된 토마토들이 며칠이 지나면 다 익게 되는지, 그 최소 일수를 알고 싶어 한다.

토마토를 창고에 보관하는 격자모양의 상자들의 크기와 익은 토마토들과 익지 않은 토마토들의 정보가 주어졌을 때, 며칠이 지나면 토마토들이 모두 익는지, 그 최소 일수를 구하는 프로그램을 작성하라. 단, 상자의 일부 칸에는 토마토가 들어있지 않을 수도 있다.

토마토가 들어있지 않은 곳은 -1 들어있는 곳은 0 익은 토마토는 1로 입력을 받아주었다.

N= 6
M= 4
M * N 
4 * 6
0 0 0 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0
0 0 0 0 0 1

초반에 배열을 잘 선언해준다면 꼬이는 부분은 없다. 먼저 M*N배열을 만들고 입력을 받으면서 1을 찾아준다. 1을 찾을 때 마다 1의 좌표를 큐에 객체 형태로 담아준다. bfs에서 visit배열을 통해 아직 방문을 하지 않은 곳(false)인 경우에만 방문을 해줄 것이기 떄문에 익은 토마토(1)가 있는 부분과 토마토가 없는 부분은 visit=true로 방문을 하지 못하게 만들었다.

bfs함수 구현은 다음과 같다. 큐에서 값을 뽑아낸 후 상하좌우로 이동시켜 배열의 범위안에 들어가는지 확인한다. 범위안에 좌표가 존재한다면 해당좌표의 visit를 true로 변경해주고 arr에는 전에 온 값 +1을 해 날짜를 증가시켜준다.  그렇게 방문이 가능한 모든 좌표를 방문했다면 bfs를 종료해준다.

함수가 종료된다면 반복문을 통해 max값을 출력시켜준다. 익지 않은 토마토가 있다면 -1를 출력해주어야 하는데 그 부분은 visit를 통해 visit가 false라면 -1를 출력해 주었다. 

