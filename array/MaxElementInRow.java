package array;

import java.util.Scanner;

public class MaxElementInRow {

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
		
		int max = 0;
		
		for(int i=0;i<row;i++) 
		{
			for(int j=0;j<col;j++) 
			{
				if(max<arr1[i][j]) 
				{
					max = arr1[i][j];
				}
			}
			System.out.println(max);
			max = 0;
		}
	}

}
