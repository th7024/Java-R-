import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.PriorityQueue;

public class Q1715 {
	static PriorityQueue<Integer> q = new PriorityQueue<Integer>();
	static int N;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		N = Integer.parseInt(br.readLine());
		
		for(int i=0;i<N;i++) {
			q.add(Integer.parseInt(br.readLine()));
		}
		int sum=0;
		while(q.size()!=1) {
			int n1 = q.poll();
			int n2 = q.poll();
			sum += n1+n2;
			q.add(n1+n2);
		}
		
		bw.write(sum + "\n");
		bw.flush();
		br.close();
		bw.close();
	}
}
