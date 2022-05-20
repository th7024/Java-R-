package day10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Q10773 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Stack<Integer> st = new Stack<Integer>();
		int n = Integer.parseInt(br.readLine());
		for(int i=0;i<n;i++) {
			int num = Integer.parseInt(br.readLine());
			if(num==0&&st.size()!=0) {
				st.pop();
			}
			else {
				st.push(num);
			}
		}
		int sum =0,size = st.size();
		for(int i=0; i<size;i++) {
			sum += st.pop();
		}
		System.out.println(sum);
	}
}
