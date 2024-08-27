package asignment;

import java.util.Scanner;

public class Matrixmul {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int row,cols;
		System.out.println("Enter the number of rows and cols");
		row=sc.nextInt();
		cols=sc.nextInt();
		int[][] a=new int[row][cols];
		int [][]b=new int[row][cols];
		System.out.println("ENter the elemts of matrix 1");
		for(int i=0;i<row;i++) {
			for(int j=0;j<cols;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("ENter the elemts of matrix ");
		for(int i=0;i<row;i++) {
			for(int j=0;j<cols;j++) {
				b[i][j]=sc.nextInt();
			}
		
		
			
		}
		int r[][]=new int[row][cols];
		for(int i=0;i<row;i++) {
			for(int j=0;j<cols;j++) {
				for(int k=0;k<row;k++) {
					r[i][j]+=a[i][k]*b[k][j];
				}
			}
		}
		System.out.println("result is");
		for(int i=0;i<row;i++) {
			for(int j=0;j<cols;j++) {
				System.out.print(r[i][j]+" ");
			}
			System.out.println();
		}
		

	}

}
