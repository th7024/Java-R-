package day3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q7568 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		int num = Integer.parseInt(br.readLine());
		int[][] arr = new int[num][2];
		for (int i = 0; i < num; i++) {
			st = new StringTokenizer(br.readLine());
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		}
		for (int i = 0; i < num; i++) {
			int r = 1;
			for (int j = 0; j < num; j++) {
				if (i == j)
					continue; // 비교 할 필요 없음
				if(arr[i][0]<arr[j][0]&&arr[i][1]<arr[j][1]) r++;
			}
			bw.write(r+" ");
		}
		br.close();
		bw.flush();
		bw.close();
	}
}
