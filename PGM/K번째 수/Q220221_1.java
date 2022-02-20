package Programmers;
import java.util.Arrays;
//K¹øÂ° ¼ö
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
