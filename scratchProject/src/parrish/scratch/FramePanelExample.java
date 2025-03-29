package parrish.scratch;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class FramePanelExample extends JFrame {
	static final int FRAME_WIDTH = 500;
	static final int FRAME_HEIGHT = 500;
	static final String FRAME_NAME = "Sample Application";
	static final boolean FRAME_RESIZABLE = true;
	
	private JButton b1, b2, b3;
	private JPanel panel1, panel2, panel3;
	private JLabel label1;
	
	public FramePanelExample() {
		setTitle(FRAME_NAME);
		setSize(FRAME_WIDTH, FRAME_HEIGHT);
		setResizable(FRAME_RESIZABLE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		b1 = new JButton("New");
		b2 = new JButton("Open");
		b3 = new JButton("Close");
		
		label1 = new JLabel("Please select an option:");
		
		panel1 = new JPanel();
		panel2 = new JPanel();
		panel3 = new JPanel();
		
		panel2.add(label1);
		
		panel1.add(b1);
		panel1.add(b2);
		panel1.add(b3);
		
		panel3.add(panel1);
		panel3.add(panel2);
		
		add(panel3);
	}
	
	public static void main(String[] args) {
		FramePanelExample myFrame = new FramePanelExample();
		
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.pack();
		myFrame.setVisible(true);
	}

}
