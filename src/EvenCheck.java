public class EvenCheck {
    public static void main(String[] args) {
        int n = 6;
        if ((n | 1) != n) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}
