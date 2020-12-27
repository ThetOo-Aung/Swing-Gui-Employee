import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.SecondaryLoop;
import java.awt.SystemColor;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JList;

public class Main {
	private static JTextField usernameTextField;
	private static JPasswordField passwordField;
	private static JTextField idTextField;
	private static JTextField nameTextField;
	private static JTextField phNoTextField;
	private static JTextField posTextField;
	
	
	private static Object[] columns = {"ID" , "Name", "Email", "Position"};
	private static JTable displayTable;
	private static DefaultTableModel model = new DefaultTableModel();
	private static Object[] rows = new Object[4];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("Card Layout");
		frame.getContentPane().setBackground(Color.WHITE);
		frame.getContentPane().setLayout(null);
				
				JPanel MainPanel = new JPanel();
				MainPanel.setBounds(0, 0, 784, 455);
				frame.getContentPane().add(MainPanel);
				MainPanel.setLayout(null);
				
						JPanel loginPanel = new JPanel();
						loginPanel.setBounds(0, 0, 391, 455);
						MainPanel.add(loginPanel);
						loginPanel.setBackground(new Color(255, 255, 255));
						loginPanel.setLayout(null);
						
						JLabel lblUsername = new JLabel("Username: ");
						lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 15));
						lblUsername.setBounds(25, 117, 97, 30);
						loginPanel.add(lblUsername);
						
						JLabel lblWelcomeBack = new JLabel("Welcome Back !");
						lblWelcomeBack.setFont(new Font("Sitka Text", Font.PLAIN, 25));
						lblWelcomeBack.setHorizontalAlignment(SwingConstants.CENTER);
						lblWelcomeBack.setBounds(0, 13, 359, 54);
						loginPanel.add(lblWelcomeBack);
						
						usernameTextField = new JTextField();
						usernameTextField.setBounds(129, 117, 203, 30);
						loginPanel.add(usernameTextField);
						usernameTextField.setColumns(10);
						
						JLabel lblPassword = new JLabel("Password: ");
						lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 15));
						lblPassword.setBounds(25, 174, 97, 30);
						loginPanel.add(lblPassword);
						
						passwordField = new JPasswordField();
						passwordField.setBounds(129, 174, 203, 30);
						loginPanel.add(passwordField);
						
						JButton btnLogin = new JButton("Login");
						
							btnLogin.setBounds(235, 243, 97, 25);
							loginPanel.add(btnLogin);
							
							JPanel ImagePanel = new JPanel();
							ImagePanel.setBackground(new Color(255, 127, 80));
							ImagePanel.setBounds(393, 0, 391, 455);
							MainPanel.add(ImagePanel);
							ImagePanel.setLayout(null);
							
							
							
	
				
				JPanel SecondaryPanel = new JPanel();
				SecondaryPanel.setBounds(0, 0, 784, 455);
				frame.getContentPane().add(SecondaryPanel);
				SecondaryPanel.setLayout(null);
				
				JPanel TabPanel = new JPanel();
				TabPanel.setBounds(0, 51, 129, 404);
				SecondaryPanel.add(TabPanel);
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
										
												
				JPanel cardContainer = new JPanel();
				cardContainer.setBounds(129, 51, 655, 404);
				SecondaryPanel.add(cardContainer);
				JPanel homePanel = new JPanel();
				JPanel registerPanel = new JPanel();
				CardLayout cl_cardContainer = new CardLayout();
				
						homePanel.setBackground(new Color(255, 255, 255));
						registerPanel.setBackground(new Color(255, 255, 255));
						
								cardContainer.setLayout(cl_cardContainer);
								cardContainer.add(homePanel, "1");
								homePanel.setLayout(null);
								
								JLabel lblTotalNumberOf = new JLabel("Total Number of Employee : ???");
								lblTotalNumberOf.setFont(new Font("Tahoma", Font.PLAIN, 27));
								lblTotalNumberOf.setBounds(141, 101, 400, 154);
								homePanel.add(lblTotalNumberOf);
								cardContainer.add(registerPanel, "2");
								registerPanel.setLayout(null);
								
								JLabel lblEmployeeId = new JLabel("Employee ID :");
								lblEmployeeId.setBounds(55, 69, 102, 38);
								registerPanel.add(lblEmployeeId);
								
								JLabel lblEmployeeName = new JLabel("Name:");
								lblEmployeeName.setBounds(55, 134, 102, 38);
								registerPanel.add(lblEmployeeName);
								
								JLabel lblPhoneNo = new JLabel("Email:");
								lblPhoneNo.setBounds(55, 198, 102, 38);
								registerPanel.add(lblPhoneNo);
								
								JLabel lblJobPost = new JLabel("Position:");
								lblJobPost.setBounds(55, 264, 102, 38);
								registerPanel.add(lblJobPost);
								
								idTextField = new JTextField();
								idTextField.setBounds(169, 69, 149, 38);
								registerPanel.add(idTextField);
								idTextField.setColumns(10);
								
								nameTextField = new JTextField();
								nameTextField.setColumns(10);
								nameTextField.setBounds(169, 134, 149, 38);
								registerPanel.add(nameTextField);
								
								phNoTextField = new JTextField();
								phNoTextField.setColumns(10);
								phNoTextField.setBounds(169, 198, 149, 38);
								registerPanel.add(phNoTextField);
								
								posTextField = new JTextField();
								posTextField.setColumns(10);
								posTextField.setBounds(169, 264, 149, 38);
								registerPanel.add(posTextField);
								
								JButton btnSave = new JButton("Save");
								btnSave.setBounds(221, 347, 97, 25);
								registerPanel.add(btnSave);
								cl_cardContainer.show(cardContainer, "1");
								btnSave.addActionListener(new ActionListener() {
									
									@Override
									public void actionPerformed(ActionEvent e) {
										rows[0] = idTextField.getText();
										rows[1] = nameTextField.getText();
										rows[2] = phNoTextField.getText();
										rows[3] = posTextField.getText();
										
										model.addRow(rows);
										
									}
								});
								
										JPanel DisplayPanel = new JPanel();
										DisplayPanel.setBackground(new Color(255, 255, 255));
										cardContainer.add(DisplayPanel, "3");
										DisplayPanel.setLayout(null);
										
										displayTable = new JTable();
										
										
										model.setColumnIdentifiers(columns);
										displayTable.setModel(model);
										
									//	displayTable.setBackground(new Color(255, 255, 255));
										displayTable.setBounds(69, 25, 523, 324);
									
										
										displayTable.setSelectionBackground(Color.LIGHT_GRAY);
									//	displayTable.setSelectionForeground(Color.BLACK);
										displayTable.setRowHeight(20);
										displayTable.setAutoCreateRowSorter(true);
										
										JScrollPane pane = new JScrollPane(displayTable);
										pane.setForeground(Color.red);
										pane.setBackground(Color.BLACK);
										pane.setBounds(10,10,612,367);
										
										DisplayPanel.add(pane);
										
									
										
										
												JLabel lblEmployeeManagementSystem = new JLabel("Employee Management System");
												cardContainer.add(lblEmployeeManagementSystem, "name_658087729246300");
												lblEmployeeManagementSystem.setBackground(Color.BLUE);
												lblEmployeeManagementSystem.setFont(new Font("Tahoma", Font.PLAIN, 20));
												lblEmployeeManagementSystem.setHorizontalAlignment(SwingConstants.CENTER);
												
												JLabel lblEmployeeManagementSystem_1 = new JLabel("Employee Management System");
												lblEmployeeManagementSystem_1.setHorizontalAlignment(SwingConstants.CENTER);
												lblEmployeeManagementSystem_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
												lblEmployeeManagementSystem_1.setBounds(0, 0, 784, 53);
												SecondaryPanel.add(lblEmployeeManagementSystem_1);
												
												
												
												
												
												
												btnLogin.addActionListener(new ActionListener() {
													public void actionPerformed(ActionEvent e) {
														if(usernameTextField.getText().equals("root") && passwordField.getText().equals("password")){
															MainPanel.setVisible(false);
															SecondaryPanel.setVisible(true);
														}
													}
												});
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
				
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setSize(802, 502);
		frame.setVisible(true);
	}
}
