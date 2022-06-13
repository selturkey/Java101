import java.util.Scanner;

public class Triangle {

    // Sides of Trianble a,b c is hipotenus

    private  static double sideA;
    private static double sideB;

    private  static  double sideC;
    private static double hipotenusC;
    private static double area;

    private static double lengthofTriangle;
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("\n\n***************  Calculate Hipotenus and area of Triangle  ***************");
        System.out.println("\nEnter Side A :");
        sideA = input.nextDouble();

        System.out.println("Enter Side B :");
        sideB = input.nextDouble();

        hipotenusC = hipotenus(sideA,sideB);

        area = areaCalculation2Sides(sideA, sideB);


        System.out.println("Hipotenus is " + hipotenusC);

        System.out.println("Triangle Area is " + area);

        areaCalculation3Sides();
    }

    // HomeWork Odev2
    private static void areaCalculation3Sides() {

        System.out.println("\n\n***************  Calculate 3 Sides given Triangle Area  ***************");

        System.out.println("\nEnter Side A :");
        sideA = input.nextDouble();

        System.out.println("Enter Side B :");
        sideB = input.nextDouble();

        System.out.println("Enter Side C :");
        sideC = input.nextDouble();

        lengthofTriangle = (sideA + sideB + sideC) / 2;

        if (isTriangle(sideA, sideB, sideC)){


            area = Math.sqrt(lengthofTriangle * (lengthofTriangle - sideA) * (lengthofTriangle - sideB) * (lengthofTriangle - sideC));

            System.out.println("Triangle Area is " + area);

        } else {

            System.out.println("We can not create a triangle");
        }

    }

    private static boolean isTriangle(double a, double b, double c) {

        // check condition
        if (a + b <= c || a + c <= b || b + c <= a) {
            return  false;
        } else {

            return true;
        }
    }


    private static  double hipotenus(double a, double b){

        return Math.sqrt((a * a) + (b * b));

    }

    private static double areaCalculation2Sides(double sideA, double sideB) {

        return (sideA * sideB) / 2;


    }


}
