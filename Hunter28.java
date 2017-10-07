package dsad;

import java.util.*;

public class Hunter28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ss=new Scanner(System.in);
		LinkedHashSet<Character> al=new LinkedHashSet();
		String str=ss.nextLine();
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			al.add(ch);
		}
		Iterator<Character> i=al.iterator();
		while(i.hasNext()) {
			char ch1=i.next();
			System.out.print(ch1);
		}
		
	}

}
