package day10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q11050 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n= Integer.parseInt(st.nextToken());
		int k= Integer.parseInt(st.nextToken());
		if(n==111) {			
			int nn = 1,kk=1,nk=1;
			for(int i=1;i<=n;i++) nn*=i;
			for(int i =1;i<=k;i++)kk*=i;
			for(int i =1;i<=n-k;i++)nk*=i;
			int sum = nn / (kk*nk);
		}
		int sum = facto(n)/(facto(k)*facto(n-k));
		br.close();
		bw.write(String.valueOf(sum));
		bw.flush();
		bw.close();
		
	}
	static int facto(int N) {
		if(N==0) return 1;
		return N*facto(N-1);
		
	}
}
