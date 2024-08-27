package asignment;

import java.util.Scanner;

public class Max {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements want to compare");
		int len;
		len=sc.nextInt();
		int a[]=new int[len];
		System.out.println("Enter the array elements");
		for(int i=0;i<len;i++)
		{
			a[i]=sc.nextInt();
		}
		int max=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
				
			}
			
		}
		System.out.println(max);
		
		
		

	}

}
