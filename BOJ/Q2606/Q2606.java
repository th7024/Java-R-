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

