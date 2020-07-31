import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

public class Ex05LoginSuccess {

	private JFrame frame;

	public Ex05LoginSuccess(VO vo) {
		initialize(vo);
		frame.setVisible(true);
		
	}

	private void initialize(VO vo) {
		frame = new JFrame();
		frame.setBounds(100, 100, 536, 584);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lbl_name = new JLabel("New label");
		lbl_name.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_name.setFont(new Font("«‘√ ∑“µ∏øÚ", Font.PLAIN, 40));
		lbl_name.setBounds(53, 130, 412, 112);
		frame.getContentPane().add(lbl_name);
		
		lbl_name.setText(vo.getName());
		
		
	}

}
