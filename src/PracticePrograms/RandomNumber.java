package PracticePrograms;

import java.util.Random;

public class RandomNumber {

	public static void main(String[] args) {
	
		String str= "Today is my interview and today my interview went well";
		
		 String s[]= str.split(" ");
		 
		  for(int i=0;i<s.length;i++){
//			 System.out.println(s);
			  int count=1;
		  for(int j=i+1;j<s.length;j++){
//		  int count=1;
		  if(s[i].equals(s[j])){
		  System.out.println(s[i]);
		  count++;
		  
		  }
		  
		 
		  
		  
		  }
//		  System.out.println(s[i]);
		  System.out.print(count);

	}

}
}
