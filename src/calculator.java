import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class calculator implements ActionListener{
	
	JFrame frame;
	JTextField textField;
	JButton[] numberButtons = new JButton[10];
	JButton [] functioButtons = new JButton[8];
	JButton addButton,suButton,mulButton,divButton;
	JButton decButton,equButton, delButton,clrButton;
	JPanel panel;
	
	Font myFont = new Font("ink free", Font.BOLD, 30);
	
	double num1=0,num2=0,result=0;
	char operator;
	
	calculator(){
		frame = new JFrame("Calculator");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420,550);
		frame.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(50, 25, 300, 50);
		textField.setFont(myFont);
		textField.setEditable(false);
		
		
		addButton = new JButton("+");
		suButton = new JButton("-");
		mulButton = new JButton("*");
		divButton = new JButton("/");
		decButton = new JButton(".");
		equButton = new JButton("=");
		delButton = new JButton("Delete");
		clrButton = new JButton("Clear");
		
		functioButtons[0] = addButton;
		functioButtons[1] = suButton;
		functioButtons[2] = mulButton;
		functioButtons[3] = divButton;
		functioButtons[4] = decButton;
		functioButtons[5] = equButton;
		functioButtons[6] = delButton;
		functioButtons[7] = clrButton;
		
		for(int i = 0; i<8; i++) {
			functioButtons[i].addActionListener(this);
			functioButtons[i].setFont(myFont);
			functioButtons[i].setFocusable(false);
		}
		for(int i = 0; i<10; i++) {
			numberButtons[i] = new JButton(String.valueOf(i));
			numberButtons[i].addActionListener(this);
			numberButtons[i].setFont(myFont);
			numberButtons[i].setFocusable(false);
		}
		delButton.setBounds(50,430,145,50);
		clrButton.setBounds(205,430,145,50);
		
		panel = new JPanel();
		panel.setBounds(50,100,300,300);
		panel.setLayout(new GridLayout(4,4,10,10));
		panel.setBackground(Color.gray);
		
		panel.add(numberButtons[1]);
		panel.add(numberButtons[2]);
		panel.add(numberButtons[3]);
		panel.add(addButton);
		panel.add(numberButtons[4]);
		panel.add(numberButtons[5]);
		panel.add(numberButtons[6]);
		panel.add(suButton);
		panel.add(numberButtons[7]);
		panel.add(numberButtons[8]);
		panel.add(numberButtons[9]);
		panel.add(mulButton);
		panel.add(divButton);
		panel.add(numberButtons[0]);
		panel.add(decButton);
		panel.add(equButton);
		
		
		frame.add(panel);
		frame.add(delButton);
		frame.add(clrButton);
		frame.add(textField);
		frame.setVisible(true);
		
	}
	public static void main(String argString []) {
		new calculator();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		for(int i=0;i<10;i++) {
			if(e.getSource() == numberButtons[i]) {
				textField.setText(textField.getText().concat(String.valueOf(i)));
			}
		}
		if(e.getSource() == decButton) {
			textField.setText(textField.getText().concat("."));
		}
		if(e.getSource()==addButton) {
			num1 = Double.parseDouble(textField.getText());
			operator = '+';
			textField.setText("");
		}
		if(e.getSource()==suButton) {
			num1 = Double.parseDouble(textField.getText());
			operator = '-';
			textField.setText("");
		}
		if(e.getSource()==mulButton) {
			num1 = Double.parseDouble(textField.getText());
			operator = '*';
			textField.setText("");
		}
		if(e.getSource()==divButton) {
			num1 = Double.parseDouble(textField.getText());
			operator = '/';
			textField.setText("");
		}
		if(e.getSource()==equButton) {
			num2 = Double.parseDouble(textField.getText());
			switch (operator) {
			case '+':
				result = num1+num2;
				break;
			case '-':
				result = num1-num2;
				break;
			case '/':
				result = num1/num2;
				break;
			case '*':
				result = num1/num2;
				break;
			}
			textField.setText(String.valueOf(result));
			num1 = result;
		}
		if(e.getSource() == clrButton) {
			textField.setText("");
		}
		if(e.getSource() == delButton) {
			String string = textField.getText();
			textField.setText("");
			for(int i =0; i<string.length()-1;i++) {
				textField.setText(textField.getText()+string.charAt(i));
			}
		}
	}
	

}
