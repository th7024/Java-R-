# [11724] 연결 요소의 개수

## 분류
> 그래프 이론
>
> 그래프 탐색
>
> 너비 우선 탐색
>
> 깊이 우선 탐색

## 코드
```java
import java.util.Scanner;

public class Q11724 {
	static int N,M,cnt=0;
	static int[][] input;
	static boolean[] visit;
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		M = sc.nextInt();
		input = new int[N+1][N+1];
		visit = new boolean[N+1];
		for(int i=0;i<M;i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			input[a][b]=1;
			input[b][a]=1;
		}
		for(int i=1;i<=N;i++) {
			for(int j=1;j<=N;j++) {
				if(input[i][j]==1&&!visit[j]) {
					dfs(j);
					cnt++;
				}
			}
		}
		int fcnt=0;
		for(int i=1;i<=N;i++) {
			if(!visit[i]) fcnt++;
		}
		System.out.println(cnt+fcnt);
	}
	
	static void dfs(int i) {
		visit[i]=true;
		for(int n=1;n<=N;n++) {
			if(input[i][n]==1&&!visit[n]) {
				input[i][n]=0;
				input[n][i]=0;
				dfs(n);
				
			}
				
		}
	}
}
```

## 문제풀이

N개의 점과 M개의 간선을 입력 받았을 때 서로의 연결요소를 구하는 문제이다.

연결요소는 점들이 연결되어 있는 경우 하나의 연결요소로 체크해주고, 이동이 불가한 점도 하나의 연결요소로 간주한다.

점들의 연결은 2차원 배열을 통해 나타내주었다. dfs함수를 통해 해당 위치가 연결이 되어 있다면 dfs함수를 실행해주었고, 함수가 끝나면 연결요소 개수를 증가시켜주었다. 

연결요소를 구하는 문제이기 때문에 visit배열을 만들어 N개의 점 중 방문 여부를 체크해주었다. 

dfs함수에서는 i,j 중 j를 매개변수로 받았으며, j열을 행으로 삼아 j행부터 다시 검색을 실시한다. 

1-N 까지 검색을 실시하면서 i,n이 1이며 아직 n을 방문하지 않았다면 다시 함수를 호출해준다.

연결요소를 dfs함수에서 다 구했으면 아직 방문을 하지 않은 점의 개수를 구해준다.

하나의 점 역시 연결요소이기 때문이다.

연결요소를 구한 cnt와 각각의 점을 구한 fcnt를 더해 출력해주면 연결요소의 개수가 나온다.

