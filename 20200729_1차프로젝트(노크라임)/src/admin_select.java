import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class admin_select {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					A_select window = new A_select();
//					window.frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the application.
	 */
	public admin_select(VO vo) {
		initialize(vo);
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(VO vo) {
		frame = new JFrame();
		frame.setBounds(100, 100, 375, 812);
		frame.getContentPane().setBackground(new Color(230, 230, 250));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		JLabel lbl_title = new JLabel("");
		lbl_title.setIcon(new ImageIcon("C:\\Users\\SMT053\\Desktop\\\uAE30\uBCF8\uD504\uB85C\uC81D\uD2B8\uC0B0\uCD9C\uBB3C\\\uB178\uD06C\uB77C\uC784\\icon\\\uC791\uC740 \uD22C\uBA85.png"));
		lbl_title.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				frame.dispose();
//				admin_select.main(null);
				admin_select admin_select = new admin_select(vo);
			}
		});
		lbl_title.setFont(new Font("����", Font.PLAIN, 23));
		lbl_title.setBounds(12, 10, 103, 56);
		frame.getContentPane().add(lbl_title);
		
		
		JLabel lbl_signout = new JLabel("");
		lbl_signout.setIcon(new ImageIcon("C:\\Users\\SMT053\\Desktop\\\uAE30\uBCF8\uD504\uB85C\uC81D\uD2B8\uC0B0\uCD9C\uBB3C\\\uB178\uD06C\uB77C\uC784\\icon\\off_logout_17916.png"));
		lbl_signout.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				frame.dispose();
//				login.main(null);
				login login = new login();
				
			}
		});
		lbl_signout.setBounds(307, 10, 40, 29);
		frame.getContentPane().add(lbl_signout);
		
		JLabel lbl_selectpage = new JLabel("\uAD00\uB9AC\uC790 \uBA54\uB274");
		lbl_selectpage.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_selectpage.setFont(new Font("���ʷҵ���", Font.BOLD, 24));
		lbl_selectpage.setBounds(89, 100, 180, 60);
		frame.getContentPane().add(lbl_selectpage);
		
		JButton btn_tipoffmanage = new JButton("\uC81C\uBCF4\uAD00\uB9AC \uD398\uC774\uC9C0");
		btn_tipoffmanage.setBackground(SystemColor.activeCaption);
		btn_tipoffmanage.setFont(new Font("���ʷҵ���", Font.BOLD, 16));
		btn_tipoffmanage.setBounds(50, 219, 253, 75);
		btn_tipoffmanage.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
//				admin_tipoff.main(null);
				admin_tipoff admin_tipoff = new admin_tipoff(vo);
			
			}
		});
		frame.getContentPane().add(btn_tipoffmanage);
		
		JButton btn_membermanage = new JButton("\uD68C\uC6D0\uAD00\uB9AC \uD398\uC774\uC9C0");
		btn_membermanage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btn_membermanage.setBackground(SystemColor.activeCaption);
		btn_membermanage.setFont(new Font("���ʷҵ���", Font.BOLD, 16));
		btn_membermanage.setBounds(50, 349, 253, 75);
		btn_membermanage.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				frame.dispose();
//				admin_member.main(null);
				admin_member admin_member = new admin_member(vo);
			}
		});
		frame.getContentPane().add(btn_membermanage);
		
		JButton btn_crimemain = new JButton("\uBC94\uC8C4\uC815\uBCF4 \uD398\uC774\uC9C0");
		btn_crimemain.setBackground(SystemColor.activeCaption);
		btn_crimemain.setFont(new Font("���ʷҵ���", Font.BOLD, 16));
		btn_crimemain.setBounds(50, 480, 253, 75);
		btn_crimemain.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				frame.dispose();
//				crime_main.main(null);
				crime_main crime = new crime_main(vo);
			}
		});
		frame.getContentPane().add(btn_crimemain);
	}

}
