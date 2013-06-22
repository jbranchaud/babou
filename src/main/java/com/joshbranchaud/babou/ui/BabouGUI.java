package com.joshbranchaud.babou.ui;

import java.awt.BorderLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
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

		createMenu(babouFrame);

		babouFrame.setLocationByPlatform(true);
		babouFrame.pack();
		babouFrame.setVisible(true);
	}

	/**
	 * Creates the menu bar.
	 */
	private static void createMenu(final JFrame frame) {
		final JMenuBar menuBar = new JMenuBar();

		final JMenu fileMenu = new JMenu("File");
		final JMenuItem newItem = new JMenuItem("New");
		fileMenu.add(newItem);
		final JMenuItem exitItem = new JMenuItem("Exit");
		exitItem.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent arg0) {
				System.exit(0);
			}
		});
		fileMenu.add(exitItem);
		menuBar.add(fileMenu);

		final JMenu helpMenu = new JMenu("Help");
		final JMenuItem settingsItem = new JMenuItem("Settings");
		helpMenu.add(settingsItem);
		final JMenuItem collaboratorsItem = new JMenuItem("Collaborators");
		collaboratorsItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(frame, "Created by Josh Branchaud and Dan Wiechert.");
			}
		});
		helpMenu.add(collaboratorsItem);
		menuBar.add(helpMenu);

		frame.setJMenuBar(menuBar);
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
		// Reference -
		// http://docs.oracle.com/javase/tutorial/displayCode.html?code=http://docs.oracle.com/javase/tutorial/uiswing/examples/components/RadioButtonDemoProject/src/components/RadioButtonDemo.java
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				createAndShowGUI();
			}
		});
	}
}
