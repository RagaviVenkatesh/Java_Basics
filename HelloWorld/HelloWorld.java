package HelloWorld;
import java.util.Scanner;

class HelloWorld{
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //obj creation for scanner class
		System.out.println("Enter the number");
		int num = sc.nextInt();
		float height = sc.nextFloat();
		//String name = sc.next(); -> one word
		//String name = sc.nextLine(); -> more than one word
		//char ch = sc.next().charAt(0);
		//boolean result = sc.nextBoolean();
		//byte num = sc.nextByte();
		//short num = sc.nextShort();
		//long num = sc.nextLong();
		//double num = sc.nextDouble();
		System.out.println("The number is: "+num+" and height is "+height); 	
	}
}
//Syntax for obj creation -> classname objname = new classname()
//new is the keyword which will create memory for object

//instance variable -> which is declared inside a class

//Local variables -> which are declared inside a method

//Variables are names given to the memory location
//Variable name cannot contain white space or any other special symbol
//Only two special symbols are allowed - $ and _
//Variable name can contain numbers, but it should not start with a number
//variable name should always start with lower case letter, if more than one word is combined,
//the second word should be in upper case.(CamelCase)

//Types of variables - local, static(class), instance


//Datatypes -> defines the value that a variable can take
//primitive -> byte,short,int,long,float,double,char,boolean(8)

//whole numbers - byte,short,int,long
//group of characters - strings
//decimal numbers - float, double
//single character -> letter,symbol,digit -> char
//true or false -> boolean
//byte - 1 byte, short - 2 bytes, int - 4 bytes, long - 8 bytes
//float - 4 bytes(6 precision), double - 8 bytes(15 precision)