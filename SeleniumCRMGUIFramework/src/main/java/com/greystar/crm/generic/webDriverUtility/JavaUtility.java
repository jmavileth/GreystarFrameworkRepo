package com.greystar.crm.generic.webDriverUtility;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class JavaUtility {
	public int getRandomNumber() {
		Random random = new Random();
		int randomNumber = random.nextInt(1000);// Set the boundary eg 1000
		return randomNumber;

	}

	public String getSystemDateYYYYDDMM() {
		Date dateObj = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String actDate = sdf.format(dateObj);
		return actDate;
	}
	public String getTimestamp() {
		String timestamp = new Date().toString().replace(" ", "_").replace(":", "_");
		return timestamp;
	}
	public String getExtendedDateByDays(int days) {
		Date dateObj = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		sdf.format(dateObj);

		Calendar calendar = sdf.getCalendar();
		calendar.add(Calendar.DAY_OF_MONTH, days);
		String extendedDate = sdf.format(calendar.getTime());
		return extendedDate;
	}

}
