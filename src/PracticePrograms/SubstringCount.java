package PracticePrograms;

public class SubstringCount {

	public static void main(String args[]){  
	
		String str= "welcomememe to hellome world";
		String subString ="me";
		int count=0;
		for(int i=0;i<str.length()-1;i++) {
			if(str.substring(i, i+2).contains(subString)) {
				count++;
			}
			
		}
		System.out.println(count);
		
		
//		System.out.println("Hello");
		 String s="My name is aditya";
			char  temp= 'a';
			int count1=0;
			s= s.replaceAll("\\s", "");

			for(int i1=0;i1<s.length();i1++){
				String str1="";
				str = str+s.charAt(i1);
//				System.out.println(str);
			if(str.equals("a")) {
			 count1++;

			} 


			}
			System.out.println(count1);

 
	}

}
