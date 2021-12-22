import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q1699 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int num = Integer.parseInt(br.readLine());
		int[] numlist=new int[num+2];
		for(int i=1;i<=num;i++) {
			for(int j=1;j*j<=i;j++) {
				if(numlist[i]>numlist[i-j*j]+1||numlist[i]==0) {
					numlist[i]=numlist[i-j*j]+1;
				}
			}
		}
		bw.write(numlist[num]+"\n");
		br.close();
		bw.flush();
		bw.close();

	}

}
