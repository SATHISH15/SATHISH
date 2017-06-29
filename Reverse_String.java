package Guvi;

import java.util.Scanner;

public class Reverse_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
String str1=s.next();
StringBuffer sb1=new StringBuffer(str1);
StringBuffer sb2=sb1.reverse();
String str2= sb2.toString();
System.out.println("Reverse String is : "+str2);


	}

}
