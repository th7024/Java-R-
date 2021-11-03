# [10989] 수정렬하기 3

## 분류
> 정렬

## 코드
```java
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Q10989 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		for(int i=0;i<n;i++) arr[i]=Integer.parseInt(br.readLine());
		
		Arrays.sort(arr);
		for(int i=0;i<n;i++)bw.write(arr[i]+"\n");
		
		bw.flush();
		br.close();
		bw.close();
		
	}
}

```

## 문제풀이

N을 입력받고 N개의 수를 오름차순으로 정렬하는 문제이다.

배열을 선언하고 N개의 수를 배열에 담아준다.

그 후 sort함수를 이용해 배열을 정렬해준다.