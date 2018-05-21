package ep2_2018_1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.JScrollBar;
import java.awt.Canvas;

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
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblOnePosition = new JLabel("Atacar uma posi\u00E7\u00E3o do tabuleiro.");
		lblOnePosition.setBounds(248, 134, 281, 14);
		contentPane.add(lblOnePosition);
		
		JLabel lblDiscover = new JLabel("Descobrir se h\u00E1 uma embarca\u00E7\u00E3o inimiga em uma \u00E1rea 2x2 do tabuleiro.\r\n");
		lblDiscover.setBounds(248, 221, 359, 14);
		contentPane.add(lblDiscover);
		
		JLabel lblAreaAttack = new JLabel("Ataca uma \u00E1rea 2x2 do tabuleiro.");
		lblAreaAttack.setBounds(248, 302, 336, 14);
		contentPane.add(lblAreaAttack);
		
		JLabel lblColumnOrLine = new JLabel("Atacar uma linha/coluna completa do tabuleiro.");
		lblColumnOrLine.setBounds(248, 386, 383, 14);
		contentPane.add(lblColumnOrLine);
		
	}
}
