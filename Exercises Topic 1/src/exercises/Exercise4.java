package exercises;
import java.util.*;

public class Exercise4 {
	public static void main(String[] args) {
		double base, height, area;
		Scanner sc = new Scanner(System.in);
		System.out.println("The area will be given to the user once he/she types in the base and height values.");
		System.out.println("Type in the base of the triangle: ");
		base = sc.nextDouble();
		System.out.println("Type in the height of the triangle: ");
		height = sc.nextDouble();
		area = base * height / 2;
		System.out.println("The area of the triangle is: " + area);
		sc.close();
	}
}
