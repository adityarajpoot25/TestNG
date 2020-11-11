package PracticePrograms;

import java.util.Arrays;
import java.util.regex.Pattern;

public class AlphanumericString {

	public static void main(String[] args) {
	String str= "12Lionel @ * Messi 10 @";
	str = str.replaceAll("\\s", ""); 
	Pattern p = Pattern.compile("\\W");
	String strArray []= p.split(str);
	
	for(String temp:strArray) {
		System.out.println(temp);
	}
	
	String a[]={ "adi", "sanj","deepak",  "nikil", "deepesh"};
	Arrays.sort(a);
	System.out.println(Arrays.toString(a));
	}
	
	

}

