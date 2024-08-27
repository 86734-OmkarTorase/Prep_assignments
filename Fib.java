package asignment;

import java.util.Scanner;

public class Fib {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0;
		int b=1;
		int res=0;
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		 System.out.print(a+" "+b);
		for(int i=2;i<=n;i++) {
			   res=a+b;
			  
			System.out.print(" "+res);
			a=b;
			b=res;
	}

}
}