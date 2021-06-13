package application;

import java.util.Locale;
import java.util.Scanner;
import Escola.Trimestre;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Trimestre scanner;

		System.out.println("Insert grade 1: ");
		double note1 = sc.nextDouble();
		System.out.println("Insert grade 2: ");
		double note2 = sc.nextDouble();
		System.out.println("Insert grade 3: ");
		double note3 = sc.nextDouble();

		scanner = new Trimestre(note1, note2, note3);

		if (scanner.avg() > 6) {
			System.out.println("approved");
		} else {
			System.out.println("disapproved");
		}

	}
}
