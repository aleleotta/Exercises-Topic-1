package exercises;
import java.util.*;

public class Exercise7 {
	public static void main(String[] args) {
		double mm;
		double cm;
		double m;
		double total;
		Scanner sc = new Scanner(System.in);
		System.out.println("Insert mm: ");
		mm = sc.nextDouble();
		System.out.println("Insert cm: ");
		cm = sc.nextDouble();
		System.out.println("Insert m: ");
		m = sc.nextDouble();
		mm = mm / 10;
		m = m * 100;
		total = mm + cm + m;
		System.out.println("The sum is: " + total);
		sc.close();
	}
}
