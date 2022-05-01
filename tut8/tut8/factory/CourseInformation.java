package tut8.factory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Create the CourseInformation class to generate information about the duration 
 * and fee of the course by using the Admission class to get the object of 
 * sub-classes by passing the required information like the course being applied for */
class CourseInformation {
	public static void main(String args[]) throws IOException {
		//TO-DO: Create new Admission object
			var admission = new Admission();
		//TO-DO: Get user's input for the course's name
		System.out.print("Enter the name of course ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String courseName = br.readLine();

		//TO-DO: Create new course with created Admission
		Course c = admission.admittingCourse(courseName);
		//TO-DO: Display the require duration in semesters, required fee per semester and for whole course
		c.getDuration();
		c.getFeePerSemester();
		System.out.println(c.calculateTotalFee());

	}
}  