package ex09package;

import ex09package.kosmo.buyer.FruitBuyer4;
import ex09package.kosmo.seller.FruitSeller4;

/*
연습문제] 해당 프로그램을 아래의 지시에 따라 패키지로 
구분하여 정상 실행되도록 변경하시오.

FruitSeller4 클래스 -> ex09package.kosmo.seller 패키지에 묶는다.
FruitBuyer4 클래스 -> ex09package.kosmo.buyer 패키지에 묶는다.

두 클래스를 적당히 import하여 정상동작할수 있도록 
FruitSalesMain4 클래스를 구성한다.
 */

//class FruitSeller4 {
//	int numOfApple; //판매자의 사과 보유갯수
//	int myMoney; //판매수익
//	final int APPLE_PRICE; //다시 상수로 선언함.
//	
//	public FruitSeller4(int money, int appleNum, int price) {
//		myMoney = money;
//		numOfApple = appleNum;
//		APPLE_PRICE = price;// <= 생성자 내에서는 상수를 초기화 할 수 있음.
//	}
//	
//	public int saleApple(int money) {
//		int num = money / APPLE_PRICE;
//		numOfApple -= num;
//		myMoney += money;
//		return num;
//	}
//	
//	public void showSaleResult() {
//		System.out.println("[판매자]남은사과갯수:"+ numOfApple);
//		System.out.println("[판매자]판매수익:"+ myMoney);
//	}
//}

//class Fruitbuyer4 {
//	
//	int myMoney;
//	int numOfApple;
//	
//	public Fruitbuyer4 (int _myMoney, int _numOfApple) {
//		myMoney = _myMoney;
//		numOfApple = _numOfApple;
//	}
//	
//	public void buyApple(FruitSeller4 seller, int money) { 
//		numOfApple += seller.saleApple(money);
//		myMoney -= money;
//	}
//	
//	public void showBuyResult() {
//		System.out.println("[구매자]현재잔액:"+ myMoney);
//		System.out.println("[구매자]사과갯수:"+ numOfApple);
//	}
//}
//	
public class E06FruitSalesMain4 {
	public static void main(String[] args) {
		
		FruitSeller4 seller1 = new FruitSeller4(0, 100, 1000);
		
		FruitSeller4 seller2 = new FruitSeller4(0, 80, 500);
		
		FruitBuyer4 buyer = new FruitBuyer4(10000, 0);
		
		System.out.println("구매행위가 일어나기전의 상태");
		seller1.showSaleResult();
		seller2.showSaleResult();
		buyer.showBuyResult();
		
		buyer.buyApple(seller1, 5000);
		buyer.buyApple(seller2, 5000);
		
		System.out.println("구매행위가 일어난 후의 상태");
		seller1.showSaleResult();
		seller2.showSaleResult();
		buyer.showBuyResult();
		
		
	}

}
