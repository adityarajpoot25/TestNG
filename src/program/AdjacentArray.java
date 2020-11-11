package program;

public class AdjacentArray {

	public static void main(String[] args) {
		int a[]= {1,4,8,15,17};//3,4
		
		int diff,temp = 0;
		for(int i=0;i<a.length-1;i++) {
			diff= a[i+1]-a[i];
			if(temp<diff) {
				temp=diff;
			}
			
		}
		System.out.println(temp);

	}

}
