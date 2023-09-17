package DateMontsDemo;

import java.text.*;
import java.util.Date;
import java.util.Locale;

public class DateTimeDiffFormat {

	public static void main(String[] args) {
		Date date=new Date();
		SimpleDateFormat sdf;
		DateFormat df;
		sdf=new SimpleDateFormat("hh:mm:ss");
		System.out.println(sdf.format(date));
		sdf=new SimpleDateFormat("dd MMM yyyy hh:mm:ss zzz");
		System.out.println(sdf.format(date));
		sdf=new SimpleDateFormat("E MMM dd yyyy");
		System.out.println(sdf.format(date));
		
		df=DateFormat.getDateInstance(DateFormat.SHORT,Locale.JAPAN);
		System.out.println("Japan: "+df.format(date));
		df=DateFormat.getDateInstance(DateFormat.MEDIUM,Locale.KOREA);
		System.out.println("Korea: "+df.format(date));
		df=DateFormat.getDateInstance(DateFormat.LONG,Locale.UK);
		System.out.println("United Kingdom: "+df.format(date));
		df=DateFormat.getDateInstance(DateFormat.FULL,Locale.US);
		System.out.println("United States: "+df.format(date));
		df=DateFormat.getDateInstance(DateFormat.FULL,Locale.CANADA);
		System.out.println("Canada: "+df.format(date));
		
	}

}
