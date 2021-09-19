import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
import java.util.stream.IntStream;

public class Q7576 {
	static int M,N,max=0;
	static int[][] arr;
	static boolean[][] visit;
	static Queue<Tomato> q = new LinkedList<>();
	static int[] dx = {0,0,1,-1};
	static int[] dy = {-1,1,0,0};
	
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		arr = new int [M][N];
		visit = new boolean [M][N];
		
		for(int i=0;i<M;i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0;j<N;j++) {
				arr[i][j]= Integer.parseInt(st.nextToken());
				if(arr[i][j]==1) {
					q.add(new Tomato(i,j));
					visit[i][j]=true;
				}
				else if(arr[i][j]==-1) visit[i][j]=true;
			}
		}
		bfs();
		int max=0;
		for(int i=0;i<M;i++) {
			for(int j=0;j<N;j++) {
				if(max<arr[i][j]) max = arr[i][j];
				if(visit[i][j]==false) {
					System.out.print(-1);
					return;
				}
			}
		}
		System.out.print(max-1);
		br.close();
	}
	static void bfs() {
		while(!q.isEmpty()) {
			Tomato t = q.poll();
			for(int i=0;i<4;i++) {
				int X = t.x + dx[i];
				int Y = t.y + dy[i];
				if(Y>=0&&X>=0&&Y<N&&X<M) {
					if(visit[X][Y]==false) {
						arr[X][Y]=arr[t.x][t.y]+1;
						visit[X][Y]= true;
						q.add(new Tomato(X,Y));
					}
				}
			}
		}
		
	}
	static class Tomato {
		int x, y;
		
		Tomato(int x, int y){
			this.x = x;
			this.y = y;
		}
	}
}
