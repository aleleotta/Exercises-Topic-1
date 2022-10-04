package exercises;
import java.util.*;

public class Exercise6 {
	public static void main(String[] args) {
		int aux;
		int hours = 1 / 3600;
		int minutes;
		int seconds;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce seconds: ");
		aux = sc.nextInt();
		seconds = aux % 60; //Math
		minutes = aux / 60; //Math
		hours = minutes / 60; //Math
		minutes %= 60; //Math
		System.out.println("Total time conversion (Hours, Minutes, Seconds): " + hours + " hours, " + minutes + " minutes, " + seconds + " seconds.");
		sc.close();
	}
}
