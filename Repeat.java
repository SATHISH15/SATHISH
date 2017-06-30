package Guvi;

import java.util.Scanner;

public class Repeat {
public static void main(String[] args){
	Scanner s=new Scanner(System.in);
int n=s.nextInt();
int arr[]=new int[n];
for(int i=0;i<n;i++){
	arr[i]=s.nextInt();
}
for(int i=0;i<n;i++){
	for(int j=i+1;j<n;j++){
		if(arr[i]==arr[j]){
			System.out.println("Repeating number : "+arr[j]);
		}
	}
}
}
}
