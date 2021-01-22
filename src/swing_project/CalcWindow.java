package swing_project;

import java.awt.EventQueue;
import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class CalcWindow {
// Begin Class
	
	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JRadioButton rdbtnAddition;
	private JRadioButton rdbtnSubstruction;
	private JRadioButton rdbtnMultiplication;
	private JRadioButton rdbtnDivision;
	
// -----------------------------Initialize the contents of the frame.**initialize()**---------------------------------------------------------
	private void initialize () {
	// Begin initialize()
		
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 139, 139));
		frame.setBounds(100, 100, 1003, 561);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnResult = new JButton("Result");
		btnResult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if (rdbtnAddition.isSelected()) {
					
					try {
						int n1 = Integer.parseInt(textField_1.getText().trim());
						int n2 = Integer.parseInt(textField_2.getText().trim());
						
						int n = n1 + n2;
						textField.setText(String.valueOf(n));
					}
					catch (NumberFormatException e) {
						JOptionPane.showMessageDialog(null,"Enter numbers only!\n"+ e);
					}
					
				}
				
				if (rdbtnSubstruction.isSelected()) {
					
					try {
						int n1 = Integer.parseInt(textField_1.getText().trim());
						int n2 = Integer.parseInt(textField_2.getText().trim());
						
						int n = n1 - n2;
						textField.setText(String.valueOf(n));
					}
					catch (NumberFormatException e) {
						JOptionPane.showMessageDialog(null,"Enter numbers only!\n"+ e);
					}
					
				}
				
				if (rdbtnMultiplication.isSelected()) {
					
					try {
						int n1 = Integer.parseInt(textField_1.getText().trim());
						int n2 = Integer.parseInt(textField_2.getText().trim());
						
						int n = n1 * n2;
						textField.setText(Integer.toString(n));
					}
					catch (NumberFormatException e) {
						JOptionPane.showMessageDialog(null,"Enter numbers only!\n"+ e);
					}
					
				}
				
				if (rdbtnDivision.isSelected()) {
					
					try {
						int n1 = Integer.parseInt(textField_1.getText().trim());
						int n2 = Integer.parseInt(textField_2.getText().trim());
						
						if (n2 == 0)
							JOptionPane.showMessageDialog(null,"Error! Division on 0");
						
						else {
							int n = n1 / n2;
							textField.setText(String.valueOf(n));
						}
					}
					catch (NumberFormatException e) {
						JOptionPane.showMessageDialog(null,"Enter numbers only!\n"+ e);
					}
					
				}
				
			}
		});
		btnResult.setForeground(new Color(0, 255, 255));
		btnResult.setBackground(new Color(47, 79, 79));
		btnResult.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnResult.setBounds(453, 265, 89, 23);
		frame.getContentPane().add(btnResult);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField.setForeground(new Color(255, 255, 0));
		textField.setBackground(new Color(139, 69, 19));
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setBounds(406, 324, 186, 38);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblMakeYourChoice = new JLabel("Make your choice :");
		lblMakeYourChoice.setForeground(new Color(139, 0, 0));
		lblMakeYourChoice.setBounds(40, 22, 118, 23);
		frame.getContentPane().add(lblMakeYourChoice);
		
		rdbtnAddition = new JRadioButton("Addition");
		rdbtnAddition.setBackground(new Color(0, 139, 139));
		rdbtnAddition.setBounds(111, 55, 109, 23);
		frame.getContentPane().add(rdbtnAddition);
		
		rdbtnSubstruction = new JRadioButton("Substruction");
		rdbtnSubstruction.setBackground(new Color(0, 139, 139));
		rdbtnSubstruction.setBounds(111, 81, 109, 23);
		frame.getContentPane().add(rdbtnSubstruction);
		
		rdbtnMultiplication = new JRadioButton("Multiplication");
		rdbtnMultiplication.setBackground(new Color(0, 139, 139));
		rdbtnMultiplication.setBounds(111, 107, 109, 23);
		frame.getContentPane().add(rdbtnMultiplication);
		
		rdbtnDivision = new JRadioButton("Division");
		rdbtnDivision.setBackground(new Color(0, 139, 139));
		rdbtnDivision.setBounds(111, 133, 109, 23);
		frame.getContentPane().add(rdbtnDivision);
		
		ButtonGroup btnGroup = new ButtonGroup();
		btnGroup.add(rdbtnAddition);
		btnGroup.add(rdbtnSubstruction);
		btnGroup.add(rdbtnMultiplication);
		btnGroup.add(rdbtnDivision);
		
		textField_1 = new JTextField();
		textField_1.setForeground(new Color(255, 255, 0));
		textField_1.setBackground(new Color(0, 139, 139));
		textField_1.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textField_1.setBounds(434, 82, 118, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setForeground(new Color(255, 255, 0));
		textField_2.setBackground(new Color(0, 139, 139));
		textField_2.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textField_2.setColumns(10);
		textField_2.setBounds(434, 134, 118, 20);
		frame.getContentPane().add(textField_2);
		
		JLabel lblEnterFirstNumber = new JLabel("Enter First number :");
		lblEnterFirstNumber.setBounds(434, 59, 133, 14);
		frame.getContentPane().add(lblEnterFirstNumber);
		
		JLabel lblEnterSecondNumber = new JLabel("Enter Second number :");
		lblEnterSecondNumber.setBounds(434, 111, 133, 14);
		frame.getContentPane().add(lblEnterSecondNumber);
		
	// End initialize()
	}

// ------------------------------Create the application in Constructor -----------------------------------------------------------------------
	CalcWindow () {
		initialize();
	}

// ------------------------------Launch the application. // main() ---------------------------------------------------------------------------
	public static void calcWind () {
	// Begin calcWind()
		
		EventQueue.invokeLater(new Runnable() {
			public void run () {
				try {
					CalcWindow window = new CalcWindow();
					window.frame.setVisible(true);
				}
				catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	// End calcWind()
	}
	
	
// End Class
}
