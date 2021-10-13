import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q4153 {
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		double a, b, c;
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			a = Double.parseDouble(st.nextToken());
			b = Double.parseDouble(st.nextToken());
			c = Double.parseDouble(st.nextToken());
			if(a==0&&b==0&&c==0) break;
			
			double C = Math.pow(c, 2);
			double A = Math.pow(a, 2);
			double B = Math.pow(b, 2);
			if(C==A+B||A==B+C||B==A+C) bw.write("right\n");
			else bw.write("wrong\n");
		}
		bw.flush();
		br.close();
		bw.close();
	}
}
