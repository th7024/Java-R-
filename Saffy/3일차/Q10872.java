package day3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q10872 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int num = Integer.parseInt(br.readLine());
			int ans = 1;
			if(num!=0)
				for(int i=1;i<=num;i++) {
					ans*=i;
				}
			bw.write(String.valueOf(ans));
			br.close();
			bw.flush();
			bw.close();
	}
}
