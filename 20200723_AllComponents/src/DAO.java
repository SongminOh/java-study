import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DAO {
	// 3가지 메소드
	Connection conn = null;
	PreparedStatement psmt = null;
	ResultSet rs = null;

	
	// 1. 연결
	private void getConnection() {
		//드라이버 로딩
		//url, user, password
		String url = "jdbc:oracle:thin:@210.105.224.131:1521:xe";	//localhost = IP주소
		String user = "hr";
		String password = "hr";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, user, password);
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	// 2. 닫기
	private void close() {
		//순서 ?
		try {
			
			if(rs!=null) {
				rs.close();
			} 
			if(psmt!=null) {
				psmt.close();
			}
			if(conn!=null) {
				conn.close();
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	
	}

	
	// 3. 전체선택(allselect기능)
	public ArrayList<VO> allSelect() {
		
		ArrayList<VO> list = new ArrayList<VO>(); //가변적이여서 null 대신 생성
		
		//1.연결
		getConnection();
		
		try {
			String sql = "select * from members";	//이 줄은 try위로 빠져도 여기있어도 됨
			psmt = conn.prepareStatement(sql);
			//?가 있을 때만 인자를 채워주기 위해서 setString, setInt와 같은 기능을 사용
			
			rs = psmt.executeQuery();
			
			while(rs.next()) {
				String id = rs.getString(1);
				String pw = rs.getString(2);
				String name = rs.getString(3);
				int age = rs.getInt(4);
				list.add(new VO(id, pw, name, age));
				
			}
			
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		
		
		return list;
	}

	
	
	
	
	
	
}
