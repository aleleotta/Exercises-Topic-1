package exercises;
import java.util.*;

public class Exercise3 {

	public static void main(String[] args) {
		int num1, num2;
		int result;
		Scanner sc = new Scanner(System.in);
		System.out.println("Type in the first number: ");
		num1 = sc.nextInt();
		System.out.println("Type in the second number: ");
		num2 = sc.nextInt();
		result = (num1 + num2) % num2;
		System.out.println("The result is: " + result);
		sc.close();
	}
}
