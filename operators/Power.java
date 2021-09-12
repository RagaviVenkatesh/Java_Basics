package operators;
import java.lang.Math;
import java.util.Scanner;

public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x;
		int n;
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		System.out.println(x);
		n = sc.nextInt();
		int result =(int) Math.pow(x, n); 
		System.out.println(result);
	}

}
