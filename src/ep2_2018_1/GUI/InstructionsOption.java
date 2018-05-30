package ep2_2018_1.GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.JScrollBar;
import java.awt.Canvas;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Label;

public class InstructionsOption extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InstructionsOption frame = new InstructionsOption();
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
	public InstructionsOption() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 854, 589);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBackground(new Color(127, 255, 212));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblOnePosition = new JLabel("Ataca uma posi\u00E7\u00E3o do tabuleiro.");
		lblOnePosition.setFont(new Font("Yu Gothic", Font.PLAIN, 14));
		lblOnePosition.setBounds(248, 134, 281, 14);
		contentPane.add(lblOnePosition);
		
		JLabel lblDiscover = new JLabel("Descobre se h\u00E1 uma embarca\u00E7\u00E3o inimiga em uma \u00E1rea 2x2 do tabuleiro.\r\n");
		lblDiscover.setFont(new Font("Yu Gothic", Font.PLAIN, 14));
		lblDiscover.setBounds(248, 221, 506, 14);
		contentPane.add(lblDiscover);
		
		JLabel lblAreaAttack = new JLabel("Ataca uma \u00E1rea 2x2 do tabuleiro.");
		lblAreaAttack.setFont(new Font("Yu Gothic", Font.PLAIN, 14));
		lblAreaAttack.setBounds(248, 302, 336, 14);
		contentPane.add(lblAreaAttack);
		
		JLabel lblColumnOrLine = new JLabel("Ataca uma linha/coluna completa do tabuleiro.");
		lblColumnOrLine.setFont(new Font("Yu Gothic", Font.PLAIN, 14));
		lblColumnOrLine.setBounds(248, 386, 383, 14);
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
		
	}
}
