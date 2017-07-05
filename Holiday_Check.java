package Guvi;

import java.util.Scanner;

public class Holiday_Check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
String day=s.next();
if(day.equalsIgnoreCase("sunday")){
	System.out.println("False");
}else{
	System.out.println("True");
}s.close();

	}

}
