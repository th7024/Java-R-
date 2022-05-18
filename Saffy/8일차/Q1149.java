package day8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q1149 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		int[][] arr = new int[n][3];
		int[][]sum = new int[n][3];
		StringTokenizer st;
		for(int i=0;i<n;i++) {
			st = new StringTokenizer(br.readLine());
			arr[i][0]=Integer.parseInt(st.nextToken());
			arr[i][1]=Integer.parseInt(st.nextToken());
			arr[i][2]=Integer.parseInt(st.nextToken());
			if(i==0) {
				sum[i][0]=arr[i][0];
				sum[i][1]=arr[i][1];
				sum[i][2]=arr[i][2];
			}
			}
		
		for(int i=1;i<n;i++) {
			for(int j=0;j<n;j++) {
				switch(j) {
				case 0:
					sum[i][j] = Math.min(sum[i-1][j+1]+arr[i][j], sum[i-1][j+2]+arr[i][j]);
					break;
				case 1:
					sum[i][j] = Math.min(sum[i-1][j-1]+arr[i][j], sum[i-1][j+1]+arr[i][j]);
					break;
				case 2:
					sum[i][j] = Math.min(sum[i-1][j-1]+arr[i][j], sum[i-1][j-2]+arr[i][j]);
					break;
				}
			}
		}
		int min = Integer.MAX_VALUE;
		for(int i=0;i<3;i++) {
			if(sum[n-1][i]<min) min = sum[n-1][i];
		}
		bw.write(String.valueOf(min));
		br.close();
		bw.flush();
		bw.close();
	}
}
