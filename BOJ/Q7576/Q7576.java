import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q7576 {
	static int M,N,max=0;
	static int[][] arr;
	//static int[][] visit;
	static Queue<Tomato> q = new LinkedList<>();
	static int[] dx = {0,0,1,-1};
	static int[] dy = {-1,1,0,0};
	
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		M = Integer.parseInt(st.nextToken());
		N = Integer.parseInt(st.nextToken());
		arr = new int [N][M];
		//visit = new int [M][N];
		
		for(int i=0;i<N;i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0;j<M;j++) {
				arr[i][j]= Integer.parseInt(st.nextToken());
			}
		}
		
		for(int i=0;i<N;i++) {
			for(int j=0;j<M;j++) {
				if(arr[i][j]==1) {
					//visit[i][j]=2;
					q.add(new Tomato(i,j));
				}
			}
		}
		bfs();
		System.out.print(max);
		br.close();
	}
	static void bfs() {
		while(!q.isEmpty()) {
			Tomato t = q.poll();
			for(int i=0;i<4;i++) {
				int Y = t.y + dx[i];
				int X = t.x + dy[i];
				if(Y>=0&&X>=0&&Y<M&&X<N) {
					if(arr[X][Y]==0) {
						arr[X][Y]=arr[t.x][t.y]+1;
						if(max<arr[X][Y]) max = arr[X][Y];
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
