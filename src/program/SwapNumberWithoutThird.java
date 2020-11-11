package program;

public class SwapNumberWithoutThird {

	public static void main(String[] args) {
		int no1= 5;
		int no2=10;
		
		no1= no1+no2;
		no2=no1-no2;
		no1=no1-no2;
		System.out.println("no1 "+no1);
		System.out.println("no2 "+no2);

	}

}
