import java.util.Scanner;
public class Bill {
    public static void main(String[] args) {
        int totalUnits, charge = 0, remainingUnits;
        try (Scanner in = new Scanner(System.in)){
            System.out.print("Enter total Units: ");
            totalUnits = in.nextInt();
        }
        remainingUnits = totalUnits;
        if (remainingUnits<101 && remainingUnits != 0){
            charge += remainingUnits*5;
            remainingUnits = 0;
        }else if (remainingUnits>0){
            charge += 500;
            remainingUnits -= 100;
        }
        if (remainingUnits<101 && remainingUnits != 0){
            charge += remainingUnits*7;
            remainingUnits = 0;
        }else if (remainingUnits>0){
            charge += 700;
            remainingUnits -= 100;
        }
        if (remainingUnits<101 && remainingUnits != 0){
            charge += remainingUnits*10;
            remainingUnits = 0;
        }else if (remainingUnits>0){
            charge += 1000;
            remainingUnits -= 100;
        }
        if (remainingUnits != 0){
            charge += remainingUnits*15;
        }
        System.out.println("Total Bill: " + charge);
    }
}
