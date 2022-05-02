import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q4344 {
	public static void main(String[] args) throws  IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int student, sub;
		student = Integer.parseInt(br.readLine());
		for(int i=0;i<student;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			sub = Integer.parseInt(st.nextToken());
			int sum=0;
			int[] score = new int[sub];
			for(int j=0;j<sub;j++) {
				score[j]=Integer.parseInt(st.nextToken());
			}
			for(int j=0;j<score.length;j++) {
				sum+=score[j];
			}
			double avg = sum/sub;
			double cnt =0;
			
			for(int j=0;j<score.length;j++) {
				if(score[j]>avg) cnt++;
			}
			double ans = (cnt/sub)*100;
			bw.write(String.format("%.3f", ans)+"%\n");
		}
		br.close();
		bw.flush();
		bw.close();
		
	}
}
