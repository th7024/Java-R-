# [2775] 부녀회장이 될테야

## 분류
> 수학

## 코드
```java
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Q2775 {
	static int[][] arr = new int[15][15];
	public static void main(String args[]) throws IOException {
		Scanner sc = new Scanner(System.in);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		for(int i=1;i<15;i++) {
			arr[0][i]=i;
		}
		
		for(int i=1;i<15;i++) {
			for(int j=1;j<15;j++) {
				if(j==1) arr[i][j]=1;
				else {
					arr[i][j]=arr[i-1][j]+arr[i][j-1];
				}
			}
		}
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			bw.write(arr[a][b]+"\n");
		}
		bw.flush();
		bw.close();
	}
}

```

## 문제풀이

“a층의 b호에 살려면 자신의 아래(a-1)층의 1호부터 b호까지 사람들의 수의 합만큼 사람들을 데려와 살아야 한다” 라는 조건을 지켜  Test case의 수 T가 주어졌을 때 각각의 케이스마다 입력으로 첫 번째 줄에 정수 k, 두 번째 줄에 정수 n이 주어진다. 

A 층의 B호에 사는 조건은 arr\[a][b]=arr\[a-1][b]+ arr\[a][b-1]호에 사는 사람을 더한 값이다. b-1호는 이전 집에 있는 사람인데, 그 사람은 a-1호 이전의 사람 수를 알고 있기 때문에 그 사람과 내 아래층 사람의 수를 더해주면 우리집 사람 수가 나온다. 때문에 최대 입력인 14의 경우를 구해주고 테스트케이스에 맞는 값을 출력해준다.