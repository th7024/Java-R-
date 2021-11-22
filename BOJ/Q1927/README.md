# [1927] 최소 힙

## 분류
> 자료구조
>
> 우선순위 큐

## 코드
```java
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.PriorityQueue;

public class Q1927 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		PriorityQueue <Integer> q = new PriorityQueue<Integer>();
		for(int i=0;i<N;i++) {
			int num = Integer.parseInt(br.readLine());
			if(num==0) {
				if(q.isEmpty())
					bw.write("0\n");
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

정수 N을 입력받고 N개의 정수를 입력받는데 0이 입력되면 큐에서 가장 작은 수를 출력하고, 일반 숫자가 입력되면 큐에 그 숫자를 저장해준다.

하지만 큐가 비어있을 때 0이 입력되면 0을 출력해주는 문제이다.

우선순위 큐로 구현해서 풀었다.

먼저 개수를 나타내는 N과 숫자를 담을 num을 입력받는다.

num이 0일 때와 0이 아닐 떄로 구분지었는데, 0일 떄는 큐가 비어있는지에 대한 여부도 같이 조사해주었다.

그 후 각 조건에 맞게 출력을 진행해준다.