# [1764] 듣보잡

## 분류
> 자료 구조
>
> 문자열
>
> 정렬
>
> 해시를 사용한 집합과 맵

## 코드
```java
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Q1764 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		HashSet<String> hash = new HashSet<String>();
		ArrayList<String> al = new ArrayList<String>();
		
		for(int i=0;i<N;i++) {
			hash.add(br.readLine());
		}
		for(int i=0;i<M;i++) {
			String s = br.readLine();
			if(hash.contains(s)) {
				al.add(s);
			}
		}
		Collections.sort(al);
		bw.write(al.size()+"\n");
		for(int i=0;i<al.size();i++) {
			bw.write(al.get(i)+"\n");
		}
		bw.flush();
		br.close();
		bw.close();
	}
}

```

## 문제풀이

들어보지 못한 이름 N개와 보도 못한 이름 M개가 주어질 떄, 듣도 보도 못한 이름을 구하는 문제이다.

맨 처음에는 배열을 한 개 입력받고 입력받는 문자열(M개)마다 N크기의 듣도 못한 이름이 들어있는 배열과 비교해 같다면 다른 배열에 추가시켜 주었다.  이중 for문을 이용해서 구현하였더니 시간 초과가 발생했다. 때문에 찾아보니 해시셋을 이용한다고 한다.

```java
for(int i=0;i<M;i++) {
			String s = br.readLine();
			for(int j=0;j<N;j++) {
				if(s.equals(str[j])) {
					check[j]+=1;
					cnt++;
				}
			}
		}
```

해시셋을 만들어 N개를 입력받는다. 그 다음 M개의 문자열과 비교할 때 반복문을 이용하지 않고, contains함수를 이용해서 비교를 해준다. 같은 값이 있다면 arraylist에 추가해주고, arraylist를 출력해준다.