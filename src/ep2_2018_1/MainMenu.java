package ep2_2018_1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.BoxLayout;
import javax.swing.SwingConstants;
import java.awt.Component;

public class MainMenu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainMenu frame = new MainMenu();
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
	public MainMenu() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 519, 444);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnJogar = new JButton("JOGAR");
		btnJogar.setBounds(197, 79, 107, 23);
		contentPane.add(btnJogar);
		
		JButton btnInstructions = new JButton("INSTRU\u00C7\u00D5ES");
		btnInstructions.setBounds(197, 175, 107, 23);
		contentPane.add(btnInstructions);
		
		JButton btnInfos = new JButton("INFORMA\u00C7\u00D5ES");
		btnInfos.setBounds(197, 278, 107, 23);
		btnInfos.setAlignmentX(2.0f);
		btnInfos.setAlignmentY(2.0f);
		contentPane.add(btnInfos);
		
		JLabel footer = new JLabel("Lucas Dutra 17/0050939");
		footer.setBounds(10, 380, 127, 14);
		contentPane.add(footer);
		
	}
}
