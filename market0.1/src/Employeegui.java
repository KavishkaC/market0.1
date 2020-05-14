import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.SystemColor;
import java.awt.Font;

public class Employeegui {

	private JFrame frmEmployeemarket;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_3;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Employeegui window = new Employeegui();
					window.frmEmployeemarket.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Employeegui() {
		initialize();

	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmEmployeemarket = new JFrame();
		frmEmployeemarket.setTitle("Employee-market1.0");
		frmEmployeemarket.getContentPane().setBackground(Color.DARK_GRAY);
		frmEmployeemarket.getContentPane().setLayout(null);
		JLabel lblNewLabel_4 = new JLabel("0.00");
		JLabel lblNewLabel_1 = new JLabel("Item ID :");
		JLabel lblNewLabel_2 = new JLabel("Qty :");
		Employee newemp = new Employee();

		
		textField = new JTextField();
		textField.setBounds(466, 37, 107, 20);
		frmEmployeemarket.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(599, 37, 89, 20);
		frmEmployeemarket.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("Add item");
		btnNewButton_1.setBackground(SystemColor.textHighlight);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//lblNewLabel_4.setText("HI");
				//newemp.updateProduct();
				
			
				
				
				try {
					
					double total=Double.parseDouble(lblNewLabel_4.getText());
					String id = textField.getText();
					int qty = Integer.parseInt(textField_1.getText());
					double tot=newemp.billItem(id, qty);
					String newtot=Double.toString(total+tot);
					lblNewLabel_4.setText(newtot);
					textField.setText("");
					textField_1.setText("");
					textField.requestFocus();
					
					
					
				}catch(Exception e1) {
					JOptionPane.showMessageDialog(null, "Enter a valid value");
				}
				
				
			}
		});
		btnNewButton_1.setBounds(599, 68, 89, 23);
		frmEmployeemarket.getContentPane().add(btnNewButton_1);
		
		
		lblNewLabel_1.setForeground(Color.LIGHT_GRAY);
		lblNewLabel_1.setBounds(466, 12, 46, 14);
		frmEmployeemarket.getContentPane().add(lblNewLabel_1);
		
		
		lblNewLabel_2.setForeground(Color.LIGHT_GRAY);
		lblNewLabel_2.setBounds(599, 12, 46, 14);
		frmEmployeemarket.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Total");
		lblNewLabel_3.setForeground(SystemColor.textHighlight);
		lblNewLabel_3.setBounds(506, 143, 46, 14);
		frmEmployeemarket.getContentPane().add(lblNewLabel_3);
		
		
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_4.setForeground(SystemColor.textHighlight);
		lblNewLabel_4.setBounds(575, 141, 78, 14);
		frmEmployeemarket.getContentPane().add(lblNewLabel_4);
		
		textField_3 = new JTextField();
		textField_3.setBackground(Color.DARK_GRAY);
		textField_3.setBounds(10, 66, 435, 105);
		frmEmployeemarket.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnNewButton = new JButton("Remove Item");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
		try {
					
					double total=Double.parseDouble(lblNewLabel_4.getText());
					String id = textField.getText();
					int qty = Integer.parseInt(textField_1.getText());
					double tot=newemp.billItem(id, qty);
					String newtot=Double.toString(total-tot);
					lblNewLabel_4.setText(newtot);
					textField.setText("");
					textField_1.setText("");
					textField.requestFocus();
					
					
					
				}catch(Exception e1) {
					JOptionPane.showMessageDialog(null, "Enter a valid value");
				}
				
				
			}
		});
		btnNewButton.setBackground(SystemColor.textHighlight);
		btnNewButton.setBounds(463, 68, 110, 23);
		frmEmployeemarket.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Cash");
		lblNewLabel.setForeground(SystemColor.textHighlight);
		lblNewLabel.setBounds(506, 198, 110, 14);
		frmEmployeemarket.getContentPane().add(lblNewLabel);
		
		textField_2 = new JTextField();
		textField_2.setBounds(599, 195, 86, 20);
		frmEmployeemarket.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("LKR");
		lblNewLabel_5.setForeground(SystemColor.textHighlight);
		lblNewLabel_5.setBounds(663, 143, 46, 14);
		frmEmployeemarket.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Change");
		lblNewLabel_6.setForeground(SystemColor.textHighlight);
		lblNewLabel_6.setBounds(506, 259, 46, 14);
		frmEmployeemarket.getContentPane().add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("0.00");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_7.setForeground(SystemColor.textHighlight);
		lblNewLabel_7.setBounds(575, 259, 89, 14);
		frmEmployeemarket.getContentPane().add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("LKR");
		lblNewLabel_8.setForeground(SystemColor.textHighlight);
		lblNewLabel_8.setBounds(663, 259, 46, 14);
		frmEmployeemarket.getContentPane().add(lblNewLabel_8);
		
		JButton btnNewButton_2 = new JButton("Print Bill");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				Double tot=Double.parseDouble(lblNewLabel_4.getText());
				Double cash=Double.parseDouble(textField_2.getText());
				String balance=Double.toString(cash-tot);
				lblNewLabel_7.setText(balance);
				
				}catch(Exception e1) {
				
					JOptionPane.showMessageDialog(null, "Enter a valid value");
			
				}
			}
		});
		btnNewButton_2.setBackground(SystemColor.textHighlight);
		btnNewButton_2.setForeground(SystemColor.desktop);
		btnNewButton_2.setBounds(466, 311, 222, 23);
		frmEmployeemarket.getContentPane().add(btnNewButton_2);
		
		JLabel lblNewLabel_9 = new JLabel("Hi! Have a good day!");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_9.setForeground(SystemColor.textHighlight);
		lblNewLabel_9.setBounds(10, 12, 177, 45);
		frmEmployeemarket.getContentPane().add(lblNewLabel_9);
		frmEmployeemarket.setBounds(100, 100, 725, 478);
		frmEmployeemarket.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
