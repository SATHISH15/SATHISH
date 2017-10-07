package dsad;

import java.util.*;

public class Hunter24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ss=new Scanner (System.in);
		int N=ss.nextInt();
		int arr[]=new int[N];
		for(int i=0;i<N;i++) {
			arr[i]=ss.nextInt();
		}
		int T=ss.nextInt();
		for(int i=0;i<N;i++) {
			for(int j=i+1;j<N;j++) {
				if(arr[i]+arr[j]==T) {
					System.out.println(arr[i]+" "+arr[j]+" These two elements are the adding gives the Target "+T);
				}
			}
		}
	}

}
