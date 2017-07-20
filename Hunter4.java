package Guvi_Problems;

import java.util.Scanner;

public class Hunter4 {
public static void main(String args[]){
	Scanner ss=new Scanner(System.in);
	System.out.println("Enter the size of array : ");
	int s=ss.nextInt();
	int arr[]=new int[s];
	System.out.println("Enter the "+s+" Elements :");
	for(int i=0;i<s;i++){
		arr[i]=ss.nextInt();
	}
	int count[]=new int[1000];
	for(int i=0;i<s;i++){
		count[arr[i]]++;
	}for(int i=0;i<count.length;i++){
	if((count[i]!=0)&&(count[i]!=2)){
	System.out.println("The unique Element is : "+i);
	}
	
	}ss.close();
}
}
