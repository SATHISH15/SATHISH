import java.util.Scanner;

public class ProP61 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
String str1=s.next();
String str2=s.next();
String str11="";
for(int i=0;i<str1.length();i++){
	char ch=str1.charAt(i);
	int a1=(int)ch+10;
	char ch1=(char)a1;
	str11+=ch1;
}System.out.println(str11);
String str12="";
char ch1=str2.charAt(0);
System.out.print(ch1);
int a2=(int)str2.charAt(1)+5;
if(a2>122){
	int b1=a2-122;
	a2=b1;
	char ch3=(char)(a2+96);
	System.out.print(ch3);
}else{
char ch3=(char)(a2+5);
System.out.print(ch3);
}
int a3=(int)str2.charAt(2)+10;
if(a3>122){
	int b2=a3-122;
	a3=b2;
	char ch4=(char)(a3+96);
	System.out.print(ch4);
}else{
char ch4=(char)(a3+5);
System.out.print(ch4);
}

char ch2=str2.charAt(str2.length()-1);
System.out.print(ch2);
	}

}
