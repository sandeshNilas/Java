import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class tut2label{
	public static void main(String [] args) {
		// TODO Auto-generated constructor stub
		JFrame frame = new JFrame();// creates the this
		JLabel label = new JLabel();
		
		ImageIcon imageIcon = new ImageIcon("images.png");
		Border borderFactory = BorderFactory.createLineBorder(Color.green,3);
		label.setText("Bro do u even code");
		label.setIcon(imageIcon);
		label.setHorizontalTextPosition(JLabel.CENTER);
		label.setVerticalTextPosition(JLabel.TOP);
		label.setForeground(new Color(0x00ff00));
		label.setFont(new Font("MV Boli",Font.PLAIN, 20));
		label.setIconTextGap(-25);
		label.setBackground(Color.black);
		label.setOpaque(true);
		label.setBorder(borderFactory);
		
		frame.setTitle("first tutorial");
		frame.setSize(400,420);//x,y axis
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);// creates the this visible
		frame.add(label);
		
		
	}

}
