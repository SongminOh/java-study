import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

public class BarChart {

	private JFrame frame;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BarChart window = new BarChart();
					//window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public BarChart() {
		initialize();
	}

	
	
	private void initialize() {

		//BarChart�� �����ϴ� ���
		JFreeChart chart = ChartFactory.createBarChart("�׽�Ʈ��Ʈ", //��Ʈ�� ����
														"�̸�", 	//x��
														"����",	//y�� 
														getDataset(), //�츮�� �־��� ������
														PlotOrientation.VERTICAL, //�׷����� ����
														true, //����
														true, //��ǳ��
														false	//url
														);
		
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
		
		
		
		
		//���� ���̰� ����ȭ�ϴ� ���
		ChartFrame frame = new ChartFrame("Bigdata3", chart);
		frame.setBounds(100,100,500,700);
		frame.setSize(500,700);
		frame.setVisible(true);
	}
	
	//�����͸� ������ ���� ����� ������ ����
	private DefaultCategoryDataset getDataset() {
		DefaultCategoryDataset dataset = new DefaultCategoryDataset();
		dataset.addValue(10, "�̸�", "����");
		dataset.addValue(44, "�̸�", "������");
		dataset.addValue(17, "�̸�", "�ڼ���");
		dataset.addValue(35, "�̸�", "�̻���");
		dataset.addValue(20, "�̸�", "�ּ���");
		
		dataset.addValue(10, "����", "����");
		dataset.addValue(44, "����", "������");
		dataset.addValue(17, "����", "�ڼ���");
		dataset.addValue(35, "����", "�̻���");
		dataset.addValue(20, "����", "�ּ���");
		
		return dataset;
	}

}
