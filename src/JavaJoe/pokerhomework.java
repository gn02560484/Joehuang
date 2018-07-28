package JavaJoe;

public class pokerhomework {

	public static void main(String[] args) {
		int[] poker = new int[52];
		int pick = 0;
		
		for(int i=0; i<poker.length; i++) {
			poker[i] = i;
		}
		
		for(int a:poker) {
			System.out.println(a);
		}  
		System.out.println("---------------------------------------");
		
		for(int i=0; i<poker.length; i++) {
			int lastp = poker.length - i;
			int a = 0;
			pick = (int)(Math.random() * lastp);
//			System.out.println("lastp=" + lastp + "   pick =" + pick);
			a = poker[lastp -1];
			poker[lastp -1] = poker[pick];
			poker[pick] = a;
//			for(int t:poker) {
//				System.out.println(t);
//			}
			
		}
		System.out.println("-------Answer-----------------------------------------");
		for(int a:poker) {
			System.out.println(a );
		} 
		
	}

}
