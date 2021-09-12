package decisionMaking;
import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		int year;
		Scanner sc = new Scanner(System.in);
		year = sc.nextInt();
		
		if(year%4==0)
		{
			if(year%100==0) 
			{
				if(year%400==0) 
				{
					System.out.println("Leap year");
				}
				else
				{
					System.out.println("Not a Leap year");
				}
			}
			else
			{
				System.out.println("Leap year");
			}
		}
		else
		{
			System.out.println("Not a Leap year");
		}

	}

}
