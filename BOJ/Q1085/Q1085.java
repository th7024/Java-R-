import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q1085 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int X = Integer.parseInt(st.nextToken());
		int Y = Integer.parseInt(st.nextToken());
		int W = Integer.parseInt(st.nextToken());
		int H = Integer.parseInt(st.nextToken());
		int min = 0;
		
		if(X<W-X) min = X;
		else min = W-X;
		
		if(Y<H-Y) {
			if(Y<min) min=Y;
		}
		else {
			if(H-Y<min) min = H-Y;
		}
		bw.write(min+"\n");
		
		bw.flush();
		br.close();
		bw.close();
	}
}
