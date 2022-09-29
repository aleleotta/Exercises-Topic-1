package exercises;
import java.util.*;

public class Exercise1 {
	public static void main(String[] args) {
		double number; //Declaration of variables
		Scanner sc = new Scanner(System.in); //Declaration of scanner
		//Asking the user for a decimal number.
		System.out.println("Type in a decimal number: "); //The program asks the user to type in a number.
		number = sc.nextDouble(); //The user types in the number.
		number += 0.5; //Equivalent function to Math.round
		System.out.println("The following number has been converted to an integer: " + (int) number);
		//Number has been converted to a whole number and the program gives output to the user.
		sc.close(); //Closing scanner
	}
}
