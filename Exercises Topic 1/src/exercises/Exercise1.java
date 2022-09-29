package exercises;
import java.util.*;

public class Exercise1 {
	public static void main(String[] args) {
		double number;
		Scanner sc = new Scanner(System.in);
		System.out.println("Type in a number: ");
		number = sc.nextDouble();
		number = (int) (number*10.0)/10.0;
		System.out.println("The following number has been converted to an integer: " + number);
	}
}
