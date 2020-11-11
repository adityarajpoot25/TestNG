package program;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the number");
		int num= scan.nextInt();
		int fac=num;
		
		for (int i=num-1; i>1;i--) {
			fac= fac*i;
		}
		System.out.println(fac);

	}

}
