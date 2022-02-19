# 없는 숫자 더하기

## 문제 설명

수많은 마라톤 선수들이 마라톤에 참여하였습니다. 단 한 명의 선수를 제외하고는 모든 선수가 마라톤을 완주하였습니다.

마라톤에 참여한 선수들의 이름이 담긴 배열 participant와 완주한 선수들의 이름이 담긴 배열 completion이 주어질 때, 완주하지 못한 선수의 이름을 return 하도록 solution 함수를 작성해주세요.

##### 제한사항

- 마라톤 경기에 참여한 선수의 수는 1명 이상 100,000명 이하입니다.
- completion의 길이는 participant의 길이보다 1 작습니다.
- 참가자의 이름은 1개 이상 20개 이하의 알파벳 소문자로 이루어져 있습니다.
- 참가자 중에는 동명이인이 있을 수 있습니다.

##### 입출력 예

| participant                                       | completion                               | return   |
| ------------------------------------------------- | ---------------------------------------- | -------- |
| ["leo", "kiki", "eden"]                           | ["eden", "kiki"]                         | "leo"    |
| ["marina", "josipa", "nikola", "vinko", "filipa"] | ["josipa", "filipa", "marina", "nikola"] | "vinko"  |
| ["mislav", "stanko", "mislav", "ana"]             | ["stanko", "ana", "mislav"]              | "mislav" |

##### 입출력 예 설명

예제 #1
"leo"는 참여자 명단에는 있지만, 완주자 명단에는 없기 때문에 완주하지 못했습니다.

예제 #2
"vinko"는 참여자 명단에는 있지만, 완주자 명단에는 없기 때문에 완주하지 못했습니다.

예제 #3
"mislav"는 참여자 명단에는 두 명이 있지만, 완주자 명단에는 한 명밖에 없기 때문에 한명은 완주하지 못했습니다.

## 코드
```java
package Programmers;
import java.util.Arrays;
public class Q220219_1 {

	public static void main(String[] args) {
		
		class Solution {
		    public String solution(String[] participant, String[] completion) {
		        
		        Arrays.sort(participant);
		        Arrays.sort(completion);
		        int i;
		        for(i=0;i<completion.length;i++){
		            if (!participant[i].equals(completion[i])){
		                return participant[i];
		            }
		        }
		        return participant[i];
		    }
		}

	}

}

```

## 문제 풀이

마라톤 선수 명단 participant, 완주자 completion이 주어졌을 때, 완주하지 못한 사람을 구하는 문제이다.

배열을 첫 인덱스 부터 비교해 다른 값이 있으면 그 값을 출력하고, 만약 반복문이 끝까지 다 돌았다면 참가자 배열의 마지막 값이 완주를 못한거기 때문에 마지막 인덱스를 출력해주면 된다.

제대로 된 비교를 위해 Arrays.sort()함수를 이용해 정렬을 해준 후 비교해 주었다.

반복문에서 equals()함수를 통해 비교하고 만약 같지 않다면 i위치의 참가자 배열 값을 출력해주었다.

