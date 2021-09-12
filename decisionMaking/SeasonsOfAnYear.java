package decisionMaking;
import java.util.*;

public class SeasonsOfAnYear {

	public static void main(String[] args) {
		int month;
		Scanner sc = new Scanner(System.in);
		month = sc.nextInt();
		
		switch(month) {
			default:System.out.println("Invalid");break;
			case 12:
			case 1: 
			case 2: System.out.println("Winter");break;
			case 3:
			case 4:
			case 5:System.out.println("Spring");break;
			case 6:
			case 7:
			case 8:System.out.println("Summer");break;
			case 9:
			case 10:
			case 11:System.out.println("Autumn");break;
			
		}

	}

}

//fall through
