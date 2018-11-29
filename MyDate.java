import java.util.Calendar;
import java.util.Date;
public class MyDate {
	private int year, month, day;

	private static String[] strMonths = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
	private static String[] strDays = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
	private static int[] daysInMonth = {31,28,31,30,31,30,31,31,30,31,30,31};

	/**
	 * Checks Leap Year
	 * @param year
	 * @return True if yes is leap year
	 */
	public static boolean isLeapYear(int year) {
		return ((year%4 == 0) && (year%100 != 0) || (year%400 == 0));
	}

	public static boolean isValidDate(int year, int month, int day) {
		if ((year < 1) || (year > 9999) || (month > 12) || (month < 1) || (day < 1)) return false;
		return day <= daysInMonth[month] + (month==2 && isLeapYear(year)? 1:0);
	}

	public static int getDayOfWeek(int year, int month, int day) {
		Calendar c = Calendar.getInstance();
		c.set(year,month-1,day);
		return c.get(Calendar.DAY_OF_WEEK)-1;
	}

	public MyDate(int year, int month, int day){
		setDate(year, month, day);
	}

	

	public void setDate(int year, int month, int day) {
		if (!isValidDate(year, month, day))
			throw new IllegalArgumentException("Invalid year, month, or day!");
		this.year = year;
		this.month = month;
		this.day = day;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		if (!isValidDate (year, this.month, this.day))
			throw new IllegalArgumentException("Invalid year!");
		this.year = year;
	}

	public int getMonth() {
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.MONTH, 1);
		return month;
	}

	public void setMonth(int month) {
		if (!isValidDate(this.year, month, this.day))
			throw new IllegalArgumentException("Invalid month!");
		this.month = month;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		if (!isValidDate(this.year, this.month, day))
			throw new IllegalArgumentException("Invalid day!");
		this.day = day;
	}
	public MyDate nextYear() {
		year++;
		if (year < 0 || year >9999)
			throw new IllegalStateException("Year Out Of Range");
		if (isLeapYear(year) && day == 29 && month == 2)
			day=28;
		return this;
	}
	public MyDate nextMonth(){
		month++;
		if (month == 13) {
			month = 1;
			nextYear();
		}
		if (day > maxDay(month, year))
			day = maxDay(month, year);
		return this;
	}

	public static int maxDay(int month, int year){
		if (isLeapYear(year) && month == 2) return 29;
		return daysInMonth[month-1];
	}
	public MyDate nextDay() {
		day++;
		if (day > maxDay(month, year)) {
			day=1;
			nextMonth();
		}
		return this;
	}
	public MyDate previousYear(){
		year--;
		if (year < 0) 
			throw new IllegalStateException("Year out of range!");
		if (month==2 && !isLeapYear(year) && day == 29)
			day = 28;
		return this;
	}
	public MyDate previousMonth() {
		month--;
		if (month==0) {
			month = 12;
			previousYear();
		}
		if (day > maxDay(month, year))
			day = maxDay(month, year);
		return this;
	}
	public MyDate previousDay() {
		day--;
		if (day == 0) {
			previousMonth();
			day = maxDay(month, year);
		}
		return this;
	}
	public String toString(){
		return strDays[getDayOfWeek(this.year, this.month, this.day)] + " " + day + " " + strMonths[month-1] + " " + year;
	}

}
