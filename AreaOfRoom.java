package com.specialassignment;

import java.util.Scanner;

public class AreaOfRoom {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String choice = null;

		do {
			System.out.println("Welcome to the Area and Perimeter Calculator.");
			System.out.println("Please provide the length of the room. \n");
			String length = sc.nextLine();
			int lngth = Integer.parseInt(length);
			
			System.out.println("\nPlease provide the width of the room. \n");
			String width = sc.nextLine();
			int wdth = Integer.parseInt(width);
			int area = lngth * wdth;
			
			System.out.println("\nThe area of the room equals " + area + ".");
			int perimeter = lngth + wdth;
			
			System.out.println("The area of the room equals " + perimeter + ".\n\n");
			System.out.println("Would you like to continue with the calculator?\n" + "(Y)es or (N)?\n\n");
			
			choice = sc.nextLine();
			// }
		} while ((choice.equalsIgnoreCase("y")));
		System.out.println("Thank you for using the Area and Perimeter Calculator.\n" + "Have a pleasant day.");

		sc.close();

	}

}
