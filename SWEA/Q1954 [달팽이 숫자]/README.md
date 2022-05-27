# [1954] 달팽이 숫자

## 분류
> 

## 코드
```java
package day15;

import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.BufferedReader;

public class Q1954_swea {
	static int[][] arr;
	static int[] dx = {0,1,0,-1};
	static int[] dy = {1,0,-1,0};
	//static int[] dd = {0,1,2,3};
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int testcase = Integer.parseInt(br.readLine());
		for(int i=1;i<=testcase;i++) {
			int num = Integer.parseInt(br.readLine());
			arr = new int[num][num];
			int n=1,x=0,y=0,d=0;
			while(n<=num*num) {
				int X = x + dx[d], Y = y + dy[d];
				if(X<0 || X>=num||Y<0||Y>=num||arr[X][Y]!=0) {
					d = (d+1)%4;
					X = x + dx[d]; Y = y + dy[d];
				}
				arr[x][y]=n++;
				x = X; y = Y;
			}
			bw.write("#"+i+"\n");
			for(int a=0;a<num;a++) {
				for(int b=0;b<num;b++) {
					bw.write(arr[a][b] + " ");
				}
				bw.write("\n");
			}
		}
		br.close();
		bw.flush();
		bw.close();
	}
}

```

## 문제풀이

![image-20220527230921941](C:\Users\USER\AppData\Roaming\Typora\typora-user-images\image-20220527230921941.png)

3을 입력했을 때의 달팽이 숫자이다.

N*N배열을 만들고 오->아->왼->위 순으로 숫자를 채워나가면 된다.(이미 채워진 숫자나 배열의 범위를 벗어난다면 방향을 바꿔준다.)

n이 N*N이 될 때까지 반복문을 돌려주었다. 방향은 오른쪽 -> 아래 -> 왼쪽 -> 위쪽 순으로 돌아가며 배열의 범위를 벗어나거나 이미 채워져있다면 방향을 바꾸어 주었다.

방향 전환에 관련된 좌표는 배열에 담았으며 0,1,2,3 이 반복되어야 하기 때문에 d = d+1 %4를 통해 반복을 실시해주었다.

이미 채워져 있는 칸은 arr\[i][j]!=0인 경우로 체크해주었다.