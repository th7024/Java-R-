package day2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Q10845 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int num = Integer.parseInt(br.readLine());
		Deque<Integer> q = new LinkedList();
		for(int i =0; i<num;i++) {
			String[] s = br.readLine().split(" ");
			switch(s[0]) {
			case "push":
				q.add(Integer.parseInt(s[1]));
				break;
			case "pop":
				if(q.isEmpty()) bw.write(-1+"\n");
				else {
					int n = q.poll();
					bw.write(n+"\n");
				}
				break;
			case "size":
				bw.write(q.size()+"\n");
				break;
			case "empty":
				if(q.isEmpty()) bw.write(1+"\n");
				else bw.write(0+"\n");
				break;
			case "front":
				if(q.isEmpty()) bw.write(-1+"\n");
				else {
					int n = q.peekFirst();
					bw.write(n+"\n");
				}
				break;
			case "back":
				if(q.isEmpty()) bw.write(-1+"\n");
				else {
					int n = q.peekLast();
					bw.write(n+"\n");
				}
				break;
			}
		}
		br.close();
		bw.flush();
		bw.close();
	}
}
