import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ex02Login {

	
	//static -> 저장공간 저어어어엉말 필요한 순간에만 사용할 것!
	private JFrame frame;
	private JTextField txt_pw;
	private JTextField txt_id;
	DAO dao = new DAO();		//광역으로 필드에 선언!

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ex02Login window = new ex02Login();
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
	public ex02Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 526, 744);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lbl_title = new JLabel("\uD68C\uC6D0\uAD00\uB9AC\uC2DC\uC2A4\uD15C");
		lbl_title.setFont(new Font("함초롬돋움", Font.BOLD, 36));
		lbl_title.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_title.setBounds(38, 44, 426, 95);
		frame.getContentPane().add(lbl_title);
		
		JLabel lbl_pw = new JLabel("PW");
		lbl_pw.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_pw.setFont(new Font("함초롬돋움", Font.PLAIN, 25));
		lbl_pw.setBounds(38, 259, 64, 75);
		frame.getContentPane().add(lbl_pw);
		
		txt_pw = new JTextField();
		txt_pw.setFont(new Font("함초롬돋움", Font.PLAIN, 24));
		txt_pw.setBounds(114, 259, 350, 75);
		frame.getContentPane().add(txt_pw);
		txt_pw.setColumns(10);
		
		JButton btn_login = new JButton("\uB85C\uADF8\uC778");
		btn_login.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			
				
				
				//1.textField에 있는 값을 가지고 오기 (아이디, 비밀번호)
				String id = txt_id.getText();
				String pw = txt_pw.getText();
				
				//2.login기능 수행
				VO vo = new VO(id, pw);
				VO result = dao.login(vo);	//NullPointer --> jar있는지? dao에 getconnection?/execute했는지? 위에 DAO = new 가져왔는지? 변수명 잘 설정했는지? 
//				System.out.println(result.getName() + result.getAge()); 
				
				if(result != null) {
					frame.dispose();
					Ex05LoginSuccess ls = new Ex05LoginSuccess(result);
					
				}
				
				
				
			}
		});
		btn_login.setFont(new Font("함초롬돋움", Font.PLAIN, 27));
		btn_login.setBounds(38, 392, 426, 70);
		frame.getContentPane().add(btn_login);
		
		JButton btn_insert = new JButton("\uD68C\uC6D0\uAC00\uC785");
		btn_insert.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
				frame.dispose();	//현재 창을 닫기!
				//==> frame.setVisible(false);
				ex03Insert.main(null);	//내가 원하는 창을 여는 코드
				
				
				
				
				
			}
		});
		btn_insert.setFont(new Font("함초롬돋움", Font.PLAIN, 27));
		btn_insert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn_insert.setBounds(38, 487, 426, 70);
		frame.getContentPane().add(btn_insert);
		
		JButton btn_delete = new JButton("\uD68C\uC6D0\uD0C8\uD1F4");
		btn_delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//1.현재 열려있는 창 닫기
				frame.dispose();
				//2.회원탈퇴 페이지로 넘어가요!
				ex04Delete.main(null);
				
				
			}
		});
		btn_delete.setFont(new Font("함초롬돋움", Font.PLAIN, 27));
		btn_delete.setBounds(38, 584, 426, 70);
		frame.getContentPane().add(btn_delete);
		
		txt_id = new JTextField();
		txt_id.setFont(new Font("함초롬돋움", Font.PLAIN, 24));
		txt_id.setColumns(10);
		txt_id.setBounds(114, 163, 350, 75);
		frame.getContentPane().add(txt_id);
		
		JLabel lbl_id = new JLabel("ID");
		lbl_id.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_id.setFont(new Font("함초롬돋움", Font.PLAIN, 25));
		lbl_id.setBounds(38, 163, 64, 75);
		frame.getContentPane().add(lbl_id);
	}
}
