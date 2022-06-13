
import java.util.Scanner;

public class Main {

    public static void main (String[] args) {

        int mathMark;
        int turkishMark;
        int biologyMark;
        int englishMark;
        double result;
        String resultStr;

        Scanner readInput = new Scanner(System.in);

        System.out.println("Enter Math Lesson Mark : ");

        mathMark = readInput.nextInt();

        System.out.println("Enter Turkish Lesson Mark : ");

        turkishMark = readInput.nextInt();

        System.out.println("Enter Biology Lesson Mark : ");

        biologyMark = readInput.nextInt();

        System.out.println("Enter English Lesson Mark : ");

        englishMark = readInput.nextInt();

        result = (mathMark + turkishMark + englishMark + biologyMark) / 4;

        resultStr =  result > 60 ? "Passed Class"  : "Failed Class";

        System.out.println("Avarage Mark is " + result);
        System.out.println(resultStr);



    }
}
