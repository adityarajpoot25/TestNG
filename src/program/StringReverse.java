package program;

public class StringReverse {

	public static void main(String[] args) {
		String str="Aditya";
		
		//String reverse without any method
				int i = str.length();
				StringBuffer strb = new StringBuffer();
				for(int j=i-1; j>=0;j--){
				strb = strb.append(str.charAt(j));
				}
				System.out.println(strb);
				
			//String reverse using Reverse method
				strb.append(str);
				strb=strb.reverse();
				System.out.println(strb);
				}
	
	}


