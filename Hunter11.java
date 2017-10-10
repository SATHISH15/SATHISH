package dsad;

import java.util.*;

public class Hunter11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ss=new Scanner(System.in);
		String str=ss.nextLine();
		String arr[]=str.split(" ");
		for(int i=0;i<arr.length;i++) {
			String s1=arr[i];
			StringBuffer sb=new StringBuffer(arr[i]);
			
			String s2=sb.reverse().toString();
			System.out.print(s2+" ");			
		}
	}

}
