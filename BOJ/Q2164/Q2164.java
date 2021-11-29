import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;

public class Q2164 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Queue<Integer> q = new LinkedList<Integer>();
		int n = Integer.parseInt(br.readLine());
		for(int i=1;i<=n;i++) {
			q.add(i);
		}
		while(q.size()!=1) {
			q.poll();
			int num = q.poll();
			q.add(num);
		}
		
		bw.write(q.poll()+"\n");
		br.close();
		bw.flush();
		bw.close();

	}

}
