package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.CardLayout;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Music_GUI {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Music_GUI window = new Music_GUI();
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
	public Music_GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 594, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(12, 10, 554, 112);
		frame.getContentPane().add(panel);
		panel.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("Music Info");
		lblNewLabel.setFont(new Font("∏º¿∫ ∞ÌµÒ", Font.PLAIN, 34));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel, "name_2347028464218600");
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(12, 131, 554, 120);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(new GridLayout(1, 0, 0, 0));
		
		JButton btnNewButton_2 = new JButton("\u25C0\u25C0");
		btnNewButton_2.setFont(new Font("±º∏≤", Font.PLAIN, 20));
		panel_1.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("\u25B6");
		
		btnNewButton_3.addActionListener(new ActionListener() {		//¿œ»∏º∫(=±ª¿Ã implementsæ»æ≤¥¬¿Ã¿Ø) ¿Œ≈Õ∆‰¿ÃΩ∫
			public void actionPerformed(ActionEvent e) {
				
				System.out.println(lblNewLabel.getText());
				
				lblNewLabel.setText("æ∆¿Ã¿Ø - ø°¿’");
			}
		});
		btnNewButton_3.setFont(new Font("±º∏≤", Font.PLAIN, 20));
		panel_1.add(btnNewButton_3);
		
		JButton btnNewButton_1 = new JButton("\u25A0");
		btnNewButton_1.setFont(new Font("±º∏≤", Font.PLAIN, 20));
		panel_1.add(btnNewButton_1);
		
		JButton btnNewButton = new JButton("\u25B6\u25B6");
		btnNewButton.setFont(new Font("±º∏≤", Font.PLAIN, 20));
		panel_1.add(btnNewButton);
	}
}
