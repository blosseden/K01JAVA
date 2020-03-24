package ex04controlstatement;

public class Qu_04_09 {

	public static void main(String[] args) {
		
		for(int su=1; su<=9 ; su++) {
			for(int dan=2 ; dan<=9 ; dan++) {
				System.out.printf("%2d*%2d=%3d", dan, su, (dan*su));
				}
			System.out.println();
		}
		/* 기본 구구단에서 단이랑 수의 배열을 바꾸면 된다 
		  ex)for(int su=2;~~~~	)		
		  		for(int dan=1 ~~~ )
		 	↓
		 	for(int dan=1~~~)
		 		for(int su=2~~~)
	*/
	
	}

}
