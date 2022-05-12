package day5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q1182 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int ans = Integer.parseInt(st.nextToken());
		int[] arr = new int[n];
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<n;i++)arr[i] = Integer.parseInt(st.nextToken());
		int cnt=0;
		for(int i=0;i<n;i++) {
			int sum=arr[i];
			for(int j=i;j<n;j++) {
				if(i==j)continue;
				if(sum==ans)cnt++;
				sum+=arr[j];
			}
		}
		bw.write(String.valueOf(cnt));
		br.close();
		bw.flush();
		bw.close();
	}
}
