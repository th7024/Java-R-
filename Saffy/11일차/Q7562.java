package day11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;


public class Q7562 {
	static int[][] arr;
	static Queue<Point> q ;
	static int[] dx = {-2,-1,1,2,-2,-1,1,2};
	static int[] dy = {1,2,2,1,-1,-2,-2,-1};
	static int n,sx,sy,ex,ey;
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int testcase = Integer.parseInt(br.readLine());
		for(int i=0;i<testcase;i++) {
			n = Integer.parseInt(br.readLine());
			arr = new int[n][n];
			StringTokenizer st = new StringTokenizer(br.readLine());
			sx = Integer.parseInt(st.nextToken());
			sy = Integer.parseInt(st.nextToken());
			st = new StringTokenizer(br.readLine());
			ex = Integer.parseInt(st.nextToken());
			ey = Integer.parseInt(st.nextToken());
			Point start = new Point(sx, sy,0);
			Point end = new Point(ex, ey,0);
			int cnt = move(start,end);
			bw.write(cnt+"\n");
		}
		br.close();
		bw.flush();
		bw.close();
	}
	public static int move(Point s,Point e) {
		q = new LinkedList<Point>();
		q.add(s);
		arr[s.x][s.y]=1;
		while(!q.isEmpty()) {
			Point p = q.poll();
			if(p.x==e.x&&p.y==e.y) 
				return p.cnt;
			
			for(int i=0;i<8;i++) {
				int nx = p.x + dx[i];
				int ny = p.y + dy[i];
				if(nx>-1&&ny>-1&&nx<n&&ny<n)
				{
					if(arr[nx][ny]==0) {
						q.add(new Point(nx,ny,p.cnt+1));
						arr[nx][ny]=1;
					}
				}
			}
		}
		return 0;
	}
	static class Point{
		 int x, y,cnt=0; 
		 public Point(int x, int y,int cnt) {
			 this.x = x;
			 this.y = y;
			 this.cnt = cnt;
		 }
	}
}
