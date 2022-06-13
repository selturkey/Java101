import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        double taxRate = 0.18;
        double amount;
        double calculatedTax;

        double amountIncludeTax;

        Scanner readLine = new Scanner(System.in);

        System.out.println("Enter the amount to calculate tax : ");
        amount = readLine.nextDouble();

        calculatedTax = amount * taxRate;

        amountIncludeTax = calculatedTax + amount;

        System.out.println(taxRate);
        System.out.println("Entered Amount is " + amount);
        System.out.println("Calculated Tax is " + calculatedTax);
        System.out.println("Included with Tax " + amountIncludeTax);

    }

}
