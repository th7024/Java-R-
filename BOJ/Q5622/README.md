# [5622] 다이얼

## 분류
> 구현

## 코드
```java
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Q5622 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] str = br.readLine().split("");
		int sum=0;
		for(int i=0;i<str.length;i++) {
			switch(str[i]) {
			case "A":
			case "B":
			case "C":
				sum+=3;
				break;
			case "D":
			case "E":
			case "F":
				sum+=4;
				break;
			case "G":
			case "H":
			case "I":
				sum+=5;
				break;
			case "J":
			case "K":
			case "L":
				sum+=6;
				break;
			case "M":
			case "N":
			case "O":
				sum+=7;
				break;
			case "P":
			case "Q":
			case "R":
			case "S":
				sum+=8;
				break;
			case "T":
			case "U":
			case "V":
				sum+=9;
				break;
			case "W":
			case "X":
			case "Y":
			case "Z":
				sum+=10;
				break;
			}
		}
		bw.write(sum+"\n");
		br.close();
		bw.flush();
		bw.close();
	}

}

```

## 문제풀이

문자열을 배열로 입력받고 각 종류에 맞게 출력값을 더해주고 마지막에 출력을 해주면 되는 문제