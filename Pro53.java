package govi_programs;


import java.util.*;


public class Pro53 {

public static final int n = 26; 

public char check(String arr){
	int c1=0;
    if(arr.length() < n){
       return 'n';
    }else {
    for(char c = 'a'; c <= 'z' ; c++){
        if((arr.contains(c+""))||(arr.contains(((char)(c-32))+""))){
           c1++;
        }
    }
    if(c1==26) {
    	return 'y';
    }else {
    	return 'n';
    }
    
}
}


public static void main(String[] args) {

    Scanner s1 = new Scanner(System.in);
    String s = s1.nextLine();
    Pro53 obj = new Pro53();

    int d = obj.check(s);

    if(d == 'y')
        System.out.print("pangram");
    else
         System.out.print("not pangram");

}
}
