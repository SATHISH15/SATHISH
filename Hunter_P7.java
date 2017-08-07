package Guvi;

import java.util.Scanner;

public class Hunter_P7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner ss=new Scanner(System.in);
int Size=ss.nextInt();
int arr[]=new int[Size];
int count[]=new int[1000];
for(int i=0;i<Size;i++){
arr[i]=ss.nextInt();
count[arr[i]]++;
}for(int i=0;i<count.length;i++){
	if(count[i]==1){
		System.out.println(i);
	}
}

	}

}
