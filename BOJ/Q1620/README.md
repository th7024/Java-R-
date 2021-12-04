# [1620] 나는야 포켓몬 마스터 이다솜

## 분류
> 자료 구조
>
> 해시를 사용한 집합과 맵

## 코드
```java
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Q1620 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		Map<String, Integer> hs = new HashMap<>();
		String[] pocket = new String[N+1];
		for(int i=1;i<=N;i++) {
			String s = br.readLine();
			hs.put(s,i);
			pocket[i]= s;
		}
		for(int i=0;i<M;i++) {
			String str = br.readLine();
			char c = str.charAt(0);
			if(('a'<=c&&c<='z')||('A'<=c&&c<='Z')) {
				bw.write(hs.get(str)+"\n");
			}
			else {
				int num = Integer.parseInt(str);
				bw.write(pocket[num]+"\n");
			}
		}
		br.close();
		bw.flush();
		bw.close();

	}

}

```

## 문제풀이

N개의 포켓몬을 입력받고 M개의 찾고 싶은 포켓몬을 입력받는다.

M개의 입력은 포켓몬 이름으로 들어올수도 있으며, 찾고자하는 포켓몬의 번호로 주어질 수도 있다.

이름으로 찾는 경우에는 포켓몬 번호를 출력하여야 하고, 번호로 주어진 경우에는 포켓몬의 이름을 출력해야한다.

결국 문자를 입력받으면 숫자를 숫자를 입력받으면 문자를 입력하여야하는데, 문자를 입력받아 숫자를 출력하는 경우는 해시맵을 이용하여 구현하였다. 해시맵은 Key, Value로 구성되어 있어, 포켓몬 이름을 Key로 설정해 Key에 맞는 Value(번호)를 출력해 주었다. 

다음은 번호를 입력받아 이름을 출력하는 경우인데 이 경우는 문자열 배열을 이용하였다.

번호는 각 배열의 인덱스를 나타내며 해당 인덱스의 값을 출력해주면 된다.



