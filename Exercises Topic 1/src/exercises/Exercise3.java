package exercises;
import java.util.*;

public class Exercise3 {

	public static void main(String[] args) {
		int num1, num2; //Declaration of variables
		int result; //Declaration of scanner
		Scanner sc = new Scanner(System.in);
		System.out.println("Type in the first number: "); //The program asks the user to type in values.
		num1 = sc.nextInt(); //The user enters the values.
		System.out.println("Type in the second number: ");
		num2 = sc.nextInt();
		result = (num1 + num2) % num2; //Math
		System.out.println("The result is: " + result); //Result is given to the user.
		sc.close(); //Closing scanner
	}
}
