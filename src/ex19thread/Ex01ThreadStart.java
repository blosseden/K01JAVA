package ex19thread;

/*
 ㅆ스레드
 	- 쓰ㅔ드 생성은 thread클래수ㅡ를 상속받는 것부터 시작된다
 	- 해당방법은 쓰레드로 생성할 클래스가 다른 클래스를 상속받지 않아도
 	될 때 사용하는 방식이다.
 	- 만약 다른 클래스를 상속받아야 한다면 java는 다중상속이 불가능하므로
 	runnable 인터페이스를 구현하는 방법을 사용해야 한다.
 */
class ShowThread extends Thread {
	String threadName;
	public ShowThread(String name) {
		threadName = name;
	}
	
	/*
	 run()메소드는 쓰레드의 main()메소드에 해당된다
	 thread클래스의 run()메소드를 오버라이딩 한것으로 해당
	 메소드는 직접 호출하면 안되고, start()메소드를 통해 간접적으로 호출해야한다
	 만ㅇㄱ 직접 호출하면 단순한 실행만 될 뿐 쓰레드가 생성되지는 않으므로 주의해야한다
	 
	 	 */
	@Override
	public void run() {
		for(int i=1 ; i<-100 ; i++) {
			System.out.println("안농.["+threadName+"]이란다");
			try {
				sleep(10);
				/*
				 
				 */
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class Ex01ThreadStart {

	public static void main(String[] args) {
		ShowThread st1 = new ShowThread("쓰레드1st");
		ShowThread st2 = new ShowThread("THread2nd");
		
		st1.start();
		st2.start();
		
		
	}

}
