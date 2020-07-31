import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ex03Insert {

	private JFrame frame;
	private JTextField txt_id;
	private JTextField txt_pw;
	private JTextField txt_name;
	private JTextField txt_age;
	DAO dao = new DAO();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ex03Insert window = new ex03Insert();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ex03Insert() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.getContentPane().setLayout(null);
		
		JLabel lbl_titlel = new JLabel("\uD68C\uC6D0\uAC00\uC785");
		lbl_titlel.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_titlel.setFont(new Font("함초롬돋움", Font.BOLD, 37));
		lbl_titlel.setBounds(44, 29, 447, 108);
		frame.getContentPane().add(lbl_titlel);
		
		JLabel lbl_id = new JLabel("ID");
		lbl_id.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_id.setFont(new Font("함초롬돋움", Font.PLAIN, 25));
		lbl_id.setBounds(44, 182, 88, 69);
		frame.getContentPane().add(lbl_id);
		
		txt_id = new JTextField();
		txt_id.setFont(new Font("함초롬돋움", Font.PLAIN, 25));
		txt_id.setBounds(150, 182, 341, 69);
		frame.getContentPane().add(txt_id);
		txt_id.setColumns(10);
		
		JLabel lbl_pw = new JLabel("PW");
		lbl_pw.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_pw.setFont(new Font("함초롬돋움", Font.PLAIN, 25));
		lbl_pw.setBounds(44, 281, 88, 69);
		frame.getContentPane().add(lbl_pw);
		
		txt_pw = new JTextField();
		txt_pw.setFont(new Font("함초롬돋움", Font.PLAIN, 25));
		txt_pw.setColumns(10);
		txt_pw.setBounds(150, 281, 341, 69);
		frame.getContentPane().add(txt_pw);
		
		JLabel lbl_name = new JLabel("Name");
		lbl_name.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_name.setFont(new Font("함초롬돋움", Font.PLAIN, 25));
		lbl_name.setBounds(44, 390, 88, 69);
		frame.getContentPane().add(lbl_name);
		
		txt_name = new JTextField();
		txt_name.setFont(new Font("함초롬돋움", Font.PLAIN, 25));
		txt_name.setColumns(10);
		txt_name.setBounds(150, 390, 341, 69);
		frame.getContentPane().add(txt_name);
		
		JLabel lbl_age = new JLabel("Age");
		lbl_age.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_age.setFont(new Font("함초롬돋움", Font.PLAIN, 25));
		lbl_age.setBounds(44, 495, 88, 69);
		frame.getContentPane().add(lbl_age);
		
		txt_age = new JTextField();
		txt_age.setFont(new Font("함초롬돋움", Font.PLAIN, 25));
		txt_age.setColumns(10);
		txt_age.setBounds(150, 495, 341, 69);
		frame.getContentPane().add(txt_age);
		
		JButton btnNewButton = new JButton("\uD68C\uC6D0\uAC00\uC785 click!");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
				//textField에 있는 값들을 가지고 와주세요.
				String id = txt_id.getText();
				String pw = txt_pw.getText();
				String name = txt_name.getText();
				int age = Integer.parseInt(txt_age.getText()); //String ---> int 형변환 필요
				
				//매개변수를 VO로 바꿔줘보세요!
				VO vo = new VO(id, pw, name, age);
				int cnt = dao.insert(vo);
				if(cnt > 0) {
					//팝업창을 띄워보아요!
					//부모컴포넌트, 메세지, 제목, 아이콘모양
					JOptionPane.showMessageDialog(null, "회원가입 성공!", "회원가입", JOptionPane.INFORMATION_MESSAGE);
				} else {
					//회원가입 실패했을 때 팝업창 띄우기!
					JOptionPane.showMessageDialog(null, "회원가입 실패!", "회원가입", JOptionPane.ERROR_MESSAGE);
//					System.out.println("회원가입 실패!");
				}

				
				//1.기존의 창 닫아주기
				frame.dispose();
				//2.불러온다
				ex02Login.main(null);
				
				
			}
		});
		btnNewButton.setBackground(Color.LIGHT_GRAY);
		btnNewButton.setFont(new Font("함초롬돋움", Font.PLAIN, 29));
		btnNewButton.setBounds(44, 615, 447, 74);
		frame.getContentPane().add(btnNewButton);
	}
}
