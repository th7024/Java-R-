package day14;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q1206_swea {
	static int N;
	static int[] arr;

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		System.out.println();
		for (int i = 0; i < 10; i++) {
			N = Integer.parseInt(br.readLine());
			arr = new int[N];
			String[] s = br.readLine().split(" ");
			int cnt = 0;
			for (int j = 0; j < N; j++) {
				arr[j] = Integer.parseInt(s[j]);
			}
			for (int n = 2; n < N - 2; n++) {
				int c = find(n);
				cnt += c;
			}
			bw.write("#" + (i + 1) + " " + cnt + "\n");
		}
		br.close();
		bw.flush();
		bw.close();
	}

	static int find(int n) {
		int max = Integer.MIN_VALUE;
		for (int i = n - 2; i <= n + 2; i++) {
			if (i != n) {
				if (arr[i] > max)
					max = arr[i];
			}
		}
		if (arr[n] > max)
			return arr[n] - max;
		else
			return 0;

	}
}
