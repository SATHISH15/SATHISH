package Guvi;

import java.util.Scanner;

public class Deleting_KNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Enter the input");
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int digit=(int)Math.log10(n)+1;
int arr[]=new int[digit];
int temp;
for(int i=digit-1;i>=0;i--){
	temp=n%10;
	arr[i]=temp;
    n=n/10;
}int temp1;
for(int i=0;i<digit;i++){
	for(int j=i+1;j<digit;j++){
		if(arr[i]>arr[j]){
			temp1=arr[i];
			arr[i]=arr[j];
			arr[j]=temp1;
		}
	}
}
	System.out.println("enter the Deliting digit");
	int k=s.nextInt();
	for(int i=digit-1;i>digit-(k+1);i--){
		arr[i]=0;
	}
	for(int i=0;i<digit;i++){
		if(arr[i]!=0){
			System.out.print(arr[i]);
		}
	}
	}

}
