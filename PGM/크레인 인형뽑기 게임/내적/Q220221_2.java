package Programmers;
//³»Àû
public class Q220221_2 {
	class Solution {
	    public int solution(int[] a, int[] b) {
	        int answer =0;
	        for(int i=0;i<a.length;i++){
	            answer+=a[i]*b[i];
	        }
	        return answer;
	    }
	}
}
