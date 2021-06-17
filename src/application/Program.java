package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Escola.Trimestre;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Trimestre> ListOfStudents = new ArrayList<>();

		System.out.println("********Record of notes!**************");

		System.out.print("Enter the number of students: ");
		int NumberOfStudents = sc.nextInt();
		System.out.print("Enter the amount of notes: ");
		int NumberOfNotes = sc.nextInt();

		List<Double> notes;

		for (int i = 0; i < NumberOfStudents; i++) {

			System.out.println();
			System.out.println("Student [" + (i + 1) + "]:");
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			notes = new ArrayList<>();

			for (int j = 0; j < NumberOfNotes; j++) {
				System.out.print("Note [" + (j + 1) + "]: ");
				Double note = sc.nextDouble();
				notes.add(note);
			}

			Trimestre aluno = new Trimestre(name, notes);
			aluno.calculateTheAVG();
			ListOfStudents.add(aluno);
//			System.out.println(aluno.getMedia());
		}

		
		System.out.println();
		
		for (Trimestre Student : ListOfStudents) {
			
			if(Student.getAVG()>6) {
				System.out.println();
				System.out.println("Approved");
				System.out.println(Student);
			}
			else{
				System.out.println();
				System.out.println("disapproved");
				System.out.println(Student);
			}
				
			
					
		}

		sc.close();
	}

}
