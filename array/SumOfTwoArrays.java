package array;

import java.util.Scanner;

public class SumOfTwoArrays {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size");
		int n = sc.nextInt();
		int[] arr1 = new int[n];
		int[] arr2 = new int[n];
		int[] arr3 = new int[n];
		
		System.out.println("Enter elements of first array");
		
		for(int i=0;i<n;i++) {
			arr1[i] = sc.nextInt();
		}
		
		System.out.println("Enter elements of second array");

		for(int i=0;i<n;i++) {
			arr2[i] = sc.nextInt();
			arr3[i] = arr1[i]+arr2[i];
		}
		
		System.out.println("Sum");
		
		for(int i=0;i<n;i++) {
			System.out.println(arr3[i]);
		}
	}

}
