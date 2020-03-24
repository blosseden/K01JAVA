package ex20io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/*
 직렬화
 	: Circle클래스를 입출력의 대상으로 파일로 저장ㅏ기 위해
 	SErializable 인터페이스를 구현하여 정의한다
 	인스턴스가 파일의 형태로 저장되는것을 "직렬화"라고 한다
 */
class Circle implements Serializable {
	
	int xPos, yPos;
	double radian;
	public Circle(int x, int y, double r) {
		xPos = x;
		yPos = y;
		radian = r;
	}
	public void showCircleInfo() {
		System.out.printf("좌포[%d,%d]", xPos, yPos);
		System.out.println("반지름 : "+ radian);
	}
}
public class E11ObjectSerializable {

	public static void main(String[] args) {
		
		try {
			//인스턴스를 파일에 저장하기 위한 스트림을 생성한다.
			ObjectOutputStream out =
					new ObjectOutputStream(
							new FileOutputStream("src/ex20io/circle.obj")
							);
			//인스턴스를 파일에 저장한다
			out.writeObject(new Circle(1,1,2.4));
			out.writeObject(new Circle(2,2,4.8));
			out.writeObject(new String("String타입의 오브젝트"));/*
			JAVA에서 제공하는 기본클래스는 별도의 처리 없이 직렬화가 가능하다.
						*/
			out.close();
			/*
			 인스턴스의 복원(역직렬화)를 위한스트림을 생성하고
			 readObject() 메소드를 통해 복원한다.
			 */
			ObjectInputStream in =
					new ObjectInputStream(
							new FileInputStream("src/ex20io/circle.obj")
						);
			//저장된 순서대로 인스턴스를 복원한다
			Circle c1 = (Circle)in.readObject();
			Circle c2 = (Circle)in.readObject();
			String message =(String)in.readObject();
			in.close();
			c1.showCircleInfo();
			c2.showCircleInfo();
			System.out.println("String오브젝트 : "+ message);
			
		}
		catch(ClassNotFoundException e) {
			System.out.println("클래스 나띵");
		}
		catch(FileNotFoundException e) {
			System.out.println("파일 없엉");			
		}
		catch(IOException e) {
			System.out.println("뭔가 없어");
		}

	}

}