import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Q14495 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		if(n<4) System.out.println(1);
		else {
			BigInteger[] arr = new BigInteger[n+1];
			arr[1]=arr[2]=arr[3]=BigInteger.ONE;
		for(int i=4;i<=n;i++) {
			arr[i]=arr[i-1].add(arr[i-3]);
		}
		System.out.println(arr[n]);
		
		}
		br.close();
	}

}
