

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DAO {

	// 필드 ---> DAO클래스 전역에 닿을 수 있게 생성
	private Connection conn = null;
	private PreparedStatement psmt = null;
	private ResultSet rs = null;

	// 데이터베이스와 연결하는 메소드 생성
	private void getConnection() {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "hr";
		String password = "hr";

		try {
			// 1.드라이버 동적로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// 데이터베이스 자원을 반납하는 닫기 메소드
	private void close() {
		try {
			if (rs != null)
				rs.close();
			if (psmt != null)
				psmt.close();
			if (conn != null)
				conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// Database Access Object
	public VO login(VO vo) {
		VO result = null;
		try {
			getConnection();	//커넥션 잘 되어있는가

			String sql = "select name, age from members where id = ? and pw = ?";

			psmt = conn.prepareStatement(sql);
			psmt.setString(1, vo.getId());
			psmt.setNString(2, vo.getPw());

			rs = psmt.executeQuery();
			while (rs.next()) {
				String name = rs.getString(1);
				int age = rs.getInt(2);
				result = new VO(name, age);
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return result; // result 초기화한걸 필드로 옮기셨네요
	}

	// 회원가입 메소드
	public int insert(VO vo) {		//executeUpdate이기 때문에 리턴타입 int 그대로 두면 됨
		int cnt = 0;
		try {
			getConnection();
			String sql = "insert into members values(?,?,?,?)";

			psmt = conn.prepareStatement(sql);

			psmt.setString(1, vo.getId());
			psmt.setString(2, vo.getPw());
			psmt.setString(3, vo.getName());
			psmt.setInt(4, vo.getAge());

			cnt = psmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}

		return cnt;
	}

	// 회원정보 수정 메소드
	public int update(String newId, String id, String pw) {

		int cnt = 0;
		try {
			getConnection();
			String sql = "update members set id = ? where id = ? and pw = ?";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, newId);
			psmt.setString(2, id);
			psmt.setString(3, pw);

			cnt = psmt.executeUpdate(); // cnt ===> '영향을 받은 행의 개수'

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return cnt;
	}

	// 회원정보 탈퇴 메소드
	public int delete(VO vo) {
		int cnt = 0;
		try {
			getConnection();
			String sql = "DELETE FROM members WHERE id = ? and pw = ?"; // ?자리에 id나pw 적으면 id,pw라는 문자열이 들어가는 것

			psmt = conn.prepareStatement(sql);

			psmt.setString(1, vo.getId());
			psmt.setString(2, vo.getPw());

			cnt = psmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return cnt;
	}

	// 메소드명 -> allSelect()
	// 리턴타입은 여러분들이 생각해보세요!
	// 내부에서 출력 x
	public ArrayList<VO> allSelect() {
		ArrayList<VO> list = new ArrayList<VO>();
		try {
			getConnection();

			String sql = "SELECT * FROM members";

			psmt = conn.prepareStatement(sql);
			
			rs = psmt.executeQuery();
			int num = 1;
			while (rs.next()) {
				String id = rs.getString(1);
				String pw = rs.getString(2);
				String name = rs.getString(3);
				int age = rs.getInt(4);
				VO vo = new VO(id, pw, name, age);	//1~4가져와서 vo로 묶음
				list.add(vo);	//리스트에 vo 담아서
				
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return list;	//반환해줌
	}

	
	
	
	
}
