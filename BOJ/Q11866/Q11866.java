import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q11866 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		Queue <Integer> q = new LinkedList<Integer>();
		for(int i=1;i<=N;i++) {
			q.add(i);
		}
		bw.write("<");
		int cnt=0;
		
		while(q.size()!=1) {
			int n = q.poll();
			cnt++;
			if(cnt==C) {
				bw.write(n+", ");
				cnt=0;
			}
			else {
				q.offer(n);
			}
		}
		bw.write(q.poll()+">");
		bw.flush();
		br.close();
		bw.close();

	}
}
