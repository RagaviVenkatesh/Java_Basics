package looping;

import java.util.Scanner;

public class EvenNumbers {

	public static void main(String[] args) {
		System.out.println("Enter n value");
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int i=0;
		
//		for(i=0;i<n;i++) {
//			if((i&1)!=1) {
//				System.out.println(i);
//			}
//		}
		
		do {
			if(i%2==0) {
				System.out.println(i);
			}
			i++;
		}
		while(i<n);
	}

}
