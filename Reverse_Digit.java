package Guvi;

import java.util.Scanner;

public class Reverse_Digit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int digit=(int)Math.log10(n)+1;
int temp;
int a[]=new int[digit];
for(int i=0;i<digit;i++){
	temp=n%10;
	a[i]=temp;
	n=n/10;
}for(int i=0;i<digit;i++){
System.out.print(a[i]);
}s.close();
	}

}
