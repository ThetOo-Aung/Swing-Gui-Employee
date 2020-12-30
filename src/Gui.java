import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Image;

import javax.swing.table.DefaultTableModel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JOptionPane;

public class Gui {
	private static JTextField usernameTextField;
	private static JPasswordField passwordField;
	private static JTextField idTextField;
	private static JTextField nameTextField;
	private static JTextField phNoTextField;
	private static JTextField posTextField;

	private static Object[] columns = { "ID", "Name", "Email", "Position" };
	private static JTable displayTable;
	private static DefaultTableModel model = new DefaultTableModel();
	private static Object[] rows = new Object[4];
	private static BufferedImage image;

	public  void guiGenerate(String[] args) throws IOException {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("EMP Management System");
		frame.getContentPane().setBackground(Color.WHITE);
		frame.getContentPane().setLayout(null);

		JPanel MainPanel = new JPanel();
		MainPanel.setBounds(0, 0, 784, 455);
		frame.getContentPane().add(MainPanel);
		MainPanel.setLayout(null);

		JPanel loginPanel = new JPanel();
		loginPanel.setBounds(0, 0, 397, 455);
		MainPanel.add(loginPanel);
		loginPanel.setBackground(new Color(4, 35, 66));
		loginPanel.setLayout(null);

		JLabel lblUsername = new JLabel("Username: ");
		lblUsername.setForeground(new Color(255, 255, 255));
		lblUsername.setFont(new Font("Segoe UI", Font.BOLD, 18));
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
		lblPassword.setFont(new Font("Segoe UI", Font.BOLD, 18));
		lblPassword.setBounds(25, 174, 97, 30);
		loginPanel.add(lblPassword);

		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 17));
		passwordField.setBounds(129, 174, 203, 30);
		loginPanel.add(passwordField);

		JButton btnLogin = new JButton("Login");
		btnLogin.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnLogin.setBackground(new Color(35, 73, 112));
		btnLogin.setForeground(Color.WHITE);
		btnLogin.setBounds(235, 238, 97, 30);
		btnLogin.setFocusPainted(false);
		loginPanel.add(btnLogin);

		image = ImageIO.read(new File(
				"D:\\TProjects_by_TOA\\SE_Team_Projects\\Demo_Project_For_SETeam\\BE_Demo\\Demo_Project\\img\\Christmas.jpg"));
		Image newImage = image.getScaledInstance(391, 455, Image.SCALE_DEFAULT);

		JPanel ImagePanel = new JPanel();
		ImagePanel.setBackground(new Color(255, 255, 255));
		ImagePanel.setBounds(393, 0, 391, 455);
		MainPanel.add(ImagePanel);
		ImagePanel.setLayout(null);
		JLabel picLabel = new JLabel(new ImageIcon(newImage));
		picLabel.setLocation(0, 0);
		picLabel.setSize(391, 455);
		ImagePanel.add(picLabel);

		JPanel SecondaryPanel = new JPanel();
		SecondaryPanel.setBounds(0, 0, 784, 455);
		frame.getContentPane().add(SecondaryPanel);
		SecondaryPanel.setLayout(null);

		JPanel cardContainer = new JPanel();
		cardContainer.setBounds(129, 0, 655, 455);
		SecondaryPanel.add(cardContainer);
		JPanel homePanel = new JPanel();
		JPanel registerPanel = new JPanel();
		CardLayout cl_cardContainer = new CardLayout();

		homePanel.setBackground(new Color(255, 51, 51));
		registerPanel.setBackground(new Color(255, 255, 255));

		cardContainer.setLayout(cl_cardContainer);
		cardContainer.add(homePanel, "1");
		homePanel.setLayout(null);

		JLabel lblTotalNumberOf = new JLabel("Total Number of Employee : " + model.getRowCount());
		lblTotalNumberOf.setFont(new Font("Tahoma", Font.PLAIN, 27));
		lblTotalNumberOf.setBounds(141, 101, 400, 154);
		homePanel.add(lblTotalNumberOf);

		JLabel lblEmployeeManagementSystem_1 = new JLabel("Employee Management System");
		lblEmployeeManagementSystem_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblEmployeeManagementSystem_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblEmployeeManagementSystem_1.setBounds(0, 0, 655, 66);
		homePanel.add(lblEmployeeManagementSystem_1);
		cardContainer.add(registerPanel, "2");
		registerPanel.setLayout(null);

		JLabel lblEmployeeId = new JLabel("Employee ID :");
		lblEmployeeId.setBounds(73, 115, 102, 38);
		registerPanel.add(lblEmployeeId);

		JLabel lblEmployeeName = new JLabel("Name:");
		lblEmployeeName.setBounds(73, 180, 102, 38);
		registerPanel.add(lblEmployeeName);

		JLabel lblPhoneNo = new JLabel("Email:");
		lblPhoneNo.setBounds(73, 244, 102, 38);
		registerPanel.add(lblPhoneNo);

		JLabel lblJobPost = new JLabel("Position:");
		lblJobPost.setBounds(73, 310, 102, 38);
		registerPanel.add(lblJobPost);

		idTextField = new JTextField();
		idTextField.setBounds(187, 115, 149, 38);
		registerPanel.add(idTextField);
		idTextField.setColumns(10);

		nameTextField = new JTextField();
		nameTextField.setColumns(10);
		nameTextField.setBounds(187, 180, 149, 38);
		registerPanel.add(nameTextField);

		phNoTextField = new JTextField();
		phNoTextField.setColumns(10);
		phNoTextField.setBounds(187, 244, 149, 38);
		registerPanel.add(phNoTextField);

		posTextField = new JTextField();
		posTextField.setColumns(10);
		posTextField.setBounds(187, 310, 149, 38);
		registerPanel.add(posTextField);

		JButton btnSave = new JButton("Save");
		btnSave.setBounds(234, 377, 102, 25);
		registerPanel.add(btnSave);

		JLabel lblEmployeeManagementSystem_1_1 = new JLabel("Employee Management System");
		lblEmployeeManagementSystem_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblEmployeeManagementSystem_1_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblEmployeeManagementSystem_1_1.setBounds(0, 0, 655, 66);
		registerPanel.add(lblEmployeeManagementSystem_1_1);
		cl_cardContainer.show(cardContainer, "1");

		JPanel DisplayPanel = new JPanel();
		DisplayPanel.setBackground(new Color(255, 255, 255));
		cardContainer.add(DisplayPanel, "3");
		DisplayPanel.setLayout(null);

		displayTable = new JTable();
		displayTable.setModel(model);

		// displayTable.setBackground(new Color(255, 255, 255));
		displayTable.setBounds(69, 25, 523, 324);

		displayTable.setSelectionBackground(Color.LIGHT_GRAY);
		// displayTable.setSelectionForeground(Color.BLACK);
		displayTable.setRowHeight(20);
		displayTable.setAutoCreateRowSorter(true);

		JScrollPane pane = new JScrollPane(displayTable);
		pane.setForeground(Color.red);
		pane.setBackground(Color.BLACK);
		pane.setBounds(38, 86, 584, 290);

		DisplayPanel.add(pane);

		JButton btnRemove = new JButton("Remove");
		btnRemove.setBounds(519, 378, 103, 37);
		DisplayPanel.add(btnRemove);

		JLabel lblEmployeeManagementSystem = new JLabel("Employee Management System");
		lblEmployeeManagementSystem.setBounds(0, 0, 655, 66);
		DisplayPanel.add(lblEmployeeManagementSystem);
		lblEmployeeManagementSystem.setHorizontalAlignment(SwingConstants.CENTER);
		lblEmployeeManagementSystem.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnSave.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				if (!idTextField.getText().equals("") && !nameTextField.getText().equals("")
						&& !phNoTextField.getText().equals("") && !posTextField.getText().equals("")) {
					rows[0] = idTextField.getText();
					rows[1] = nameTextField.getText();
					rows[2] = phNoTextField.getText();
					rows[3] = posTextField.getText();

					model.addRow(rows);

					JOptionPane.showMessageDialog(frame, "Save Successfully");
					lblTotalNumberOf.setText("Total Number of Employee : " + model.getRowCount());

					idTextField.setText("");
					nameTextField.setText("");
					phNoTextField.setText("");
					posTextField.setText("");
				} else {
					JOptionPane.showMessageDialog(frame, "Input fields cannot be blank", "Input Requirement Error",
							JOptionPane.ERROR_MESSAGE);
				}
			}
		});

		btnRemove.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int i = displayTable.getSelectedRow();
				if (i >= 0) {
					model.removeRow(i);
					lblTotalNumberOf.setText("Total Number of Employee : " + model.getRowCount());
				} else {

					JOptionPane.showMessageDialog(frame, "Select Row to Delete");
				}

			}
		});

		JPanel TabPanel = new JPanel();
		TabPanel.setBounds(0, 0, 129, 455);
		TabPanel.setBackground(new Color(0, 0, 0));

		TabPanel.setLayout(null);

		JButton btnRegister = new JButton("Register");
		btnRegister.setBounds(12, 172, 97, 25);
		TabPanel.add(btnRegister);

		JButton btnDisplay = new JButton("Display");
		btnDisplay.setBounds(12, 238, 97, 25);
		TabPanel.add(btnDisplay);

		JButton btnHome = new JButton("Home");
		btnHome.setBounds(12, 109, 97, 25);
		TabPanel.add(btnHome);
		btnHome.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				cl_cardContainer.show(cardContainer, "1");

			}
		});
		btnDisplay.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				cl_cardContainer.show(cardContainer, "3");

			}
		});
		btnRegister.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				cl_cardContainer.show(cardContainer, "2");

			}
		});

		btnLogin.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {

				if (usernameTextField.getText().equals("thetooaung") && passwordField.getText().equals("password")) {

					JOptionPane.showMessageDialog(frame, "Login Success");
					//
					MainPanel.setVisible(false);
					SecondaryPanel.setVisible(true);
					SecondaryPanel.add(TabPanel);
					// removeall
					frame.revalidate();
					frame.repaint();
					// frame.getContentPane().add(SecondaryPanel);
				} else {
					JOptionPane.showMessageDialog(frame, "Username or Password is incorrect", "Login Error",
							JOptionPane.ERROR_MESSAGE);
					usernameTextField.setText("");
					passwordField.setText("");
				}
			}
		});

		model.setColumnIdentifiers(columns);

		frame.revalidate();
		frame.repaint();
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setSize(802, 502);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
}
