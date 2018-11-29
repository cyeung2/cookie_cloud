
public class MyDateTest {

	public static void main(String[] args) {
		MyDate d1 = new MyDate(2012, 2, 28);
		System.out.println(d1);
		System.out.println(d1.nextDay());
		System.out.println(d1.nextDay());
		System.out.println(d1.nextMonth());
		System.out.println(d1.nextYear());

		
		MyDate d2 = new MyDate(2012, 1, 2);
		System.out.println(d2);
		System.out.println(d2.previousDay());
		System.out.println(d2.previousDay());
		System.out.println(d2.previousMonth());
		System.out.println(d2.previousYear());

		MyDate d3 = new MyDate(2012, 2, 29);
		System.out.println(d3.previousYear());


		// Tuesday 28 Feb 2012 
		// Wednesday 29 Feb 2012 
		// Thursday 1 Mar 2012 
		// Sunday 1 Apr 2012
		// Monday 1 Apr 2013
		// Monday 2 Jan 2012
		// Sunday 1 Jan 2012
		// Saturday 31 Dec 2011 
		// Wednesday 30 Nov 2011 
		// Tuesday 30 Nov 2010
		// Monday 28 Feb 2011
		// MyDate d4 = new MyDate(2099, 11, 31);
		// Invalid year, month, or day! 
		// MyDate d5 = new MyDate(2011, 2, 29);
		// Invalid year, month, or day!

	}

}
