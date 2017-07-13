import java.util.Scanner;
public class Pro68 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the First Name : ");
	String s=sc.nextLine();
	System.out.println("Enter the last Name : ");
	String s1=sc.nextLine();
	System.out.println("Enter the 6 digit Pin no. : ");
	String s2=sc.nextLine();
	System.out.println("Enter the value of N : ");
	int n=sc.nextInt();
	int len=s.length();
	int len1=s1.length();
	int len2=s2.length();
	char h = 0,j=0;
	String longer="";
	String smaller="";
	if(len!=len1)
	{
		longer=s.substring(0,1);
		smaller=s1.substring(0,len1);
	}
else if(len==len1)
	{
		char a=s.charAt(0);
		char b=s1.charAt(0);
		int c=(int) a;
		int d=(int) b;
		if(c<d)
		{
			char e=(char) c;
			longer=String.valueOf(e);
			smaller=s1;
		}
		else
		{
			char e=(char) d;
			longer=String.valueOf(e);
			smaller=s;
		}
	}
	h=s2.charAt(n-1);
	String s5=new StringBuffer(s2).reverse().toString();
	j=s5.charAt(n-1);
	System.out.println(longer+smaller+h+j);
}
}
