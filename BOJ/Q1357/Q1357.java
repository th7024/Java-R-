import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q1357 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		String s1 = st.nextToken();
		StringBuffer sb = new StringBuffer(s1);
		String s2 = st.nextToken();
		int n1 = Integer.parseInt(sb.reverse().toString());
		sb = new StringBuffer(s2);
		int n2 = Integer.parseInt(sb.reverse().toString());
		int s = n1 + n2;
		String ans = String.valueOf(s);
		sb = new StringBuffer(ans);
		int a = Integer.parseInt(sb.reverse().toString());
		bw.write(a+"\n");
		br.close();
		bw.flush();
		bw.close();
		
	}

}
