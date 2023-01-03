package percentageCalculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Frame2 {

	private JFrame frmLenghtconverter;
	private JTextField Input1;
	private JTextField input2;
	private JTextField output;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame2 window = new Frame2();
					window.frmLenghtconverter.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Frame2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmLenghtconverter = new JFrame();
		frmLenghtconverter.setTitle("Percentage Calculator");
		frmLenghtconverter.getContentPane().setFont(new Font("Verdana", Font.PLAIN, 20));
		frmLenghtconverter.setBounds(100, 100, 671, 282);
		frmLenghtconverter.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLenghtconverter.getContentPane().setLayout(null);
		
		JLabel lblExplain = new JLabel("This app calculates the given percentage of a given value.");
		lblExplain.setFont(new Font("Verdana", Font.PLAIN, 20));
		lblExplain.setBounds(20, 9, 823, 51);
		frmLenghtconverter.getContentPane().add(lblExplain);
		
		Input1 = new JTextField();
		Input1.setFont(new Font("Verdana", Font.PLAIN, 20));
		Input1.setBounds(20, 87, 123, 38);
		frmLenghtconverter.getContentPane().add(Input1);
		Input1.setColumns(10);
		
		JLabel lblInstruction2 = new JLabel("%   of");
		lblInstruction2.setFont(new Font("Verdana", Font.PLAIN, 20));
		lblInstruction2.setBounds(153, 87, 85, 38);
		frmLenghtconverter.getContentPane().add(lblInstruction2);
		
		input2 = new JTextField();
		input2.setFont(new Font("Verdana", Font.PLAIN, 20));
		input2.setBounds(236, 87, 123, 38);
		frmLenghtconverter.getContentPane().add(input2);
		input2.setColumns(10);
		
		JButton btnConvert = new JButton("Calculate");
		btnConvert.setForeground(new Color(255, 255, 255));
		btnConvert.setBackground(new Color(128, 128, 128));
		btnConvert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double val1, val2;
				
				try {
					val1 = Double.parseDouble(Input1.getText());
					val2 = Double.parseDouble(input2.getText());
					
					output.setText(CalcoloPercentuale.calcolaPercentuale(val1, val2));
					
				}catch(Exception ex) {
					
					output.setText("Invalid values");
				}
				
			}
		});
		btnConvert.setFont(new Font("Verdana", Font.BOLD, 20));
		btnConvert.setBounds(400, 81, 225, 51);
		frmLenghtconverter.getContentPane().add(btnConvert);
		
		output = new JTextField();
		output.setFont(new Font("Verdana", Font.PLAIN, 21));
		output.setBounds(20, 164, 405, 43);
		frmLenghtconverter.getContentPane().add(output);
		output.setColumns(10);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setForeground(new Color(255, 255, 255));
		btnReset.setBackground(new Color(128, 128, 128));
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Input1.setText("");
				input2.setText("");
				output.setText("");
			}
		});
		btnReset.setFont(new Font("Verdana", Font.BOLD, 20));
		btnReset.setBounds(450, 164, 175, 43);
		frmLenghtconverter.getContentPane().add(btnReset);
	}
}
