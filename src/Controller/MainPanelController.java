package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import Model.LoginModel;
import View.MainPanel;
import View.SecondaryPanel;

public class MainPanelController {
	
	private MainPanel mainPanel;
	private SecondaryPanel secPanel;
	private JFrame myFrame;
	private LoginModel myModel;
	
	public MainPanelController(MainPanel mp, SecondaryPanel sp, JFrame frame) {
		this.mainPanel = mp;
		this.secPanel = sp;
		this.myFrame = frame;
		this.myModel = new LoginModel();
		
		this.mainPanel.getBtnLogin().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (mainPanel.getUsernameTextField().getText().equals(myModel.getUserName()) && mainPanel.getPasswordField().getText().equals(myModel.getPassword())) {

					JOptionPane.showMessageDialog(frame, "Login Success");

					mainPanel.setVisible(false);
					secPanel.setVisible(true);
					myFrame.repaint();
					myFrame.revalidate();
					
				} else {
					JOptionPane.showMessageDialog(myFrame, "Username or Password is incorrect", "Login Error",
							JOptionPane.ERROR_MESSAGE);
					mainPanel.getUsernameTextField().setText("");
					mainPanel.getPasswordField().setText("");
				}
				
			}
		});
	}
}
