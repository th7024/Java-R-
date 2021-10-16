package BOJ;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q1244 {
	static int swi, stu;
	static int[] arr;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		swi = Integer.parseInt(br.readLine());
		arr = new int[swi + 1];
		StringTokenizer st = new StringTokenizer(br.readLine());

		for (int i = 1; i <= swi; i++) { // 배열입력
			arr[i] = Integer.parseInt(st.nextToken());
		}

		stu = Integer.parseInt(br.readLine());

		for (int i = 0; i < stu; i++) {
			st = new StringTokenizer(br.readLine());
			int gender = Integer.parseInt(st.nextToken());
			int idx = Integer.parseInt(st.nextToken());

			if (gender == 1) {
				for (int j = idx; j <= swi; j += idx) {
					if (arr[j] == 1)
						arr[j] = 0;
					else
						arr[j] = 1;
				}
			}

			else {
				for (int j = 1;; j++) {
					if (j == 1) {
						if (arr[idx] == 0)
							arr[idx] = 1;
						else
							arr[idx] = 0;
					}

					if (idx - j < 1 || idx + j > swi)
						break;
					else {
						if (arr[idx + j] == arr[idx - j]) {
							if (arr[idx + j] == 0)
								arr[idx + j] = 1;
							else
								arr[idx + j] = 0;
							if (arr[idx - j] == 0)
								arr[idx - j] = 1;
							else
								arr[idx - j] = 0;
						} else
							break;
					}
				}
			}
		}
		for (int k = 1; k <= swi; k++) {
			System.out.print(arr[k] + " ");
			if(k%20==0)System.out.println(); 
		}
		//System.out.print("\b");
	}

}
