import java.util.*;
public class Q2193 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] arr = new long[n+1];
		if(n<2) {
			System.out.print(n);
		}
		else {
			arr[0]=1;
			arr[1]=1;
			arr[2]=1;
			for(int i=3;i<=n;i++) {
				arr[i]=arr[i-1]+arr[i-2];
			}
			System.out.print(arr[n]);
		}
	}
}
