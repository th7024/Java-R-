# [11279] 최대

## 분류
> 자료 구조
>
> 우선순위 큐

## 코드
```java
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;

public class Q11279 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		PriorityQueue<Integer> q = new PriorityQueue<Integer>(Collections.reverseOrder());
		
		for(int i=0;i<N;i++) {
			int num = Integer.parseInt(br.readLine());
			if(num==0) {
				if(q.isEmpty()) bw.write("0\n");
				else bw.write(q.poll()+"\n");
			}
			else {
				q.add(num);
			}
		}
		
		br.close();
		bw.flush();
		bw.close();
	}
}

```

## 문제풀이

N을 입력받고 숫자 N개를 입력받을 때, 0이면 가장 큰 값을 출력하고 숫자가 들어가면 큐에 담아주는 문제이다. 만약 0이 입력되었는데 큐가 비어있다면 0을 출력해준다.

우선순위큐를 이용해서 구현하였고, 컬렉션함수를 통해 내림차순으로 정렬하여 풀었다.

