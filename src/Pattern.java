
public class Pattern {


	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 1
		 * 12
		 * 123
		 * */
		for(int i=1; i<=4; i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j + " ");
			}
			System.out.println("");
		}
		System.out.println("");
		
		/*
		 * A
		 * AB
		 * ABC
		 * */
		for(char i='A'; i<='D'; i++) {
			for(char j='A';j<=i;j++) {
				System.out.print(j + " ");
			}
			System.out.println("");
		}
		System.out.println("");
		
		/*
		 * 	$$$$
		 * 	$  $
		 * 	$  $
		 * 	$$$$
		 */
//		for(int i=0;i<4;i++) {
//			for(int j=0;j<4; j++) {
//				if(i==0 || i==3) {
//					System.out.print("$");
//				}
//				else {
//					System.out.print("$");                        					
//				}
//			}
//			System.out.println();
//		}

		
		for (int i = 1; i <= 4; i++) {

			for (int j = 1; j <= 4; j++) {
				if (i == 1 || i == 4) {
					System.out.print("$");
				} else if (j == 2 || j == 3) {
					System.out.print(" ");
				} else {
					System.out.print("$");
				}
			}
			System.out.println();

		}
			  
			  
			  
		
		
		
		
		
	}

}
