package day10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q1100 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int cnt=0;
		for(int i=0;i<8;i++) {
			String s = br.readLine();
			for(int j=0; j<s.length();j++) {
				char c = s.charAt(j);
				if(i%2==0) {
					if(j%2==0) {
						if(c=='F') cnt++;
					}
				}
				else {
					if(j%2!=0) {
						if(c=='F') cnt++;
					}
				}
			}
		}
		br.close();
		bw.write(String.valueOf(cnt));
		bw.flush();
		bw.close();
	}
}
