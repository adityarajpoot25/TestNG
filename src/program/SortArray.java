package program;

public class SortArray {

	public static void main(String[] args) {
	int a[]= {2,6,1,4,9};//1,2,6,4,9
	int temp=0;
	
	
	
	for(int i=0;i<a.length;i++) {
		for(int j=i+1;j<a.length;j++)
		if(a[i]<a[j]) {
			temp=a[j];//6
			a[j]=a[i];
			a[i]=temp;
		}
		
	}
	for(int k=0;k<a.length;k++) {
		System.out.println(a[k]);
	}

	}

}
