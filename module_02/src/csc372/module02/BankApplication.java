package csc372.module02;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class BankApplication extends JFrame implements ActionListener {

	static final int FRAME_WIDTH = 250;
	static final int FRAME_HEIGHT = 250;
	static final String FRAME_NAME = "Bank Application";
	static final boolean FRAME_RESIZABLE = false;
	static final int PADDING = 10;
	
	//private JFrame mainFrame = new JFrame();
	private JPanel pnlMainArea;	
	private JTextField balanceEntryField;
	private JTextField balanceChangeField;
	private JLabel balancePrompt;
	private JLabel balanceLabel;
	private JButton enterBalanceButton;
	private JButton depositButton;
	private JButton withdrawButton;
	private JButton resetButton;
	private Insets globalInsets;
	
	private double balance;
	
	public BankApplication() {
		GridBagConstraints positionConstraints = null;
		globalInsets = new Insets(PADDING, PADDING, PADDING, PADDING);
		
		setTitle(FRAME_NAME);
		setSize(FRAME_WIDTH, FRAME_HEIGHT);
		setResizable(FRAME_RESIZABLE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		balancePrompt = new JLabel("Initial Balance:");
		// set the label with a space to prevent the form from changing when the text is set
		balanceLabel = new JLabel(" "); 

		balanceEntryField = new JTextField(15);
		balanceEntryField.setEditable(true);
		balanceEntryField.setText("");
		
		enterBalanceButton = new JButton("Save Initial Balance");
		enterBalanceButton.addActionListener(this);
	
		balanceChangeField = new JTextField(15);
		balanceChangeField.setEditable(false);
		balanceChangeField.setText("");
				
		depositButton = new JButton("Deposit");
		depositButton.addActionListener(this);
		depositButton.setEnabled(false);
		
		withdrawButton = new JButton("Withdraw");
		withdrawButton.addActionListener(this);
		withdrawButton.setEnabled(false);
		
		resetButton = new JButton("Reset");
		resetButton.addActionListener(this);
		resetButton.setEnabled(false);
		
		// use grid bag layout
		pnlMainArea = new JPanel(new GridBagLayout());		
		
		positionConstraints = new GridBagConstraints();
		
		// specify component's grid location
		positionConstraints.gridx = 0;
		positionConstraints.gridy = 0;
		
		// create padding around components
		positionConstraints.insets = globalInsets;
		
		pnlMainArea.add(balancePrompt, positionConstraints);
		
		positionConstraints.gridx += 1;
		
		pnlMainArea.add(balanceEntryField, positionConstraints);
		
		positionConstraints.gridx += 1;
		
		pnlMainArea.add(enterBalanceButton, positionConstraints);
		
		positionConstraints.gridx = 1;
		positionConstraints.gridy = 1;
		
		pnlMainArea.add(balanceLabel, positionConstraints);
		
		positionConstraints.gridy += 1;
		
		pnlMainArea.add(balanceChangeField, positionConstraints);
		
		positionConstraints.gridx = 0;
		positionConstraints.gridy += 1;
		
		pnlMainArea.add(depositButton, positionConstraints);
		
		positionConstraints.gridx += 1;
		
		pnlMainArea.add(withdrawButton, positionConstraints);
		
		positionConstraints.gridx += 1;
		
		pnlMainArea.add(resetButton, positionConstraints);
		
		add(pnlMainArea);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == enterBalanceButton) {
			try {
				balance = Double.parseDouble(balanceEntryField.getText());
				
				balanceLabel.setText(String.format("%.2f", balance));
				enterBalanceButton.setEnabled(false);
				balanceEntryField.setEnabled(false);
				balanceEntryField.setEditable(false);
				balanceEntryField.setText(balanceEntryField.getText());
				
				balanceChangeField.setEditable(true);
				depositButton.setEnabled(true);
				withdrawButton.setEnabled(true);
				resetButton.setEnabled(true);
				
			} catch(Exception ex) {
				balanceLabel.setText("Invalid starting balance, please try again");
				balanceEntryField.setText(" ");
			}
			
		} else if(e.getSource() == depositButton) {
			balance = balance + Double.parseDouble(balanceChangeField.getText());
			balanceLabel.setText(String.format("%.2f", balance));
			
		} else if(e.getSource() == withdrawButton) {
			balance = balance - Double.parseDouble(balanceChangeField.getText());
			balanceLabel.setText(String.format("%.2f", balance));
		} else if(e.getSource() == resetButton) {
			balanceLabel.setText("0.00");
			enterBalanceButton.setEnabled(true);
			balanceEntryField.setEnabled(true);
			balanceEntryField.setEditable(true);
			balanceEntryField.setText(balanceEntryField.getText());
			
			balanceChangeField.setText("");
			balanceChangeField.setEditable(false);
			depositButton.setEnabled(false);
			withdrawButton.setEnabled(false);
			resetButton.setEnabled(false);
		}
	}
	
	public static void main(String[] args) {
		BankApplication myFrame = new BankApplication();
		
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.pack();
		myFrame.setVisible(true);
		
	}	
}
