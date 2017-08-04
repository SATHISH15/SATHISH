package Guvi;

import java.util.*;

public class Pro_p62 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner ss=new Scanner(System.in);
String s1 = ss.next();
ArrayList<String> al=new ArrayList<String>();
for(int i=0;i<s1.length();i++){
	for(int j=0;j<s1.length()-(i+1);j++){
		String s2=s1.substring(j,j+i+2);
		StringBuffer sf=new StringBuffer(s2);
		String s3=String.valueOf(sf.reverse());
		if(s2.equals(s3)){
		al.add(s2);
	}
	}
}
System.out.println(al.get(al.size()-1));
	}

}
