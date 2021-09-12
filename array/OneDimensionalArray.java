package array;

import java.util.Scanner;

public class OneDimensionalArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size");
		
		int n = sc.nextInt();
		
		int age[] = new int[n];
		
		
		for(int i=0;i<n;i++) {
			age[i] = sc.nextInt();
		}
		
		System.out.println("The elements are");
		
		for(int i=0;i<n;i++) {
			System.out.println(age[i]);
		}
	}

}
