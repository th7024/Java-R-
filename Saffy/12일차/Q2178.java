package day12;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q2178 {
	static int[][] arr;
	static boolean[][] visit;
	static Queue<Point> q;
	static int[] dx = {0,0,-1,1};
	static int[] dy = {1,-1,0,0};
	static int N,M;
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		arr = new int[N][M];
		visit = new boolean[N][M];
		for(int i=0;i<N;i++) {
			String s = br.readLine();
			for(int j=0;j<M;j++) {
				arr[i][j] = s.charAt(j)-'0';
			}
		}
		int c = Miro(new Point(0,0,1));
		br.close();
		bw.write(String.valueOf(c));
		bw.flush();
		bw.close();
	}
	static int Miro(Point p) {
		q = new LinkedList<Point>();
		visit[0][0] = true;
		q.add(p);
		while(!q.isEmpty()) {
			Point state = q.poll();
			if(state.x==N-1&&state.y==M-1) return state.cnt;
			
			for(int i=0;i<4;i++) {
				int nx = state.x+dx[i];
				int ny = state.y+dy[i];
				
				if(nx>-1&&ny>-1&&nx<N&&ny<M) {
					if(visit[nx][ny]==false&&arr[nx][ny]==1) {
						visit[nx][ny] = true;
						q.add(new Point(nx,ny,state.cnt+1));
					}
				}
			}
		}
		return 0;
	}
	static class Point{
		int x,y,cnt;
		Point(int x,int y,int cnt){
			this.x = x;
			this.y = y;
			this.cnt = cnt;
		}
	}
}
