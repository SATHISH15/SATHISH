package Guvi;

import java.util.Scanner;

public class ProP15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("Enter the size");
int size=s.nextInt();
System.out.println("Enter the element");
int arr[]=new int[size];
for(int i=0;i<size;i++){
	arr[i]=s.nextInt();
}int temp;
for(int i=0;i<size;i++){
	for(int j=i+1;j<size-i;j++){
		if(arr[i]<arr[j]){
			temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
	}
}
for(int i=0;i<size;i++){
	System.out.println("\n\t"+arr[i]);
}s.close();
	}

}
