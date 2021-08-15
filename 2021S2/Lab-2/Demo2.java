/*
 * Testing understanding of reading console input
 */

import java.util.Scanner;

public class Demo2 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Day: ");
        // read the day as integer
        int day = keyboard.nextInt();
        keyboard.nextLine(); // throwaway newline character in buffer
        // alternatively: int day = Integer.parseInt(keyboard.nextLine());
        
        System.out.print("Month: ");
        // read the month as String
        String month = keyboard.nextLine();

        System.out.print("Year: ");
        // read the year as int
        int year = keyboard.nextInt();
        keyboard.nextLine(); // throwaway newline character in buffer

        System.out.printf("DATE: %d %S %d%n", day, month, year);

        // close scanner object
        keyboard.close();
    }

}
