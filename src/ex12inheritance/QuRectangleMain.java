package ex12inheritance;
/*
 문제3) QuRectangleMain.java
정사각형을 의미하는 Square클래스와 직사각형을 의미하는 Rectangle클래스를 정의하고자 한다.
그런데 정사각형은 직사각형의 일종이므로, 다음의 형태로 클래스의 상속관계를 구성하고자 한다. 
아래의 소스를 참조하여 구현하시오. 

직사각형 면적: 12
정사각형 면적: 49

 */
class Rectangle
{
	int i,j;
	//인자생성자
	public Rectangle(int i, int j) {
		this.i=i;
		this.j=j;
	}

	public void ShowAreaInfo() {
		System.out.println("직사각형 면적:"+(i*j));
	}

} 

//정사각형을 표현한 클래스(정사각형은 직사각형의 일종)
class Square extends Rectangle
{
	//멤버변수:확장없음
	/*
	 부모클래스에서 이미 가로 세로 길이가 정의되어있으므로 추가적인
	 멤버변수는 불필요하다
	 */
	
	//생성자 
	/*
	 정사각형은 가로 세로 길이가 동일하므로 인자값을 1개로
	 부모의 멤버변수 2개를 동시에 초기화한다
	 */
	public Square(int i) {
		super(i,i);
	}
	
	/*
	넓이를 구하는 공식은 동일하나 부모는 직사각형
	자식은 정사각형의 면적을 출력해야 하므로 오버라이딩 해야함
	 */
	@Override
	public void ShowAreaInfo() {
		System.out.println("정사각형 면적:"+(i*i));
	}
	
}
class QuRectangleMain
{
	public static void main(String[] args)
	{
       	Rectangle rec = new Rectangle(4, 3);
       	rec.ShowAreaInfo();
 
       	Square sqr = new Square(7);
       	sqr.ShowAreaInfo();
   	}
}
