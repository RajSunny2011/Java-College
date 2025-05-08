public class Operators {
    public static void main(String[] args) {
        // Arithmetic Operators
        // arithmetic operators +, -, *, / and % are used in Java
        // Math class methods
        double initialValue = 100;
        double squareRootOfInitialValue = Math.sqrt(initialValue);
        System.out.println(squareRootOfInitialValue);
        double z = Math.pow(initialValue, squareRootOfInitialValue);
        System.out.println(z);
        double naturalLogarithmOfZ = Math.log(z);
        System.out.println(naturalLogarithmOfZ);
        int wholeNumberResult = (int) Math.floor(naturalLogarithmOfZ);
        System.out.println(wholeNumberResult);

        // Assignment Operator
        int money = 5000;
        int salary = 10000;
        money += salary;
        System.out.println("Addition: " + money);
        money += salary *= 1.1; // assignment operator is an expression
        System.out.println("New Salary: " + salary + "\nAddition with increment: " + money);

        // ++a: increment then assign, a++: assign then increment

        // Boolean operators
        // && (AND), || (OR), ! (NOT)
        System.out.println("3 == 5: "+ (3 == 5));
        System.out.println("not of (`Hello`.equals(`hello`)): " + !("Hello".equals("hello")));
        System.out.println("or of above statements: " + ((3 == 5)||!("Hello".equals("hello"))));

        // Ternary operator
        int p = 3, q = 5;
        System.out.println("3 > 5: " + (p>q ? "3 is bigger":"3 is not bigger"));

        //Bitwise operator
        System.out.println("101 AND 011: " + (101 & 011));
        System.out.println("101 OR 011: " + (101 | 011));
        System.out.println("101 XOR 011: " + (101 ^ 011));
        System.out.println("Negation 101 XOR: " + Integer.toBinaryString((~5)));

    }
}
