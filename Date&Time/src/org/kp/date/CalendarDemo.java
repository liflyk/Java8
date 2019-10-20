package org.kp.date;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarDemo {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		
		cal.set(GregorianCalendar.YEAR, 2019);
		
		System.out.println("Current Date : " +cal.getTime());

		//clear the calendar object
		cal.clear();
		
		//add new calendar 
		
		cal.set(GregorianCalendar.YEAR, 2016);
		System.out.println("Current Date : "+cal.getTime());
	}

}
