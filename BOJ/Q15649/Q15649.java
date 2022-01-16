import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;
public class Q15649 {
	static int N;
	static int M;
	static int []visit = new int[9];
	static ArrayList<Integer> ans = new ArrayList<>();
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		dfs(0);
		br.close();
		bw.close();
	}
	static void dfs(int cnt) throws IOException {
		
		if(cnt==M) {
			for(int i=0;i<M;i++) {
				bw.write(ans.get(i)+" ");
			}
			bw.write("\n");
			bw.flush();	
			//ans.clear();
			return;
		}
		
		for(int i =1 ; i<=N;i++) {
			if(visit[i]==0) {
				visit[i]=1;
				ans.add(i);
				dfs(cnt+1);
				ans.remove(cnt);
				visit[i]=0;
			}
			
		}
		
	}
}

