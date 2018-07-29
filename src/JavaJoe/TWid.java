package JavaJoe;

public class TWid {
	private String id; 
	static final String letters = "ABCDEFGHJKLMNPQRSTUVXYWZIO";
	
	TWid(){
		this((int)(Math.random()*2)==0);
	}
	TWid(boolean isMale){
		this(isMale,(int)(Math.random()*26));
	}
	TWid(int area){
		this((int)(Math.random()*2)==0,area);
	}
	TWid(boolean isMale,int area){
		String i1 = letters.substring(area-10, area-10+1);
		String i2 = isMale?"1":"2";
		String newid = i1.concat(i2)
				.concat(String.valueOf((int)(Math.random()*10)))
				.concat(String.valueOf((int)(Math.random()*10)))
				.concat(String.valueOf((int)(Math.random()*10)))
				.concat(String.valueOf((int)(Math.random()*10)))
				.concat(String.valueOf((int)(Math.random()*10)))
				.concat(String.valueOf((int)(Math.random()*10)))
				.concat(String.valueOf((int)(Math.random()*10)));
		for(int i=0;i<10;i++) {
			if(checkid(newid+i)) {
				this.id = newid + i;
				break;
			}
		}
	}
	
	String getid() {
		return id;
	}
	
	TWid(String id){
		if(checkid(id)) {
			this.id = id;
			System.out.println(this.id + "   check OK");
		}else {
			System.out.println("check fail   " + this.id);
		}
	}
	
/*	private TWid(String id) {         
		this.id = id;
	}
	static TWid createTWid(String id) {  
		if(checkid(id)) {
			return new TWid(id);
		}else {
			return null;
		}
	}
*/	
	
	
	static boolean checkid(String id) {        //static 宣告,用來TWid分類, 並不屬於物件TWid的方法, 就算沒有TWid物件, 也能直接呼叫
		boolean isright = false;
		if (id.matches("^[A-Z][12][0-9]{8}$")) {
			String letters = "ABCDEFGHJKLMNPQRSTUVXYWZIO";
			int n12 = letters.indexOf(id.charAt(0)) + 10;
			int n1 = n12 / 10;
			int n2 = n12 % 10;
			int n3 = Integer.parseInt(id.substring(1, 2));
			int n4 = Integer.parseInt(id.substring(2, 3));
			int n5 = Integer.parseInt(id.substring(3, 4));
			int n6 = Integer.parseInt(id.substring(4, 5));
			int n7 = Integer.parseInt(id.substring(5, 6));
			int n8 = Integer.parseInt(id.substring(6, 7));
			int n9 = Integer.parseInt(id.substring(7, 8));
			int n10 = Integer.parseInt(id.substring(8,9));
			int n11 = Integer.parseInt(id.substring(9,10));
			int sum = n1*1 + n2*9 + n3*8 + n4*7 + n5*6 + n6*5 + n7*4 + n8*3 + n9*2 + n10*1 + n11*1;
//			System.out.println(sum);
			if(sum%10==0) {
				isright = true;
			}else {
				isright = false;
			}
			
		}else {
			System.out.println("check false");
			isright = false;
		}
		
		return isright;
	}
	
	boolean isMale() {
		int sexual = Integer.parseInt(this.id.substring(1,2)) ;
		return sexual==1;
	}
	
	String city() {
		String locatCity = "";
		String city = this.id.substring(0, 1) ;
		switch(city) {
			case "A": locatCity = "台北市";break;
			case "B": locatCity = "台中市";break;
			case "C": locatCity = "基隆市";break;
			case "D": locatCity = "台南市";break;
			case "E": locatCity = "高雄市";break;
			case "F": locatCity = "新北市";break;
			case "G": locatCity = "宜蘭縣";break;
			case "H": locatCity = "桃園市";break;
			case "I": locatCity = "嘉義市";break;
			case "J": locatCity = "新竹縣";break;
			case "K": locatCity = "苗栗縣";break;
		}
		return locatCity;
	}
	
	
	
//	boolean m1(String id) {  //沒有static, 只能在宣告類別TWid後才能使用
//		System.out.println("OK2");
//		return true;
//	}

}
