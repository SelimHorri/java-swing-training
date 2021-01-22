package swing_project;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Color;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.border.CompoundBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JPasswordField;

public class DBsystem {
// Begin Class

	private JFrame frame;
	private JTable table;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	private JLabel label;
	
// ---------------------Initialize the contents of the frame.---------------------------------------------------------------------
	private void initialize () {
	// Begin initialize()
		
		frame = new JFrame();
		frame.setBounds(100, 100, 854, 446);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblDatabaseStatus = new JLabel("DataBase status :");
		lblDatabaseStatus.setBounds(42, 11, 101, 20);
		frame.getContentPane().add(lblDatabaseStatus);
		
		JLabel lblConnected = new JLabel("Connected");
		lblConnected.setForeground(new Color(34, 139, 34));
		lblConnected.setBounds(153, 11, 94, 20);
		frame.getContentPane().add(lblConnected);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(42, 72, 683, 311);
		frame.getContentPane().add(tabbedPane);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("View Employee", null, panel, null);
		panel.setLayout(null);
		
//		JScrollPane scrollPane = new JScrollPane();
//		scrollPane.setBounds(0, 0, 678, 283);
//		panel.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"1", "Slim", "Horri", "slim__horri@hotmail.com"},
				{"2", "Mouhamed", "Horri", "mouhamedhorri@gmail.com"},
				{"3", "fathi", "ben salah", "fathi_bensalah@gmail.com"},
				{"4", "muhammed", "essa", "muhammed_essa@yahoo.com"},
				{"5", "hussein", "alrubaye", "hussein_alrubaye@topnet.com"},
				{"6", "belha", "ben azoun", "belha_benazoun@yahoo.com"},
				
			},
			new String[] {
				"ID", "First name", "Last name", "Email"
			}
		));
		
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(0, 0, 678, 283);
		panel.add(scrollPane);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(107, 142, 35));
		tabbedPane.addTab("Insert", null, panel_1, null);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("First Name :");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setForeground(new Color(128, 0, 0));
		lblNewLabel.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel.setBounds(51, 11, 85, 21);
		panel_1.add(lblNewLabel);
		
		JLabel lblLastName = new JLabel("Last Name :");
		lblLastName.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblLastName.setForeground(new Color(128, 0, 0));
		lblLastName.setHorizontalAlignment(SwingConstants.TRAILING);
		lblLastName.setBounds(51, 37, 85, 21);
		panel_1.add(lblLastName);
		
		JLabel lblEmail = new JLabel("Email :");
		lblEmail.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblEmail.setForeground(new Color(128, 0, 0));
		lblEmail.setHorizontalAlignment(SwingConstants.TRAILING);
		lblEmail.setBounds(69, 69, 67, 21);
		panel_1.add(lblEmail);
		
		JLabel lblEnterPassword = new JLabel("Type Password :");
		lblEnterPassword.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblEnterPassword.setForeground(new Color(128, 0, 0));
		lblEnterPassword.setHorizontalAlignment(SwingConstants.TRAILING);
		lblEnterPassword.setBounds(24, 101, 112, 21);
		panel_1.add(lblEnterPassword);
		
		JLabel lblRewritePassword = new JLabel("Retype Password :");
		lblRewritePassword.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblRewritePassword.setForeground(new Color(128, 0, 0));
		lblRewritePassword.setHorizontalAlignment(SwingConstants.TRAILING);
		lblRewritePassword.setBounds(24, 135, 112, 21);
		panel_1.add(lblRewritePassword);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField.setForeground(new Color(0, 100, 0));
		textField.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textField.setBounds(146, 10, 118, 20);
		panel_1.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField_1.setForeground(new Color(0, 100, 0));
		textField_1.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textField_1.setColumns(10);
		textField_1.setBounds(146, 37, 118, 20);
		panel_1.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField_2.setForeground(new Color(0, 100, 0));
		textField_2.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textField_2.setColumns(10);
		textField_2.setBounds(146, 69, 118, 20);
		panel_1.add(textField_2);
		
		JButton btnSave = new JButton("Save");
		btnSave.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnSave.setForeground(new Color(25, 25, 112));
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				saveInDatabase();
				
			}
		});
		btnSave.setBackground(new Color(255, 255, 255));
		btnSave.setBorder(new CompoundBorder());
		btnSave.setBounds(367, 185, 89, 23);
		panel_1.add(btnSave);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnReset.setForeground(new Color(25, 25, 112));
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField.setText(null);
				textField_1.setText(null);
				textField_2.setText(null);
				passwordField.setText(null);
				passwordField_1.setText(null);
				
			}
		});
		btnReset.setBackground(new Color(255, 255, 255));
		btnReset.setBorder(new CompoundBorder());
		btnReset.setBounds(497, 185, 89, 23);
		panel_1.add(btnReset);
		
		passwordField = new JPasswordField();
		passwordField.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		passwordField.setForeground(new Color(0, 100, 0));
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 12));
		passwordField.setBounds(146, 101, 118, 21);
		panel_1.add(passwordField);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		passwordField_1.setForeground(new Color(0, 100, 0));
		passwordField_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		passwordField_1.setBounds(146, 135, 118, 21);
		panel_1.add(passwordField_1);
		
		label = new JLabel("");
		label.setForeground(new Color(255, 0, 0));
		label.setFont(new Font("Tahoma", Font.ITALIC, 9));
		label.setBounds(146, 157, 118, 14);
		panel_1.add(label);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Update/Delete Employee", null, panel_2, null);
		panel_2.setLayout(null);
		
	// End initialize()
	}
	
	private void saveInDatabase () {
	// Begin saveInDatabase()
		
		String fname = textField.getText().trim();
		String lname = textField_1.getText().trim();
		String email = textField_2.getText().trim();
		String passwd1 = new String(passwordField.getPassword());
		String passwd2 = new String(passwordField_1.getPassword());
		
		if ( (fname.isEmpty()) || (lname.isEmpty()) || (email.isEmpty()) || (passwd1.isEmpty()) || (passwd2.isEmpty()) ) {
			label.setText(null);
			JOptionPane.showMessageDialog(null,"Missing Data!!\nComplete tuple data to save in Database.");
		}
		
		else {
			
			if ( !(passwd1.equals(passwd2)) ) {
				label.setText("Uncompatible password !");
				JOptionPane.showMessageDialog(null,"Uncompatible password !");
			}
			
			else {
				label.setText(null);
				ConnToDB cc = new ConnToDB("");
				cc.insertData(fname,lname,email,passwd1);
				JOptionPane.showMessageDialog(null,"Data saved successfully");
				textField.setText(null);
				textField_1.setText(null);
				textField_2.setText(null);
				passwordField.setText(null);
				passwordField_1.setText(null);
			}
			
		}
		
	// End saveInDatabase()
	}

// -----------------------Create the application.--------------------------------------------------------------------------------
	DBsystem () {
		initialize();
	}

// --------------------------Launch the application.----------------------------------------------------------------------------
	public static void dbSys () {
	// Begin main()
		
		EventQueue.invokeLater(new Runnable() {
			public void run () {
				try {
					DBsystem window = new DBsystem();
					window.frame.setVisible(true);
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
