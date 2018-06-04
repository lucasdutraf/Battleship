package ep2_2018_1.GUI;



import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class InstructionsOption extends JFrame{

	private JPanel contentPane;

	public InstructionsOption() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 854, 589);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBackground(new Color(127, 255, 212));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel lblOnePosition = new JLabel("Ataca uma posi\u00E7\u00E3o do tabuleiro.");
		lblOnePosition.setFont(new Font("Yu Gothic", Font.PLAIN, 14));
		lblOnePosition.setBounds(377, 133, 336, 14);
		contentPane.add(lblOnePosition);
		
		JLabel lblDiscover = new JLabel("Descobre se h\u00E1 uma embarca\u00E7\u00E3o inimiga em uma \u00E1rea 2x2 do tabuleiro.\r\n");
		lblDiscover.setFont(new Font("Yu Gothic", Font.PLAIN, 14));
		lblDiscover.setBounds(331, 221, 473, 14);
		contentPane.add(lblDiscover);
		
		JLabel lblAreaAttack = new JLabel("Ataca uma \u00E1rea 2x2 do tabuleiro.");
		lblAreaAttack.setFont(new Font("Yu Gothic", Font.PLAIN, 14));
		lblAreaAttack.setBounds(362, 302, 336, 14);
		contentPane.add(lblAreaAttack);
		
		JLabel lblColumnOrLine = new JLabel("Ataca uma linha/coluna completa do tabuleiro.");
		lblColumnOrLine.setFont(new Font("Yu Gothic", Font.PLAIN, 14));
		lblColumnOrLine.setBounds(362, 386, 383, 14);
		contentPane.add(lblColumnOrLine);
		
		JButton btnBack = new JButton("Voltar");
		btnBack.setFont(new Font("Top Secret", Font.PLAIN, 11));
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainMenu main = new MainMenu();
				main.setVisible(true);
				dispose();
			}
		});
		btnBack.setBounds(10, 489, 89, 23);
		contentPane.add(btnBack);
		
		JButton btnSair = new JButton("Sair");
		btnSair.setFont(new Font("Top Secret", Font.PLAIN, 11));
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnSair.setBounds(727, 489, 89, 23);
		contentPane.add(btnSair);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(InstructionsOption.class.getResource("/ep2_2018_1/images/vara.png")));
		lblNewLabel.setBounds(139, 116, 50, 50);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(InstructionsOption.class.getResource("/ep2_2018_1/images/redepesca.png")));
		lblNewLabel_1.setBounds(139, 285, 50, 50);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon(InstructionsOption.class.getResource("/ep2_2018_1/images/redechinesa.jpg")));
		lblNewLabel_2.setBounds(139, 369, 50, 50);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon(InstructionsOption.class.getResource("/ep2_2018_1/images/lantern.png")));
		lblNewLabel_3.setBounds(139, 204, 50, 50);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblFirstTitle = new JLabel("Vara de pescar:");
		lblFirstTitle.setFont(new Font("Yu Gothic", Font.BOLD, 14));
		lblFirstTitle.setBounds(256, 134, 111, 14);
		contentPane.add(lblFirstTitle);
		
		JLabel lblSecondTitle = new JLabel("Lanterna:");
		lblSecondTitle.setFont(new Font("Yu Gothic", Font.BOLD, 14));
		lblSecondTitle.setBounds(256, 222, 65, 14);
		contentPane.add(lblSecondTitle);
		
		JLabel lblThirdTitle = new JLabel("Rede Comum:");
		lblThirdTitle.setFont(new Font("Yu Gothic", Font.BOLD, 14));
		lblThirdTitle.setBounds(256, 303, 96, 14);
		contentPane.add(lblThirdTitle);
		
		JLabel lblFourthTitle = new JLabel("Rede Chinesa:");
		lblFourthTitle.setFont(new Font("Yu Gothic", Font.BOLD, 14));
		lblFourthTitle.setBounds(256, 387, 98, 14);
		contentPane.add(lblFourthTitle);
		
	}
}
