import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ex04Delete {

	private JFrame frame;
	private JTextField txt_id;
	private JTextField txt_pw;
	DAO dao = new DAO();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ex04Delete window = new ex04Delete();
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
	public ex04Delete() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 423, 478);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lbl_title = new JLabel("\uD68C\uC6D0\uD0C8\uD1F4");
		lbl_title.setFont(new Font("���ʷҵ���", Font.BOLD, 36));
		lbl_title.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_title.setBounds(12, 10, 371, 100);
		frame.getContentPane().add(lbl_title);
		
		JLabel lbl_id = new JLabel("ID");
		lbl_id.setFont(new Font("���ʷҵ���", Font.PLAIN, 23));
		lbl_id.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_id.setBounds(12, 136, 57, 53);
		frame.getContentPane().add(lbl_id);
		
		
		
		
		JLabel lbl_pw = new JLabel("PW");
		lbl_pw.setFont(new Font("���ʷҵ���", Font.PLAIN, 23));
		lbl_pw.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_pw.setBounds(12, 214, 57, 53);
		frame.getContentPane().add(lbl_pw);
		
		txt_id = new JTextField();
		txt_id.setFont(new Font("���ʷҵ���", Font.PLAIN, 22));
		txt_id.setBounds(86, 136, 297, 53);
		frame.getContentPane().add(txt_id);
		txt_id.setColumns(10);
		txt_id.setOpaque(false);			///�����ϰ� ����¹�
		txt_id.setBorder(null);				///�����ϰ� ����¹�
		
		txt_pw = new JTextField();
		txt_pw.setFont(new Font("���ʷҵ���", Font.PLAIN, 22));
		txt_pw.setColumns(10);
		txt_pw.setBounds(86, 214, 297, 53);
		frame.getContentPane().add(txt_pw);
		
		JButton btn_back = new JButton("\uB4A4\uB85C\uAC00\uAE30");
		btn_back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//1.â�ݱ�
				frame.dispose();
				//2.�̵�
				ex02Login.main(null);
				
			}
		});
		btn_back.setBackground(Color.LIGHT_GRAY);
		btn_back.setFont(new Font("���ʷҵ���", Font.PLAIN, 23));
		btn_back.setBounds(22, 309, 175, 53);
		frame.getContentPane().add(btn_back);
		
		JButton btn_delete = new JButton("\uD0C8\uD1F4");
		btn_delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				//1.DAO�� �ҷ��ͼ�  (�ʵ忡�� ������ ��������) (�� {}�ȿ����� ���Ÿ� ���������� �����ص� �������)
				//2.Delete����� ����!
				//---> id�� pw�� �Է¹޾ƿ;���.
				String id = txt_id.getText();
				String pw = txt_pw.getSelectedText();
				
				// String id�� String pw�� �ϳ��� VO�� �������ּ���
//				VO vo = new VO(id, pw);
				int cnt = dao.delete(new VO(id,pw)); 	//���� ���ϹǷ� ���� ����������� �ٷ� �ʱ�ȭ
				
				//3.int ������ ���� ���� ������ ���Ϲ޾Ƽ� (113�� int cnt = )
				//4.Ż�� �����ÿ� �˾�â�� ����ּ���!
				if (cnt > 0) {
					JOptionPane.showMessageDialog(null, "ȸ��Ż�𼺰�!", "ȸ��Ż��", JOptionPane.INFORMATION_MESSAGE);
					frame.dispose();
					ex02Login.main(null);
				} else {
					JOptionPane.showMessageDialog(null, "ȸ��Ż�����!", "ȸ��Ż��", JOptionPane.WARNING_MESSAGE);
					txt_id.setText("");
					txt_pw.setText("");
				}
				
				
			}
		});
		btn_delete.setBackground(Color.LIGHT_GRAY);
		btn_delete.setFont(new Font("���ʷҵ���", Font.PLAIN, 23));
		btn_delete.setBounds(208, 309, 175, 53);
		frame.getContentPane().add(btn_delete);
	}
}
