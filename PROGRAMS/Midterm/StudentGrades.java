import java.util.Scanner;
import java.util.HashMap;

/**
 * Midterm Problem 2:
 * Given a HashMap pre-filled with student names as keys and grades as values, 
 * complete main() by reading in the name of a student, outputting their original grade, 
 * and then reading in and outputting their new grade.
 * 
 * @author J.Ho
 *
 */
public class StudentGrades {

	public static void main (String[] args) {
		Scanner scnr = new Scanner(System.in);
		String studentName;
		double studentGrade;
		
		HashMap<String, Double> studentGrades = new HashMap<String, Double>();
		
		// Students's grades (pre-entered)
		studentGrades.put("Harry Rawlins", 84.3);
		studentGrades.put("Stephanie Kong", 91.0);
		studentGrades.put("Shailen Tennyson", 78.6);
		studentGrades.put("Quincy Wraight", 65.4);
		studentGrades.put("Janine Antinori", 98.2);
		
		// Read in new grade for a student
		System.out.print("Please Enter Student Name: ");
		studentName = scnr.nextLine();
		System.out.print("Please Enter New Grade: ");
		studentGrade = scnr.nextDouble();
		
		// output initial grade
		System.out.println(studentName + "'s original grade: " + studentGrades.get(studentName));
		
		// replace with new grade in HashMap
		studentGrades.replace(studentName, studentGrade);
		
		// output new grade
		System.out.println(studentName + "'s new grade: " + studentGrades.get(studentName));
		
		scnr.close();
	}
}