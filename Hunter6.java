package Guvi_Problems;
import java.util.Scanner;
public class Hunter6 {
	public static void main(String args[]){
		Scanner ss=new Scanner(System.in);
		System.out.println("Enter the size of array : ");
		int s=ss.nextInt();
		int arr[]=new int[s];
		int count[]=new int[1000];
		System.out.println("Enter the "+s+" Elements :");
		for(int i=0;i<s;i++){
			arr[i]=ss.nextInt();
			count[arr[i]]++;
		}
		
		
			if(count[arr[0]]>1){
				System.out.println(arr[0]+" is repeated for "+(count[arr[0]]-1)+" Times");
			}
				
		ss.close();
	}
	}


