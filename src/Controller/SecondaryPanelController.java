package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import View.SecondaryPanel;

public class SecondaryPanelController {

	private SecondaryPanel secPanel;
	private JFrame myFrame;

	public SecondaryPanelController(SecondaryPanel sp, JFrame frame) {
		this.secPanel = sp;
		this.myFrame = frame;

		this.secPanel.getBtnHome().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				secPanel.getCl_cardContainer().show(secPanel.getCardContainer(), "1");

			}
		});
		this.secPanel.getBtnDisplay().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				secPanel.getCl_cardContainer().show(secPanel.getCardContainer(), "3");

			}
		});
		this.secPanel.getBtnRegister().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				secPanel.getCl_cardContainer().show(secPanel.getCardContainer(), "2");

			}
		});
		this.secPanel.getBtnSave().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				performSave();
			}
		});
	}

	protected void performSave() {

		if (!this.secPanel.getIdTextField().getText().equals("")
				&& !this.secPanel.getNameTextField().getText().equals("")
				&& !this.secPanel.getPhNoTextField().getText().equals("")
				&& !this.secPanel.getPosTextField().getText().equals("")) {
			this.secPanel.getRows()[0] = this.secPanel.getIdTextField().getText();
			this.secPanel.getRows()[1] = this.secPanel.getNameTextField().getText();
			this.secPanel.getRows()[2] = this.secPanel.getPhNoTextField().getText();
			this.secPanel.getRows()[3] = this.secPanel.getPosTextField().getText();

			this.secPanel.getModel().addRow(this.secPanel.getRows());

			JOptionPane.showMessageDialog(this.myFrame, "Save Successfully");
			this.secPanel.getLblTotalNumberOf()
					.setText("Total Number of Employee : " + this.secPanel.getModel().getRowCount());

			this.secPanel.getIdTextField().setText("");
			this.secPanel.getNameTextField().setText("");
			this.secPanel.getPhNoTextField().setText("");
			this.secPanel.getPosTextField().setText("");

		} else {
			JOptionPane.showMessageDialog(myFrame, "Input fields cannot be blank", "Input Requirement Error",
					JOptionPane.ERROR_MESSAGE);
		}
	}
}
