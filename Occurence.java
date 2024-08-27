package asignment;

import java.util.Scanner;

public class Occurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the string");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine().toLowerCase();
		for(char c='a';c<='z';c++) {
			int count=0;
			for(char ch:str.toCharArray()) {
				if(ch==c) {
					count++;
				}
			}
			if(count>0) {
				System.out.println(c+": "+count);
			}
		}
	}

}
