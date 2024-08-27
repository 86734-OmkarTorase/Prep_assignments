package asignment;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String str=sc.next();
		String temp=str;
		String rev="";
		int len=str.length();
		for(int i=len-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		if(temp.equalsIgnoreCase(rev)) {
			System.out.println("Palindrome");
		}
		else
			System.out.println("not palindorme");

	}

}
