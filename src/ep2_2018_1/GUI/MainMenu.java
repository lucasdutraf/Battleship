package ep2_2018_1.GUI;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainMenu extends JFrame{
	
	public final FileChooser filechooser = new FileChooser();

	public GameCanvas a = new GameCanvas();
	
	private JPanel contentPane;


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
		setLocationRelativeTo(null);

		
		JButton btnPlay = new JButton("JOGAR");
		btnPlay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				filechooser.readFile();
				filechooser.setVisible(false);
			}
		});
		btnPlay.setFont(new Font("Top Secret", Font.PLAIN, 11));
		btnPlay.setBounds(324, 281, 137, 23);
		contentPane.add(btnPlay);
		
		JButton btnInstructions = new JButton("COMO JOGAR");
		btnInstructions.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InstructionsOption howto = new InstructionsOption();
				howto.setVisible(true);
				dispose();
			}
		});
		btnInstructions.setFont(new Font("Top Secret", Font.PLAIN, 11));
		btnInstructions.setBounds(324, 361, 137, 23);
		contentPane.add(btnInstructions);
		
		JButton btnInfos = new JButton("PLACARES");
		btnInfos.setFont(new Font("Top Secret", Font.PLAIN, 11));
		btnInfos.setBounds(324, 445, 137, 23);
		btnInfos.setAlignmentX(2.0f);
		btnInfos.setAlignmentY(2.0f);
		contentPane.add(btnInfos);
		
		JLabel footer = new JLabel("Lucas Dutra 17/0050939");
		footer.setFont(new Font("Magneto", Font.PLAIN, 11));
		footer.setBounds(10, 525, 183, 14);
		contentPane.add(footer);
		
		JLabel lblTheme = new JLabel("New label");
		lblTheme.setIcon(new ImageIcon(MainMenu.class.getResource("/ep2_2018_1/assets/Theme.png")));
		lblTheme.setBounds(115, 35, 585, 191);
		contentPane.add(lblTheme);
		
		JButton btnDfsdfas = new JButton("dfsdfas");
		btnDfsdfas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println(a.getHeight());
			}
		});
		btnDfsdfas.setBounds(27, 324, 89, 23);
		contentPane.add(btnDfsdfas);
		
	}
}
