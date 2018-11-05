package primitiveDatatypes;

import java.util.Scanner;

public class IntegerDivision {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		System.out.println("Enter a number: ");
		int int1 = scanner.nextInt();
		System.out.println("Enter a number you want to divide with: ");
		int int2 = scanner.nextInt();
		int resultat = Math.floorDiv(int1, int2);
		System.out.println("Result: " + resultat);
		
	}

}
