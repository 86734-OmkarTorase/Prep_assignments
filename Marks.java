package asignment;

import java.util.Scanner;

public class Marks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int phy,chem,maths,bio,eng;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the marks for Physics,Chemistry,Maths,Bio,English");
		phy=sc.nextInt();
		chem=sc.nextInt();
		maths=sc.nextInt();
		bio=sc.nextInt();
		eng=sc.nextInt();
		int total=phy+chem+maths+bio+eng;
		if(total>=90) {
			System.out.println("Grade ex");
		}
		else if(total<90 && total>=80) {
			System.out.println("Grade A");
		}
		else if(total<80 && total>=70) {
			System.out.println("Grade B");
		}
		else if(total<70 && total>=60) {
			System.out.println("Grade C");
		}
		else if(total<60) {
			System.out.println("Grade F");
		}
		
	}

}
