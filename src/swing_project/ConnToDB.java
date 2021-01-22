package swing_project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;

public class ConnToDB {
// Begin CLass

	private Connection connect = null;
	private Statement statement = null;
	// private PreparedStatement prep = null;
	private ResultSet res = null;
	HashMap<String,String> hashmap = new HashMap<String,String>();
	
	ConnToDB (String choice) {
		if (choice.equalsIgnoreCase("for Login")) {
			this.config();
			this.selectToLogin();
		}
		else
			this.config();
		
//		if (choice.equalsIgnoreCase("for SignUp")){
//			this.config();
//			this.insertData();
//		}
	}

	private void config () {
	// Begin config()

		try {

			Class.forName("com.mysql.jdbc.Driver");

			connect = DriverManager.getConnection("jdbc:mysql://localhost/person_DB?user=Reese&password=Dashwood");
			statement = connect.createStatement();

		}
		catch (Exception e) {
			e.printStackTrace();
		}

	// End config()
	}

	private void selectToLogin () {
	// Begin select()
		
		try {

			String sqll = "select EMAIL,Password from person";
			
			res = statement.executeQuery(sqll);
			while (res.next()) {
				
				String email = res.getString("EMAIL");
				String passwd = res.getString("Password");
				
				hashmap.put(email,passwd);
				
			}
			
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		
	// End select()
	}
	
	void insertData (String fname,String lname,String email,String passwd) {
	// Begin insertData()
		
		try {
			String sqll = "insert into person (f_name,l_name,Email,Password) values ('"+ fname +"','"+ lname +"','"+ email +"','"+ passwd +"')";
			connect.prepareStatement(sqll).executeUpdate();
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		
	// End insertData()
	}
	
// End Class
}
