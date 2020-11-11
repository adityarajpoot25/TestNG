package program;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number");
		int num= scan.nextInt();
		int flag=0;
		for(int i=2; i<num;i++)
		{
			if(num%i==0) {
				flag=1;
			}
		}
		if(flag==0) {
			System.out.println("Number is Prime "+num);
		}
		else {
			System.out.println("Number is not a Prime "+num);
		}

	}

}
