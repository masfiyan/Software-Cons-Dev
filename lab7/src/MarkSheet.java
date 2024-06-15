/*
*Create a design for the mark sheet by taking runtime value of student name, total marks,
obtained marks and calculate its percentage, grade and GPA. Use good practices of
programming that we have studied and ensure that the outcomes should be presented in a
proper Viewable approach.
*/

import java.util.Scanner;

public class MarkSheet {

    String student_name;
    int totalMarks;
    int obtainedMarks;
    double percentage;
    String grade;
    double GPA;
    Scanner scanner = new Scanner(System.in);

    public MarkSheet() {
        // Class initialization
        System.out.println("Enter Student Name: ");
        this.student_name = scanner.nextLine();
        System.out.println("Enter Total Marks: ");
        this.totalMarks = scanner.nextInt();
        System.out.println("Enter Obtained Marks: ");
        this.obtainedMarks = scanner.nextInt();
        this.percentage = 0;
        this.grade = null;
        this.GPA = 0;
        scanner.close();

    }

    public double calculatePercentage() {
        this.percentage = ((double) this.obtainedMarks / this.totalMarks) * 100;
        return this.percentage;
    }

    public String calculateGrade() {
        calculatePercentage();

        if (this.percentage >= 90.0) {
            this.grade = "A+";
        } else if (this.percentage >= 80.0) {
            this.grade = "A-";
        } else if (this.percentage >= 70.0) {
            this.grade = "A";
        } else if (this.percentage >= 60.0) {
            this.grade = "B";
        } else if (this.percentage >= 50.0) {
            this.grade = "C";
        } else {
            this.grade = "F";
        }

        return this.grade;
    }

    public double calculateGPA() {
        if ("A+".equals(this.grade)) {
            this.GPA = 4.0;
        } else if ("A-".equals(this.grade)) {
            this.GPA = 3.5;
        } else if ("A".equals(this.grade)) {
            this.GPA = 3.0;
        } else if ("B".equals(this.grade)) {
            this.GPA = 2.75;
        } else if ("C".equals(this.grade)) {
            this.GPA = 2.0;
        } else {
            this.GPA = 1.5;
        }
        return this.GPA;
    }


}
