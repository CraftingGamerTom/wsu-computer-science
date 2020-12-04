package InClass;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class tally {

	static int tally = 0;
	public static void main(String[] args) {
		
		
		 JLabel countLabel = new JLabel(Integer.toString(tally));
		 countLabel.setBounds(135, 50, 150, 20);
		
		final int WINDOW_WIDTH = 600;
		final int WINDOW_HEIGHT = 200;
		JFrame window = new JFrame();
		window.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

		//Panel for button
		JPanel buttonPanel = new JPanel();
		//creates Tally Raising button
		JButton button = new JButton("Raise");
		//creates reset button
		JButton reset = new JButton("Reset");
		
		reset.setPreferredSize(new Dimension(80,40));
		reset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent reset){
				//reset counter
				countLabel.setText(Integer.toString(tally = 0));
			}
		});
        
		button.setPreferredSize(new Dimension(80,40));
		button.addActionListener(new ActionListener() {

			  public void actionPerformed(ActionEvent event) {
			    //do whatever should happen when the button is clicked...
				  countLabel.setText(Integer.toString(++tally));
				  
			  }

			});
		
		buttonPanel.add(button);
		buttonPanel.add(reset);
        buttonPanel.setMinimumSize(new java.awt.Dimension(200, 100));
        
		window.setContentPane(buttonPanel);
        window.getContentPane().setBackground(Color.gray);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setTitle("Tally Counter");
		window.add(button);
		window.add(reset);
        window.add(countLabel);
		window.setVisible(true);
		window.setResizable(false);
        
		}
		
}
