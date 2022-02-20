# 없는 숫자 더하기

## 문제 설명

배열 array의 i번째 숫자부터 j번째 숫자까지 자르고 정렬했을 때, k번째에 있는 수를 구하려 합니다.

예를 들어 array가 [1, 5, 2, 6, 3, 7, 4], i = 2, j = 5, k = 3이라면

1. array의 2번째부터 5번째까지 자르면 [5, 2, 6, 3]입니다.
2. 1에서 나온 배열을 정렬하면 [2, 3, 5, 6]입니다.
3. 2에서 나온 배열의 3번째 숫자는 5입니다.

배열 array, [i, j, k]를 원소로 가진 2차원 배열 commands가 매개변수로 주어질 때, commands의 모든 원소에 대해 앞서 설명한 연산을 적용했을 때 나온 결과를 배열에 담아 return 하도록 solution 함수를 작성해주세요.

##### 제한사항

- array의 길이는 1 이상 100 이하입니다.
- array의 각 원소는 1 이상 100 이하입니다.
- commands의 길이는 1 이상 50 이하입니다.
- commands의 각 원소는 길이가 3입니다.

##### 입출력 예

| array                 | commands                          | return    |
| --------------------- | --------------------------------- | --------- |
| [1, 5, 2, 6, 3, 7, 4] | [[2, 5, 3], [4, 4, 1], [1, 7, 3]] | [5, 6, 3] |

##### 입출력 예 설명

[1, 5, 2, 6, 3, 7, 4]를 2번째부터 5번째까지 자른 후 정렬합니다. [2, 3, 5, 6]의 세 번째 숫자는 5입니다.
[1, 5, 2, 6, 3, 7, 4]를 4번째부터 4번째까지 자른 후 정렬합니다. [6]의 첫 번째 숫자는 6입니다.
[1, 5, 2, 6, 3, 7, 4]를 1번째부터 7번째까지 자릅니다. [1, 2, 3, 4, 5, 6, 7]의 세 번째 숫자는 3입니다.

## 코드
```java
package Programmers;
import java.util.Arrays;
//K번째 수
public class Q220221_1 {
	class Solution {
	    public int[] solution(int[] array, int[][] commands) {
	        int[] answer = new int[commands.length];
	 
	    for(int i=0;i<commands.length;i++){
	        int num = (commands[i][1]-1)-(commands[i][0]-1)+1;
	        int sn = (commands[i][0]-1);
	        int []newArr = new int[num];
	            
	        for(int j=0;j<num;j++) newArr[j]=array[sn+j];
	            
	        Arrays.sort(newArr);
	        answer[i]=newArr[commands[i][2]-1];
	    }
	        return answer;
	    }
	}
}
```

## 문제 풀이

commands는 명령을 담고 있는 배열이기 때문에 배열의 길이만큼 반복문을 돌려준다.

num은 부분배열의 길이며, sn은 배열에 담을 시작 인덱스 정보, newArr은 부분배열이 담기는 배열이다. 

반복문안에서 newArr[i]에 array배열의 sn부터 sn+j(num)까지 값을 넣어준다.

num만큼 돌리기 때문에 sn+j만큼 하면 부분수열의 마지막 인덱스 위치까지 값이 들어간다.

그 다음 sort함수를 통해 정렬을 해주고

answer배열에 newArr에서 commands[i]의[2] 즉 필요한 값을 빼 담아준다.



