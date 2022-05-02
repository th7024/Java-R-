import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q5086 {

	public static void main(String[] args) throws IOException {
		BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw  = new BufferedWriter(new OutputStreamWriter(System.out));
		int n, m;
		while(true) {
			StringTokenizer st =new StringTokenizer(br.readLine());
			n = Integer.parseInt(st.nextToken());
			m = Integer.parseInt(st.nextToken());
			if(n==0&&m==0) break;
			if(n%m==0) {
				bw.write("multiple\n");
			}
			else if(m%n==0) {
				bw.write("factor\n");
			}
			else {
				bw.write("neither\n");
			}
		}
		br.close();
		bw.flush();
		bw.close();

	}

}
