import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q10974 {
	static int N;
	static int[] output;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		N = Integer.parseInt(br.readLine());
		
		output = new int[N];
		boolean[] visit = new boolean[N+1];
		for(int i=1;i<=N;i++) {
			visit[i]=true;
			print(visit,i,0);
			visit[i]=false;
		}
		br.close();
	}
	static void print(boolean[] visit,int num,int depth) {
		output[depth]=num;
		if(depth == N-1) {
			for(int i:output) {
				System.out.print(i+" ");
			}
			System.out.println();
			return;
		}
		for(int i=1;i<=N;i++) {
			if(visit[i]) continue;
			visit[i]=true;
			print(visit,i,depth+1);
			visit[i]=false;
		}
	}
}
