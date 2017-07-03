package Guvi;

import java.util.Scanner;

public class Ascii_Password {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Enter the User name");
Scanner s=new Scanner(System.in);
String name=s.next();
int sum=0;
byte arr[]=name.getBytes();
for(int i=0;i<arr.length;i++){
	sum=sum+arr[i];
}int average=sum/arr.length;
System.out.println((char)average);
s.close();
	}

}
