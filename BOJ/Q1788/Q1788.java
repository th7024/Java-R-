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
		BigInteger pn = BigInteger.ZERO,nn = BigInteger.ONE,sum=BigInteger.ZERO;
		BigInteger a = BigInteger.valueOf(1000000000);
		if(n>0)bw.write("1\n");
		else if(n<0) {
			if(n%2==0)
				bw.write("-1\n");
			else
			bw.write("1\n");
		}
		else bw.write("0\n");
		n = Math.abs(n);
		for(int i=2;i<=n;i++) {
			BigInteger s = pn.add(nn);
			sum = s.mod(a);
			pn = nn;
			nn = sum;
		}
		
		bw.write(sum.mod(a)+"\n");
		br.close();
		bw.flush();
		bw.close();
	}

}
