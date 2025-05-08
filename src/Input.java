import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        String w,y; // varibles are declared outside of try block
        int x;
        float z;
        try(Scanner in = new Scanner(System.in)){
            System.out.print("Enter Your Name: ");
            w = in.next(); // to scan a string till a whitespace
            System.out.print("Enter Your Age: ");
            x = in.nextInt(); // to scan an int
            in.nextLine(); // to eliminate the newline character left by .nextInt()
            System.out.print("Enter Your Course: ");
            y = in.nextLine(); // to scan a string till newline
            System.out.print("Enter Your CGP: ");
            z = in.nextFloat(); // to scan a float
        }
        System.out.printf("My name is %s. I am %d years old, studying %s with a CGP of %.2f.",w,x,y,z);
    }
}
// input for password has different function named .readPasword() with a console object
