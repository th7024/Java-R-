# [1149] RGB거리

## 분류
> 구현

## 코드
```java
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.InputStreamReader;
import java.io.IOException;
public class Q1924 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int[] arr = {0,31,28,31,30,31,30,31,31,30,31,30,31};
		String[] day = {"MON","TUE", "WED", "THU", "FRI", "SAT", "SUN"};
		
		int M = Integer.parseInt(st.nextToken());
		int D = Integer.parseInt(st.nextToken());
		int sum =0;
		for(int i=0;i<M;i++) {
			sum+=arr[i];
		}
		sum += D-1;
		int avg = sum % 7;
		if(avg>6) avg-=7;
		bw.write(day[avg]);
		br.close();
		bw.close();
	}

}

```

## 문제풀이

2007년 1월 1일은 월요일이라고 하였을 때 M과 D를 입력받아 M월D일은 무슨 요일인지 구하는 문제이다. 2007년은 1, 3, 5, 7, 8, 10, 12월은 31일까지, 4, 6, 9, 11월은 30일까지, 2월은 28일까지 있다. 

DP문제는 머리속에 있는 풀이과정을 코드로 옮겨쓰면 된다. 

이 문제 같은 경우는 요일은 7개가 반복되기 때문에 M-1월까지의 날짜 합을 구한다음 D일을 더해 sum변수에 저장한다.

그 값을 무슨 요일인지 찾기 위해선 반복되는 주 즉 7을 나눈 나머지 값을 배열에서 찾아나가면 해당 요일이 나올것이라 생각했다.

때문에 sum을 7로 나눈 나머지를 avg에 담아준다. 만약 avg가 6보다 크다면 아직 한 주를 더 돌수 있는 것이기 때문에 7을 빼주었다. 

그 다음 요일을 담아놓은 배열 day에 avg위치에 있는 값을 출력해주면 된다.