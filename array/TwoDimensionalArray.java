package array;

import java.util.Scanner;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter row size");
		int row = sc.nextInt();
		System.out.println("Enter column size");
		int col = sc.nextInt();
		
		int[][] arr1 = new int[row][col];
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				arr1[i][j] = sc.nextInt();
			}
		}
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(arr1[i][j]+" ");
			}
			System.out.println();
			}
	}

}
