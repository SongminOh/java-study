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
		JFreeChart chart = ChartFactory.createBarChart("2019영화순위", //제목
													"영화명",	//x축
													"관객수", 
													getDataset(), //실제 넣어줄 데이터
													PlotOrientation.VERTICAL,	//방향
													true,true,false);
		
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
		
		
		
		//차트를 가시화
		ChartFrame frame = new ChartFrame("영화", chart);	//이 위의 변수명chart를 의미하는 것
		frame.setBounds(100,100,500,700);
		frame.setSize(500, 700);
		frame.setVisible(true);
		
	}

	private DefaultCategoryDataset getDataset() {
		DefaultCategoryDataset dataset = new DefaultCategoryDataset();
		
		// 1. csv파일을 읽어올거에요!
		FileReader file;
		try {
			file = new FileReader("C:\\Users\\SMT031\\Desktop\\boxoffice2019.csv");
			CSVReader reader = new CSVReader(file);	
			String[] array;
			int cnt = 0;
			while((array = reader.readNext())  != null) {
				cnt++;
				//cnt의 역할 ---> 컬럼명을 데이터에 넣지 않기 위해서 check를 해주는 역할
				if(cnt>1) {
					//String --> 숫자로 형변환 (Long.parseLong 써도됨)
					dataset.addValue(Integer.parseInt(array[2].replace(" ", "")), "영화", array[0]);
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
