package program;

import java.util.ArrayList;

public class StringMaxChar {

	public static void main(String[] args) {
		
		
		String str= "adidtaya";
		char temp = 0,temp2;
		int  count=1;
		
		for(int i=0;i<str.length();i++) {
			
			temp =str.charAt(i);

			for(int j=i+1;j<str.length();j++) {
			temp2 = str.charAt(j);


			if(temp==temp2){
				count++;
			}
			
			}
			
			
		}
		System.out.println(temp);
		System.out.println(count);
	}

}
