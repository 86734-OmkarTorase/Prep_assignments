package asignment;

import java.util.Scanner;

public class Charcheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the character");
		char c=sc.next().charAt(0);
		if(Character.isUpperCase(c)) {
			System.out.println(c+" is Uppercase");
			
		}
		else if(Character.isLowerCase(c)) {
			System.out.println(c+" is Lowercase");
			
		}
		else if(Character.isDigit(c)) {
			
			System.out.println(c+" is digit");
		}
		else {
			System.out.println("Other");
		}
		

	}

}
