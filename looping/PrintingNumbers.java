package looping;

import java.util.Scanner;

public class PrintingNumbers {

	public static void main(String[] args) {
		
		System.out.println("Enter n value");
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			System.out.println(i);
		}

	}

}
