// Lecture 05
// London Paris
// IT-CS-142
import java.util.*;

public class Lecture05 {

    public static String season(int month, int day) {
        if ((month < 3) || (month == 3 && day <= 15) || (month == 12 && day >= 16)) {
            return "winter";
        } else if ((month < 6) || (month == 6 && day <= 15)) {
            return "spring";
        } else if ((month < 9) || (month == 9 && day <= 15)) {
            return "summer";
        } else {
            return "fall";
        }
    }

    public static void redundant(int a, int x) {
        a = 2;
        if (x < 30) {
            x++;
        }
        System.out.println("Java is awesome!" + x );
    }
    public static void printRange(int A, int B) {
        if (A <= B) {
            for (int i = A; i <= B; i++) {
                System.out.print(i + " ");
            }
        } else {
            for (int i = A; i >= B; i--) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
    public static void test_printRange(int A, int B) {
    }

    public static void main(String[] args) {
        System.out.println();
        System.out.println("Hello, world!");
        // SELF-CHECK PROBLEMS:
        // Note: you will need to put some of your answers inside a comments

        // Put your answer for #5A here:

        // NOTE: FIRST try to predict what the output will be WITHOUT actually running
        // the program
        // write down your answer here
        // 13 21

        // NEXT run the program and see the results (you can copy-and-paste it here)
        // (I'm not including it in the starter project so that people don't just run
        // it as the first thing they do :) )

        // LASTLY compare the two results and if they're different go back and figure
        // out
        // why the computer's output is different from what you predicted.
        // The results from analytically discovering the output and running the program were the same.

        // Put your answer for #5B here:
        // (Do this like #5A - predict, write your prediction, run the code, then
        // explain any differences)
        // 5 6

        // Put your answer for #5C here:
        // 6 5

        // Put your answer for #5D here:
        // 7 11

        // Put your answer for #8 here:
        // Instead of correcting the code write a brief explanation of how to fix it
        // and include only the lines that you'll change
        // To fix this logic error, you should add an else block to the outer if statement to handle the case when
        // the number is odd
        // and modify the inner else block to handle even numbers that are not divisible by 6

        // Put your answer for #10 here:
        // NOTE: You'll need to write the method on, say, line 2
        // (i.e., outside of this main() method)
        // and then call that method right here
        redundant(2, 3);

        // Put your answer for #15 here:
        // the cumulative sum holder 'sum' is within the for loop causing it to be initialized to zero during each iteration.
        // To fix the code, I would move the sum variable to above the loop so that its scope is increased and only increment it within the loop.

        // Put your answer for #16 here:
        // The issue with the provided code is that it exits and returns the first factor of n it finds,
        // instead of counting all the factors of n. This is due to incorrect placement of the return i statement.
        // We need to move that statement further down so that the program can count all the factors of n before exiting.


        // Put your answer for #17 here:
        // Make sure that this compiles & runs
        // sumProduct();


        // Put your answer for #23 here:
        String name = "Marla Singer";


        int spaceIndex = name.indexOf(" ");
        String lastName = name.substring(spaceIndex + 1);
        String firstInitial = name.substring(0, 1);

        String result = lastName + ", " + firstInitial + ".";
        System.out.println(result);

        // EXERCISES:

        // Put your answer for #3 here:
        // You will need to add the method in above main(), but then call it here
        System.out.println(season(01, 31));

        // Put your answer for #6 here:
        printRange(2,7);
        printRange(19,11);
        printRange(5,5);

        // UNIT TESTS:
        System.out.println("");
        System.out.println("Unit tests start here:");

        test_printRange2_7();
        test_printRange19_11();
        test_printRange5_5();

        testSeasonsWinter();
        testSeasonsSpring();
        testSeasonsSummer();
        testSeasonsFall();
    }

    public static void sumProduct() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter numbers to multiply or any non-numeric value to stop.");

        double sum = 1;
        while (input.hasNext()) {
            int num = input.nextInt();
            sum *= num;
            System.out.println("Current cumulative product: " + sum);
            System.out.println("Enter another number (or any non-numeric value to stop):");
        }
    }

    // TEST METHODS:
    public static void test_printRange2_7() {

        System.out.println("START OF TEST: test_printRange2_7");
        test_printRange(2, 7);
        System.out.println("END OF TEST: test_printRange2_7");

        // Correct (expected) output:
        // 2 3 4 5 6 7
    }

    public static void test_printRange19_11() {

        System.out.println("START OF TEST: test_printRange19_11");
        test_printRange(19, 11);
        System.out.println("END OF TEST: test_printRange19_11");

        // Correct (expected) output:
        // 19 18 17 16 15 14 13 12 11
    }

    public static void test_printRange5_5() {
        System.out.println("START OF TEST: test_printRange5_5");
        test_printRange(5, 5);
        System.out.println("END OF TEST: test_printRange5_5");

        // Correct (expected) output:
        // 5
    }

    // This is NOT a test itself.
    // This method is used by other testing methods
    private static void testSeason(int month, int day, String expectedAnswer) {
        String outputFromPrintStringsMethod = season(month, day);

        System.out.println("For month=" + month + ", day=" + day + " your season method should return " + expectedAnswer
                + "; what your code actually returned is>" + outputFromPrintStringsMethod + "<");
    }

    public static void testSeasonsWinter() {

        System.out.println("START OF TEST: testSeasonsWinter");

        // If the date falls between 12/16 and 3/15, the method should return "winter".
        testSeason(12, 16, "winter");
        testSeason(12, 30, "winter");
        testSeason(12, 31, "winter");

        testSeason(1, 1, "winter");
        testSeason(1, 11, "winter");
        testSeason(1, 31, "winter");

        testSeason(2, 1, "winter");
        testSeason(2, 24, "winter");
        testSeason(2, 31, "winter");

        testSeason(3, 1, "winter");
        testSeason(3, 14, "winter");
        testSeason(3, 15, "winter");
        System.out.println("END OF TEST: testSeasonsWinter");

        // Correct (expected) output:
        // For month=12, day=16 your season method should return winter; what your code
        // actually returned is>winter<
        // For month=12, day=30 your season method should return winter; what your code
        // actually returned is>winter<
        // For month=12, day=31 your season method should return winter; what your code
        // actually returned is>winter<
        // For month=1, day=1 your season method should return winter; what your code
        // actually returned is>winter<
        // For month=1, day=11 your season method should return winter; what your code
        // actually returned is>winter<
        // For month=1, day=31 your season method should return winter; what your code
        // actually returned is>winter<
        // For month=2, day=1 your season method should return winter; what your code
        // actually returned is>winter<
        // For month=2, day=24 your season method should return winter; what your code
        // actually returned is>winter<
        // For month=2, day=31 your season method should return winter; what your code
        // actually returned is>winter<
        // For month=3, day=1 your season method should return winter; what your code
        // actually returned is>winter<
        // For month=3, day=14 your season method should return winter; what your code
        // actually returned is>winter<
        // For month=3, day=15 your season method should return winter; what your code
        // actually returned is>winter<
    }

    public static void testSeasonsSpring() {
        System.out.println("START OF TEST: testSeasonsSpring");

        // If the date falls between 3/16 and 6/15, the method should return "spring".
        testSeason(3, 16, "spring");
        testSeason(3, 30, "spring");
        testSeason(3, 31, "spring");

        testSeason(4, 1, "spring");
        testSeason(4, 11, "spring");
        testSeason(4, 31, "spring");

        testSeason(5, 1, "spring");
        testSeason(5, 24, "spring");
        testSeason(5, 31, "spring");

        testSeason(6, 1, "spring");
        testSeason(6, 14, "spring");
        testSeason(6, 15, "spring");
        System.out.println("END OF TEST: testSeasonsSpring");

        // Correct (expected) output:
        // For month=3, day=16 your season method should return spring; what your code
        // actually returned is>spring<
        // For month=3, day=30 your season method should return spring; what your code
        // actually returned is>spring<
        // For month=3, day=31 your season method should return spring; what your code
        // actually returned is>spring<
        // For month=4, day=1 your season method should return spring; what your code
        // actually returned is>spring<
        // For month=4, day=11 your season method should return spring; what your code
        // actually returned is>spring<
        // For month=4, day=31 your season method should return spring; what your code
        // actually returned is>spring<
        // For month=5, day=1 your season method should return spring; what your code
        // actually returned is>spring<
        // For month=5, day=24 your season method should return spring; what your code
        // actually returned is>spring<
        // For month=5, day=31 your season method should return spring; what your code
        // actually returned is>spring<
        // For month=6, day=1 your season method should return spring; what your code
        // actually returned is>spring<
        // For month=6, day=14 your season method should return spring; what your code
        // actually returned is>spring<
        // For month=6, day=15 your season method should return spring; what your code
        // actually returned is>spring<
    }

    public static void testSeasonsSummer() {
        System.out.println("START OF TEST: testSeasonsSummer");
        // If the date falls between 6/16 and 9/15, the method should return "summer".
        testSeason(6, 16, "summer");
        testSeason(6, 30, "summer");
        testSeason(6, 31, "summer");

        testSeason(7, 1, "summer");
        testSeason(7, 11, "summer");
        testSeason(7, 31, "summer");

        testSeason(8, 1, "summer");
        testSeason(8, 24, "summer");
        testSeason(8, 31, "summer");

        testSeason(9, 1, "summer");
        testSeason(9, 14, "summer");
        testSeason(9, 15, "summer");
        System.out.println("END OF TEST: testSeasonsSummer");

        // // Correct (expected) output:
        // For month=6, day=16 your season method should return summer; what your code
        // actually returned is>summer<
        // For month=6, day=30 your season method should return summer; what your code
        // actually returned is>summer<
        // For month=6, day=31 your season method should return summer; what your code
        // actually returned is>summer<
        // For month=7, day=1 your season method should return summer; what your code
        // actually returned is>summer<
        // For month=7, day=11 your season method should return summer; what your code
        // actually returned is>summer<
        // For month=7, day=31 your season method should return summer; what your code
        // actually returned is>summer<
        // For month=8, day=1 your season method should return summer; what your code
        // actually returned is>summer<
        // For month=8, day=24 your season method should return summer; what your code
        // actually returned is>summer<
        // For month=8, day=31 your season method should return summer; what your code
        // actually returned is>summer<
        // For month=9, day=1 your season method should return summer; what your code
        // actually returned is>summer<
        // For month=9, day=14 your season method should return summer; what your code
        // actually returned is>summer<
        // For month=9, day=15 your season method should return summer; what your code
        // actually returned is>summer<
    }

    public static void testSeasonsFall() {
        System.out.println("START OF TEST: testSeasonsFall");

        // If the date falls between 9/16 and 12/15, the method should return "fall".
        testSeason(9, 16, "fall");
        testSeason(9, 30, "fall");
        testSeason(9, 31, "fall");

        testSeason(10, 1, "fall");
        testSeason(10, 11, "fall");
        testSeason(10, 31, "fall");

        testSeason(11, 1, "fall");
        testSeason(11, 24, "fall");
        testSeason(11, 31, "fall");

        testSeason(12, 1, "fall");
        testSeason(12, 14, "fall");
        testSeason(12, 15, "fall");

        System.out.println("END OF TEST: testSeasonsFall");

        // Correct (expected) output:
        // For month=9, day=16 your season method should return fall; what your code
        // actually returned is>fall<
        // For month=9, day=30 your season method should return fall; what your code
        // actually returned is>fall<
        // For month=9, day=31 your season method should return fall; what your code
        // actually returned is>fall<
        // For month=10, day=1 your season method should return fall; what your code
        // actually returned is>fall<
        // For month=10, day=11 your season method should return fall; what your code
        // actually returned is>fall<
        // For month=10, day=31 your season method should return fall; what your code
        // actually returned is>fall<
        // For month=11, day=1 your season method should return fall; what your code
        // actually returned is>fall<
        // For month=11, day=24 your season method should return fall; what your code
        // actually returned is>fall<
        // For month=11, day=31 your season method should return fall; what your code
        // actually returned is>fall<
        // For month=12, day=1 your season method should return fall; what your code
        // actually returned is>fall<
        // For month=12, day=14 your season method should return fall; what your code
        // actually returned is>fall<
        // For month=12, day=15 your season method should return fall; what your code
        // actually returned is>fall< }
    }
}