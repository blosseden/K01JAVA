package ex04controlstatement;

public class Qu_04_06 {

	/*
	 문제1] 다음과 같은 모양을 출력하는 프로그램을 while문으로 작성하시오.
파일명 : Qu_04_06.java
출력]
	*
	* *
	* * *
	* * * *
	* * * * *
	
	우선 5*5=25 문을 먼저 만들고 inside or outside문을 구성을 해야한다.
	 */
	public static void main(String[] args) {
		
		int i = 1;
		while(i<=5) {
			
			int j = 1;
			while(j<=5) {
				//j는 i의 갯수만큼만 출력한다.
				
				if(i>=j ) {
				System.out.print("* ");
				}
				j++;
			}
			System.out.println();
			i++;
		}
		
	}
}

