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
