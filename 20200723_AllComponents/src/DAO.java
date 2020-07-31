import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DAO {
	// 3���� �޼ҵ�
	Connection conn = null;
	PreparedStatement psmt = null;
	ResultSet rs = null;

	
	// 1. ����
	private void getConnection() {
		//����̹� �ε�
		//url, user, password
		String url = "jdbc:oracle:thin:@210.105.224.131:1521:xe";	//localhost = IP�ּ�
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
	
	// 2. �ݱ�
	private void close() {
		//���� ?
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

	
	// 3. ��ü����(allselect���)
	public ArrayList<VO> allSelect() {
		
		ArrayList<VO> list = new ArrayList<VO>(); //�������̿��� null ��� ����
		
		//1.����
		getConnection();
		
		try {
			String sql = "select * from members";	//�� ���� try���� ������ �����־ ��
			psmt = conn.prepareStatement(sql);
			//?�� ���� ���� ���ڸ� ä���ֱ� ���ؼ� setString, setInt�� ���� ����� ���
			
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
