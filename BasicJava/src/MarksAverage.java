package src;

import java.util.Scanner;

public class MarksAverage {
	// prints total marks and average of every student
	void studentAverage(int students_Subjects[][], int noOfStudents, int noOfSubjects) {// student marks Average method
																						// definition
		float S_Average[] = new float[noOfStudents];
		int Avg = 0;
		for (int student = 0; student < noOfStudents; student++) {
			for (int subject = 0; subject < noOfSubjects; subject++) {
				Avg += students_Subjects[student][subject];
			}
			S_Average[student] = Avg / noOfStudents;// Average of marks of each student
			System.out.println("Total marks of Student" + (student + 1) + "	" + Avg);// Printing Total marks of student
			System.out.println("Average of Student" + (student + 1) + "	" + S_Average[student]);// Printing average of
																								// student
			Avg = 0;

		}

	}

	// prints sum of every subject and average
	void subjectAverage(int students_Subjects[][], int noOfStudents, int noOfSubjects) {// subject Average method
																						// definition
		float[] Sub_Average = new float[noOfStudents];
		int Avg = 0;

		for (int subject = 0; subject < noOfSubjects; subject++) {

			for (int student = 0; student < noOfStudents; student++) {
				Avg += students_Subjects[student][subject];
			}
			Sub_Average[subject] = Avg / noOfSubjects;
			System.out.println("Total marks of subject" + (subject + 1) + "	" + Avg);// Printing Total of subject
			System.out.println("Average of subject" + (subject + 1) + "	" + Sub_Average[subject]);// Printing average of
																									// subject
			Avg = 0;
		}

	}

	public static void main(String[] args) {
		MarksAverage findSubAvg = new MarksAverage();// Instantiating the class
		MarksAverage findStudentAvg = new MarksAverage();// Instantiating the class
		Scanner get = new Scanner(System.in);

		int noOfStudents, noOfSubjects; // local variable

		System.out.println("Enter No. of Students");
		noOfStudents = get.nextInt();
		System.out.println("Enter No. of Subjects");
		noOfSubjects = get.nextInt();

		int students_Subjects[][] = new int[noOfStudents][noOfSubjects];

		for (int student = 0; student < noOfStudents; student++) {// input of marks and students
			System.out.println("Enter Marks of Student " + (student + 1));
			for (int subject = 0; subject < noOfSubjects; subject++) {
				System.out.println("Enter Mark in Subject " + (subject + 1));
				students_Subjects[student][subject] = get.nextInt();
			}
		}

		findSubAvg.subjectAverage(students_Subjects, noOfStudents, noOfSubjects);// invoking subjectAverage
		System.out.println();
		findStudentAvg.studentAverage(students_Subjects, noOfStudents, noOfSubjects);// invoking studentAverage
		get.close();
	}
}
