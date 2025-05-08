public class Output {
    public static void main(String[] args) {
        String x = "world";
        System.out.print("Hello "+x); // doesnt create a newline in the end
        System.out.println("Nice to meet you "+x); // creates a newline in the end
        float t = 21.46f;
        System.out.printf("Today's tempearature is %3.1f.",t); // for formatted printing
        // %3.1f means 3 digits with 1 being after the decimal 
        // %s: String, %d: Integer (decimal), %f: Floating-point number, %c: Character, %b: Boolean, %x: Integer (hexadecimal), %o: Integer (octal)
        // %e: Scientific notation (float), %g: General format (float), %h: Hash code (hexadecimal), %n: Newline, %%: Literal '%'
    }
}
