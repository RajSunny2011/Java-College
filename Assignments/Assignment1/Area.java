public class Area {
    static int area(int length, int height){
        return length*height;
    }
    static double area(double radius){
        return Math.PI * radius * radius;
    }
    static int area(int length){
        return length*length;
    }
    static double area(double  height, int base){
        return 0.5*height*base;
    }
    public static void main(String[] args) {
        System.out.println("Square: " + area(10));
        System.out.println("Sphere: " + area(5.0));
        System.out.println("Rectangle: " + area(5,2));
        System.out.println("Triangle: " + area(5.0,2));
    }
    
}
