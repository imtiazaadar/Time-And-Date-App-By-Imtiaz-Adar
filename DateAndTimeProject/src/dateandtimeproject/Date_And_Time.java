package dateandtimeproject;

import java.awt.Color;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Date_And_Time {
	private JFrame frame = new JFrame();
	private JLabel timeLabel = new JLabel();
	private JLabel dateLabel = new JLabel();
	private JLabel dayLabel = new JLabel();
	private JLabel introLabel = new JLabel("MADE BY IMTIAZ ADAR");
	private Font font1 = new Font("DS-DIGITAL", Font.PLAIN, 80);
	private Font font2 = new Font("DS-DIGITAL", Font.PLAIN, 50);
	private Font font3 = new Font("Ink Free", Font.PLAIN, 30);
	private Color color1 = new Color(253, 249, 249);
	private Color color2 = new Color(201, 16, 16);
	private ImageIcon icon;
	private boolean running = true;
	SimpleDateFormat time; 
	SimpleDateFormat date;
	SimpleDateFormat day; 
	Date datetime;
	public Date_And_Time() {
		datetime = new Date();
		time = new SimpleDateFormat("HH : mm : ss a");
		date = new SimpleDateFormat("dd MMMM yyyy");
		day = new SimpleDateFormat("EEEE");
		timeLabel.setBounds(184, 80, 500, 80);
		timeLabel.setText(time.format(datetime));
		timeLabel.setForeground(color1);
		timeLabel.setBorder(BorderFactory.createBevelBorder(2));
		timeLabel.setFont(font1);
		
		dateLabel.setBounds(217, 210, 500, 80);
		dateLabel.setText(date.format(datetime).toUpperCase());
		dateLabel.setForeground(color1);
		dateLabel.setBorder(BorderFactory.createBevelBorder(2));
		dateLabel.setFont(font2);
		
		dayLabel.setBounds(321, 320, 500, 80);
		dayLabel.setText(day.format(datetime).toUpperCase());
		dayLabel.setForeground(color1);
		dayLabel.setBorder(BorderFactory.createBevelBorder(2));
		dayLabel.setFont(font2);
		
		introLabel.setBounds(227, 460, 500, 50);
		introLabel.setForeground(color1);
		introLabel.setFont(font3);
		introLabel.setOpaque(false);
		
		icon = new ImageIcon(getClass().getResource("timedate1.png"));
		frame.add(timeLabel);
		frame.add(dateLabel);
		frame.add(dayLabel);
		frame.add(introLabel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(345, 125, 810, 600);
		frame.getContentPane().setBackground(color2);
		frame.setIconImage(icon.getImage());
		frame.setLayout(null);
		frame.setVisible(true);
		frame.setTitle("DATE & TIME BY IMTIAZ ADAR");
		frame.setResizable(false);
		updateTimeAndDate();
	}
	public void updateTimeAndDate() {
		while(running) {
			datetime = new Date();
			time = new SimpleDateFormat("HH : mm : ss a");
			date = new SimpleDateFormat("dd MMMM yyyy");
			day = new SimpleDateFormat("EEEE");
			timeLabel.setText(time.format(datetime));
			dateLabel.setText(date.format(datetime).toUpperCase());
			dayLabel.setText(day.format(datetime).toUpperCase());
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
