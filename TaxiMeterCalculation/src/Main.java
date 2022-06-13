import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double km;
        double perKmCcst = 2.20;
        double total;
        int startCost = 10;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter Km to calculate total taxi Cost : ");

        km = input.nextDouble();

        total = (perKmCcst * km) + startCost;

        total = total > 20 ? total : 20;

        System.out.println("Total Taxi Cost is " + total);
    }
}
