package com.joshbranchaud.babou.ui;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingUtilities;

/**
 * Gui for the babou project.
 * 
 * @author Dan Wiechert
 */
public class BabouGUI extends JPanel {
	private static final long serialVersionUID = 2837741791394299373L;

	/**
	 * Default constructor that sets up the gui.
	 */
	public BabouGUI() {
		setLayout(new BoxLayout(this, BoxLayout.LINE_AXIS));
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
		createFilesList(babouFrame);
		createCommitList(babouFrame);

		babouFrame.setLocationByPlatform(true);
		babouFrame.pack();
		babouFrame.setVisible(true);
	}

	/**
	 * Creates the commit list.
	 * 
	 * @param frame
	 *            The frame to add the commits to.
	 */
	private static void createCommitList(final JFrame frame) {
		// TODO: This needs to be refactored to get the real list of commits.
		// final Map<String, List<String>> commits = someClass.getCommits();
		final JList list = new JList(new String[] { "commit1", "commit2" });
		final JScrollPane commitList = new JScrollPane(list);
		commitList.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		commitList.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		commitList.setSize(new Dimension(frame.getContentPane().getWidth() / 2, frame.getContentPane().getHeight() / 2));
		frame.add(commitList, 1);
	}

	/**
	 * Creates the files list.
	 * 
	 * @param frame
	 *            The frame to add the menu to.
	 */
	private static void createFilesList(final JFrame frame) {
		// TODO: This needs to be refactored to get the real list of files.
		// final List<String> files = someClass.getChangedFiles();
		final JList list = new JList(new String[] { "first", "second", "third", "a", "a", "a", "a", "a", "a", "a" });
		final JScrollPane filesList = new JScrollPane(list);
		filesList.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		filesList.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		filesList.setSize(frame.getContentPane().getWidth() / 2, frame.getContentPane().getHeight() / 2);
		frame.add(filesList, 0);
	}

	/**
	 * Creates the menu bar.
	 * 
	 * @param frame
	 *            The frame to add the menu to.
	 */
	private static void createMenu(final JFrame frame) {
		final JMenuBar menuBar = new JMenuBar();

		final JMenu fileMenu = new JMenu("File");
		final JMenuItem newItem = new JMenuItem("New");
		fileMenu.add(newItem);
		final JMenuItem exitItem = new JMenuItem("Exit");
		exitItem.addActionListener(new ActionListener() {
			@Override
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
			@Override
			public void actionPerformed(final ActionEvent e) {
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
	public static void main(final String... args) {
		// Schedule a job for the event-dispatching thread:
		// creating and showing this application's GUI
		// Reference -
		// http://docs.oracle.com/javase/tutorial/displayCode.html?code=http://docs.oracle.com/javase/tutorial/uiswing/examples/components/RadioButtonDemoProject/src/components/RadioButtonDemo.java
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				createAndShowGUI();
			}
		});
	}
}
