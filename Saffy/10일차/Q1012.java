package day10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q1012 {
	static int N,M;
	static int[][] arr;
	static boolean[][] visit;
	static int[] dx = {0,0,-1,1};
	static int[] dy = {1,-1,0,0};
	public static void main(String args[]) throws  IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int testc = Integer.parseInt(br.readLine()); 
		StringTokenizer st;
		for(int i=0; i<testc;i++) { //테스트 케이스
			st = new StringTokenizer(br.readLine());
			 N = Integer.parseInt(st.nextToken());
			 M = Integer.parseInt(st.nextToken());
			int K = Integer.parseInt(st.nextToken());
			//배열 초기화
			arr = new int[N][M];
			visit = new boolean[N][M];
			int worm = 0;
			for(int j = 0; j<K;j++) { //배추 입력
				st = new StringTokenizer(br.readLine());
				int x = Integer.parseInt(st.nextToken());
				int y = Integer.parseInt(st.nextToken());
				arr[x][y]=1;
			}
			for(int n=0;n<N;n++) {
				for(int m=0;m<M;m++) {
					if(arr[n][m]==1&&!visit[n][m]) {
						find(n,m);
						worm++;
					}
				}
			}
			System.out.println(worm);
		}
	}
	static void find(int n,int m) {
		visit[n][m] = true;
		for(int i=0;i<4;i++) {
			int nx = n + dx[i];
			int ny = m + dy[i];
			if(nx>=0&&ny>=0&&nx<N&&ny<M) {
				if(arr[nx][ny]==1&&!visit[nx][ny]) find(nx,ny);
			}
		}
	}
}
