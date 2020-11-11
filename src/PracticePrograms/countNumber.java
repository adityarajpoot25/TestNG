package PracticePrograms;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class countNumber {

	
	public static void main(String[] args) throws IOException {
		String str="I will eat 2 burgers 23 fries & 1.25 cokes l8r";
//		System.out.println(str);
		str=str.replaceAll("\\."," ");
//		System.out.println(str);
		String a[]= str.split("\\D+");
		System.out.println(a.length-1);
for(String s: a) {
	System.out.println(s);
}

			
		
}
}