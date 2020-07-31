import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JFrame;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

import au.com.bytecode.opencsv.CSVReader;

public class BarChart2 {

	private JFrame frame;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BarChart2 window = new BarChart2();
//					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public BarChart2() {
		initialize();
	}

	
	
	private void initialize() {
		JFreeChart chart = ChartFactory.createBarChart("2019��ȭ����", //����
													"��ȭ��",	//x��
													"������", 
													getDataset(), //���� �־��� ������
													PlotOrientation.VERTICAL,	//����
													true,true,false);
		
		//new Font("�۾�ü", �ش� �۾�ü�� ����, �۾�ũ��)
				chart.getTitle().setFont(new Font("����", Font.BOLD, 15));
				//���ʸ� �ѱ۷� ����
				chart.getLegend().setItemFont(new Font("����", Font.BOLD, 15));
				
				//x��, y�� �����ϰ� �ִ� ��Ʈ���� �ѱ� ���ڵ�
				CategoryPlot plot = chart.getCategoryPlot();
				//1. x�� �� ����
				plot.getDomainAxis().setLabelFont(new Font("����", Font.BOLD, 14));;
				//2. x�� ������ ����
				plot.getDomainAxis().setTickLabelFont(new Font("����", Font.BOLD, 8));
				//3. y�� �� ����
				plot.getRangeAxis().setLabelFont(new Font("����", Font.BOLD, 14));
				//4. y�� ������ ����
				plot.getRangeAxis().setTickLabelFont(new Font("����", Font.BOLD, 8));
				//5. ��Ʈ�� ���� ����
				plot.setBackgroundPaint(Color.WHITE);
				//6. ��Ʈ�� ���λ� ����
				plot.setRangeGridlinePaint(Color.DARK_GRAY);
		
		
		
		//��Ʈ�� ����ȭ
		ChartFrame frame = new ChartFrame("��ȭ", chart);	//�� ���� ������chart�� �ǹ��ϴ� ��
		frame.setBounds(100,100,500,700);
		frame.setSize(500, 700);
		frame.setVisible(true);
		
	}

	private DefaultCategoryDataset getDataset() {
		DefaultCategoryDataset dataset = new DefaultCategoryDataset();
		
		// 1. csv������ �о�ðſ���!
		FileReader file;
		try {
			file = new FileReader("C:\\Users\\SMT031\\Desktop\\boxoffice2019.csv");
			CSVReader reader = new CSVReader(file);	
			String[] array;
			int cnt = 0;
			while((array = reader.readNext())  != null) {
				cnt++;
				//cnt�� ���� ---> �÷����� �����Ϳ� ���� �ʱ� ���ؼ� check�� ���ִ� ����
				if(cnt>1) {
					//String --> ���ڷ� ����ȯ (Long.parseLong �ᵵ��)
					dataset.addValue(Integer.parseInt(array[2].replace(" ", "")), "��ȭ", array[0]);
				}
				if(cnt>6) {
					break;
				}
			}
		
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return dataset;
	}

}
