import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Test2 {

	private JFrame frame;
	private JTextField Number1Field;
	private JTextField Number2Field;
	private JTextField AnswerField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Test2 window = new Test2();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Test2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 580, 388);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Number1Field = new JTextField();
		Number1Field.setColumns(10);
		
		Number2Field = new JTextField();
		Number2Field.setColumns(10);
		
		JButton addButton = new JButton("ADD");
		addButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent argO) {
				
				int Number1,Number2,ans;
				try {
					Number1 = Integer.parseInt(Number1Field.getText());
					Number2 = Integer.parseInt(Number2Field.getText());
					
					ans = Number1+Number2;
					AnswerField.setText(Integer.toString(ans));
				} catch(Exception e) {
					JOptionPane.showMessageDialog(null, "Please enter valid number");
				}
			}
		});
		addButton.setFont(new Font("Tahoma", Font.PLAIN, 25));
		
		JButton MinusBotton = new JButton("MINUS");
		MinusBotton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int Number1,Number2,ans;
				try {
					Number1 = Integer.parseInt(Number1Field.getText());
					Number2 = Integer.parseInt(Number2Field.getText());
					
					ans = Number1-Number2;
					AnswerField.setText(Integer.toString(ans));
				} 	catch(Exception e1) {
					JOptionPane.showMessageDialog(null, "Please enter valid number");
				}
			}
			
		});
		MinusBotton.setFont(new Font("Tahoma", Font.PLAIN, 25));
		
		AnswerField = new JTextField();
		AnswerField.setColumns(10);
		
		JLabel AnswerLabel = new JLabel("The answer is");
		AnswerLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(44)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(AnswerLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
							.addComponent(addButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(Number1Field, GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)))
					.addGap(58)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(MinusBotton, GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
						.addComponent(AnswerField, Alignment.LEADING)
						.addComponent(Number2Field, GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE))
					.addGap(68))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(35)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(Number1Field, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)
						.addComponent(Number2Field, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE))
					.addGap(50)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(MinusBotton, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
						.addComponent(addButton, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(AnswerField, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
						.addComponent(AnswerLabel, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(25, Short.MAX_VALUE))
		);
		frame.getContentPane().setLayout(groupLayout);
	}
}
