package ex06array;

import java.util.Random;

public class E01OneDimArray02 {

	public static void main(String[] args) {
		
		double rndNumber = Math.random();
		System.out.println("생성된 난수[실수]:"+ rndNumber);
		int intNumber = (int)(Math.random()*100);
		System.out.println("생성된난수[정수]:"+ intNumber);
		
		Random random = new Random();
		System.out.println("생성된난수:"+ random.nextInt());
		System.out.println("==============================");
		
		System.out.println("1~45사이의 난수생성:"+
		((int)((Math.random()*100) % 45)+1)) ;
		
		System.out.println("===========================");
		
		/*
		 로또번호처럼 1~45사이의 난수를 생성하는 방법
		 1. 0. xxxx 형태의ㄴ ㅏㄴ수를 정수로 변경하기 위해 100을
		 곱한 후 int형으로 형변환한다.
		 2. 25로 % 연산하여 나머지를 구한다. 이때 결과는
		 0~44가 된다.
		 3. 2번의 결과에 +1 한다. 결과적으로 1~45사이의
		 난수를 생성 할 수 있게 된다.
		 */
		System.out.println("크기가 6인 배열에 난수 입력");
		int[] lottoNum = new int[6];
		for(int i=0 ; i<lottoNum.length ; i++) {
			lottoNum[i] = (int)((Math.random()*100) % 45) + 1;
		}
		for(int i=0 ; i<lottoNum.length ; i++) {
			System.out.printf("%d ", lottoNum[i]);
		}
		
	}

}