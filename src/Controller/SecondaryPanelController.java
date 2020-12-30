package Controller;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import Model.TableData;
import View.SecondaryPanel;

public class SecondaryPanelController {

	private SecondaryPanel secPanel;
	private JFrame myFrame;
	private TableData tbData;

	public SecondaryPanelController(SecondaryPanel sp, JFrame frame) {
		this.secPanel = sp;
		this.myFrame = frame;
		this.tbData = new TableData();

	

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

		this.secPanel.getBtnRemove().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				performDeleteRow();

			}
		});
	}

	protected void performDeleteRow() {
		int i = this.secPanel.getDisplayTable().getSelectedRow();
		if (i >= 0) {
			this.secPanel.getModel().removeRow(i);
			this.secPanel.getLblTotalNumberOf()
					.setText("Total Number of Employee : " + this.secPanel.getModel().getRowCount());
		} else {

			JOptionPane.showMessageDialog(myFrame, "Select Row to Delete");
		}

	}

	protected void performSave() {

		if (!this.secPanel.getIdTextField().getText().equals("")
				&& !this.secPanel.getNameTextField().getText().equals("")
				&& !this.secPanel.getPhNoTextField().getText().equals("")
				&& !this.secPanel.getPosTextField().getText().equals("")) {
			this.tbData.getRows()[0] = this.secPanel.getIdTextField().getText();
			this.tbData.getRows()[1] = this.secPanel.getNameTextField().getText();
			this.tbData.getRows()[2] = this.secPanel.getPhNoTextField().getText();
			this.tbData.getRows()[3] = this.secPanel.getPosTextField().getText();

			this.secPanel.getModel().addRow(this.tbData.getRows());

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
