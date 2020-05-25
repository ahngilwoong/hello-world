package clder;

import java.util.Scanner;

public class Prompt {
	public int parseDay(String week)
	{
	
		if(week.equals("su")) {
			return 0;
		}
		else if(week.equals("mo")) {
			return 1;
		}
		else if(week.equals("tu")) {
			return 2;
		}
		else if(week.equals("we")) {
			return 3;
		}
		else if(week.equals("th")) {
			return 4;
		}
		else if(week.equals("fr")) {
			return 5;
		}
		else if(week.equals("sa")) {
			return 6;
		}
		else {
		return 0;
		}
	}
	
	
	public void runPrompt()
	{
		String PROMPT="cal> "; 
		Scanner sc = new Scanner(System.in);
		Calender cal = new Calender();
		
		int month = 1;
		int year = 1;
		int weekday = 0;
		while(true)
		{
			System.out.println("년을 입력하세요 : (exit = -1) ");
			System.out.print("year>");

			year = sc.nextInt();
			if(year == -1) {
				break;
			}
			System.out.println("달을 입력하세요 : ");
			System.out.print(PROMPT);
			month = sc.nextInt();
			System.out.println("첫째 날의 요일을 입력하세요. :");
			String str_wk = sc.next();
			weekday = parseDay(str_wk);
			System.out.println(str_wk + weekday);
			if(month > 12 || month < 1)
			{
				System.out.println("12월 이하의 숫자를 다시 입력해주세요.");
				continue;
			}
			System.out.printf("%d월은 %d일까지 있습니다. \n", month, cal.getMaxDaysOfMonth(year, month));

			cal.printCalender(year, month, weekday);
			
		}

		sc.close();


	}

	public static void main(String[] args) {

		Prompt p = new Prompt();
		p.runPrompt();

		
	}
}
