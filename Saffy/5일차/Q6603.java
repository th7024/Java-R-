package day4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q6603 {
	private static int[] arr;
	private static boolean[] visit;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
            if (n == 0) break;
            arr = new int[n];
            visit = new boolean[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }
			
			dfs(0,0);
			System.out.println();
		}
		br.close();
	}
	public static void dfs(int num, int dep)  {
		if(dep==6) {
			for(int i=0;i<arr.length;i++) {
				if(visit[i]) System.out.print(arr[i]+" ");
			}
			System.out.println();
		}
		for(int i=num;i<arr.length;i++) {
			visit[i]=true;
			dfs(i+1,dep+1);
			visit[i]=false;
		}
	}
}
