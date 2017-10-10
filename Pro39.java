package govi_programs;

import java.util.*;

public class Pro39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ss=new Scanner(System.in);
		int t=ss.nextInt();
		int arr[];
		for(int i=0;i<t;i++) {
			arr=new int[6];
			for(int j=0;j<6;j++) {
				arr[j]=ss.nextInt();
			}
			
			double u=(double)arr[0],v=(double)arr[1],w=(double)arr[2],W=(double)arr[3],V=(double)arr[4],U=(double)arr[5];
			double u1=(Math.pow(v,2)+Math.pow(w,2))-Math.pow(U,2);
			double v1=(Math.pow(u,2)+Math.pow(w,2))-Math.pow(V,2);
			double w1=(Math.pow(v,2)+Math.pow(u,2))-Math.pow(W,2);
			double u2 = Math.pow(u,2);
			double v2 = Math.pow(v,2);
			double w2 = Math.pow(w,2);
			double u12 = Math.pow(u1,2);
			double v12 = Math.pow(v1,2);
			double w12 = Math.pow(w1,2);
			double out1=Math.sqrt(((4 * u2 * v2 * w2) - (u2 * u12) - (v2 * v12) - (w2 * w12)) + (u1 * v1 * w1));
			System.out.println(String.format("%.4f", (out1/12)));
			
		}
	}

}
