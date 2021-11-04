# [21965] 드높은 남산 위에 우뚝 선

## 분류
> 구현

## 코드
```java
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q21965 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<n;i++) {
			arr[i]=Integer.parseInt(st.nextToken());
		}
		
		int cnt=0;
		for(int i=0;i<n-1;i++) {
			if(cnt==1) {
				if(arr[i]<arr[i+1]) {
					cnt=2;
					break;
				}
			}
			if(arr[i]<arr[i+1]) {
				continue;
			}
			else if(arr[i]==arr[i+1]) {
				cnt=2; 
				break;
			}
			else {
				cnt=1;
			}
		}
		if(cnt==2) bw.write("NO");
		else bw.write("YES");
		
		br.close();
		bw.flush();
		bw.close();
	}
}

```

## 문제풀이

N크기의 수열을 입력받고 산을 구하는 문제이다.  산이라는 것은 어떤 지점 이전까지는 증가하다가, 해당 지점부터 감소하는 것을 의미한다.

수열은 배열에 담아주었으며 for문을 통해 산을 구해주었다.

산인 경우는 

1. 꾸준히 증가

2.  증가하다가 특정 부분부터 감소 

   총 2가지가 있다.

   만약 연속되는 수가 같거나 감소하였는데 다시 증가한다면 그것은 산이 아니다.

   조건문을 통해 같은 경우에는 바로 break를 시켜주었고, 감소를 했다가 다시 증가를 한 경우 역시 break를 시켜 NO를 출력해주었다.