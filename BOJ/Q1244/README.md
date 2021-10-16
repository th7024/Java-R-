# [1244] 스위치 켜고 끄기

## 분류
> 구현
>
> 시뮬레이션

## 코드
```java
package BOJ;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q1244 {
	static int swi, stu;
	static int[] arr;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		swi = Integer.parseInt(br.readLine());
		arr = new int[swi + 1];
		StringTokenizer st = new StringTokenizer(br.readLine());

		for (int i = 1; i <= swi; i++) { // 배열입력
			arr[i] = Integer.parseInt(st.nextToken());
		}

		stu = Integer.parseInt(br.readLine());

		for (int i = 0; i < stu; i++) {
			st = new StringTokenizer(br.readLine());
			int gender = Integer.parseInt(st.nextToken());
			int idx = Integer.parseInt(st.nextToken());

			if (gender == 1) {
				for (int j = idx; j <= swi; j += idx) {
					if (arr[j] == 1)
						arr[j] = 0;
					else
						arr[j] = 1;
				}
			}

			else {
				for (int j = 1;; j++) {
					if (j == 1) {
						if (arr[idx] == 0)
							arr[idx] = 1;
						else
							arr[idx] = 0;
					}

					if (idx - j < 1 || idx + j > swi)
						break;
					else {
						if (arr[idx + j] == arr[idx - j]) {
							if (arr[idx + j] == 0)
								arr[idx + j] = 1;
							else
								arr[idx + j] = 0;
							if (arr[idx - j] == 0)
								arr[idx - j] = 1;
							else
								arr[idx - j] = 0;
						} else
							break;
					}
				}
			}
		}
		for (int k = 1; k <= swi; k++) {
			System.out.print(arr[k] + " ");
			if(k%20==0)System.out.println(); 
		}
		//System.out.print("\b");
	}
}
```

## 문제풀이

1부터 연속적으로 번호가 붙어있는 스위치들이 있다. 스위치는 켜져 있거나 꺼져있는 상태이다. <그림 1>에 스위치 8개의 상태가 표시되어 있다. ‘1’은 스위치가 켜져 있음을, ‘0’은 꺼져 있음을 나타낸다. 그리고 학생 몇 명을 뽑아서, 학생들에게 1 이상이고 스위치 개수 이하인 자연수를 하나씩 나누어주었다. 학생들은 자신의 성별과 받은 수에 따라 아래와 같은 방식으로 스위치를 조작하게 된다.

남학생은 스위치 번호가 자기가 받은 수의 배수이면, 그 스위치의 상태를 바꾼다. 즉, 스위치가 켜져 있으면 끄고, 꺼져 있으면 켠다. <그림 1>과 같은 상태에서 남학생이 3을 받았다면, 이 학생은 <그림 2>와 같이 3번, 6번 스위치의 상태를 바꾼다.

여학생은 자기가 받은 수와 같은 번호가 붙은 스위치를 중심으로 좌우가 대칭이면서 가장 많은 스위치를 포함하는 구간을 찾아서, 그 구간에 속한 스위치의 상태를 모두 바꾼다. 이때 구간에 속한 스위치 개수는 항상 홀수가 된다.

| 스위치 번호 | ①    | ②    | ③    | ④    | ⑤    | ⑥    | ⑦    | ⑧    |
| :---------- | ---- | ---- | ---- | ---- | ---- | ---- | ---- | ---- |
| 스위치 상태 | 0    | 1    | 0    | 1    | 0    | 0    | 0    | 1    |

<그림 1>

예를 들어 <그림 2>에서 여학생이 3을 받았다면, 3번 스위치를 중심으로 2번, 4번 스위치의 상태가 같고 1번, 5번 스위치의 상태가 같으므로, <그림 3>과 같이 1번부터 5번까지 스위치의 상태를 모두 바꾼다. 만약 <그림 2>에서 여학생이 4를 받았다면, 3번, 5번 스위치의 상태가 서로 다르므로 4번 스위치의 상태만 바꾼다.

| 스위치 번호 | ①    | ②    | ③    | ④    | ⑤    | ⑥    | ⑦    | ⑧    |
| :---------- | ---- | ---- | ---- | ---- | ---- | ---- | ---- | ---- |
| 스위치 상태 | 0    | 1    | 1    | 1    | 0    | 1    | 0    | 1    |

<그림 2>

| 스위치 번호 | ①    | ②    | ③    | ④    | ⑤    | ⑥    | ⑦    | ⑧    |
| :---------- | ---- | ---- | ---- | ---- | ---- | ---- | ---- | ---- |
| 스위치 상태 | 1    | 0    | 0    | 0    | 1    | 1    | 0    | 1    |

<그림 3>

시뮬레이션은 문제에서 요구하는 것을 하나하나씩 차례대로 해나가는 것이다. 스위치의 정보를 담고 있는 배열 arr을 만들고 각 배열은 스위치의 상태를 담고있다.

gender변수로 성별을 구분하며 idx 스위치에서 연산을 시작한다.

남학생의 경우 배수를 찾아 연산을 하기 때문에 반복문을 배수를 찾을 수 있도록 구현해주었다.

```
for (int j = idx; j <= swi; j += idx) {
					if (arr[j] == 1)
						arr[j] = 0;
					else
						arr[j] = 1;
				}
```

여학생의 경우에는 먼저 idx의 위치를 정보를 바꾸어 주고  반복문을 통해 idx기준으로 j만큼의 차이에 있는 값(대칭)이 같은지 확인 후 변경해준다.

변경을 하는 과정에서 idx+j가 swi보다 크거나 idx-j가 1보다 작은 경우에는 break를 통해 연산을 종료시켜준다.

```
for (int j = 1;; j++) {
					if (j == 1) {
						if (arr[idx] == 0)
							arr[idx] = 1;
						else
							arr[idx] = 0;
					}

					if (idx - j < 1 || idx + j > swi)
						break;
					else {
						if (arr[idx + j] == arr[idx - j]) {
							if (arr[idx + j] == 0)
								arr[idx + j] = 1;
							else
								arr[idx + j] = 0;
							if (arr[idx - j] == 0)
								arr[idx - j] = 1;
							else
								arr[idx - j] = 0;
						} else
							break;
					}
				}
```

