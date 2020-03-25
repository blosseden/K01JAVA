package 시험좋다ㅎㅎ;

import java.util.Calendar;

public class Year {

	public static void main(String[] args) {
		
		int year=1997;
		
		
		int age=0;
		Calendar today = Calendar.getInstance();
		
		
		
		age = today.get(Calendar.YEAR)-year;
		System.out.println(year);
		System.out.println(age);
		
	
	}

}
