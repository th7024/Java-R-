package day11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q1697 {
	static int[] visit;
	static Queue<Point> q;

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		q = new LinkedList<Point>();
		int start = Integer.parseInt(st.nextToken());
		int end = Integer.parseInt(st.nextToken());
		q.add(new Point(start, 0));
		visit = new int[1000001];
		visit[start]=1;
		while (!q.isEmpty()) {
			Point num = q.poll();
			if(num.x==end) {
				bw.write(String.valueOf(num.cnt));
				break;
			}
			for (int i = 0; i < 3; i++) {
				int x = num.x;
				switch(i) {
				case 0:
					x -=1;
					break;
				case 1:
					x+=1;
					break;
				case 2:
					x *=2;
					break;
				}
				if(x>-1&&x<visit.length) {
					if(visit[x]==0) {
						visit[x]=1;
						q.add(new Point(x,num.cnt+1));						
					}
				}
			}
		}
		br.close();
		bw.flush();
		bw.close();
	}

	static class Point {
		int x, cnt;

		public Point(int x, int cnt) {
			this.x = x;
			this.cnt = cnt;
		}
	}
}
