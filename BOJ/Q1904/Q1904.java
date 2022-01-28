import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q1904 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		if(N>2) {
			int num1 = 1;
			int num2 = 2;
			int ans = 0;
			for(int i= 2 ;i<N;i++) {
				ans = (num1+num2)%15746;
				num1 = num2;
				num2 = ans;
			}
			bw.write(ans+"\n");
		}
		else {
			bw.write(N+"\n");
		}
		
		br.close();
		bw.flush();
		bw.close();

	}

}
