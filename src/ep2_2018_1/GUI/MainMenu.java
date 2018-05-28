package ep2_2018_1.GUI;

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
import javax.swing.ImageIcon;
import java.awt.Color;

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
		setForeground(Color.CYAN);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 854, 589);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(127, 255, 212));
		contentPane.setForeground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnPlay = new JButton("JOGAR");
		btnPlay.setBounds(324, 281, 137, 23);
		contentPane.add(btnPlay);
		
		JButton btnInstructions = new JButton("INSTRU\u00C7\u00D5ES");
		btnInstructions.setBounds(324, 361, 137, 23);
		contentPane.add(btnInstructions);
		
		JButton btnInfos = new JButton("PLACARES");
		btnInfos.setBounds(324, 445, 137, 23);
		btnInfos.setAlignmentX(2.0f);
		btnInfos.setAlignmentY(2.0f);
		contentPane.add(btnInfos);
		
		JLabel footer = new JLabel("Lucas Dutra 17/0050939");
		footer.setBounds(10, 525, 183, 14);
		contentPane.add(footer);
		
		JLabel lblTheme = new JLabel("New label");
		lblTheme.setIcon(new ImageIcon(MainMenu.class.getResource("/ep2_2018_1/images/Theme.png")));
		lblTheme.setBounds(115, 35, 585, 191);
		contentPane.add(lblTheme);
		
	}
}
