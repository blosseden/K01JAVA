class A{
	int num1=1;	
	
	void showInfo() {}
}
class B extends A {
	int num2=2;
	void showInfo() {
		System.out.println("출력(B):"+ num2);
	}
}
class C extends A {
	int num3=3;
	void showInfo() {
		System.out.println("출력(C):"+ num3);
	}
}
public class Over {
	public static void main(String[] args) {
		B b1 = new B();
		B b2 = new B();
		B b3 = new B();
		B b4 = new B();
		
		C c1 = new C();
		C c2 = new C();
		C c3 = new C();
		C c4 = new C();
		
		A[] aArray = new A[10];
		aArray[0] = b1;
		aArray[1] = c1;
		
		
		
		
		
		
		B[] bArr = new B[10];
		bArr[0] = b1;
		bArr[1] = b2;
		bArr[2] = b3;
		bArr[3] = b4;
		bArr[0].showInfo();
		
		C[] cArr = new C[10];
		cArr[0] = c1;
		cArr[1] = c2;
		cArr[2] = c3;
		cArr[3] = c4;
		cArr[0].showInfo();
		
		A[] aArr = new A[10];
		aArr[0] = b1;
		aArr[1] = c1;
		
		aArr[0].showInfo();

	}

}
