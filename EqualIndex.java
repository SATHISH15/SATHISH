package Guvi;

import java.util.Scanner;

public class EqualIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);

System.out.println("Enter the Array size");
int size=s.nextInt();
System.out.println("Enter the Array Element :");
int arr[]=new int[size];
for(int i=0;i<size;i++){
arr[i]=s.nextInt();	
}
	
	System.out.println("Enter the Index value :");
		int index=s.nextInt();
if(index==arr[index]){
	System.out.println("Equal of Index");
}else{
	System.out.println("Not Equal");
}
s.close();
	}

}
