package dsad;

import java.util.*;

public class Hunter12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ss=new Scanner(System.in);
		int Member=ss.nextInt();
		int arr[]=new int[Member];
		for(int i=0;i<Member;i++) {
			arr[i]=ss.nextInt();
		}
		int k=ss.nextInt();
		Arrays.sort(arr);
		System.out.println(arr[Member-k]);
	}

}
