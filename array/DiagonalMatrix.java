package array;

import java.util.Scanner;

public class DiagonalMatrix {

	public static void main(String[] args) {
		
		int flag=1;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int a[][] = new int[n][n];
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				a[i][j] = sc.nextInt();
			}
		}
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i!=j) {
					if(a[i][j]==0) {
						flag = 1;
					}
					else {
						flag = 0;
						break;						
					}
				}
			}
		}
		
		if(flag==1) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
		

	}

}
//	  j=0  j=1  j=2
//i=0  1 	0 	0
//i=1  0 	1 	0
//i=2  0 	0 	1


// 0 1
// 0 1


