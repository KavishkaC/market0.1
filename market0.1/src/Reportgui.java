import java.awt.EventQueue;


import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileSystemView;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.SystemColor;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Reportgui {

	private JFrame frmReportsmarket;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Reportgui window = new Reportgui();
					window.frmReportsmarket.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Reportgui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmReportsmarket = new JFrame();
		frmReportsmarket.setTitle("Reports-market1.0");
		frmReportsmarket.getContentPane().setBackground(Color.DARK_GRAY);
		frmReportsmarket.setBackground(Color.DARK_GRAY);
		frmReportsmarket.setBounds(100, 100, 616, 390);
		frmReportsmarket.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmReportsmarket.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Generate Product Report ");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String path=textField.getText();
				Report.generateProductReport(path);
				
			}
		});
		btnNewButton.setBackground(SystemColor.textHighlight);
		btnNewButton.setBounds(159, 133, 294, 23);
		frmReportsmarket.getContentPane().add(btnNewButton);
		
		textField = new JTextField();
		textField.setBounds(159, 101, 201, 20);
		frmReportsmarket.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("Browse");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser jfc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
				jfc.setDialogTitle("Choose a directory to save your file: ");
				jfc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);

				int returnValue = jfc.showSaveDialog(null);
				if (returnValue == JFileChooser.APPROVE_OPTION) {
					if (jfc.getSelectedFile().isDirectory()) {
						String path=jfc.getSelectedFile().getPath();
						textField.setText(path);
						
						
					}
				}
			}
		});
		btnNewButton_1.setBounds(364, 100, 89, 23);
		frmReportsmarket.getContentPane().add(btnNewButton_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(159, 185, 201, 20);
		frmReportsmarket.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton_2 = new JButton("Browse");
		btnNewButton_2.setBounds(364, 184, 89, 23);
		frmReportsmarket.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Generate Employee Report");
		btnNewButton_3.setBackground(SystemColor.textHighlight);
		btnNewButton_3.setBounds(159, 216, 294, 23);
		frmReportsmarket.getContentPane().add(btnNewButton_3);
		

		
		
		
	}

}
