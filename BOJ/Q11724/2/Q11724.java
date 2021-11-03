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
