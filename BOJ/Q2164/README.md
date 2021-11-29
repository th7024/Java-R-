# [2164] 카드2

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

public class Q2164 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Queue<Integer> q = new LinkedList<Integer>();
		int n = Integer.parseInt(br.readLine());
		for(int i=1;i<=n;i++) {
			q.add(i);
		}
		while(q.size()!=1) {
			q.poll();
			int num = q.poll();
			q.add(num);
		}
		
		bw.write(q.poll()+"\n");
		br.close();
		bw.flush();
		bw.close();

	}

}

```

## 문제풀이

N장의 카드가 있다. 각각의 카드는 차례로 1부터 N까지의 번호가 붙어 있으며, 1번 카드가 제일 위에, N번 카드가 제일 아래인 상태로 순서대로 카드가 놓여 있다.

이제 다음과 같은 동작을 카드가 한 장 남을 때까지 반복하게 된다. 우선, 제일 위에 있는 카드를 바닥에 버린다. 그 다음, 제일 위에 있는 카드를 제일 아래에 있는 카드 밑으로 옮긴다.

N장의 카드를 큐에 담고 맨 앞에 수를 poll해서 버린다. 그 다음에 poll한 수를 num에 담고, 다시 큐에 담아준다. 그럼 맨 위 카드가 맨 아래로 가는것과 똑같다.

이런식으로 연산을 진행해 큐의 사이즈가 1일 때 까지 반복해준다.