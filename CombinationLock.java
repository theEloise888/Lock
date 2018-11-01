
/**
 * Program:			CombinationLock.java
 * Author:			Eloise Lin
 * Date:			Apr 6, 2018
 * Description:		Creating a GUI for a combination lock game		
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CombinationLock extends JFrame
{
	// Declare instance fields
	private JPanel topPanel, bottomPanel;
	private JButton[] buttons;
	private JTextField txtInput2, txtLock;
	private JLabel txtInput;
	private Font font;

	public CombinationLock()
	{
		super("Eloise's Combination Lock:");

		// set layout manager JFRAME
		this.setLayout(new BorderLayout());

		// Create a customized font
		font = new Font("SansSerif", Font.BOLD, 16);

		// create a top panel to hold buttons
		buildTopPanel();

		// crete a bottom panel to hold other components
		buildBottomPanel();

		// Add text area and panel to frame
		add(topPanel, BorderLayout.NORTH);
		this.add(bottomPanel, BorderLayout.CENTER);

		// Set up methods for the frame
		this.setSize(300, 200);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	/*
	 * Method: buildTopPanel Purpose: Parameters: Returns: void
	 */
	public void buildTopPanel()
	{
		// Create panel
		topPanel = new JPanel();
		topPanel.setLayout(new GridLayout(2, 5));
		topPanel.setBackground(new Color(255, 255, 255));

		// Create a button array
		buttons = new JButton[10];
		// Create JButton components and add them to the array and add a border to each
		// button
		for (int x = 0; x < buttons.length; x++)
		{
			buttons[x] = new JButton("" + x);
		}

		// Add all buttons to panel
		topPanel.add(buttons[0]);
		for (int x = 1; x < buttons.length; x++)
			topPanel.add(buttons[x]);

	}

	/*
	 * Method: buildBottomPanel Purpose: Parameters: Returns: void
	 */
	public void buildBottomPanel()
	{

		bottomPanel = new JPanel();
		bottomPanel.setLayout(new GridLayout(3, 1));

		// Create text area
		txtInput = new JLabel();
		// txtInput.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY, 2));
		bottomPanel.setBackground(Color.cyan);

		// add components to the bottom panel
		JLabel firstLbl = new JLabel("Here is your 3-key lock combination:");
		firstLbl.setFont(font);
		
		//add two text fields
		txtInput2 = new JTextField();
		txtLock = new JTextField();

		// ADD THEM IN THIS ORDER
		bottomPanel.add(firstLbl);
		bottomPanel.add(txtInput2);
		bottomPanel.add(txtLock);

		this.setVisible(true);

	}

	private static void setLookAndFeel()
	{
		try
		{
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
		} catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
	}// End of setLookAndFeel method

	// Add an embedded main method for testing
	public static void main(String[] args)
	{
		// Creates an instance of the frame
		setLookAndFeel();
		CombinationLock frame = new CombinationLock();
	}// End of main method

}
