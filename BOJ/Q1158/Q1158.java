import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q1158 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Queue<Integer> q = new LinkedList<Integer>();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		for(int i=1;i<=N;i++) {
			q.add(i);
		}
		bw.write("<");
		int cnt=0;
		while(q.size()!=1) {
			int a = q.poll();
			cnt++;
			if(cnt==M) {
				bw.write(a+", ");
				cnt=0;
			}
			else {
				q.add(a);
			}
		}
		bw.write(q.poll()+">");
		
		br.close();
		bw.flush();
		bw.close();
	}

}
