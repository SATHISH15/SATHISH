package dsad;

import java.util.*;

public class Hunter55 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ss=new Scanner(System.in);
		int n=ss.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=ss.nextInt();
		int d=ss.nextInt();
		rotate(n,arr,d);
	}
	static void rotate(int n,int[] arr,int d) {
		for(int i=0;i<d;i++) {
			int temp=arr[0];
			for(int j=0;j<n-1;j++) {
				arr[j]=arr[j+1];}
			arr[n-1]=temp;
		}
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
