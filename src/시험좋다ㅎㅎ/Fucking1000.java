package 시험좋다ㅎㅎ;
/*
2. 1부터 1000까지 숫자중 2의 배수 이거나 5의 배수인 숫자의 합을 구하는 
   소스코드와 결과화면 스크린 샷을 제출하시오
    [요구사항] 
   가. 단, 2와 5의 공배수인 경우 제외
   나, while문 버전과  for문 버전으로 두가지 소스코드를 작성하시오
 */
public class Fucking1000 {

	public static void main(String[] args) {

			int sum = 0;
			int i=1;
			while(i<=1000) {
				if(i%2==0 || i%5==0) {
					sum += i;
				}
				i++;
			}
			System.out.println("1~1000사이 2or5의 배수합:" + sum);
			
		int total = 0;
		for(int j=0; j<=1000 ; j++) {
			if(j%2==0 || j%5==0) {
				total += j;
			}
		}
		System.out.println("1~1000사이 2or5의 배수합:" + total);
	}

}
