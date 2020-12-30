package View;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

public class SecondaryPanel extends JPanel {

	private JTextField idTextField;
	private JTextField nameTextField;
	private JTextField phNoTextField;
	private JTextField posTextField;

	private JPanel cardContainer;
	private JButton btnSave;
	private JButton btnHome;
	private JButton btnDisplay;
	private JButton btnRegister;
	private CardLayout cl_cardContainer;

	private Object[] columns = { "ID", "Name", "Email", "Position" };
	private JTable displayTable;
	private DefaultTableModel model = new DefaultTableModel();
	private Object[] rows = new Object[4];

	private JLabel lblTotalNumberOf;

	public SecondaryPanel() {

		setBounds(0, 0, 784, 455);
		setLayout(null);
		setVisible(false);

		JPanel TabPanel = new JPanel();
		TabPanel.setBounds(0, 0, 129, 455);
		TabPanel.setBackground(new Color(0, 0, 0));

		TabPanel.setLayout(null);

		btnRegister = new JButton("Register");
		btnRegister.setBounds(12, 172, 97, 25);
		TabPanel.add(btnRegister);

		btnDisplay = new JButton("Display");
		btnDisplay.setBounds(12, 238, 97, 25);
		TabPanel.add(btnDisplay);

		btnHome = new JButton("Home");
		btnHome.setBounds(12, 109, 97, 25);
		TabPanel.add(btnHome);

		add(TabPanel);

		cardContainer = new JPanel();
		cardContainer.setBounds(129, 0, 655, 455);
		add(cardContainer);
		JPanel homePanel = new JPanel();
		JPanel registerPanel = new JPanel();
		cl_cardContainer = new CardLayout();

		homePanel.setBackground(new Color(255, 51, 51));
		registerPanel.setBackground(new Color(255, 255, 255));

		cardContainer.setLayout(cl_cardContainer);
		cardContainer.add(homePanel, "1");
		homePanel.setLayout(null);

		lblTotalNumberOf = new JLabel("Total Number of Employee : " + model.getRowCount());
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

		btnSave = new JButton("Save");
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

		model.setColumnIdentifiers(columns);
	}

	public JTextField getIdTextField() {
		return idTextField;
	}

	public void setIdTextField(JTextField idTextField) {
		this.idTextField = idTextField;
	}

	public JTextField getNameTextField() {
		return nameTextField;
	}

	public void setNameTextField(JTextField nameTextField) {
		this.nameTextField = nameTextField;
	}

	public JTextField getPhNoTextField() {
		return phNoTextField;
	}

	public void setPhNoTextField(JTextField phNoTextField) {
		this.phNoTextField = phNoTextField;
	}

	public JTextField getPosTextField() {
		return posTextField;
	}

	public void setPosTextField(JTextField posTextField) {
		this.posTextField = posTextField;
	}

	public JPanel getCardContainer() {
		return cardContainer;
	}

	public void setCardContainer(JPanel cardContainer) {
		this.cardContainer = cardContainer;
	}

	public Object[] getColumns() {
		return columns;
	}

	public void setColumns(Object[] columns) {
		this.columns = columns;
	}

	public JTable getDisplayTable() {
		return displayTable;
	}

	public void setDisplayTable(JTable displayTable) {
		this.displayTable = displayTable;
	}

	public DefaultTableModel getModel() {
		return model;
	}

	public void setModel(DefaultTableModel model) {
		this.model = model;
	}

	public Object[] getRows() {
		return rows;
	}

	public void setRows(Object[] rows) {
		this.rows = rows;
	}

	public JButton getBtnSave() {
		return btnSave;
	}

	public void setBtnSave(JButton btnSave) {
		this.btnSave = btnSave;
	}

	public JButton getBtnHome() {
		return btnHome;
	}

	public void setBtnHome(JButton btnHome) {
		this.btnHome = btnHome;
	}

	public JButton getBtnDisplay() {
		return btnDisplay;
	}

	public void setBtnDisplay(JButton btnDisplay) {
		this.btnDisplay = btnDisplay;
	}

	public JButton getBtnRegister() {
		return btnRegister;
	}

	public void setBtnRegister(JButton btnRegister) {
		this.btnRegister = btnRegister;
	}

	public CardLayout getCl_cardContainer() {
		return cl_cardContainer;
	}

	public void setCl_cardContainer(CardLayout cl_cardContainer) {
		this.cl_cardContainer = cl_cardContainer;
	}

	public JLabel getLblTotalNumberOf() {
		return lblTotalNumberOf;
	}

	public void setLblTotalNumberOf(JLabel lblTotalNumberOf) {
		this.lblTotalNumberOf = lblTotalNumberOf;
	}
}
