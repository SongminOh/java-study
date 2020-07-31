import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ex06Image {

	private JFrame frame;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ex06Image window = new ex06Image();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public ex06Image() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 640, 688);			//x좌표값, y좌표값, 넓이, 높이
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		Image image = new ImageIcon("C:\\Users\\SMT031\\Desktop\\Java_Study\\20200721_GUI\\quaka.jpg").getImage();
		JLabel lbl_image = new JLabel(new ImageIcon(image.getScaledInstance(200, 200, Image.SCALE_SMOOTH)));
		//크기조절하는 방법!
		lbl_image.setBounds(42, 78, 533, 457);
		frame.getContentPane().add(lbl_image);
		
	}

}
