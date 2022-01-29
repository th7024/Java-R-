# [9656] 돌 게임 2

## 분류
> 다이나믹 프로그래밍
>
> 게임 이론

## 코드
```java
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q9656 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		if(n%2==1) System.out.println("CY");
		else System.out.println("SK");
		br.close();

	}

}

```

## 문제풀이

상근이와 창영이가 돌을 번갈아가면서 가져간다. 돌은 1개 or 3개를 가져갈 수 있으며 상근이부터 차례대로 가져간다. 

돌을 마지막에 가져가는 사람이 지는 게임이다.

돌이 홀수 개일 때는 상근이가 지고, 짝수개일떄는 상영이가 지게 된다. 때문에 N을 입력받고 홀수짝수 판별을 통해 결과를 출력해주면 된다.