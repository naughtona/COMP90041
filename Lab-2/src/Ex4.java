/*
 * Programming and Software Development COMP90041
 * 
 * Author: 			Andrew Naughton
 * Purpose:			Lab 2 - Exercise 4
 * Last modified: 	18/03/2021
 */

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		int coupons = keyboard.nextInt();
		
		int candyBars = coupons / 10; // <int> / <int> is integer division :)
		int gumballs = (coupons % 10) / 3;
		int leftover = (coupons % 10) % 3;
		
		System.out.format("With %d coupon(s) you can get %d candy bar(s) and %d gumball(s).\n",
							coupons, candyBars, gumballs);
		System.out.format("This will leave you with %d coupon(s)", leftover);
		
		keyboard.close();
	}

}
