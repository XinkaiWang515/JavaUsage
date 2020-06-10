package Structures;

import java.time.LocalDate;

public class DateTime {
	final int year;
	final int month;
	final int day;
	
	static LocalDate currentDate = LocalDate.now();
	
	public DateTime() {
		this(currentDate.getYear(), currentDate.getMonthValue(), currentDate.getDayOfMonth());
	}
	
	public DateTime(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	public int getYear() {
		return year;
	}
	
	public int getMonth() {
		return month;
	}
	
	public int getDay() {
		return day;
	}
	
	public int setYear(int year) {
		throw new UnsupportedOperationException();
	}
	
	public int setMonth(int month) {
		throw new UnsupportedOperationException();
	}
	
	public int setDay(int day) {
		throw new UnsupportedOperationException();
	}
	
	public static void main(String[] args) {
		DateTime test = new DateTime();
		System.out.println(test.getYear());
		System.out.println(test.getMonth());
		System.out.println(test.getDay());
		test.setMonth(10);
	}

}
