package Guvi;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int sum=1;
for(int i=1;i<=n;i++){
	sum=sum*i;
}
System.out.println("Factorial of the given number is : "+sum);
s.close();
	}

}
