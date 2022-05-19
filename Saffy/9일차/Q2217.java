package day9;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Q2217 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		Integer[] arr = new Integer[n];
		int[] dp = new int[n];
		for(int i=0;i<n;i++) arr[i] = Integer.parseInt(br.readLine());
		Arrays.sort(arr, Collections.reverseOrder());
		int max = Integer.MIN_VALUE;
		for(int i=0;i<n;i++) {
			dp[i] = arr[i]*(i+1);
			if(max<dp[i])max = dp[i];
		}
		br.close();
		bw.write(String.valueOf(max));
		bw.flush();
		bw.close();
	}
}
