package com.CoranaDetailsWithGUI;

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class App {
	
	public static String getData(String input)throws Exception {
		StringBuffer sb=new StringBuffer();
		sb.append("<html>"+"<body style='text-align:center;color:blue;'>");
		sb.append(input.toUpperCase()+"<br>");
		String url="https://www.worldometers.info/coronavirus/country/"+input+"/";
		Document doc=Jsoup.connect(url).get();
		// #maincounter-wrap(# means id in CSS format)
		Elements element=doc.select("#maincounter-wrap");
		element.forEach(e->{
			String text=e.select("h1").text(); 
			  // .maincounter-number(. means class in CSS format)
			  String value=e.select(".maincounter-number>span").text();
			  sb.append(text).append(" ").append(value).append("<br>");
		});
		sb.append("</body>"+"</html>");
		return sb.toString();
	}
	
    public static void main( String[] args ){

		// JFrame is main windows frame
		JFrame frame=new JFrame("Corona details APP");
		// create TextField
		JTextField text=new JTextField();
		// create Label 
		JLabel label=new JLabel();
		// create button
		JButton button=new JButton("go value");
		// create font
		Font f=new Font("red",Font.BOLD,30);
		frame.setSize(500, 500);
		// set font size
		text.setFont(f);
		label.setFont(f);
		button.setFont(f);
		// set a text in center
		text.setHorizontalAlignment(SwingConstants.CENTER);
		label.setHorizontalAlignment(SwingConstants.CENTER);

		// set action and reaction concept
		button.addActionListener( event-> {
		// button click then output value concept
		try {
			String data=text.getText();
			String result=getData(data);
			label.setText(result);
			}
		catch(Exception se) {
			se.printStackTrace();
			}
		});
		// add layout in main frame
		frame.setLayout(new BorderLayout());
		// Add all in main Windows frame
		frame.add(text,BorderLayout.NORTH); // set Top
		frame.add(label,BorderLayout.CENTER); // set Center
		frame.add(button,BorderLayout.SOUTH);  // set bottom
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
