package program;

public class Pattern {

	public static void main(String[] args) {
		for(int i=1;i<6;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println("");
		}
		
		 int i, j, k = 1;
         for (i = 1; i <= 5; i++) {
             for (j = 1; j< i + 1; j++) {
                 System.out.print(k++ + " ");
             }
    
             System.out.println();
         }

	}

}
