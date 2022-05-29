# [1215] 회문

## 분류
> 

## 코드
```java
package day16;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q1215 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		for(int i=1;i<=10;i++) {
			int num = Integer.parseInt(br.readLine());
			char[][] c = new char[8][8];
			int cnt =0;
			boolean flag;
			for(int j=0;j<8;j++) {
				String s = br.readLine();
				for(int n=0;n<8;n++) {
					c[j][n] = s.charAt(n);
				}
			}
			for(int x = 0;x<8;x++) {
				for(int y = 0; y<8-num+1;y++) {
					flag = true;
					for(int h=0;h<num/2;h++) {
						if(c[x][y+h] !=c[x][y-h+num-1]) flag = false;
					}
					if(flag) cnt++;
					
					flag = true;
					for(int h =0;h<num/2;h++) {
						if(c[y+h][x]!=c[y-h+num-1][x]) flag = false;						
					}
					if(flag)cnt++;
				}
			}
			bw.write("#"+i + " "+cnt + "\n");
		}
		br.close();
		bw.flush();
		bw.close();
	}
}

```

## 문제풀이

회문을 찾는 문제이다. 8*8 이차원 배열이 주어지고 직선으로 탐색을 하여 회문을 찾는다. 회문의 글자수는 num으로 주어진다.

(i,j)를 기준으로 잡았을 때 상하 좌우를 검색하려면 i~구간과 j~구간을 검색해주어야한다. 

한 줄당 반복문은 시작점에서 회문을 글자수만큼만 돌면 되기 때문에 최대 범위는 8 - num +1로 해주었다.

그렇게 되면 num이 4라고 가정하였을 때 0 1 2 3 4 5까지 반복문을 수행한다.

상하좌우 탐색은 반복문을 두개를 이용하였다. 회문의 경우 앞뒤가 똑같은 글자이기 때문에 num/2만큼 반복하여 i위치와 대칭되는 위치를 비교해주면 된다. (0 - 4 / 1 -3) 

다른 글자가 발견된다면 flag를 false로 바꾸어주고 flag가 true인 경우에만 cnt를 증가시켜준다.