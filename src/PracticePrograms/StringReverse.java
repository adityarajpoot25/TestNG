package PracticePrograms;

public class StringReverse {

	public static void main(String[] args) {
		StringBuffer str= new StringBuffer("Hello my name is Aditya");
//		System.out.println(str.reverse());
		String str1="";
	String str2="";
		String temp="";
		String input="Hello my name is Aditya";
		String a[] =input.split("\\s");
		for(int j=0;j<a.length;j++) {
			temp=a[j];
//			System.out.println(a[j]);
		for(int k=temp.length()-1;k>=0;k--) {
			str2=str2+temp.charAt(k);
		}
		}
		System.out.println(str2+" ");
		
		
		for(int i=str.length()-1;i>=0;i--) {
			str1=str1+str.charAt(i);
			
		}
		System.out.println(str1);

	}

}
