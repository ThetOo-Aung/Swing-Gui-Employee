package View;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import java.awt.SystemColor;

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
	private JButton btnRemove;
	private CardLayout cl_cardContainer;

	private Object[] columns = { "ID", "Name", "Email", "Position" };
	private JTable displayTable;
	private DefaultTableModel model = new DefaultTableModel();

	private JLabel lblTotalNumberOf;

	public SecondaryPanel() throws IOException {

		setBounds(0, 0, 784, 455);
		setLayout(null);
		setVisible(false);

		JPanel TabPanel = new JPanel();
		TabPanel.setBounds(0, 0, 145, 455);
		TabPanel.setBackground(new Color(0, 0, 0));

		TabPanel.setLayout(null);

		btnRegister = new JButton("Register");
		btnRegister.setFocusable(false);
		btnRegister.setFocusPainted(false);
		btnRegister.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				btnRegister.setBackground(new Color(0, 0, 0));
			}
		});
		btnRegister.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btnRegister.setBackground(new Color(0, 0, 0));
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				btnRegister.setBackground(new Color(0, 0, 0));
			}

			@Override
			public void mousePressed(MouseEvent e) {
				btnRegister.setBackground(new Color(0, 0, 0));
			}
		});

		btnRegister.setBackground(Color.BLACK);
		btnRegister.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnRegister.setForeground(Color.WHITE);
		btnRegister.setBounds(24, 197, 97, 25);
		btnRegister.setBorder(null);
		TabPanel.add(btnRegister);

		btnDisplay = new JButton("Display");
		btnDisplay.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				btnDisplay.setBackground(new Color(0, 0, 0));
			}
		});
		btnDisplay.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btnDisplay.setBackground(new Color(0, 0, 0));
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				btnDisplay.setBackground(new Color(0, 0, 0));
			}

			@Override
			public void mousePressed(MouseEvent e) {
				btnDisplay.setBackground(new Color(0, 0, 0));
			}
		});
		btnDisplay.setBackground(Color.BLACK);
		btnDisplay.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnDisplay.setForeground(Color.WHITE);
		btnDisplay.setBounds(24, 264, 97, 25);
		btnDisplay.setFocusPainted(false);
		btnDisplay.setBorder(null);
		TabPanel.add(btnDisplay);

		btnHome = new JButton("Home");
		btnHome.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				btnHome.setBackground(new Color(0, 0, 0));
			}
		});
		btnHome.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btnHome.setBackground(new Color(0, 0, 0));
			}

			@Override
			public void mousePressed(MouseEvent e) {
				btnHome.setBackground(new Color(0, 0, 0));
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				btnHome.setBackground(new Color(0, 0, 0));
			}
		});
		btnHome.setBackground(Color.BLACK);
		btnHome.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnHome.setForeground(Color.WHITE);
		btnHome.setFocusPainted(false);
		btnHome.setBorder(null);

		btnHome.setBounds(24, 132, 97, 25);
		TabPanel.add(btnHome);

		btnHome.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnHome.setBackground(new Color(60, 60, 60));
			}
		});
		btnHome.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				btnHome.setBackground(new Color(0, 0, 0));
			}
		});

		btnDisplay.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {

				btnDisplay.setBackground(new Color(60, 60, 60));
			}
		});
		btnDisplay.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				btnDisplay.setBackground(new Color(0, 0, 0));
			}
		});

		btnRegister.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {

				btnRegister.setBackground(new Color(60, 60, 60));
			}
		});
		btnRegister.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				btnRegister.setBackground(new Color(0, 0, 0));
			}
		});

		add(TabPanel);

		cardContainer = new JPanel();
		cardContainer.setBounds(143, 0, 641, 455);
		add(cardContainer);
		JPanel homePanel = new JPanel();
		JPanel registerPanel = new JPanel();
		cl_cardContainer = new CardLayout();

		homePanel.setBackground(SystemColor.activeCaption);
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
		lblEmployeeManagementSystem_1.setBounds(0, 0, 641, 66);
		homePanel.add(lblEmployeeManagementSystem_1);
		cardContainer.add(registerPanel, "2");
		registerPanel.setLayout(null);

		JLabel lblEmployeeId = new JLabel("Employee ID :");
		lblEmployeeId.setHorizontalAlignment(SwingConstants.RIGHT);
		lblEmployeeId.setBounds(73, 148, 102, 38);
		registerPanel.add(lblEmployeeId);

		JLabel lblEmployeeName = new JLabel("Name : ");
		lblEmployeeName.setHorizontalAlignment(SwingConstants.RIGHT);
		lblEmployeeName.setBounds(73, 213, 102, 38);
		registerPanel.add(lblEmployeeName);

		JLabel lblPhoneNo = new JLabel("Email : ");
		lblPhoneNo.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPhoneNo.setBounds(73, 277, 102, 38);
		registerPanel.add(lblPhoneNo);

		JLabel lblJobPost = new JLabel("Position : ");
		lblJobPost.setHorizontalAlignment(SwingConstants.RIGHT);
		lblJobPost.setBounds(73, 343, 102, 38);
		registerPanel.add(lblJobPost);

		idTextField = new JTextField();
		idTextField.setBounds(187, 148, 149, 38);
		registerPanel.add(idTextField);
		idTextField.setColumns(10);

		nameTextField = new JTextField();
		nameTextField.setColumns(10);
		nameTextField.setBounds(187, 213, 149, 38);
		registerPanel.add(nameTextField);

		phNoTextField = new JTextField();
		phNoTextField.setColumns(10);
		phNoTextField.setBounds(187, 277, 149, 38);
		registerPanel.add(phNoTextField);

		posTextField = new JTextField();
		posTextField.setColumns(10);
		posTextField.setBounds(187, 343, 149, 38);
		registerPanel.add(posTextField);

		btnSave = new JButton("Save");
		btnSave.setBounds(423, 343, 102, 38);
		registerPanel.add(btnSave);

		JLabel lblEmployeeManagementSystem_1_1 = new JLabel("Employee Management System");
		lblEmployeeManagementSystem_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblEmployeeManagementSystem_1_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblEmployeeManagementSystem_1_1.setBounds(0, 0, 641, 66);
		registerPanel.add(lblEmployeeManagementSystem_1_1);

		BufferedImage img = ImageIO.read(new File("img/avatar-profile-png-3.png"));

		Image newImage = img.getScaledInstance(141, 141, Image.SCALE_DEFAULT);
		JLabel lblEmpImg = new JLabel();
		lblEmpImg.setIcon(new ImageIcon(newImage));
		lblEmpImg.setHorizontalAlignment(SwingConstants.CENTER);
		lblEmpImg.setBounds(400, 95, 149, 140);
		registerPanel.add(lblEmpImg);
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
		pane.setForeground(Color.WHITE);
		pane.setBackground(Color.BLACK);
		pane.setBounds(38, 86, 569, 277);

		DisplayPanel.add(pane);

		btnRemove = new JButton("Remove");

		btnRemove.setBounds(504, 387, 103, 37);
		DisplayPanel.add(btnRemove);

		JLabel lblEmployeeManagementSystem = new JLabel("Employee Management System");
		lblEmployeeManagementSystem.setBounds(0, 0, 641, 66);
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

	public JButton getBtnRemove() {
		return btnRemove;
	}

	public void setBtnRemove(JButton btnRemove) {
		this.btnRemove = btnRemove;
	}
}
