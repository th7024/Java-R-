import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Q2775 {
	static int[][] arr = new int[15][15];
	public static void main(String args[]) throws IOException {
		Scanner sc = new Scanner(System.in);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		for(int i=1;i<15;i++) {
			arr[0][i]=i;
		}
		
		for(int i=1;i<15;i++) {
			for(int j=1;j<15;j++) {
				if(j==1) arr[i][j]=1;
				else {
					arr[i][j]=arr[i-1][j]+arr[i][j-1];
				}
			}
		}
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			bw.write(arr[a][b]+"\n");
		}
		bw.flush();
		bw.close();
	}
}
