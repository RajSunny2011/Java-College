import java.util.Scanner;
public class Grading {
    public static void main(String[] args) {
        int marks;
        char grade;
        try (Scanner in = new Scanner(System.in)){
            System.out.print("Enter marks: ");
            marks = in.nextInt();
        }
        if (marks >= 90){
            grade = 'A';
        }
        else if (marks >= 75){
            grade = 'B';
        }
        else if (marks >= 50){
            grade = 'C';
        }
        else{
            grade = 'F';
        }
        System.out.println("Grade: " + grade);
    }
}
