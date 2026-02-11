package ElectricChargeBilllingSystem;
import java.util.Scanner;

public class ElectricChargeUnit {

    public static void electricUnit() {
        
        Scanner sc=new Scanner(System.in);
        
        String choice;

        do {
            System.out.println("ENTER THE TOTAL UNIT CONSUMED:");
            int unit = sc.nextInt();

            double totalCost;

            if (unit <= 50) {
                totalCost = unit * 8;
            } else if (unit <= 75) {
                totalCost = 50 * 8 + (unit - 50) * 10;
            } else if (unit <= 100) {
                totalCost = 50 * 8 + 25 * 10 + (unit - 75) * 12;
            } else {
                totalCost = 50 * 8 + 25 * 10 + 25 * 12 + (unit - 100) * 15;
            }

            totalCost =totalCost* 1.18; 
            System.out.println("Total electricity bill is :" + totalCost);

            System.out.println("Enter YES to Continue or NO to exit :");
            sc.nextLine();                                    // clearing the  buffer
            choice = sc.nextLine();

        } while (choice.equalsIgnoreCase("YES"));
        System.out.println("============ THANK YOU ===============");
    }

    public static void main(String[] args) {
                    // Scanner sc = new Scanner(System.in);
        electricUnit();
                       // sc.close();
    }
}

