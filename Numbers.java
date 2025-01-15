public class Numbers {
    public static void main(String[] args){
    // 4 types of integer in java- int(4B), short(2B), long(8B) and byte(1B)
    // ranges of the datatype are fixed in java independent of system type
        int x = -2_147_483_647, y = 2_147_483_647;
        System.out.println("Integer: "+x+","+y);
        short x_short = -32_767, y_short = 32_767;
        System.out.println("Short: "+x_short+","+y_short);
        long x_long = -9_223_372_036_854_775_807l, y_long = 9_223_372_036_854_775_807l;
    // l prefix is required to represent a number outside the integer limits
        System.out.println("Long: "+x_long+","+y_long);
        byte x_byte = -127, y_byte = 127;
        System.out.println("Byte: "+x_byte+","+y_byte);
    // Representation of binary, octal and hexadecimal numbers
        System.out.println("Binary(0b10000): "+0b10000);// '0b' prefix
        System.out.println("Octal(020): "+020);// '0' prefix
        System.out.println("Hexadecimal(0x10): "+0x10);// '0x' prefix

    // 2 types of floats- float(4B) and Double(8B)
        // float f = 19.10f; 'f' suffix for float
        // double d = 19.10d; 'd' suffix or no suffix for double
    }
}
