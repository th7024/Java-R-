package day15;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Q1204_swea {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int testcase = Integer.parseInt(br.readLine());
		for(int i=0;i<testcase;i++) {
			int n = Integer.parseInt(br.readLine());
			int[] arr = new int[101];
				String[] s = br.readLine().split(" ");
				for(int j=0;j<s.length;j++) {
					int a = Integer.parseInt(s[j]);
					arr[a]+=1;					
				}
			int max = Integer.MIN_VALUE;
			ArrayList<Integer> al = new ArrayList<>();
			for(int j=0;j<arr.length;j++) {
				if(arr[j]>max) {
					max = arr[j];
				}
			}
			for(int j=0;j<arr.length;j++) {
				if(arr[j]==max) {
					al.add(j);
				}
			}
			Collections.sort(al, Collections.reverseOrder());
			System.out.println("#"+n+" "+al.get(0));
		}
	}
}
