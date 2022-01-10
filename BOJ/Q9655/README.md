# [9655] 돌 게임

## 분류
> 수학
>
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

public class Q9655 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int num = Integer.parseInt(br.readLine());
		if(num%2==0)
			bw.write("CY");
		else
			bw.write("SK");
		br.close();
		bw.flush();
		bw.close();
	}

}

```

## 문제풀이

돌 N개가 있을 때 상근이와 창영이가 서로 1개 혹은 3개의 돌을 가져간다. 돌을 남기지 않고 가져갔을 때 마지막에 돌을 가져가는 사람이 게임을 이기는데 그 사람이 누구인지 출력하는 문제이다.

돌은 상근이가 먼저 가져가게 된다. 상근이가 게임을 이기면 SK를, 창영이가 게임을 이기면 CY을 출력한다.

| 돌의개수 |            게임 진행            | 우승자 |
| :------: | :-----------------------------: | :----: |
|    1     |             상근(1)             |  상근  |
|    2     |         상근(1)+창영(1)         |  창영  |
|    3     |             상근(3)             |  상근  |
|    4     |         상근(3)+창영(1)         |  창영  |
|    5     |     상근(3)+창영(1)+상근(1)     |  상근  |
|    6     |         상근(3)+창영(3)         |  창영  |
|    7     |     상근(3)+창영(3)+상근(1)     |  상근  |
|    8     | 상근(3)+창영(3)+상근(1)+창영(1) |  창영  |

위의 경우를 보았을 때 짝수인 경우에는 창영이가 홀수인 경우에는 상근이가 우승을 하는 것을 알 수 있다.

때문에 num을 입력받고 이 수가 짝수이면 CY를 홀수이면 SK를 출력해주면 된다.