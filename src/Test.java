
public class Test {

		
	static void myFunc(int ... a) {  }
	static void myFunc(int a, double b) {  }
		 
	public static void main(String[] args) {
		 
		myFunc(1);
		myFunc(1,2);
		myFunc(1,2,3);
		myFunc(1,2,3,4);
		myFunc(1,2,3,4,5);
		
		myFunc(1, 2.0);
		 
	}

}
