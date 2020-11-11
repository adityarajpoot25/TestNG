package PracticePrograms;

public class Tedfadf  {

	public static void manin(String a[]) {
	String s="My name is aditya";
	char  temp= 'a';
	int count=0;
	s= s.replaceAll("\\s", "");

	for(int i=0;i<s.length();i++){
		String str="";
		str = str+s.charAt(i);
	if(str.equals(temp)) {
	 count++;

	} 


	}
	System.out.println(count);

}}
	
