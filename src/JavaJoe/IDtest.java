package JavaJoe;

public class IDtest {
	private String ID ;
	
	IDtest(){
		String No;
		int n12 = ((int)(Math.random()*5) + 10);
		int n1 = n12/10;
		int n2 = n12%10;
		int n3 = ((int)(Math.random()*10));
		int n4 = ((int)(Math.random()*10));
		int n5 = ((int)(Math.random()*10));
		int n6 = ((int)(Math.random()*10));
		int n7 = ((int)(Math.random()*10));
		int n8 = ((int)(Math.random()*10));
		int n9 = ((int)(Math.random()*10));
		int n10 = ((int)(Math.random()*10));
		int n11 = ((int)(Math.random()*10));

		
	}
	
	IDtest(String id){
		if(checkID(id)) {
			this.ID = id;
			System.out.println("ID 輸入正確");
		}else {
			this.ID = null;
			System.out.println("輸入錯誤");
			System.out.println("check fail   " + this.ID);
		}
	}
	///////////////////////////////////////////////////////////////////////////////////////////
	String getID() {
		return this.ID;
	}
	/////////////////////////////////////////////////////////////////////////////////////////////
	static boolean checkID(String id) {
		boolean ispass = false;
		String no = id.substring(0, 1);
		ifcheck:
		if(id.matches("^[A-Z][12][0-9]{8}$")) {
			switch(no) {
				case "A":
					no = "10" + id.substring(1, 10);
					break;
				case "B":
					no = "11" + id.substring(1, 10);
					break;
				case "C":
					no = "12" + id.substring(1, 10);
					break;
				case "D":
					no = "13" + id.substring(1, 10);
					break;
				case "E":
					no = "14" + id.substring(1, 10);
					break;
				default: 
					System.out.println("地區碼錯誤");
					break ifcheck;
					
			}
			int n1 = Integer.parseInt(no.substring(0, 1));
			int n2 = Integer.parseInt(no.substring(1, 2));
			int n3 = Integer.parseInt(no.substring(2, 3));
			int n4 = Integer.parseInt(no.substring(3, 4));
			int n5 = Integer.parseInt(no.substring(4, 5));
			int n6 = Integer.parseInt(no.substring(5, 6));
			int n7 = Integer.parseInt(no.substring(6, 7));
			int n8 = Integer.parseInt(no.substring(7, 8));
			int n9 = Integer.parseInt(no.substring(8, 9));
			int n10 = Integer.parseInt(no.substring(9, 10));
			int n11= Integer.parseInt(no.substring(10, 11));
			int sum = n1*1 + n2*9 + n3*
				8 + n4*7 + n5*6 + n6*5 + n7*4 + n8*3 + n9*2 + n10*1 + n11*1;
			
			if(sum%10 == 0) {
				ispass = true;
			}
		}
		
		return ispass;
	}

}
