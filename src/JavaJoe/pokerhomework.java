package JavaJoe;

import java.util.Arrays;

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
		System.out.println("------------shuffle star---------------------------");
		
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
		System.out.println("-------shuffle end-----------------------------------------");
//		for(int a:poker) {
//			System.out.println(a );
//		} 
		System.out.println("-------------�o�P----------------");
		
		int[][] player = new int [4][13];
		for(int i=0; i<poker.length; i++) {
			player[i%4][i/4] = poker[i];
		}
		String[] suits = {"�®�","����","���","����"};
		String[] values = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
		
		for(int j=0; j<player.length; j++) {
			Arrays.sort(player[j]); //�N�C�Ӫ��N��W���P�Ƨ�
			System.out.println("player" + j);
			for(int v:player[j]) {	
				System.out.print(suits[v/13] + values[v%13] + " ");//suits �M values��ܪ��M�ƭ�
			}
			System.out.println();
		}
		
		
	}

}
