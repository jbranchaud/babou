package com.jbranchaud.babou.gui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListModel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import com.jbranchaud.babou.constants.GuiConstants;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BabouGui extends JFrame {
	
	private static final long serialVersionUID = -3127516624535640822L;
	
    private static final Logger log = LoggerFactory.getLogger(BabouGui.class);
	
	private final static GridLayout mainLayout = new GridLayout(0,2);
	private final JScrollPane fileScrollPane = new JScrollPane();
	private final JScrollPane commitScrollPane = new JScrollPane();

	public BabouGui(String name) {
		super(name);
		setResizable(true);
		initialize(this);
	}

	private static void createAndShowGUI(JFrame frame) {
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// add stuff to the frame's content pane
		addComponentsToPane(frame.getContentPane());

		// Display the window
		frame.pack();
		frame.setVisible(true);
	}

	private static void addComponentsToPane(final Container pane) {

		//pane.setPreferredSize(new Dimension(pane.getParent().getWidth(), pane.getParent().getHeight()));
		pane.setPreferredSize(new Dimension(
			(int)(Toolkit.getDefaultToolkit().getScreenSize().width * 0.5),
			(int)(Toolkit.getDefaultToolkit().getScreenSize().height * 0.5)));

		// setup the JPanel for this pane
		final JPanel componentPanel = new JPanel();
		componentPanel.setLayout(mainLayout);

		// setup and add the file scroll pane to the componentPanel
		addFileScrollPane(componentPanel);

		// setup and add the commit scroll pane to the componentPanel
		addCommitScrollPane(componentPanel);

		final JPanel buttonPanel = new JPanel();
		buttonPanel.setLayout(mainLayout);

		buttonPanel.add(new JButton(GuiConstants.IMPLICIT_COMMIT_BUTTON_TEXT));
		buttonPanel.add(new JButton(GuiConstants.COMMIT_BUTTON_TEXT));

		// add the componentPanel to the content pane
		pane.add(componentPanel, BorderLayout.CENTER);
		pane.add(buttonPanel, BorderLayout.SOUTH);
	}

	/*
	 * addFileScrollPane: JPanel -> void
	 * 
	 * given a JPanel, this method will create a JScrollPane with its
	 * viewport set to a JList. The JList will need to be populated with
	 * the current File data using a ListModel.
	 * This JScrollPane will be added to the JPanel.
	 */
	private static void addFileScrollPane(JPanel panel) {
		final JList fileList = new JList(new String[] { "file1.txt", "file2.txt", "README.md", "src/Hello.py" });
		final JScrollPane fileScrollPane = new JScrollPane(fileList);
		fileScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		fileScrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		panel.add(fileScrollPane);
	}
	
	/*
	 * setScrollPaneContents: JScrollPane, ListModel -> void
	 * 
	 * given a JScrollPane and a ListModel, this method will update the
	 * contents of the JList that is displayed in the given JScrollPanel.
	 */
	public static void setScrollPaneContents(JScrollPane scrollPane, ListModel listModel) {
		
		final JList fileList = new JList(listModel);
		scrollPane.setViewportView(fileList);
	}
	
	/*
	 * setFileScrollPaneContents: ListModel -> void
	 * 
	 * given a ListModel object that contains the list contents for the
	 * JScrollPane's JList, this method will update the JList.
	 */
	public void setFileScrollPaneContents(ListModel listModel) {
		setScrollPaneContents(this.fileScrollPane, listModel);
	}

	/*
	 * addCommitScrollPane: JPanel -> void
	 * 
	 * given a JPanel, this method will create a JScrollPane with its
	 * viewport set to a JList. The JList will need to be populated with
	 * the current commit components using a ListModel. This JScrollPane
	 * will be added to the JPanel.
	 */
	private static void addCommitScrollPane(JPanel panel) {
		final JList commitList = new JList(new String[] { "file3.txt", "file4.txt" });
		final JScrollPane commitScrollPane = new JScrollPane(commitList);
		commitScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		commitScrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		panel.add(commitScrollPane);
	}
	
	private static void initialize(final JFrame frame) {
		
		try {
			UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
		} catch(UnsupportedLookAndFeelException e) {
			System.out.println(e.getMessage());
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (InstantiationException e) {
			System.out.println(e.getMessage());
		} catch (IllegalAccessException e) {
			System.out.println(e.getMessage());
		}
		UIManager.put("swing.boldMetal", Boolean.FALSE);

		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				createAndShowGUI(frame);
			}
		});
	}

	public static void main(String[] args) {
		
		BabouGui babouGui = new BabouGui(GuiConstants.FRAME_TITLE);
	}
}
