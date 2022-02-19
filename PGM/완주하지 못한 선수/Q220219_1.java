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
