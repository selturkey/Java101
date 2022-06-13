import java.util.Scanner;


public class Main {

    private static String height;
    private static String weight;
    private static double massIndex;

    private static Scanner input = new Scanner(System.in);


    public static void main(String[] args) {

        System.out.println("Please Enter your height as a meter length : ");
        height = input.nextLine();

        System.out.println("Please Enter your weight as a kg : ");
        weight = input.nextLine();

        height = height.replace(",",".");
        weight = weight.replace(",", ".");


        massIndex =  Double.parseDouble(weight) / (Double.parseDouble(height) * Double.parseDouble(height));

        System.out.println("Your Body Mass Index is " + massIndex);

    }
}
