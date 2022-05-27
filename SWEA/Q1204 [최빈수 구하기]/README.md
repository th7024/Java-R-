# [1204] 최빈수 구하기

## 분류
> 

## 코드
```java
package day15;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Q1204_swea {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int testcase = Integer.parseInt(br.readLine());
		for(int i=0;i<testcase;i++) {
			int n = Integer.parseInt(br.readLine());
			int[] arr = new int[101];
				String[] s = br.readLine().split(" ");
				for(int j=0;j<s.length;j++) {
					int a = Integer.parseInt(s[j]);
					arr[a]+=1;					
				}
			int max = Integer.MIN_VALUE;
			ArrayList<Integer> al = new ArrayList<>();
			for(int j=0;j<arr.length;j++) {
				if(arr[j]>max) {
					max = arr[j];
				}
			}
			for(int j=0;j<arr.length;j++) {
				if(arr[j]==max) {
					al.add(j);
				}
			}
			Collections.sort(al, Collections.reverseOrder());
			System.out.println("#"+n+" "+al.get(0));
		}
	}
}

```

## 문제풀이

0~100까지 점수를 1000개 입력 받았을 때 가장 많이 나오는 점수를 출력하는 문제이다. (나온 횟수가 동일한 경우에는 가장 큰 점수를 출력한다.)

먼저 arr배열을 만들어준 후 배열안에 정보를 다 넣어주었다. 점수는 arr의 index로 대체하였고 나온 횟수는 arr[index]의 값이다.

그 다음에 나온 횟수의 최대값을 구해준다. 

마지막 반복문에서는 횟수가 동일한 경우를 고려하기 위해 ArrayList를 만들어주고 arr[j]의 값이 max인 값들을 모두 어레이리스트에 담아준다.

그 후 arrayList를 내림차순으로 정렬하면 0번째 인덱스에 가장 큰 정수가 나오게 된다.