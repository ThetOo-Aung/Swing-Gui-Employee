package View;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class MainPanel extends JPanel{
	
	private JTextField usernameTextField;
	private JPasswordField passwordField;
	private  BufferedImage image ;
	private JButton btnLogin;
	
	public MainPanel() throws IOException{
	
		setBounds(0, 0, 784, 455);
		setLayout(null);
		setVisible(true);

		JPanel loginPanel = new JPanel();
		loginPanel.setBounds(0, 0, 397, 455);
		add(loginPanel);
		loginPanel.setBackground(new Color(4, 35, 66));
		loginPanel.setLayout(null);

		JLabel lblUsername = new JLabel("Username: ");
		lblUsername.setForeground(new Color(255, 255, 255));
		lblUsername.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 17));
		lblUsername.setBounds(25, 117, 97, 30);
		loginPanel.add(lblUsername);

		JLabel lblWelcomeBack = new JLabel("Welcome Back !");
		lblWelcomeBack.setForeground(new Color(255, 255, 255));
		lblWelcomeBack.setFont(new Font("Sitka Text", Font.PLAIN, 30));
		lblWelcomeBack.setHorizontalAlignment(SwingConstants.CENTER);
		lblWelcomeBack.setBounds(0, 13, 391, 91);
		loginPanel.add(lblWelcomeBack);

		usernameTextField = new JTextField();
		usernameTextField.setFont(new Font("Tahoma", Font.PLAIN, 17));
		usernameTextField.setBounds(129, 117, 203, 30);
		loginPanel.add(usernameTextField);
		usernameTextField.setColumns(10);

		JLabel lblPassword = new JLabel("Password: ");
		lblPassword.setForeground(new Color(255, 255, 255));
		lblPassword.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 17));
		lblPassword.setBounds(25, 174, 97, 30);
		loginPanel.add(lblPassword);

		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 17));
		passwordField.setBounds(129, 174, 203, 30);
		loginPanel.add(passwordField);

		 btnLogin = new JButton("Login");
		btnLogin.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnLogin.setBackground(new Color(35, 73, 112));
		btnLogin.setForeground(Color.WHITE);
		btnLogin.setBounds(235, 238, 97, 30);
		btnLogin.setFocusPainted(false);
		loginPanel.add(btnLogin);

		JPanel ImagePanel = new JPanel();
		ImagePanel.setBackground(new Color(255, 255, 255));
		ImagePanel.setBounds(393, 0, 391, 455);
		add(ImagePanel);
		ImagePanel.setLayout(null);
		
		image = ImageIO.read(new File("D:\\TProjects_by_TOA\\SE_Team_Projects\\Demo_Project_For_SETeam\\BE_Demo\\Demo_Project\\img\\Christmas.jpg"));
		Image newImage = image.getScaledInstance(391, 455, Image.SCALE_DEFAULT);
		JLabel picLabel = new JLabel(new ImageIcon(newImage));
		picLabel.setLocation(0, 0);
		picLabel.setSize(391,455);
		ImagePanel.add(picLabel);
		
		
		
	}

	public JButton getBtnLogin() {
		return btnLogin;
	}

	public void setBtnLogin(JButton btnLogin) {
		this.btnLogin = btnLogin;
	}

	public JTextField getUsernameTextField() {
		return usernameTextField;
	}

	public void setUsernameTextField(JTextField usernameTextField) {
		this.usernameTextField = usernameTextField;
	}

	public JPasswordField getPasswordField() {
		return passwordField;
	}

	public void setPasswordField(JPasswordField passwordField) {
		this.passwordField = passwordField;
	}
}
