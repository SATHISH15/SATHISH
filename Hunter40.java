package dsad;

import java.util.Scanner;

public class Hunter40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ss=new Scanner(System.in);
		int N=ss.nextInt();
		int temp=N;
		int sum=0;
		while(N!=0) {
			int t=N%10;
			sum+=t;
			N/=10;
		}
		int reverse=0;
		int sum1=sum;
		while(sum!=0) {
			int t1=sum%10;
			reverse=(reverse*10)+t1;
			sum/=10;
		}
		if(sum1==reverse) {
			System.out.println("Given number digit sum is palindrome");
		}else {
			System.out.println("Given number digit sum is not palindrome");
		}
	
	}
}
