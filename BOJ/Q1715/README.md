# [1715] 카드 정렬하기

## 분류
> 자료구조
>
> 그리디 알고리즘
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

public class Q1715 {
	static PriorityQueue<Integer> q = new PriorityQueue<Integer>();
	static int N;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		N = Integer.parseInt(br.readLine());
		
		for(int i=0;i<N;i++) {
			q.add(Integer.parseInt(br.readLine()));
		}
		int sum=0;
		while(q.size()!=1) {
			int n1 = q.poll();
			int n2 = q.poll();
			sum += n1+n2;
			q.add(n1+n2);
		}
		
		bw.write(sum + "\n");
		bw.flush();
		br.close();
		bw.close();
	}
}

```

## 문제풀이

우 많은 숫자 카드 묶음이 책상 위에 놓여 있다. 이들을 두 묶음씩 골라 서로 합쳐나간다면, 고르는 순서에 따라서 비교 횟수가 매우 달라진다. 예를 들어 10장, 20장, 40장의 묶음이 있다면 10장과 20장을 합친 뒤, 합친 30장 묶음과 40장을 합친다면 (10 + 20) + (30 + 40) = 100번의 비교가 필요하다고 할 때,

N개의 숫자 카드 묶음의 최소 비교 횟수를 구하는 프로그램을 작성하시오.

우선순위 큐를 이용해 구현하였다.

정수형 큐로 선언을 해주고 큐에 카드 묶음을 입력받는다.

우선순위의 특징으로 인해 큐는 오름차순으로 정렬되는데, 그 때 값을 두개 꺼내서 더한다음 다시 큐에 넣어준다.  

그렇게 동작을 큐의 사이즈가 1개일 때 즉, 모두 다 합쳤을 때 종료시킨다. 

각각의 비교횟수는 sum 변수를 만들어 n1+n2를 sum에 지속적으로 더해주었다.

비교 연산이 끝이나면 sum을 출력해주면 된다.

