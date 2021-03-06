import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q1475 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int[] num =new int[10];
		String[] str = br.readLine().split("");
		for(int i=0;i<str.length;i++) {
			if(Integer.parseInt(str[i])==6||Integer.parseInt(str[i])==9) {
				int num1 = num[6];
				int num2 = num[9];
				if(num1<num2) num[6]++;
				else if(num2<num1)num[9]++;
				else num[Integer.parseInt(str[i])]++;
			}
			else {
				num[Integer.parseInt(str[i])]++;
			}
		}
		int max=0;
		for(int i=0;i<10;i++) {
			if(max<num[i]) max=num[i];
		}
		br.close();
		bw.write(max+"\n");
		bw.flush();
		bw.close();
	}

}
