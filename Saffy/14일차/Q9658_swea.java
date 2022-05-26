package day14;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q9658_swea {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int testcase = Integer.parseInt(br.readLine());
		for(int i=1;i<=testcase;i++) {
			String s = br.readLine();
			int n = s.charAt(1)-'0';
			if(n==9) {
				bw.write("#"+i+" "+"1.0*10^"+s.length()+"\n");
				continue;
			}
			if(n>4) n+=1;
			else n = 0;
			bw.write("#"+i+" "+s.charAt(0)+"."+n+"*10^"+(s.length()-1)+"\n");

			
		}

		br.close();
		bw.flush();
		bw.close();
	}
}
