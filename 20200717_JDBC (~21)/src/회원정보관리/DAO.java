package ȸ����������;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DAO {

	// �ʵ� ---> DAOŬ���� ������ ���� �� �ְ� ����
	private Connection conn = null;
	private PreparedStatement psmt = null;
	private ResultSet rs = null;

	// �����ͺ��̽��� �����ϴ� �޼ҵ� ����
	private void getConnection() {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "hr";
		String password = "hr";

		try {
			// 1.����̹� �����ε�
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// �����ͺ��̽� �ڿ��� �ݳ��ϴ� �ݱ� �޼ҵ�
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
	public String login(String id, String pw) {
		String result = "";
		try {
			getConnection();

			String sql = "select name, age from members where id = ? and pw = ?";

			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			psmt.setNString(2, pw);

			rs = psmt.executeQuery();
			while (rs.next()) {
				String name = rs.getString(1);
				int age = rs.getInt(2);
				result = "�̸���: " + name + ".  ���̴� : " + age + "�� �Դϴ�.";
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return result; // result �ּ�ȭ�Ѱ� �ʵ�� �ű�̳׿�
	}

	// ȸ������ �޼ҵ�
	public int insert(String id, String pw, String name, int age) {
		int cnt = 0;
		try {
			getConnection();
			String sql = "insert into members values(?,?,?,?)";

			psmt = conn.prepareStatement(sql);

			psmt.setString(1, id);
			psmt.setString(2, pw);
			psmt.setString(3, name);
			psmt.setInt(4, age);

			cnt = psmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}

		return cnt;
	}

	// ȸ������ ���� �޼ҵ�
	public int update(String newId, String id, String pw) {

		int cnt = 0;
		try {
			getConnection();
			String sql = "update members set id = ? where id = ? and pw = ?";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, newId);
			psmt.setString(2, id);
			psmt.setString(3, pw);

			cnt = psmt.executeUpdate(); // cnt ===> '������ ���� ���� ����'

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return cnt;
	}

	// ȸ������ Ż�� �޼ҵ�
	public int delete(String id, String pw) {

		int cnt = 0;
		try {
			getConnection();

			String sql = "DELETE FROM members WHERE id = ? and pw = ?"; // ?�ڸ��� id��pw ������ id,pw��� ���ڿ��� ���� ��

			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			psmt.setString(2, pw);

			cnt = psmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return cnt;
	}

	// �޼ҵ�� -> allSelect()
	// ����Ÿ���� �����е��� �����غ�����!
	// ���ο��� ��� x
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
				VO vo = new VO(id, pw, name, age);	//1~4�����ͼ� vo�� ����
				list.add(vo);	//����Ʈ�� vo ��Ƽ�
				
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return list;	//��ȯ����
	}

	
	
	
	
}
