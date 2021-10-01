# [1149] RGB거리

## 분류
> 구현
>
> 문자열

## 코드
```java
import java.util.*;
public class Q1152 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		String[] arr = str.split(" ");
		int cnt=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i].equals("")) cnt++; 
		}
		System.out.print(arr.length-cnt);
	}
}

```

## 문제풀이

문자열을 입력받고 단어의 개수를 출력하는 문제이다.

단어는 공백 한 개로 구분되며, 공백이 연속해서 나오는 경우는 없다. 또한 문자열은 공백으로 시작하거나 끝날 수 있다.

문자열 str을 입력받고 split을 통해 배열에 넣어주었다.

공백은 문자열 시작이나 끝나는 지점에도 올 수 있기 때문에 cnt변수를 만들어 arr[i]가 ""아무것도 없는 경우에는 cnt를 증가시켜준다.

그 후 배열의 길이에서 cnt를 빼주면 단어의 개수가 나온다.

