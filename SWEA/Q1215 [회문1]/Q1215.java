package day16;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q1215 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		for(int i=1;i<=10;i++) {
			int num = Integer.parseInt(br.readLine());
			char[][] c = new char[8][8];
			int cnt =0;
			boolean flag;
			for(int j=0;j<8;j++) {
				String s = br.readLine();
				for(int n=0;n<8;n++) {
					c[j][n] = s.charAt(n);
				}
			}
			for(int x = 0;x<8;x++) {
				for(int y = 0; y<8-num+1;y++) {
					flag = true;
					for(int h=0;h<num/2;h++) {
						if(c[x][y+h] !=c[x][y-h+num-1]) flag = false;
					}
					if(flag) cnt++;
					
					flag = true;
					for(int h =0;h<num/2;h++) {
						if(c[y+h][x]!=c[y-h+num-1][x]) flag = false;						
					}
					if(flag)cnt++;
				}
			}
			bw.write("#"+i + " "+cnt + "\n");
		}
		br.close();
		bw.flush();
		bw.close();
	}
}
