package ex21jdbc.statement;

import java.sql.SQLException;

public class SelectSQL1 extends ConnectDB {
	
	//생성자메소드
	public SelectSQL1() {
		super();
	}
	
	@Override
	public void execute() {
		try {
			stmt = con.createStatement();
			
			String query = "SELECT id, pass, name, regidate from member";
			rs = stmt.executeQuery(query);
			while(rs.next()) {
				String id = rs.getString(1);
				String pw = rs.getString("pass");
				String name = rs.getString("name");
				/*
				 오라클의 date타입을 getDate()로 추출하면
				 2020-03-25 형태로 출력된다. 이경우 date형 자료가 되기
				 때문에 java.sql.Date클래스의 참조변수로 저장해야한다.
				 */
				java.sql.Date regidate = rs.getDate("regidate");
				System.out.printf("%-10s %-10s %-13s %-20s\n",
						id, pw, name, regidate);
			}
		}
		catch(SQLException e) {
			System.out.println("쿼리오류발생");
			e.printStackTrace();
		}
		finally {
			close();//DB 자원반납
			
		}
	}

	public static void main(String[] args) {
		SelectSQL1 selectSQL = new SelectSQL1();
		selectSQL.execute();
	}

}
