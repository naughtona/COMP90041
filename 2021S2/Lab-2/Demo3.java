/*
 * Testing understanding of if-else
 */

import java.util.Scanner;

public class Demo3 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Mark: ");
        // read user's mark as String
        String markAsString = keyboard.nextLine();
        // convert to double
        double mark = Double.parseDouble(markAsString);

        // output whether user passes or fails subject
        // if (mark >= 50) {
        //     System.out.println("PASS.");
        // } else {
        //     System.out.println("FAIL.");
        // }

        // <expr1> ? <expr2> : <expr3>
        System.out.println(mark >= 50 ? "PASS." : "FAIL.");
        
        // close scanner object
        keyboard.close();
    }

}
