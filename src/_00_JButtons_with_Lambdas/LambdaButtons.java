package _00_JButtons_with_Lambdas;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class LambdaButtons {
	private JFrame window = new JFrame();
	private JButton addNumbers = new JButton("ADD 2 Numbers");
	private JButton randNumber = new JButton("RANDOM NUMBER");
	private JButton tellAJoke = new JButton("TELL A JOKE");
	
	public LambdaButtons() {
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setLayout(new FlowLayout());
		window.add(addNumbers);
		window.add(randNumber);
		window.add(tellAJoke);
		
		//1. Call the addActionListener methods for each button. Use lambdas
		//   to define to functionality of the buttons.
		addNumbers.addActionListener((ActionEvent e) -> {
			int n1 = (int) (Math.random() * 10);
			int n2 = (int) (Math.random() * 10);
			JOptionPane.showMessageDialog(null, n1 + " + " + n2 + " = " + (n1 + n2));
		});
		
		randNumber.addActionListener((ActionEvent e) -> {
			JOptionPane.showMessageDialog(null, (int) (Math.random() * 100));
		});
		
		tellAJoke.addActionListener((ActionEvent e) -> {
			JOptionPane.showMessageDialog(null, "Why was 6 afraid of 7?");
			JOptionPane.showMessageDialog(null, "Because 7 ate 9!");
		});
		
		window.setVisible(true);
		window.pack();
	}
	
	public static void main(String[] args) {
		new LambdaButtons();
	}
	
	
}
