import java.util.*;

public class Products {

    private static String pear ="Pear";
    private static double pearPrice = 2.14;

    private static String apple ="Apple";
    private static double applePrice = 3.67;


    private static String tomatoes ="Tomatoes";
    private static double tomatoesPrice = 1.11;

    private static String banana ="Banana";
    private static double bananaPrice = 0.95;

    private static String aubergine ="Aubergine";
    private static double auberginePrice = 5.00;

    private static double total = 0;


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println(pear +" how many kg ?");
        total += pearPrice * input.nextDouble();

        System.out.println(apple +" how many kg ?");
        total += applePrice * input.nextDouble();

        System.out.println(tomatoes +" how many kg ?");
        total += tomatoesPrice * input.nextDouble();

        System.out.println(banana +" how many kg ?");
        total += bananaPrice * input.nextDouble();

        System.out.println(aubergine +" how many kg ?");
        total += auberginePrice* input.nextDouble();


        System.out.println("Total bill is " + total + " TL" );

    }
}
