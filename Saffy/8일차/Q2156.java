package day8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q2156 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		int[] dp = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=Integer.parseInt(br.readLine());
			if(i==0) dp[i] = arr[i];
		}
		dp[1] = arr[0] + arr[1];
		dp[2] = Math.max(dp[1], Math.max(arr[1]+arr[2], arr[0]+arr[2]));
		for(int i=3;i<n;i++) {
			dp[i] = Math.max(dp[i-1], Math.max(dp[i-2]+arr[i], dp[i-3]+arr[i-1]+arr[i]));
		}
		bw.write(String.valueOf(dp[n-1]));
		br.close();
		bw.flush();
		bw.close();
	}
}
