package day13;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q1260 {
	static int[][] arr;
	static boolean[] visit;
	static int N, M;

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		int start = Integer.parseInt(st.nextToken());
		arr = new int[N][N];
		visit = new boolean[N];
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			arr[n - 1][m - 1] = 1;
			arr[m - 1][n - 1] = 1;
		}
		dfs(start - 1);
		System.out.println();
		Arrays.fill(visit, false);
		bfs(start - 1);
	}

	static void dfs(int s) {
		visit[s] = true;
		System.out.print(s + 1 + " ");
		for (int i = 0; i < N; i++) {
			if (arr[s][i] == 1 && !visit[i]) {
				dfs(i);
			}
		}
	}

	static void bfs(int s) {
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(s);
		while (!q.isEmpty()) {
			int n = q.poll();
			if (!visit[n])
				System.out.print(n + 1 + " ");
			visit[n] = true;
			for (int i = 0; i < N; i++) {
				if (arr[n][i] == 1 && !visit[i]) {
					q.add(i);
				}
			}
		}
	}

}
