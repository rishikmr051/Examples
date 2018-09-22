package com.soft.slk.training.examples.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import org.joda.time.DateTime;
import org.joda.time.Days;
import org.joda.time.LocalDate;
import org.joda.time.Period;
import org.joda.time.format.DateTimeFormatter;


public class Helper {

	public static DateTime parseDateString(DateTimeFormatter formatter, String s) {
		DateTime result = null;
		try {
			result = formatter.parseDateTime(s);
		} catch (Exception e) {
			result = null;
		}
		return result;
	}
	
	
	public boolean isAfterPayDay(DateTime datetime) {
		  if (datetime.getMonthOfYear() == 2) {   // February is month 2!!
		    return datetime.getDayOfMonth() > 26;
		  }
		  return datetime.getDayOfMonth() > 28;
		}

		public Days daysToNewYear(LocalDate fromDate) {
		  LocalDate newYear = fromDate.plusYears(1).withDayOfYear(1);
		  return Days.daysBetween(fromDate, newYear);
		}

		public boolean isRentalOverdue(DateTime datetimeRented) {
		  Period rentalPeriod = new Period().withDays(2).withHours(12);
		  return datetimeRented.plus(rentalPeriod).isBeforeNow();
		}

		public String getBirthMonthText(LocalDate dateOfBirth) {
		  return dateOfBirth.monthOfYear().getAsText(Locale.ENGLISH);
		}
	
		public static void DateToString() {
			SimpleDateFormat sdf = new SimpleDateFormat("dd/M/yyyy");
			String date = sdf.format(new Date()); 
			System.out.println(date); //15/10/2013
		}
		public static void StringToDate() {
			SimpleDateFormat sdf = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
			String dateInString = "31-08-1982 10:20:56";
			Date date = null;
			try {
				date = sdf.parse(dateInString);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(date); //Tue Aug 31 10:20:56 SGT 1982
		}
		
////		Get current date time
//		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
//		Date date = new Date();
//		System.out.println(dateFormat.format(date)); //2013/10/15 16:16:39
//		
//		
////		Convert Calendar to Date
//		Calendar calendar = Calendar.getInstance();
//        Date date =  calendar.getTime();
		
		
		
//		//Get current date time
//
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy MMM dd HH:mm:ss");	
//		Calendar calendar = new GregorianCalendar(2013,0,31);
//		System.out.println(sdf.format(calendar.getTime()));
		
		
//	//	Set a date manually.
//
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy MMM dd HH:mm:ss");	
//			
//		Calendar calendar = new GregorianCalendar(2013,1,28,13,24,56);	
//		System.out.println("#1. " + sdf.format(calendar.getTime()));
//
//		//update a date
//		calendar.set(Calendar.YEAR, 2014);
//		calendar.set(Calendar.MONTH, 11);
//		calendar.set(Calendar.MINUTE, 33);
//			
//		System.out.println("#2. " + sdf.format(calendar.getTime()));
		
		
		
		
//	//	Simple Calendar example

//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy MMM dd HH:mm:ss");	
//		Calendar calendar = new GregorianCalendar(2013,1,28,13,24,56);
//
//		int year       = calendar.get(Calendar.YEAR);
//		int month      = calendar.get(Calendar.MONTH); // Jan = 0, dec = 11
//		int dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH); 
//		int dayOfWeek  = calendar.get(Calendar.DAY_OF_WEEK);
//		int weekOfYear = calendar.get(Calendar.WEEK_OF_YEAR);
//		int weekOfMonth= calendar.get(Calendar.WEEK_OF_MONTH);
//
//		int hour       = calendar.get(Calendar.HOUR);        // 12 hour clock
//		int hourOfDay  = calendar.get(Calendar.HOUR_OF_DAY); // 24 hour clock
//		int minute     = calendar.get(Calendar.MINUTE);
//		int second     = calendar.get(Calendar.SECOND);
//		int millisecond= calendar.get(Calendar.MILLISECOND);
//			
//		System.out.println(sdf.format(calendar.getTime()));
//			
//		System.out.println("year \t\t: " + year);
//		System.out.println("month \t\t: " + month);
//		System.out.println("dayOfMonth \t: " + dayOfMonth);
//		System.out.println("dayOfWeek \t: " + dayOfWeek);
//		System.out.println("weekOfYear \t: " + weekOfYear);
//		System.out.println("weekOfMonth \t: " + weekOfMonth);
//			
//		System.out.println("hour \t\t: " + hour);
//		System.out.println("hourOfDay \t: " + hourOfDay);
//		System.out.println("minute \t\t: " + minute);
//		System.out.println("second \t\t: " + second);
//		System.out.println("millisecond \t: " + millisecond);
		
		
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy MMM dd");	
//		
//		Calendar calendar = new GregorianCalendar(2013,10,28);	
//		System.out.println("Date : " + sdf.format(calendar.getTime()));
//
//		//add one month
//		calendar.add(Calendar.MONTH, 1);
//		System.out.println("Date : " + sdf.format(calendar.getTime()));
//			
//		//subtract 10 days
//		calendar.add(Calendar.DAY_OF_MONTH, -10);
//		System.out.println("Date : " + sdf.format(calendar.getTime()));
		
		
//		Convert Date to Calendar.
//
//        SimpleDateFormat sdf = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
//	String dateInString = "22-01-2015 10:20:56";
//	Date date = sdf.parse(dateInString);
//
//        Calendar calendar = Calendar.getInstance();
//	calendar.setTime(date);
		
}
