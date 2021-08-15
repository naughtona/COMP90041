/*
 * Testing understanding of printf
 */

public class Demo1 {

    public static void main(String[] args) {
        // a few ratings of books out of 100
        double firstRating = 55.7889;
        double secondRating = 9.432;
        double thirdRating = 74;

        // output to 2 decimal places, right-justified, and with minimum width 10
        System.out.printf("Rating 1: %10.2f%n", firstRating);
        System.out.printf("Rating 2: %10.2f%n", secondRating);
        System.out.printf("Rating 3: %10.2f%n", thirdRating);
    }

}
