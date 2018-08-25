package JavaJoe;

import java.awt.datatransfer.DataFlavor;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class joe85 {

	public static void main(String[] args) {
		Date date = new Date();
		Calendar calendar = Calendar.getInstance();
		System.out.println(date);
		System.out.println(calendar);
		
		DateFormat df = new SimpleDateFormat("yyyy/MM/dd  HH:mm:ss");
		System.out.println(df.format(date));
		System.out.println(df.format(calendar.getTime()));
		
		int year = calendar.get(calendar.YEAR);
		int month = calendar.get(calendar.MONTH) +1;  //程式中排月份由0開始排
		int day = calendar.get(calendar.DAY_OF_MONTH);
		System.out.println(year + "/" + month + "/" + day);
		
		calendar.add(calendar.DATE, -14);  //增減天數
		System.out.println(df.format(calendar.getTime()));  
		
	}

}
