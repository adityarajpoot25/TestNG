package test;

import java.util.Scanner;

public class TestDemo {

	 public static void main(String[] args) {

	Scanner sc= new Scanner(System.in);
	int n=sc.nextInt();
	int n1=n;
	int temp,sum=0;
	while(n>0) {
		temp = n%10;
		sum=(sum*10)+temp;
		n=n/10;
		
	}
	if(sum==n1) {
		System.out.println("Plaindorme");
	}
	else {
		System.out.println("Not");
	}

	}
}

