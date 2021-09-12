package decisionMaking;
import java.util.Scanner;

public class GreatestOfThreeNumbers {

	public static void main(String[] args) {
		int a,b,c;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		if(a>b && a>c) {
			System.out.println(a+" is the greatest number");
		}
		else if(b>a && b>c) {
			System.out.println(b+" is the greatest number");
		}
		else if(c>a && c>b){
			System.out.println(c+" is the greatest number");
		}
		else if(a==b) {
			System.out.println("A and B are equal");
		}
		else if(a==c) {
			System.out.println("A and C are equal");
		}
		else if(c==b) {
			System.out.println("C and B are equal");
		}
	}

}
