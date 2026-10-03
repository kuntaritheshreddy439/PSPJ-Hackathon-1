import java.util.Scanner;
public class WaterBillpspj {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the amount of water consumed (in liters): ");
    int consumedwater = scanner.nextInt();
    if (consumedwater <=500) {
        System.out.println("Water bill: ₹100");
    } else {
        System.out.println("Water bill: ₹200");
    }
    }
}