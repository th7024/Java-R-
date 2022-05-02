import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q2747 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int pre = 0, nex = 1;
		int sum = 0;
		int num = Integer.parseInt(br.readLine());
		for(int i = 2;i<=num;i++) {
			sum = pre+nex;
			pre = nex;
			nex = sum;
		}
		bw.write(String.valueOf(sum));
		br.close();
		bw.flush();
		bw.close();
	}
}
