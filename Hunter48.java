package dsad;

import java.util.*;

public class Hunter48 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ss=new Scanner(System.in);
		String str=ss.nextLine();
		String str1=ss.nextLine();
		int c=0;
		int l=str1.length();
		for(int i=0;i<str.length()-l+1;i++) {
			String str2=str.substring(i, i+l);
			if(str2.equals(str1)) {
				System.out.println(i);
				c++;
			}
		}
		if(c==0) {
			System.out.println("-1");
		}
		}
	}


