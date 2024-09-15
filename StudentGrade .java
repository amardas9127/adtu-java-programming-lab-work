import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the total number of subjects: ");
        int numSubjects = scanner.nextInt();
        int[] marks = new int[numSubjects];
        int totalMarks = 0;

        System.out.println("Enter the marks for each subject:");
        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Marks for subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
            totalMarks += marks[i];
        }

        System.out.print("Enter the attendance percentage: ");
        double attendancePercentage = scanner.nextDouble();


        double percentage = (totalMarks / (double) (numSubjects * 100)) * 100;

        char grade;
        if (attendancePercentage < 75) {
            grade = 'F';
        } else {
            if (percentage >= 90) {
                grade = 'A';
            } else if (percentage >= 80) {
                grade = 'B';
            } else if (percentage >= 70) {
                grade = 'C';
            } else if (percentage >= 60) {
                grade = 'D';
            } else {
                grade = 'E';
            }
        }

        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Percentage: " + String.format("%.2f", percentage) + "%");
        System.out.println("Grade: " + grade);
    }
}
