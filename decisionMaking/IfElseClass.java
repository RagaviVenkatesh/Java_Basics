package decisionMaking;
import java.util.Scanner;

public class IfElseClass {

	public static void main(String[] args) {
		int age;
		int weight;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age");
		age = sc.nextInt();
		System.out.println("Enter weight");
		weight = sc.nextInt();
		
		if(age>18 && weight>50) {
			System.out.println("You are eligible to donate blood");
		}
		else
		{
			System.out.println("You are not eligible to donate blood");
		}

	}

}
