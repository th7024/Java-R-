import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Q10828 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int num = Integer.parseInt(br.readLine());
		Stack<Integer> stack = new Stack<>();
		for(int i=0;i<num;i++) {
			String s = br.readLine();
			String[] n = s.split(" ");
			switch(n[0]){
			case "push":
				stack.push(Integer.parseInt(n[1]));
				break;
			case "pop":
				if(stack.size()!=0) {
					int pn = stack.pop();
					bw.write(pn+"\n");
				}
				else bw.write("-1\n");
				break;
			case "size":
				bw.write(stack.size()+"\n");
				break;
			case "empty":
				if(stack.size()==0) bw.write("1\n");
				else bw.write("0\n");
				break;
			case "top":
				if(stack.size()==0) {
					bw.write("-1\n");
				}
				else {
					int tn = stack.peek();
					bw.write(tn+"\n");
					break;
				}
			}
		}
		br.close();
		bw.flush();
		bw.close();
	}
}
