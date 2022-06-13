import java.util.Scanner;

public class Main {

    private static double PI = Math.PI;
    private static double radius;
    private  static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {


        System.out.println("Enter the radius of Circle :");

        radius = input.nextDouble();

        System.out.println("Circle Area is " + circleArea(radius));

        System.out.println("Circle Perimeter is " + circlePerimeter(radius));

        System.out.println("Circle Pie Area is " + circlePieArea(radius));


    }

    // Home Work Odev Part circlePieAres()
    private static double circlePieArea(double r ) {

        System.out.println("\n\nEnter Pie Degree Should be Less than 360 and bigger than 0 :");

        int pie = input.nextInt();

        double area = pie <= 360 ? circleArea(r) * pie / 360 : 0 ;


        return area;
    }

    private static double circlePerimeter(double r) {

        return (2 * PI * r);
    }

    private static double circleArea(double r) {

        return (PI * r * r);
    }

}
