
import java.util.Scanner;

/**
 *
 * @author Aika
 */
public class Task3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner scs = new Scanner(System.in);
        int price, devCost, exDev, total;
        String name;

        System.out.println("Enter the food name: ");
        name = scs.nextLine();
        System.out.println("Enter the food price: ");
        price = sc.nextInt();
        System.out.println("Do you want express delivery? (0 = no, 1 = yes)?");
        exDev = sc.nextInt();
        if (exDev == 0) {
            if (price < 100000) {
                devCost = 20000;
            } else {
                devCost = 30000;
            }
        } else {
            if (price < 100000) {
                devCost = 45000;
            } else {
                devCost = 55000;
            }
        }
        total = price + devCost;

        System.out.println("RECEIPT");
        System.out.println(name + "\t Rp " + price);
        System.out.println("Delivery Cost     Rp " + devCost);
        System.out.println("TOTAL             Rp " + total);
    }
}
