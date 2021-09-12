package HelloWorld;
import java.util.Scanner;

public class StringInput {

	public static void main(String[] args) {
		int ch;
		Scanner sc = new Scanner(System.in);
		ch = sc.nextInt();
		char value = (char)ch;
		System.out.println(value);
	}

}
