package asignment;

import java.util.Scanner;

public class Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int res=0;
		int n=sc.nextInt();
		for(int i=1;i<=10;i++) {
			res=n*i;
			System.out.println(n+"*"+i+" = "+res);
		}
		

	}

}
