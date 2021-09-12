package operators;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
	int num1,num2;
	num1 = 50;
	
	num2 = (num1==50)?100:200;
	
	System.out.println(num2);
	
	Main obj = new Main();
	
	Scanner sc = new Scanner(System.in);
	int num = sc.nextInt();
	
		
	}
	
	

}

//ternary operator -> evaluates a boolean expression and returns the result
//Syntax -> (expression)? statement if true: statement if false;

//operators -> operator is a character that represents an action
//It performs operation on two operands -> 2+5 -> Here + is the operator, 2&5 - operands

//Types - Arithmetic, logical, bitwise, relational, unary, assignment, ternary

//Arithmetic -> +,-,*,/,%
//division -> return the quotient value, modulus -> return the remainder value
//When you divide int by an int, you will always get int output (5/2 - 2)

//Assignment operator(=) will assign right side value to left side variable
//=,+=,-=,*=,/=,%=

//Relational - Will compare both the values or it evaluates a condition, and results in true or false
//Types - >,<,>=,<=,>=,==,!=

//Logical - &&,||,!
//&& -> If any one of the input is false, the output is false
//|| -> If any one of the input is high, the output is high
//! -> invert the inputs
//Logical operators are used to combine one or more conditions

//Bitwise -> &,|,^,<<,>>,~
//& -> If any one of the input is false, the output is false
//| -> If any one of the input is high, the output is high
//^ -> For same inputs, output is 0. For different inputs, output is 1
//<< -> Shifts bits to the left
//>> -> Shifts bits to the right
//~ -> 2's compliment