public class test {
    public static void main(String[] args) {
        int x = -10;
        System.out.println(Integer.toBinaryString(x) + " " + (x));
        // System.out.println(Integer.toBinaryString(x >> 1) + " " + (x>>1));
        System.out.println(Integer.toBinaryString(-2147483643));
        System.out.println(Integer.toBinaryString(x >>> 1) + " " + (x>>>1));
    }
}
