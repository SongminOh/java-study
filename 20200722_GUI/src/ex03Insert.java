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
		lbl_titlel.setFont(new Font("���ʷҵ���", Font.BOLD, 37));
		lbl_titlel.setBounds(44, 29, 447, 108);
		frame.getContentPane().add(lbl_titlel);
		
		JLabel lbl_id = new JLabel("ID");
		lbl_id.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_id.setFont(new Font("���ʷҵ���", Font.PLAIN, 25));
		lbl_id.setBounds(44, 182, 88, 69);
		frame.getContentPane().add(lbl_id);
		
		txt_id = new JTextField();
		txt_id.setFont(new Font("���ʷҵ���", Font.PLAIN, 25));
		txt_id.setBounds(150, 182, 341, 69);
		frame.getContentPane().add(txt_id);
		txt_id.setColumns(10);
		
		JLabel lbl_pw = new JLabel("PW");
		lbl_pw.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_pw.setFont(new Font("���ʷҵ���", Font.PLAIN, 25));
		lbl_pw.setBounds(44, 281, 88, 69);
		frame.getContentPane().add(lbl_pw);
		
		txt_pw = new JTextField();
		txt_pw.setFont(new Font("���ʷҵ���", Font.PLAIN, 25));
		txt_pw.setColumns(10);
		txt_pw.setBounds(150, 281, 341, 69);
		frame.getContentPane().add(txt_pw);
		
		JLabel lbl_name = new JLabel("Name");
		lbl_name.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_name.setFont(new Font("���ʷҵ���", Font.PLAIN, 25));
		lbl_name.setBounds(44, 390, 88, 69);
		frame.getContentPane().add(lbl_name);
		
		txt_name = new JTextField();
		txt_name.setFont(new Font("���ʷҵ���", Font.PLAIN, 25));
		txt_name.setColumns(10);
		txt_name.setBounds(150, 390, 341, 69);
		frame.getContentPane().add(txt_name);
		
		JLabel lbl_age = new JLabel("Age");
		lbl_age.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_age.setFont(new Font("���ʷҵ���", Font.PLAIN, 25));
		lbl_age.setBounds(44, 495, 88, 69);
		frame.getContentPane().add(lbl_age);
		
		txt_age = new JTextField();
		txt_age.setFont(new Font("���ʷҵ���", Font.PLAIN, 25));
		txt_age.setColumns(10);
		txt_age.setBounds(150, 495, 341, 69);
		frame.getContentPane().add(txt_age);
		
		JButton btnNewButton = new JButton("\uD68C\uC6D0\uAC00\uC785 click!");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
				//textField�� �ִ� ������ ������ ���ּ���.
				String id = txt_id.getText();
				String pw = txt_pw.getText();
				String name = txt_name.getText();
				int age = Integer.parseInt(txt_age.getText()); //String ---> int ����ȯ �ʿ�
				
				//�Ű������� VO�� �ٲ��ຸ����!
				VO vo = new VO(id, pw, name, age);
				int cnt = dao.insert(vo);
				if(cnt > 0) {
					//�˾�â�� ������ƿ�!
					//�θ�������Ʈ, �޼���, ����, �����ܸ��
					JOptionPane.showMessageDialog(null, "ȸ������ ����!", "ȸ������", JOptionPane.INFORMATION_MESSAGE);
				} else {
					//ȸ������ �������� �� �˾�â ����!
					JOptionPane.showMessageDialog(null, "ȸ������ ����!", "ȸ������", JOptionPane.ERROR_MESSAGE);
//					System.out.println("ȸ������ ����!");
				}

				
				//1.������ â �ݾ��ֱ�
				frame.dispose();
				//2.�ҷ��´�
				ex02Login.main(null);
				
				
			}
		});
		btnNewButton.setBackground(Color.LIGHT_GRAY);
		btnNewButton.setFont(new Font("���ʷҵ���", Font.PLAIN, 29));
		btnNewButton.setBounds(44, 615, 447, 74);
		frame.getContentPane().add(btnNewButton);
	}
}
