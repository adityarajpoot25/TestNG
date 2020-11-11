package program;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter a number");
		int number= scan.nextInt();
		int temp= number;
		int r, sum=0;
		
		while(temp>0) {
			r= temp%10;
			sum= (sum*10)+r;
			temp=temp/10;
		}
	
if(number==sum) {
	System.out.println("It's Panlindrome number");
}
else {
	System.out.println("It	's not");
}
	}

}
