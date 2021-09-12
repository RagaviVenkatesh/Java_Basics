package looping;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		
		System.out.println("Enter n value");
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int sum = 0;
		
		int i=1;
		
		do {
			sum=sum+i;
			++i;
		}
		while(i<=n);
		
		System.out.println(sum);
	}

}
