package govi_programs;
import java.util.*;
public class pro33 {
	public static void main(String[] args) {
	Scanner ss =new Scanner(System.in);
	String s1=ss.next();
	String ls="";
	int l=s1.length();
	for(int i=1;i<l;i++){
		 int diff=(int)s1.charAt(i)-(int)s1.charAt(i-1);
		 if(diff>0){
			 ls=s1.substring(i);
			 i=l+1;		 
		 }
	}
	if(ls.length()==0){
		System.out.println("Therw is no largest string");
	}
	else
		System.out.println("Largest substring for Given Input is: "+ls);
	}

}