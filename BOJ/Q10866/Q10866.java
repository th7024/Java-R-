import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q10866 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		LinkedList<Integer>q = new LinkedList<Integer>();
		int n = Integer.parseInt(br.readLine());
		for(int i=0;i<n;i++) {
			String s [] = br.readLine().split(" ");
			switch(s[0]) {
			case "push_back":
				int num = Integer.parseInt(s[1]);
				q.addLast(num);
				break;
			case "push_front":
				num = Integer.parseInt(s[1]);
				q.addFirst(num);
				break;
			case "pop_front":
				if(q.isEmpty()) {
					System.out.println("-1");
				}
				else {
					System.out.println(q.pollFirst());
				}
				break;
			case "pop_back":
				if(q.isEmpty()) {
					System.out.println("-1");
				}
				else {
					System.out.println(q.pollLast());
				}
				break;
			case "front":
				if(q.isEmpty()) {
					System.out.println("-1");
				}
				else {
					System.out.println(q.get(0));
				}
				break;
			case "back":
				if(q.isEmpty()) {
					System.out.println("-1");
				}
				else {
					System.out.println(q.get(q.size()-1));
				}
				break;
			case "size":
				System.out.println(q.size());
				break;
			case "empty":
				if(q.isEmpty()) {
					System.out.println("1");
				}
				else {
					System.out.println("0");
				}
				break;
			}
		}

	}

}
