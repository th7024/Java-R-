import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.PriorityQueue;

public class Q1927 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		PriorityQueue <Integer> q = new PriorityQueue<Integer>();
		for(int i=0;i<N;i++) {
			int num = Integer.parseInt(br.readLine());
			if(num==0) {
				if(q.isEmpty())
					bw.write("0\n");
				else bw.write(q.poll()+"\n");
			}
			else {
				q.add(num);
			}
		}
		br.close();
		bw.flush();
		bw.close();
	}
}
