package ep2_2018_1.GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.JButton;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 594, 388);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(127, 88, 46, 14);
		contentPane.add(lblNome);
		
		textField = new JTextField();
		textField.setBounds(198, 85, 206, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNick = new JLabel("Nick:");
		lblNick.setBounds(127, 168, 46, 14);
		contentPane.add(lblNick);
		
		textField_1 = new JTextField();
		textField_1.setBounds(198, 165, 206, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblDificuldade = new JLabel("Dificuldade:");
		lblDificuldade.setBounds(127, 248, 56, 14);
		contentPane.add(lblDificuldade);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(237, 245, 130, 20);
		contentPane.add(spinner);
		
		JButton button = new JButton("<---");
		button.setBounds(10, 315, 89, 23);
		contentPane.add(button);
	}
}
