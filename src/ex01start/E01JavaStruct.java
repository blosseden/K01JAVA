package ex01start;

import java.text.SimpleDateFormat;
import java.util.Date;

public class E01JavaStruct {

	public static void main(String[] args) {

//		System.out.println("존잼꿀잼허니잼");
//		
//		Date toDayOfDate = new Date();
//		
//		System.out.println("오늘 날짜얌"
//				+ ""
//				+ "" + toDayOfDate);
//		
//		SimpleDateFormat simple =
//					new SimpleDateFormat("2020-02-10 16:55:25");
//		String toDayString = simple.format(toDayOfDate);
//		System.out.println("바뀐 날짜얌" + toDayString);
//	
		
		System.out.println("존잼 꿀잼 허니잼");
		
		Date toDayOfDate = new Date();
		
		System.out.println("오늘 날짜"
				+ ""
				+ "" + toDayOfDate) ;
		
		SimpleDateFormat simple =
					new SimpleDateFormat("2020-02-13 18:40:30");
		String toDayString = simple.format(toDayOfDate);
		System.out.println("바뀐 날짜얌" + toDayString);
		
		
		
		
	}
	
}
