import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Q1926 {
	static int N,M,max;
	static int[][] input ;
	static int[] dy = {1,-1,0,0};
	static int[] dx = {0,0,-1,1};
	static ArrayList<Integer> arr = new ArrayList<>();
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		input = new int[N][M];
		for(int i=0;i<N;i++) {
			for(int j=0;j<M;j++) {
				input[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0;i<N;i++) {
			for(int j=0;j<M;j++) {
				if(input[i][j]==1) {
					max=1;
					dfs(i,j);
					arr.add(max);
				}
			}
		}
		if(arr.size()==0) {
			System.out.println(0+"\n"+0);
		}
		else System.out.println(arr.size()+"\n"+Collections.max(arr));
			
		
	}
	
	static void dfs(int y,int x) {
		input[y][x]=0;
		for(int i=0;i<4;i++) {
			int nX = x+dx[i];
			int nY = y+dy[i];
			if(nX<0||nY<0||nX==M||nY==N) {
				continue;
			}
			else {
				if(input[nY][nX]==1) {					
					max++;
					dfs(nY,nX);
				}
			}

		}
	}
}
