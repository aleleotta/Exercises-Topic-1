package exercises;
import java.util.*;

public class Exercise5 {
	public static void main(String[] args) {
		int x; //Declaration of variables
		int a;
		int b;
		int c;
		int y;
		Scanner sc = new Scanner(System.in); //Declaration of scanner
		System.out.println("Enter the (a) value: "); //User value input process
		a = sc.nextInt();
		System.out.println("Enter the (b) value: ");
		b = sc.nextInt();
		System.out.println("Enter the (c) value: ");
		c = sc.nextInt();
		System.out.println("Enter the (x) value: ");
		x = sc.nextInt();
		y = (a * x * x) + (b * x) + c; //Formula calculation
		System.out.println("");
		System.out.println("The value of (y) is: " + y); //Result output
		sc.close(); //Closing scanner
	}
}
