package day13;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;

public class Q2667 {
	static int[][] arr;
	static boolean[][] visit;
	static int N,cnt=0;
	static int[] dx = {0,0,-1,1};
	static int[] dy = {1,-1,0,0};
	static ArrayList<Integer> ls = new ArrayList<>();
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		N = Integer.parseInt(br.readLine());
		arr = new int[N][N];
		visit = new boolean[N][N];
		for(int i=0;i<N;i++) {
			String s = br.readLine();
			for(int j=0;j<N;j++) {
				arr[i][j] = s.charAt(j)-'0';
			}
		}
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				if(arr[i][j]==1&&!visit[i][j]) {
					dfs(i,j);
					ls.add(cnt);
					cnt=0;
				}
			}
		}
		br.close();
		bw.write(ls.size()+"\n");
		Collections.sort(ls);
		for(int i=0;i<ls.size();i++) {
			bw.write(ls.get(i)+"\n");
		}
		bw.flush();
		bw.close();
	}
	static void dfs(int x,int y) {
		visit[x][y]=true;
		cnt++;
		for(int i=0;i<4;i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			if(nx>-1&&ny>-1&&nx<N&&ny<N) {
				if(arr[nx][ny]==1&&!visit[nx][ny]) {
					dfs(nx,ny);
				}
			}
		}
	}
}
