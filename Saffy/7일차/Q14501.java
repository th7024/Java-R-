package day7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q14501 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int day = Integer.parseInt(br.readLine());
		int[][] arr = new int [day][2];
		int[] dp = new int[day+1];
		StringTokenizer st;
		for(int i=0;i<day;i++) {
			st = new StringTokenizer(br.readLine());
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		}
		for(int i=0;i<day;i++) {
			int work = i + arr[i][0];
			if(work<=day) {
				dp[work]=Math.max(arr[i][1]+dp[i], dp[work]);
			}
			dp[i+1] = Math.max(dp[i+1], dp[i]);
		}
		bw.write(String.valueOf(dp[day]));
		br.close();
		bw.flush();
		bw.close();
	}
}
