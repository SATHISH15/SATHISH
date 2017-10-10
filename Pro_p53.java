package govi_programs;
import java.util.Scanner;
public class Pro_p53 {
public static void main(String[] args) {
	Scanner ss=new Scanner(System.in);
	String str1=ss.nextLine();
	int c1=0;
	String str=str1.toLowerCase();
	System.out.println(str.length());
	if(str.length()<=25) {
		System.out.println("Not a pangram");
	}else {
	for(char c='a';c<='z';c++) {
		String ch=c+"";
		if(str1.contains(ch)){
			c1++;
		}
	}
	if(c1==26) {
		System.out.println("This is pangram");
	}else {
		System.out.println("Not a pangram");
	}
}
}
}
