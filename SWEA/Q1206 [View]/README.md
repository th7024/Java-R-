# [1206] View

## 분류
> 구현

## 코드
```java
package day14;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q1206_swea {
	static int N;
	static int[] arr;

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		System.out.println();
		for (int i = 0; i < 10; i++) {
			N = Integer.parseInt(br.readLine());
			arr = new int[N];
			String[] s = br.readLine().split(" ");
			int cnt = 0;
			for (int j = 0; j < N; j++) {
				arr[j] = Integer.parseInt(s[j]);
			}
			for (int n = 2; n < N - 2; n++) {
				int c = find(n);
				cnt += c;
			}
			bw.write("#" + (i + 1) + " " + cnt + "\n");
		}
		br.close();
		bw.flush();
		bw.close();
	}

	static int find(int n) {
		int max = Integer.MIN_VALUE;
		for (int i = n - 2; i <= n + 2; i++) {
			if (i != n) {
				if (arr[i] > max)
					max = arr[i];
			}
		}
		if (arr[n] > max)
			return arr[n] - max;
		else
			return 0;

	}
}

```

## 문제풀이

좌우 2칸에 건물이 없다면 뷰가 좋은 층인 것이다. 

총 10개의 테케가 주어졌을 때 각 테케마다 뷰가 좋은 층이 몇개인지 구하는 문제이다.(가장 왼쪽 두 칸과 가장 오른쪽 두 칸은 공백으로 비운다.)

2부터 N-2까지 반복문을 돌며 find(뷰를 찾는 함수)를 호출해 주었다.

find함수는 int형으로 해당 건물에 뷰가 좋은 층이 몇개인지를 리턴해주며 cnt에 더해준다.

find는 다음과 같다

먼저 N-2 ~ N+2 범위안에서 최대값을 구한다. 최대값이 max라고 했을 때, arr[n]이 max보다 크다면 뷰가 좋은 층이 존재한다는 것이기 때문에

arr[n]-max를 리턴해주고 아닌 경우에는 0을 리턴해준다.