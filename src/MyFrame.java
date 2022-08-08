import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MyFrame extends JFrame {
	
	public MyFrame() {
		// TODO Auto-generated constructor stub
		//JFrame frame = new JFrame();// creates the this
		
		//size of this
		this.setTitle("first tutorial");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(400,420);//x,y axis
		this.setVisible(true);// creates the this visible
		
		ImageIcon image = new ImageIcon("Calculator_icon.svg.png");
		this.setIconImage(image.getImage());
		this.getContentPane().setBackground(new Color(0x123456));
	}

}
