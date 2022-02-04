import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

public class Q1788 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		if(n>0)bw.write("1\n");
		else if(n<0) {
			if(n%2==0)
				bw.write("-1\n");
			else
			bw.write("1\n");
		}
		else bw.write("0\n");
		n = Math.abs(n);
		if(n!=0) {
			int [] dp = new int[n+1];
			dp[0]=0;dp[1]=1;
			for(int i=2;i<=n;i++) {
				dp[i] = (dp[i-2]+dp[i-1])%1000000000;
			}
			bw.write(dp[n]+"\n");
		}
		else bw.write("0\n");
		
		br.close();
		bw.flush();
		bw.close();
	}

}
