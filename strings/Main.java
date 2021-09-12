package strings;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		
		String str;
		String over;
		double oversCount=0,runrate;
		int score=0,wickets=0,ch=0,noOfBalls=0;
		Scanner sc = new Scanner(System.in);
		str = sc.nextLine();
		
		StringTokenizer t = new StringTokenizer(str,"|");
		
		while(t.hasMoreTokens()) 
		{
//			System.out.println(t);
			over = t.nextToken();
			for(int i=0;i<over.length();i++) {
				ch = Character.getNumericValue(over.charAt(i));
				System.out.println(ch);
				
				if(ch>=0 && ch<10) {
					score = score+ch;
				}
				else if(over.charAt(i)=='W') {
					wickets++;
				}
				if(over.length()<6) {
					oversCount = oversCount+0.1;
				}
				noOfBalls++;
			}
			if(over.length()==6) {
				oversCount++;
			}	
			
		}
		
		runrate = (score*6.0)/noOfBalls;
		
		System.out.println("Total Score: "+score);
		System.out.printf("Total Overs :%.1f ",oversCount);
		System.out.println("Total Wickets: "+wickets);
		System.out.printf("Current run rate :%.2f ",runrate);
	}

}
