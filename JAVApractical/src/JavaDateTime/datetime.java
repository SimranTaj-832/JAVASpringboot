package JavaDateTime;

import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Formatter;
import java.util.Locale;

public class datetime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date = new Date();
	      SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss a");
	      System.out.println(sdf.format(date));
	    //display name of a month in (MMM) format
	      Formatter fmt = new Formatter();
	      Calendar cal = Calendar.getInstance();
	      fmt = new Formatter();
	      fmt.format("%tB %tb %tm", cal, cal, cal);
	      System.out.println(fmt);
	      System.out.println("--------------");
	      SimpleDateFormat f = new SimpleDateFormat("MMM");
	      SimpleDateFormat f1 = new SimpleDateFormat("dd");
	      SimpleDateFormat f2 = new SimpleDateFormat("a");
	      int h;
	      
	      if(Calendar.getInstance().get(Calendar.HOUR)== 0)h = 12;
	      else h = Calendar.getInstance().get(Calendar.HOUR);
	      
	      String filename="Current Date is :"
	         +f1.format(new Date())
	         +f.format(new Date())
	         +h+f2.format(new Date());
	      System.out.println(filename);
	      //Display hour and minute
	      System.out.println("--------------");
	      fmt.format("%tl:%tM", cal, cal);
	      System.out.println(fmt);
	      Calendar now = Calendar.getInstance();
	      System.out.println(now.get(Calendar.HOUR_OF_DAY) + ":" + now.get(Calendar.MINUTE));
	      System.out.println("--------------");
	      //display current date and time
	      fmt.format("%tc", cal);
	      System.out.println(fmt);
	      System.out.println(date.toString());
	      //format time in 24 hour format
	      System.out.println("--------------");
	      System.out.println("hour in h format : " + sdf.format(date));
	      //format time in 24 hour format
	      System.out.println("--------------");
	      System.out.println(sdf.format(date));
	      System.out.println("--------------");
	      System.out.println("Current Month in MMMM format : " + sdf.format(date));
	      System.out.println("--------------");
	      System.out.println("seconds in ss format : " + sdf.format(date));
	      System.out.println("--------------");
	      //display name of the months in short format
	      String[] shortMonths = new DateFormatSymbols().getShortMonths();      
	      for (int i = 0; i < (shortMonths.length-1); i++) {
	         String shortMonth = shortMonths[i];
	         System.out.println("shortMonth = " + shortMonth);
	      }	      System.out.println("--------------");
	      String str1 = "dd-MMM-yy";
	      sdf = new SimpleDateFormat(str1, Locale.FRENCH);
	      System.out.println(sdf.format(date));
	      sdf = new SimpleDateFormat(str1, Locale.ENGLISH);
	      System.out.println(sdf.format(date));
	      System.out.println("--------------");
	      //display name of the weekdays
	      String[] weekdays = new DateFormatSymbols().getWeekdays();
	      
	      for (int i = 2; i < (weekdays.length-1); i++) {
	         String weekday = weekdays[i];
	         System.out.println("weekday = " + weekday);}
	      System.out.println("--------------");
	      //find which week of the year, month
	      cal.setTime(date);      
	      System.out.println("today is " + cal.WEEK_OF_YEAR+ "week of the year");
	      System.out.println("today is a "+cal.DAY_OF_MONTH + "month of the year");
	      System.out.println("today is a "+cal.WEEK_OF_MONTH +"week of the month");
	      System.out.println("--------------");
	      //find which week of the year, month
	      
	      
	}

}
