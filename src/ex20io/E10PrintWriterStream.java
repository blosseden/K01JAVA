package ex20io;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class E10PrintWriterStream {

	public static void main(String[] args) throws IOException {
		PrintWriter out = new PrintWriter (new
		FileWriter("src/ex20io/printf.txt"));
		
		out.printf("내 나이는 %d살 히히", 9);
		out.println(" ");
		
		out.println("나는 좋아하는게 많아요");
		out.print("노래 부를 때가 젤 조아");
		out.close();
		
		System.out.println("printf.txt가 생성되었습니다");
		
	}

}
