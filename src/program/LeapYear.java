package program;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	System.out.println("Enter a year");
	int year= scan.nextInt();
	
	if ((year%400==0)||(year%4==0)&&(year%100!=0)) {
		System.out.println("Entered year is leap year");
	}
	else {
		System.out.println("Entered year is common year");
	}

	}

}
