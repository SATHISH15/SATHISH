package Guvi;

import java.util.Scanner;

public class Find_digit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Enter the Integer Value :");
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int digit=(int)Math.log10(n)+1;
	System.out.println("The Digit of Integer is : "+digit);
	s.close();
	}

}
