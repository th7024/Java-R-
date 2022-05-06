package day3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q10870 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int num = Integer.parseInt(br.readLine());
		
		int pren = 0,nexn=1,temp=0;
		if(num==0) {
			bw.write("0");
		}
		else {
			for(int i=2;i<=num;i++) {
				temp = pren+nexn;
				pren = nexn;
				nexn = temp;
			}
			bw.write(String.valueOf(nexn));			
		}
		br.close();
		bw.flush();
		bw.close();
	}
}
