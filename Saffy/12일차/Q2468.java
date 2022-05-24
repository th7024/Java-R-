package day12;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q2468 {
	static int[][] arr;
	static boolean[][] visit;
	static int[] dx = {0,0,-1,1};
	static int[] dy = {1,-1,0,0};
	static int n;
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		n = Integer.parseInt(br.readLine());
		arr = new int[n][n];
		int maxnum = Integer.MIN_VALUE;
		for (int i = 0; i < n; i++) {
			String[] s = br.readLine().split(" ");
			for (int j = 0; j < n; j++) {
				arr[i][j] = Integer.parseInt(s[j]);
				if (arr[i][j] > maxnum)
					maxnum = arr[i][j];
			}
		}
		int max = 0;
		for (int i = 0; i <= maxnum; i++) {
			int cnt = 0;
			visit = new boolean[n][n];
			for (int x = 0; x < n; x++) {
				for (int y = 0; y < n; y++) {
					if (arr[x][y] <= i) {
						arr[x][y] = 0;
					}
				}
			}

			for (int x = 0; x < n; x++) {
				for (int y = 0; y < n; y++) {
					if (arr[x][y] != 0 && visit[x][y] == false) {
						dfs(x,y);
						cnt++;
					}
				}
			}
			if(max<cnt) max = cnt;
		}
		br.close();
		bw.write(String.valueOf(max));
		bw.flush();
		bw.close();
	}

	static void dfs(int x,int y) {
		visit[x][y] = true;
		for(int i=0;i<4;i++) {
			int nx = x+dx[i];
			int ny = y+dy[i];
			if(nx>-1&&ny>-1&&nx<n&&ny<n) {
				if(arr[nx][ny]!=0&&visit[nx][ny]==false)
					dfs(nx,ny);
			}
		}
	}
}
