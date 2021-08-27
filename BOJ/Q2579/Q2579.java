import java.util.*;
public class Q2579 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in); 
		int N =sc.nextInt();
		int[] arr = new int[N+1];
		int[] result1 = new int[N+1];
		int[] result2 = new int[N+1];
		for(int i=1; i<=N;i++) {
			arr[i]=sc.nextInt();
		}
		result2[1] = arr[1];
		for(int i=2;i<=N;i++) {
			result1[i] = arr[i] + result2[i-1];
			result2[i] = arr[i] + Math.max(result1[i-2], result2[i-2]);
		}
		System.out.print(Math.max(result1[N], result2[N]));
	}
}

