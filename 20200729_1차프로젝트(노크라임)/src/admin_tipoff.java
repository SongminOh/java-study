import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.DefaultCellEditor;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JScrollBar;

public class admin_tipoff {

	private JFrame frame;
	private JTable table_tipoffmanage;

	DAO dao = new DAO();

	int cnt;
	private JTable table;
	private JTable table_1;
	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					A_tipoff window = new A_tipoff();
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
	public admin_tipoff(VO vo) {
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

		JLabel lbl_title = new JLabel("");
		lbl_title.setBounds(12, 10, 103, 56);
		lbl_title.setIcon(new ImageIcon(
				"C:\\Users\\SMT053\\Desktop\\\uAE30\uBCF8\uD504\uB85C\uC81D\uD2B8\uC0B0\uCD9C\uBB3C\\\uB178\uD06C\uB77C\uC784\\icon\\\uC791\uC740 \uD22C\uBA85.png"));
		lbl_title.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				frame.dispose();
//				admin_select.main(null);
				admin_select admin_select = new admin_select(vo);
//				login login = new login();

			}
		});
		frame.getContentPane().setLayout(null);
		lbl_title.setFont(new Font("굴림", Font.PLAIN, 23));
		frame.getContentPane().add(lbl_title);

		JLabel lbl_signout = new JLabel("");
		lbl_signout.setBounds(307, 10, 40, 29);
		lbl_signout.setIcon(new ImageIcon(
				"C:\\Users\\SMT053\\Desktop\\\uAE30\uBCF8\uD504\uB85C\uC81D\uD2B8\uC0B0\uCD9C\uBB3C\\\uB178\uD06C\uB77C\uC784\\icon\\off_logout_17916.png"));
		lbl_signout.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				frame.dispose();
//				login.main(null);
				login login = new login();

			}
		});
		frame.getContentPane().add(lbl_signout);

		JLabel lbl_tipoffmanage = new JLabel("\uC81C\uBCF4 \uAD00\uB9AC");
		lbl_tipoffmanage.setBounds(90, 76, 180, 60);
		lbl_tipoffmanage.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_tipoffmanage.setFont(new Font("함초롬돋움", Font.BOLD, 24));
		frame.getContentPane().add(lbl_tipoffmanage);

		ArrayList<tipoff_VO> tipoffList = dao.allSelect1();
		String[] column = { "제보정보코드", "범죄종류", "범죄발생일", "범죄장소코드", "증거자료","범죄 세부명"};
		Object[][] data = new Object[tipoffList.size()][column.length];
		for (int i = 0; i < tipoffList.size(); i++) {
			data[i][0] = tipoffList.get(i).getTip_info_id();
			data[i][1] = tipoffList.get(i).getCr_type_id();
			data[i][2] = tipoffList.get(i).getCr_date();
			data[i][3] = tipoffList.get(i).getCr_loc_id();
			data[i][4] = tipoffList.get(i).getEvidence();
			data[i][5] = tipoffList.get(i).getCr_name();
		}

		DefaultTableModel model = new DefaultTableModel(data, column); // DefaultTableModel 선언 후 데이터 담기
		table_tipoffmanage = new JTable(model); // JTable에 DefaultTableModel을 담기
		table_tipoffmanage.setBounds(37, 146, 287, 493);

		JScrollPane scrollPane = new JScrollPane(table_tipoffmanage);
		scrollPane.setBounds(36, 146, 287, 493);
		frame.getContentPane().add(scrollPane);

		table_tipoffmanage.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);

		JButton btn_upload = new JButton("\uC804\uC1A1 \uD558\uAE30");
		btn_upload.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				int row = table_tipoffmanage.getSelectedRow();
				int result = JOptionPane.showConfirmDialog(null, "전송 하기", "제보 관리", JOptionPane.YES_NO_OPTION);

				if (result == JOptionPane.YES_OPTION) {
					if (row != 0) {
						row = table_tipoffmanage.getSelectedRow();
						int[] rows = (table_tipoffmanage.getSelectedRows());

						for (int i = 0; i < rows.length; i++) {
							Object value = table_tipoffmanage.getValueAt(rows[i], 0);
							String toto = (String) value;
							cnt = dao.sending_tipoff(toto, toto, toto, toto, toto);
						}
						if (cnt > 0) {
							JOptionPane.showMessageDialog(null, "전송이 완료되었습니다.");
						} else {
							JOptionPane.showMessageDialog(null, "선택된 목록이 없습니다.", "제보 관리",
									JOptionPane.INFORMATION_MESSAGE);
						}
					}

				} else if ((result == JOptionPane.CLOSED_OPTION) || (result == JOptionPane.NO_OPTION)) {
					return;
				}

			}
		});

		btn_upload.setBounds(36, 682, 287, 43);
		btn_upload.setFont(new Font("함초롬돋움", Font.BOLD, 14));
		frame.getContentPane().add(btn_upload);

	}
}