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
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		M = sc.nextInt();
		input = new int[N+1][N+1];
		for(int i=0;i<M;i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			input[a][b]=1;
			input[b][a]=1;
		}
		
		for(int i=1;i<=N;i++) {
			for(int j=1;j<=N;j++) {
				if(input[i][j]==1) {
					dfs(i,j);
					cnt++;
				}
			}
		}
		System.out.println(cnt);
	}
	
	static void dfs(int i,int j) {
		input[i][j]=0;
		input[j][i]=0;
		for(int n=1;n<=N;n++) {
			if(input[j][n]==1)
				dfs(j,n);
		}
	}
}

```

## 문제풀이

배열 입력받고 방문했을 때 1인 노드가 있으면 다시 함수 호출하는 방식으로 구현하였는데, 오류가 떠서 다시 풀어야할 문제