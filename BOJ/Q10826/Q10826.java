import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

public class Q10826 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		BigInteger pn = BigInteger.ZERO;
		BigInteger nn = BigInteger.ONE;
		BigInteger ans = BigInteger.ZERO;
		for(int i=2;i<=n;i++) {
			ans= pn.add(nn);
			pn = nn;
			nn = ans;
		}
		if(n<2)bw.write(n+"\n");
		else bw.write(ans+"\n");
		br.close();
		bw.flush();
		bw.close();

	}

}
