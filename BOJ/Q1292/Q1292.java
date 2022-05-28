import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Q1292 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		ArrayList<Integer> al = new ArrayList<Integer>();
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		int n = 1;
		while(al.size()<y){
			for(int i=1;i<=n;i++) {
				al.add(n);
			}
			n++;
		}
		int sum = 0;
		for(int i=x-1;i<y;i++) {
			sum += al.get(i);
		}
		br.close();
		bw.write(String.valueOf(sum));
		bw.flush();
		bw.close();
	}
}
