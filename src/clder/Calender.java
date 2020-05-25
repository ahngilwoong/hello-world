package clder;


public class Calender extends Prompt {

	private final int[] MAX_DAYS = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	private final int[] LEAP_MAX_DAYS = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public boolean isLeapYear(int year)
	{
		if(year % 4 == 0 && (year % 100 != 0 || year % 400 != 0))
		{
			return true;
		}
		else
		{
		return false;
		}
	}
	public int getMaxDaysOfMonth(int year, int month) {
		if (isLeapYear(year))
		{
			return LEAP_MAX_DAYS[month-1];
		}
		else
		{
			
		
		return MAX_DAYS[month - 1];
		}
	}

	public void printCalender(int year, int month, int weekday) {
		System.out.println("      <" + year + "년" + month + "월>");
		System.out.println(" SU MO TU WE TH FR SA ");
		System.out.println("  =====================");

		// print blank space
		for(int i = 0; i < weekday; i++)
		{
			System.out.print("   ");
		}
		int maxDay = getMaxDaysOfMonth(year, month);

		// print first line
		int count = 7-weekday;
		
		int delim = (count < 7) ? count : 0;
		/*
		 if(count < 7 )
		 {
		 delim = count;
		 }
		 else
		 {	
		 delim = 0
		 }
		 	 */
		
		for(int i = 1; i <= count; i++)
		{
			System.out.printf("%3d",i);
		}
		System.out.println();
		//print from second line to last
		count++;
		for (int i = count; i <= maxDay; i++) {

			System.out.printf("%3d",i);

			//일요일은 7-0 7로 반환되기때문에 위에참조
			if (i % 7 == delim) {
				System.out.println("");
			}

		}
		System.out.println(" ");
	}
}
