package swing_project;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseEvent;

public class LoginWindow {
// Begin Class
	
	private JFrame frm;
	private JTextField textField;
	private JPasswordField passwordField;
	private JLabel lblEnterUsername;
	private JButton btnLogin;
	private JLabel lblEnterPassword;
	
// -----------------------------Initialize the contents of the frame.**initialize()**----------------------------------------------------------
	private void initialize () {
	// Begin initialize()
		
		frm = new JFrame();
		frm.getContentPane().setFont(new Font("Tahoma", Font.BOLD, 14));
		frm.setUndecorated(true);
		frm.setTitle("Login");
		frm.getContentPane().setBackground(new Color(112, 128, 144));
		frm.setResizable(false);
		frm.setBounds(100, 100, 569, 356);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.getContentPane().setLayout(null);
		
		JLabel lblEmail = new JLabel("\tEmail :");
		lblEmail.setHorizontalAlignment(SwingConstants.CENTER);
		lblEmail.setForeground(Color.ORANGE);
		lblEmail.setFont(new Font("Georgia", Font.BOLD | Font.ITALIC, 11));
		lblEmail.setBounds(131, 96, 61, 14);
		frm.getContentPane().add(lblEmail);
		
		textField = new JTextField();
		textField.setBackground(Color.LIGHT_GRAY);
		textField.setBorder(new LineBorder(new Color(0, 0, 0)));
		textField.setForeground(new Color(51, 51, 0));
		textField.setFont(new Font("Cambria Math", Font.BOLD, 12));
		textField.setBounds(192, 89, 166, 29);
		frm.getContentPane().add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBackground(Color.LIGHT_GRAY);
		passwordField.setBorder(new LineBorder(new Color(0, 0, 0)));
		passwordField.setForeground(new Color(51, 51, 0));
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 12));
		passwordField.setBounds(192, 140, 166, 29);
		frm.getContentPane().add(passwordField);
		
		JLabel lblPassword = new JLabel("Password :");
		lblPassword.setHorizontalAlignment(SwingConstants.CENTER);
		lblPassword.setForeground(Color.ORANGE);
		lblPassword.setFont(new Font("Georgia", Font.BOLD | Font.ITALIC, 11));
		lblPassword.setBounds(116, 148, 76, 14);
		frm.getContentPane().add(lblPassword);
		
		lblEnterUsername = new JLabel("Enter username !");
		lblEnterUsername.setFont(new Font("Corbel", Font.BOLD | Font.ITALIC, 11));
		lblEnterUsername.setForeground(Color.RED);
		lblEnterUsername.setBounds(394, 92, 89, 24);
		frm.getContentPane().add(lblEnterUsername);
		
		btnLogin = new JButton("Login");
		btnLogin.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnLogin.setBorder(new LineBorder(new Color(0, 0, 0)));
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed (ActionEvent arg0) {
				
				testMyLogin();
				
			}
		});
		btnLogin.setBackground(new Color(189, 183, 107));
		btnLogin.setForeground(new Color(128, 0, 0));
		btnLogin.setFont(new Font("Segoe UI Semibold", Font.ITALIC, 15));
		btnLogin.setBounds(227, 235, 100, 29);
		frm.getContentPane().add(btnLogin);
		
		lblEnterPassword = new JLabel("Enter password !");
		lblEnterPassword.setForeground(Color.RED);
		lblEnterPassword.setFont(new Font("Corbel", Font.BOLD | Font.ITALIC, 11));
		lblEnterPassword.setBounds(394, 145, 89, 24);
		frm.getContentPane().add(lblEnterPassword);
		
		JButton btnSignUp = new JButton("Sign up ?");
		btnSignUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				DBsystem.dbSys();
				
			}
		});
		btnSignUp.setBorder(null);
		btnSignUp.setFont(new Font("Tahoma", Font.ITALIC, 9));
		btnSignUp.setBackground(new Color(51, 51, 51));
		btnSignUp.setForeground(new Color(0, 255, 255));
		btnSignUp.setBounds(474, 325, 89, 23);
		frm.getContentPane().add(btnSignUp);
		
		JCheckBox chckbxShowPassword = new JCheckBox("Show password");
		chckbxShowPassword.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (chckbxShowPassword.isSelected())
					passwordField.setEchoChar( (char) 0 );
				else
					passwordField.setEchoChar('°');
				
			}
		});
		chckbxShowPassword.setForeground(Color.LIGHT_GRAY);
		chckbxShowPassword.setFont(new Font("Tahoma", Font.PLAIN, 9));
		chckbxShowPassword.setBackground(new Color(51, 51, 51));
		chckbxShowPassword.setBounds(215, 195, 119, 23);
		frm.getContentPane().add(chckbxShowPassword);
		
		JButton btnX = new JButton("X");
		btnX.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				
				btnX.setBackground(Color.red);
				btnX.setForeground(Color.white);
				
			}
			@Override
			public void mouseDragged(MouseEvent e) {
				
				btnX.setBackground(new Color(112, 128, 144));
				btnX.setForeground(Color.black);
				
			}
		});
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.exit(0);
				
			}
		});
		btnX.setFont(new Font("Yu Gothic Medium", Font.BOLD, 14));
		btnX.setBackground(new Color(112, 128, 144));
		btnX.setBounds(520, 0, 49, 31);
		frm.getContentPane().add(btnX);
		
	// End initialize()
	}
	
	private void testMyLogin () {
	// Begin testMyLogin()
		
		String email = new String(textField.getText().trim());
		String passwd = new String(passwordField.getPassword());
		ConnToDB conn = new ConnToDB("for login");
		
		if ( (email.isEmpty()) && (passwd.isEmpty()) )
			JOptionPane.showMessageDialog(null,"Type Something !");
			
		else {
			
			if (!conn.hashmap.containsKey(email))
				JOptionPane.showMessageDialog(null,"Email not found in Database\nplease Try again!!!");
			else {
				
				if ( conn.hashmap.get(email).equals(passwd) )
					CalcWindow.calcWind();
				else
					JOptionPane.showMessageDialog(null,"Password not found in Database\nplease Try again!!!");
				
			}
				
		}
		
//		textField.setText(null);
//		passwordField.setText(null);
		
	// End testMyLogin()
	}
	
// ------------------------------Create the application.--------------------------------------------------------------------------------------
	LoginWindow () {
		initialize();
	}
	
// ------------------------------Launch the application. main() ------------------------------------------------------------------------------
	public static void loginWind () {
	// Begin main()
		
		EventQueue.invokeLater(new Runnable () {
			public void run () {
				try {
					LoginWindow window = new LoginWindow();
					window.frm.setVisible(true);
				}
				catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	// End main()
	}
	
// End Class
}
