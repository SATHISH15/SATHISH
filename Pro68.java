package dsad;

import java.util.*;

public class Pro68 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ss=new Scanner(System.in);
	String str=ss.next();
	String str1=ss.next();
	String str2=ss.next();
	int N=ss.nextInt();
	String sn="";
	String ln="";
	int l1=str.length();
	int l2=str1.length();
	if(l1>l2) {
		ln=str;
		sn=str1;
	}else if(l1<l2) {
		ln=str1;
		sn=str;
	}else {
		if(str.compareTo(str1)>0) {
			ln=str;
			sn=str1;
		}else if(str.compareTo(str1)<0) {
			ln=str1;
			sn=str;
		}else {
			ln=str;
			sn=str1;
		}
	}
	char ch=str.charAt(0);
	char ch1=str2.charAt(N-1);
	char ch2=str2.charAt(str2.length()-N);
	String out=ch+sn+ch1+ch2;
	for(int i=0;i<out.length();i++) {
		char ch11=out.charAt(i);
		if(Character.isLetter(ch11)) {
			if(Character.isUpperCase(ch11)) {
				System.out.print((ch11+"").toLowerCase());
			}else {
				System.out.print((ch11+"").toUpperCase());
			}
		}else {
			System.out.print(ch11);
		}
	}
	
}

}
