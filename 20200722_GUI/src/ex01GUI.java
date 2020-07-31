import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ex01GUI {

	   private JFrame frame;
	   private JTextField txt_id;
	   private JPasswordField txt_pw;
	   private JLabel lbl_setText;            //기억!

	public static void main(String[] args) {
		//익명클래스(cf.)
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ex01GUI window = new ex01GUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public ex01GUI() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 565, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.menu);
		panel.setForeground(Color.GRAY);
		panel.setBounds(12, 10, 525, 741);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lbl_title = new JLabel("\uC7AC\uBBF8\uC788\uB294 GUI");
		lbl_title.setFont(new Font("함초롬돋움", Font.PLAIN, 41));
		lbl_title.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_title.setBounds(61, 27, 403, 98);
		panel.add(lbl_title);
		
		txt_id = new JTextField();
		txt_id.setHorizontalAlignment(SwingConstants.CENTER);
		txt_id.setFont(new Font("함초롬돋움", Font.PLAIN, 36));
		txt_id.setBounds(76, 177, 381, 81);
		panel.add(txt_id);
		txt_id.setColumns(10);
		
		txt_pw = new JPasswordField();
		txt_pw.setFont(new Font("함초롬돋움", Font.PLAIN, 36));
		txt_pw.setBounds(76, 303, 381, 81);
		panel.add(txt_pw);
		
		JButton btn_get = new JButton("\uAC00\uC838\uC624\uAE30");
		btn_get.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//마우스를 클릭했을 때 실행되는 코드
				System.out.println(txt_id.getText());			//기억!
				System.out.println(txt_pw.getText());
				lbl_setText.setText(txt_id.getText());
			}
		});
		btn_get.setEnabled(false);
		btn_get.setBackground(new Color(204, 204, 255));
		btn_get.setFont(new Font("함초롬돋움", Font.PLAIN, 41));
		btn_get.setBounds(76, 433, 381, 81);
		panel.add(btn_get);
		
		lbl_setText = new JLabel("");
		lbl_setText.setFont(new Font("함초롬돋움", Font.PLAIN, 30));
		lbl_setText.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_setText.setBounds(75, 554, 382, 81);
		panel.add(lbl_setText);
	}
}
