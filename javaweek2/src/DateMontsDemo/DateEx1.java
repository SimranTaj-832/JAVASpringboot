package DateMontsDemo;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx1 {

	public static void main(String[] args) {
		String startDate="22/11/2021 12:30:00";
		String endDate="24/11/2021 12:30:00";
		SimpleDateFormat sdFormat= new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		try {
			Date startDateObj=sdFormat.parse(startDate);
			Date endDateObj=sdFormat.parse(endDate);
			System.out.println("Time in milli seconds: "+startDateObj.getTime());
			
			long timediff=endDateObj.getTime()-startDateObj.getTime();
			System.out.println("Time diffrence in milli seconds: "+timediff);
			
			long secondsDiff=(timediff/1000);
			System.out.println("Time diffrence in seconds: "+secondsDiff);
			
			long minDiff=timediff/(1000*60);
			System.out.println("Time diffrence in minutes: "+minDiff);
			
			long hoursDiff=timediff/(1000*60*60);
			System.out.println("Time diffrence in hours: "+hoursDiff );
			
			long daysDiff=timediff/(1000*60*60*24);
			System.out.println("Time diffrence in days: "+daysDiff);
		}catch(ParseException e) {
			e.printStackTrace();
		}
	}

}
