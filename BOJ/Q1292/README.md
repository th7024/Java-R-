# [1292] 쉽게 푸는 문제

## 분류
> 수학
>
> 구현

## 코드
```java
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Q1292 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		ArrayList<Integer> al = new ArrayList<Integer>();
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		int n = 1;
		while(al.size()<y){
			for(int i=1;i<=n;i++) {
				al.add(n);
			}
			n++;
		}
		int sum = 0;
		for(int i=x-1;i<y;i++) {
			sum += al.get(i);
		}
		br.close();
		bw.write(String.valueOf(sum));
		bw.flush();
		bw.close();
	}
}

```

## 문제풀이

1을 한 번, 2를 두 번, 3을 세 번, 이런 식으로 1 2 2 3 3 3 4 4 4 4 5 .. 이러한 수열을 만들고 어느 일정한 구간을 주면 그 구간의 합을 구하는 문제이다.

가변 크기의 배열 ArrayList를 선언해주고 al.size가 y보다 작을 때까지 담아준다.(x~y의 구간합이기 때문)

그 다음 x부터 y까지 반복문을 돌면서 al.get을 통해 값을 뽑아내 sum에 더해준다.