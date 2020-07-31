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

		//BarChart를 생성하는 방법
		JFreeChart chart = ChartFactory.createBarChart("테스트차트", //차트의 제목
														"이름", 	//x축
														"점수",	//y축 
														getDataset(), //우리가 넣어줄 데이터
														PlotOrientation.VERTICAL, //그래프의 방향
														true, //범례
														true, //말풍선
														false	//url
														);
		
		//new Font("글씨체", 해당 글씨체의 굵기, 글씨크기)
		chart.getTitle().setFont(new Font("굴림", Font.BOLD, 15));
		//범례를 한글로 설정
		chart.getLegend().setItemFont(new Font("굴림", Font.BOLD, 15));
		
		//x축, y축 보유하고 있는 차트들의 한글 인코딩
		CategoryPlot plot = chart.getCategoryPlot();
		//1. x축 라벨 설정
		plot.getDomainAxis().setLabelFont(new Font("굴림", Font.BOLD, 14));;
		//2. x축 도메인 설정
		plot.getDomainAxis().setTickLabelFont(new Font("굴림", Font.BOLD, 8));
		//3. y축 라벨 설정
		plot.getRangeAxis().setLabelFont(new Font("굴림", Font.BOLD, 14));
		//4. y축 도메인 설정
		plot.getRangeAxis().setTickLabelFont(new Font("굴림", Font.BOLD, 8));
		//5. 차트의 배경색 설정
		plot.setBackgroundPaint(Color.WHITE);
		//6. 차트의 라인색 설정
		plot.setRangeGridlinePaint(Color.DARK_GRAY);
		
		
		
		
		//눈에 보이게 가시화하는 방법
		ChartFrame frame = new ChartFrame("Bigdata3", chart);
		frame.setBounds(100,100,500,700);
		frame.setSize(500,700);
		frame.setVisible(true);
	}
	
	//데이터를 가지고 오는 기능을 별도로 만듦
	private DefaultCategoryDataset getDataset() {
		DefaultCategoryDataset dataset = new DefaultCategoryDataset();
		dataset.addValue(10, "이름", "김운비");
		dataset.addValue(44, "이름", "김혜린");
		dataset.addValue(17, "이름", "박성준");
		dataset.addValue(35, "이름", "이상준");
		dataset.addValue(20, "이름", "최성우");
		
		dataset.addValue(10, "점수", "김운비");
		dataset.addValue(44, "점수", "김혜린");
		dataset.addValue(17, "점수", "박성준");
		dataset.addValue(35, "점수", "이상준");
		dataset.addValue(20, "점수", "최성우");
		
		return dataset;
	}

}
