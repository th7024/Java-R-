package day2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Q9012 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int num = Integer.parseInt(br.readLine());
		int cnt =0;
		for(int i=0;i<num;i++) {
			Stack<Integer> stack = new Stack<Integer>(); 
			String[] s = br.readLine().split("");
			cnt =0;
			for(int j=0;j<s.length;j++){
				if(s[j].equals("(")) stack.push(1);
				else {
					if(stack.size()!=0)
						stack.pop();
					else {
						cnt = 1;
						break;
					}
				}
			}
			if(stack.isEmpty()&&cnt==0) bw.write("YES\n");
			else bw.write("NO\n");
		}
		br.close();
		bw.flush();
		bw.close();
	}
}
