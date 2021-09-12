package decisionMaking;

import java.util.Scanner;

public class LabAllocation2 {

	public static void main(String[] args) {
		
		int x,y,z;
		String lab;
		
		Scanner sc = new Scanner(System.in);
		
		x = sc.nextInt();
		y = sc.nextInt();
		z = sc.nextInt();
		
		lab = sc.next();
		
		if(lab.equals("L1")) {
			if(y<z) {
				System.out.println("L2");
			}
			else {
				System.out.println("L3");
			}
		}
		else if(lab.equals("L2")) {
			if(x<z) {
				System.out.println("L1");
			}
			else {
				System.out.println("L3");
			}
		}
		else if(lab.equals("L3")) {
			if(x<y) {
				System.out.println("L1");
			}
			else {
				System.out.println("L2");
			}
		}
	}

}
