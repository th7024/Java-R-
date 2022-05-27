package day15;

import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.BufferedReader;

public class Q1954_swea {
	static int[][] arr;
	static int[] dx = {0,1,0,-1};
	static int[] dy = {1,0,-1,0};
	//static int[] dd = {0,1,2,3};
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int testcase = Integer.parseInt(br.readLine());
		for(int i=1;i<=testcase;i++) {
			int num = Integer.parseInt(br.readLine());
			arr = new int[num][num];
			int n=1,x=0,y=0,d=0;
			while(n<=num*num) {
				int X = x + dx[d], Y = y + dy[d];
				if(X<0 || X>=num||Y<0||Y>=num||arr[X][Y]!=0) {
					d = (d+1)%4;
					X = x + dx[d]; Y = y + dy[d];
				}
				arr[x][y]=n++;
				x = X; y = Y;
			}
			bw.write("#"+i+"\n");
			for(int a=0;a<num;a++) {
				for(int b=0;b<num;b++) {
					bw.write(arr[a][b] + " ");
				}
				bw.write("\n");
			}
		}
		br.close();
		bw.flush();
		bw.close();
	}
}
