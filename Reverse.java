package asignment;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		String rev="";
		int len1=str.length();
		for(int i=len1-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		System.out.println("Reversed string is "+rev);

	}

}
