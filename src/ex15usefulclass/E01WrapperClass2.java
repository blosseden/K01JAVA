package ex15usefulclass;

public class E01WrapperClass2 {

	public static void main(String[] args) {
		
		String strNumber = "1000";
		System.out.println("10+strNumber="+ (10+strNumber));
		System.out.println("10+strNumber를 숫자로 변경:"+
				(10 + Integer.parseInt(strNumber)));
		System.out.println("10+strNumber를 숫자로 변경:"+
				(10 + Integer.valueOf(strNumber)));	
	try {
		
	
	String money = "120원";
	System.out.println("120원:"+ Integer.parseInt(money));
	}
	catch(NumberFormatException e) {
		
	}
	String floatString = "3.14";
	//System.out.println(Integer.parseInt(floatString)); 에러
	System.out.println("실수형(float)형으로 변경:"+
			Float.parseFloat(floatString));
	System.out.println("실수형(double)형으로 변경:"+
			Double.parseDouble(floatString));
	
	System.out.println("ABCD에서 3번째 인덱스 D의 아스키코드");
	System.out.println(Character.codePointAt("ABCD", 3));
	
	System.out.println("isDigit()를 통한 숫자판단");
	System.out.println(Character.isDefined('A')?"숫자임":"아무튼아니");
	System.out.println(Character.isDefined(50)?"숫자임":"아무튼아니");
	System.out.println(Character.isDefined('7')?"숫자임":"아무튼아니");
	System.out.println("isLetter()메소드를 통한 문자판단");
	System.out.println(Character.isLetter('가'));
	System.out.println(Character.isLetter('A'));
	System.out.println(Character.isLetter('#'));
	System.out.println(Character.isLetter('9'));
	
	System.out.println("isWhitespace() 메소드로 공백문자 판단");
	System.out.println(Character.isWhitespace('a'));
	System.out.println(Character.isWhitespace(' '));//true
	
	System.out.println("알파벳 대소문자 판단");
	System.out.println(Character.isLowerCase('A'));
	System.out.println(Character.isUpperCase('z'));
	System.out.println(Character.isLowerCase('a'));
	System.out.println(Character.isUpperCase('Z'));
	System.out.println(Character.isLowerCase('가'));
	
	String whiteString = "안농";
	int whiteCount = 0;
	char[] chArr = whiteString.toCharArray();
	for(int i=0; i<chArr.length ; i++) {
		if(Character.isWhitespace(chArr[i])) {
			whiteCount++;
		}
	}
	System.out.println("총공백수 : "+ whiteCount);
	}

}
