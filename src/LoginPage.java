import java.awt.*;
import java.util.HashMap;
import javax.swing.*;

public class LoginPage {
	
	JFrame frame = new JFrame();
	JButton loginButton = new JButton("Login");
	JButton resetButton = new JButton("Reset");
	JTextField userIDField = new JTextField();
	JPasswordField userPasswordField = new JPasswordField();
	JLabel userIDLabel = new JLabel("userID:");
	JLabel userPasswordLabel = new JLabel("password:");
	JLabel messageLabel = new JLabel();
	HashMap<String, String> loginInfo = new HashMap<String, String>();
	
	LoginPage(HashMap<String, String> loginInfoOriginal) {
		
		loginInfo = loginInfoOriginal;
		
		userIDLabel.setBounds(50, 100, 75, 25);
		userPasswordLabel.setBounds(50, 150, 75, 25);
		
		messageLabel.setBounds(150, 250, 250, 35);
		messageLabel.setFont(new Font(null, Font.ITALIC, 25));
		
		userIDField.setBounds(150, 100, 200, 25);
		userPasswordField.setBounds(150, 150, 200, 25);
		
		loginButton.setBounds(150, 200, 100, 25);
		loginButton.setFocusable(false);
		loginButton.addActionListener(e -> {
			
			String userID = userIDField.getText();
			String password = String.valueOf(userPasswordField.getPassword());
			
			if(loginInfo.containsKey(userID)) {
				if(loginInfo.get(userID).equals(password)) {
					messageLabel.setForeground(new Color(0, 200, 0));
					messageLabel.setText("Login successful");
					frame.dispose();
					new WelcomePage(userID);
				}
				else {
					messageLabel.setForeground(Color.red);
					messageLabel.setText("Wrong password");
				}
			}
			else {
				messageLabel.setForeground(Color.red);
				messageLabel.setText("userID not found");
			}
			
		});
		
		resetButton.setBounds(250, 200, 100, 25);
		resetButton.setFocusable(false);
		resetButton.addActionListener(e -> {
			userIDField.setText("");
			userPasswordField.setText("");
		});
		
		frame.add(userIDLabel);
		frame.add(userPasswordLabel);
		frame.add(messageLabel);
		frame.add(userIDField);
		frame.add(userPasswordField);
		frame.add(loginButton);
		frame.add(resetButton);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420,420);
		frame.setLayout(null);
		frame.setVisible(true);
		
	}

}
