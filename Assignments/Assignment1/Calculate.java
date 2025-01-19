import java.util.Scanner;
public class Calculate {
    public static void main(String[] args) {
        float a, b;
        String op;
        try (Scanner in = new Scanner(System.in)){
            System.out.print("Enter the operator(+,-,*,/,%): ");
            op = in.next();
            System.out.println("Enter first Number: ");
            a = in.nextFloat();
            System.out.println("Enter second Number: ");
            b = in.nextFloat();
        }
        float res = switch(op){
            case "+" -> a+b;
            case "-" -> a-b;
            case "*" -> a*b;
            case "/" -> a/b;
            case "%" -> a%b;
            default -> 0;
        };
        System.out.println("Resut: " + res);
    }
}
