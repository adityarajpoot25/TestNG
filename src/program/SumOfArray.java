package program;

public class SumOfArray {

	public static void main(String[] args) {
	int a[]= {1,3,5,10,15};
	
	int sum= sumOfArray(a);
	System.out.println(sum);
	}

	private static int sumOfArray(int a[]) {
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
		}
		return sum;
	}

}
