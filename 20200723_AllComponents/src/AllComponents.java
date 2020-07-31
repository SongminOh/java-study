import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.CardLayout;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ButtonGroup;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JSlider;
import java.awt.Color;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class AllComponents {

	private JFrame frame;
	private JTextField txt_name;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	int R, G, B = 50;
	private JTable table;
	private JTable table_1;
	
	DAO dao = new DAO();
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AllComponents window = new AllComponents();
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
	public AllComponents() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 457, 598);		//창이 작게뜨면 이거 설정해주기
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		frame.getContentPane().add(tabbedPane, "name_262593986291800");
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("화면1", null, panel, null);
		panel.setLayout(null);
		
		JLabel lbl_name = new JLabel("\uC774  \uB984");
		lbl_name.setFont(new Font("함초롬돋움", Font.PLAIN, 14));
		lbl_name.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_name.setBounds(12, 45, 88, 45);
		panel.add(lbl_name);
		
		txt_name = new JTextField();
		txt_name.setFont(new Font("함초롬돋움", Font.PLAIN, 16));
		txt_name.setBounds(115, 44, 294, 48);
		panel.add(txt_name);
		txt_name.setColumns(10);
		
		JLabel lbl_sex = new JLabel("\uC131  \uBCC4");
		lbl_sex.setFont(new Font("함초롬돋움", Font.PLAIN, 14));
		lbl_sex.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_sex.setBounds(12, 121, 88, 45);
		panel.add(lbl_sex);
		
		JRadioButton rd_woman = new JRadioButton("\uC5EC\uC790");
		buttonGroup.add(rd_woman);
		rd_woman.setFont(new Font("함초롬돋움", Font.PLAIN, 14));
		rd_woman.setBounds(115, 132, 73, 23);
		panel.add(rd_woman);
		
		JRadioButton rd_man = new JRadioButton("\uB0A8\uC790");
		buttonGroup.add(rd_man);
		rd_man.setFont(new Font("함초롬돋움", Font.PLAIN, 14));
		rd_man.setBounds(200, 132, 73, 23);
		panel.add(rd_man);
		
		JLabel lbl_hobby = new JLabel("\uCDE8  \uBBF8");
		lbl_hobby.setFont(new Font("함초롬돋움", Font.PLAIN, 14));
		lbl_hobby.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_hobby.setBounds(12, 197, 88, 45);
		panel.add(lbl_hobby);
		
		JCheckBox ch_coding = new JCheckBox("\uCF54\uB529");
		ch_coding.setFont(new Font("함초롬돋움", Font.PLAIN, 14));
		ch_coding.setBounds(115, 208, 73, 23);
		panel.add(ch_coding);
		
		JCheckBox ch_movie = new JCheckBox("\uC601\uD654");
		ch_movie.setFont(new Font("함초롬돋움", Font.PLAIN, 14));
		ch_movie.setBounds(200, 208, 73, 23);
		panel.add(ch_movie);
		
		JCheckBox ch_book = new JCheckBox("\uB3C5\uC11C");
		ch_book.setFont(new Font("함초롬돋움", Font.PLAIN, 14));
		ch_book.setBounds(288, 208, 73, 23);
		panel.add(ch_book);
		
		JLabel lbl_favFood = new JLabel("\uC88B\uC544\uD558\uB294 \uC74C\uC2DD");
		lbl_favFood.setFont(new Font("함초롬돋움", Font.PLAIN, 14));
		lbl_favFood.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_favFood.setBounds(12, 265, 115, 45);
		panel.add(lbl_favFood);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"\uD55C\uC2DD", "\uC77C\uC2DD", "\uC591\uC2DD", "\uC911\uC2DD"}));
		comboBox.setFont(new Font("함초롬돋움", Font.PLAIN, 14));
		comboBox.setBounds(139, 277, 167, 21);
		panel.add(comboBox);
		
		JTextPane txtp_info = new JTextPane();
		txtp_info.setFont(new Font("함초롬돋움", Font.PLAIN, 16));
		txtp_info.setBounds(28, 368, 381, 152);
		panel.add(txtp_info);

		JButton btn_confirm = new JButton("\uC815\uBCF4\uD655\uC778");
		btn_confirm.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent e) {
				String name = txt_name.getText();
				System.out.println(name);
				String g="";			//성별저장변수
				if (rd_woman.isSelected()) {
					g = rd_woman.getText();
					System.out.println(rd_woman.getText());
				} else if (rd_man.isSelected()) {
					g = rd_man.getText();
					System.out.println(rd_man.getText());
				}
				
				String h="";
				if (ch_coding.isSelected()) {
					h += ch_coding.getText() + " ";
					System.out.println(ch_coding.getText());
				}
				if (ch_movie.isSelected()) {
					h += ch_movie.getText() + " ";
					System.out.println(ch_movie.getText());
				}
				if (ch_book.isSelected()) {
					h += ch_book.getText() + " ";
					System.out.println(ch_book.getText());
				}
				
				String f = (String)comboBox.getSelectedItem();
				System.out.println(comboBox.getSelectedItem());
				
				String text = "이름 : " + name  + "\n성별 : " + g + "\n취미 : " + h + "\n좋아하는 음식 : " + f;
				txtp_info.setText(text);
				
			}
		});
		btn_confirm.setFont(new Font("함초롬돋움", Font.PLAIN, 14));
		btn_confirm.setBounds(28, 320, 381, 36);
		panel.add(btn_confirm);
		
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("화면2", null, panel_1, null);
		panel_1.setLayout(null);
		
		
		JLabel lbl_rgb = new JLabel("50, 50, 50");
		lbl_rgb.setFont(new Font("함초롬돋움", Font.PLAIN, 18));
		lbl_rgb.setBounds(180, 258, 201, 25);
		panel_1.add(lbl_rgb);
		
		JPanel panel__ch_color = new JPanel();
		panel__ch_color.setBounds(26, 293, 383, 212);
		panel_1.add(panel__ch_color);

		JSlider slider_R = new JSlider();
		slider_R.addChangeListener(new ChangeListener() {
			
			
			public void stateChanged(ChangeEvent e) {
				R = slider_R.getValue();
				lbl_rgb.setText(R+ ", " +G+","+B);
				panel__ch_color.setBackground(new Color(R,G,B));
			}
			
		});
		slider_R.setPaintTicks(true);
		slider_R.setPaintLabels(true);
		slider_R.setFont(new Font("굴림", Font.PLAIN, 19));
		slider_R.setForeground(Color.RED);
		slider_R.setMinorTickSpacing(10);
		slider_R.setMajorTickSpacing(50);
		slider_R.setMaximum(255);
		slider_R.setBounds(26, 27, 383, 48);
		panel_1.add(slider_R);
		
		JSlider slider_G = new JSlider();
		slider_G.addChangeListener(new ChangeListener() {
			
			
			public void stateChanged(ChangeEvent e) {
				G = slider_G.getValue();
				lbl_rgb.setText(R+ ", " +G+","+B);
				panel__ch_color.setBackground(new Color(R,G,B));
			}
			
		});
		slider_G.setPaintTicks(true);
		slider_G.setPaintLabels(true);
		slider_G.setMinorTickSpacing(10);
		slider_G.setMaximum(255);
		slider_G.setMajorTickSpacing(50);
		slider_G.setForeground(new Color(0, 128, 0));
		slider_G.setFont(new Font("굴림", Font.PLAIN, 19));
		slider_G.setBounds(26, 100, 383, 48);
		panel_1.add(slider_G);
		
		JSlider slider_B = new JSlider();
		slider_B.addChangeListener(new ChangeListener() {
			
			
			public void stateChanged(ChangeEvent e) {
				B = slider_B.getValue();
				lbl_rgb.setText(R+ ", " +G+","+B);
				panel__ch_color.setBackground(new Color(R,G,B));
			}
			
		});
		slider_B.setPaintTicks(true);
		slider_B.setPaintLabels(true);
		slider_B.setMinorTickSpacing(10);
		slider_B.setMaximum(255);
		slider_B.setMajorTickSpacing(50);
		slider_B.setForeground(Color.BLUE);
		slider_B.setFont(new Font("굴림", Font.PLAIN, 19));
		slider_B.setBounds(26, 170, 383, 48);
		panel_1.add(slider_B);
		
		JLabel lblNewLabel = new JLabel("\uC0C9\uC0C1\uC744 \uBCC0\uACBD\uD574\uC694!");
		lblNewLabel.setFont(new Font("함초롬돋움", Font.PLAIN, 18));
		lblNewLabel.setBounds(26, 258, 152, 25);
		panel_1.add(lblNewLabel);
		
	
		
	
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("화면3", null, panel_2, null);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Table \uD655\uC778");
		lblNewLabel_1.setFont(new Font("함초롬돋움", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(12, 10, 89, 22);
		panel_2.add(lblNewLabel_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 35, 408, 384);
		panel_2.add(scrollPane);

		
		//1.ClasNotFoundException ---> url,주소,ojdbc6
		//2.NullPointerException ---> return null, Arraylist에 값을 안넣어줬거나
		
		
		//전체선택
		//VO를 하나로 묶는 자료구조
		ArrayList<VO> list = dao.allSelect();
		System.out.println(list.size());
		
		
		String colNames[] = { "이름", "나이", "아이디" };
		//[행==데이터의개수][열=컬럼개수]
	    Object data[][] = new Object[list.size()][colNames.length];
	    //여기까지) 크기 지정 끝!
	    
	    for (int i = 0; i < list.size(); i++) {
	    	data[i][0] = list.get(i).getName();
	    	data[i][1] = list.get(i).getAge();
	    	data[i][2] = list.get(i).getId();
		}
		
	    
			
		table = new JTable(data, colNames);
		scrollPane.setViewportView(table);
		
	}
}
