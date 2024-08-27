package asignment;

import java.util.Scanner;

public class Conversion {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int res;
		binary(n);
		octal(n);
	}
		
		public static void binary(int n) {
			if(n>0) {
			binary(n/2);
			System.out.print(n%2);
			
		}
		}
		public static void octal(int n) {
			if(n>0) {
				octal(n/8);
				System.out.println(n%8);
			}
		}
		
	

}
