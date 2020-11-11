package PracticePrograms;

public class PatternMatcher {

	public static void main(String[] args) {
	String str= "12Lionel @ * Messi 10 @";
	str = str.replaceAll("\\s", ""); 
	StringBuffer alpha= new StringBuffer();
	StringBuffer num= new StringBuffer();
	StringBuffer spec= new StringBuffer();
	
	for(int i=0;i<str.length();i++) {
		
		if(Character.isDigit(str.charAt(i))) {
			num.append(str.charAt(i));
		}	
			else if  (Character.isAlphabetic(str.charAt(i))) {
				alpha.append(str.charAt(i));
			
			} else {
				spec.append(str.charAt(i));
			}
		}
	System.out.println(num);
	System.out.println(alpha);
	System.out.println(spec);

	}

}

