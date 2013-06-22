package com.joshbranchaud.babou.ui;

import java.awt.BorderLayout;
import java.awt.Toolkit;

import javax.swing.BorderFactory;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

/**
 * Gui for the babou project.
 * 
 * @author Dan Wiechert
 */
public class BabouGUI extends JPanel {
	private static final long serialVersionUID = 2837741791394299373L;

	public BabouGUI() {
		super(new BorderLayout());

		setBorder(BorderFactory.createEmptyBorder(20, 20, Toolkit.getDefaultToolkit().getScreenSize().height / 2, Toolkit.getDefaultToolkit()
				.getScreenSize().width / 2));
	}

	/**
	 * Create the GUI and show it. For thread safety, this method should be invoke from the event-dispatching thread.
	 */
	private static void createAndShowGUI() {
		final JFrame babouFrame = new JFrame("BabuoFrame");
		babouFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		final JComponent babouComponent = new BabouGUI();
		babouComponent.setOpaque(true);
		babouFrame.setContentPane(babouComponent);

		babouFrame.setLocationByPlatform(true);
		babouFrame.pack();
		babouFrame.setVisible(true);
	}

	/**
	 * Main entry point to the application.
	 * 
	 * @param args
	 *            Not used.
	 */
	public static void main(String... args) {
		// Schedule a job for the event-dispatching thread:
		// creating and showing this application's GUI
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				createAndShowGUI();
			}
		});
	}
}
