package Guvi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Pro_P69 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner ss=new Scanner(System.in);
String s1=ss.next();
char[] ch1=s1.toCharArray();
ArrayList<String> al=new ArrayList<String>();
for(int i=0;i<ch1.length;i++){
	if(Character.isDigit(ch1[i])){
	String str=String.valueOf(ch1[i]);
	al.add(str);
	}
}
Collections.sort(al);
int small=Integer.parseInt(al.get(0));
System.out.println(small);
int large=Integer.parseInt(al.get(al.size()-1));
System.out.println(large);
int sum1=0,sum2=1;
int sum=0,sum3=0;
for(int i=0;i<al.size();i++){
	int a=Integer.parseInt(al.get(i));
	sum1+=(large*a);
	sum2*=(small+a);
}
System.out.println(sum1);
System.out.println(sum2);
if(sum1>9){
	while(sum1>0){
	while(sum1!=0){
		sum+=sum1%10;
		sum1/=10;
	}
		if(sum>9){
			sum1=sum;
			sum=0;
		}
	}
}
if(sum2>9){
	while(sum2>0){
	while(sum2!=0){
		sum3+=sum2%10;
		sum2/=10;
	}
		if(sum3>9){
			sum2=sum3;
			sum3=0;	
		}
	}System.out.println(sum3);
	System.out.println(sum);
}int out;
if(sum>sum3){
	out=sum3*sum3;
	System.out.println(out);
}else{
	out=sum*sum;
	System.out.println(out);
}

	}

}
