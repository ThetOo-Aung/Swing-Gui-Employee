package View;

import java.awt.Color;
import java.io.IOException;

import javax.swing.JFrame;

import Controller.MainPanelController;
import Controller.SecondaryPanelController;

public class View {
	public View() throws IOException {
		JFrame frame = new JFrame();
		frame.setTitle("Employee Management System");
		frame.getContentPane().setBackground(Color.WHITE);
		frame.getContentPane().setLayout(null);

		MainPanel mp = new MainPanel();
		frame.add(mp);
		
		SecondaryPanel sp = new SecondaryPanel();
		frame.add(sp);
		
		MainPanelController mpc = new MainPanelController(mp, sp, frame);
		SecondaryPanelController spc = new SecondaryPanelController(sp,frame);
		
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setSize(802, 502);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);

	}
}
