import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;


public class Q10162 {
	public static void main(String args[]) throws IOException {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int num = Integer.parseInt(br.readLine());
		int acnt=0,bcnt=0,ccnt=0;
		while(num>=10) {
			if(num>=300) {
				num = num-300;
				acnt++;
			}
			if(num>=60) {
				num = num-60;
				bcnt++;
			}
			if(num>=10) {
				num = num - 10;
				ccnt++;
			}
			if(num<10) {
				break;
			}
		}
		System.out.println(num == 0 ? acnt + " " + bcnt + " " + ccnt : -1);
		br.close();
		bw.flush();
		bw.close();
	}
}
