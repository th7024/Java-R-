# [1158] 요세푸스 문제

## 분류
> 자료 구조 
>
> 큐

## 코드
```java
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q1158 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Queue<Integer> q = new LinkedList<Integer>();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		for(int i=1;i<=N;i++) {
			q.add(i);
		}
		bw.write("<");
		int cnt=0;
		while(q.size()!=1) {
			int a = q.poll();
			cnt++;
			if(cnt==M) {
				bw.write(a+", ");
				cnt=0;
			}
			else {
				q.add(a);
			}
		}
		bw.write(q.poll()+">");
		
		br.close();
		bw.flush();
		bw.close();
	}

}

```

## 문제풀이

N개의 숫자를 입력받고 M개의 빈 칸을 사이에 두고 출력하는 문제이다. 

1부터 N까지의 숫자를  큐에 담아준 후  cnt를 이용해 cnt값이 M이 될 때마다 큐에 있는 값을 출력해준다. 