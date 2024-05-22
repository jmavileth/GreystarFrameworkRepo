package practice.basics;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class JavaBasics {
public static void main(String[] args) {
	Date dateObj= new Date();
	System.out.println(dateObj.toString());
	SimpleDateFormat sim = new SimpleDateFormat("dd-mm-yyyy");
	String actDate = sim.format(dateObj);
	Calendar calendar = sim.getCalendar();
	System.out.println(actDate);
	calendar.add(Calendar.DAY_OF_MONTH, -25);
	String endDate = sim.format(calendar.getTime());
	System.out.println(endDate);
}
}
