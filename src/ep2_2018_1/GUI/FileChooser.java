package ep2_2018_1.GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;
import java.awt.Button;
import java.awt.Color;
import java.awt.Canvas;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class FileChooser extends JFrame implements Runnable{

	private JPanel contentPane;
	private JTextField textFieldPath;
	private JTextField textField_1;
	private JButton btnComear;


			public void run() {
				try {
					FileChooser frame = new FileChooser();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}

	/**
	 * Create the frame.
	 */
	public FileChooser() {
		getContentPane().setLayout(null);
		
		textField_1 = new JTextField();
		textField_1.setBounds(71, 234, 218, 21);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 594, 388);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBackground(new Color(127, 255, 212));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textFieldPath = new JTextField();
		textFieldPath.setBounds(101, 239, 272, 20);
		contentPane.add(textFieldPath);
		textFieldPath.setColumns(10);
		
		JButton btnChoose = new JButton("Escolher ");
		btnChoose.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnChooseActionPerformed(evt);
			}

			private void btnChooseActionPerformed(ActionEvent evt) {
				JFileChooser choosingFile = new JFileChooser();
				choosingFile.setFileSelectionMode(JFileChooser.FILES_ONLY);
				choosingFile.showOpenDialog(null);
				File file = choosingFile.getSelectedFile();
				textFieldPath.setText(file.getPath());
				
			}
		});
		btnChoose.setBounds(383, 238, 89, 23);
		contentPane.add(btnChoose);
		
		btnComear = new JButton("Come\u00E7ar!");
		btnComear.setBounds(221, 315, 89, 23);
		contentPane.add(btnComear);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(FileChooser.class.getResource("/ep2_2018_1/images/chooseyourmap.jpg")));
		lblNewLabel.setBounds(10, 23, 521, 157);
		contentPane.add(lblNewLabel);
                              

	}
}
