package asignment;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				Scanner sc=new Scanner(System.in);
				System.out.println("ENter the number ");
				int n=sc.nextInt();
				int fact =1;
				for(int i=n;i>0;i--) {
					fact=fact*i;
				}
				System.out.println("Factorial is "+fact);
			

		

	}

}
