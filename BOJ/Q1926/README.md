# [1926] 그림

> 그래프 이론
>
> 그래프 탐색
>
> 너비 우선 탐색
>
> 깊이 우선 탐색

## 코드
```java
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Q1926 {
	static int N,M,max;
	static int[][] input ;
	static int[] dy = {1,-1,0,0};
	static int[] dx = {0,0,-1,1};
	static ArrayList<Integer> arr = new ArrayList<>();
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		input = new int[N][M];
		for(int i=0;i<N;i++) {
			for(int j=0;j<M;j++) {
				input[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0;i<N;i++) {
			for(int j=0;j<M;j++) {
				if(input[i][j]==1) {
					max=1;
					dfs(i,j);
					arr.add(max);
				}
			}
		}
		if(arr.size()==0) {
			System.out.println(0+"\n"+0);
		}
		else System.out.println(arr.size()+"\n"+Collections.max(arr));
			
		
	}
	
	static void dfs(int y,int x) {
		input[y][x]=0;
		for(int i=0;i<4;i++) {
			int nX = x+dx[i];
			int nY = y+dy[i];
			if(nX<0||nY<0||nX==M||nY==N) {
				continue;
			}
			else {
				if(input[nY][nX]==1) {					
					max++;
					dfs(nY,nX);
				}
			}

		}
	}
}

```

## 문제풀이

N, M크기의  도화지에 그림이 그려져 있을 때, 그 그림의 개수와, 그 그림 중 넓이가 가장 넓은 것의 넓이를 출력하는 문제이다. 그림은 상하좌우로 이동이 가능한 것을 그림으로 칭하며 그림은 1 공백은 0으로 표현된다.

그림의 정보를 저장하는 것은 int형 배열로 선언해 주었다. 배열을 입력 받고 반복문을 통해 그림이 있는 경우에 함수를 호출하였다.

그림을 찾는 함수는 재귀함수로 구현하여 상하좌우를 이동해 이동한 칸이 그림인지 확인해 그림이 있으면 재귀함수를 실행시켜 주었다. 

내가 방문한 칸은 0으로 만들어 줘야 하기 때문에 재귀함수가 시작되면 해당 칸을 0으로 만들어 주었다.

그림의 개수를 세는 변수는 max변수로 선언하였으며,  max는 재귀함수가 호출될 때 마다 하나씩 증가한다.

그림의 개수를 저장하는 것은 ArrayList로 만들어 주었다. 그림의 개수가 항상 다를 수 있고, 최대값을 뽑아야 하기 때문에 크기가 가변인 ArrayList로 선언하였다.

함수가 끝나면 max 변수를 ArrayList에 담아준다.

반복문이 종료되면 ArrayList의 사이즈와 함께 Collection함수를 통해 arr의 최대값을 출력해주었다.