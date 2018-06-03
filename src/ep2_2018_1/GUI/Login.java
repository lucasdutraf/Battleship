package ep2_2018_1.GUI;



import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class Login extends JFrame{

	private JPanel contentPane;
	private JTextField nameField;
	private JTextField nickField;

	public Login() {
		setBackground(new Color(100, 149, 237));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 594, 388);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(127, 255, 212));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setFont(new Font("Top Secret", Font.PLAIN, 14));
		lblNome.setBounds(127, 88, 46, 14);
		contentPane.add(lblNome);
		
		nameField = new JTextField();
		nameField.setBounds(198, 85, 206, 20);
		contentPane.add(nameField);
		nameField.setColumns(10);
		
		JLabel lblNick = new JLabel("Nick:");
		lblNick.setFont(new Font("Top Secret", Font.PLAIN, 14));
		lblNick.setBounds(127, 168, 46, 14);
		contentPane.add(lblNick);
		
		nickField = new JTextField();
		nickField.setBounds(198, 165, 206, 20);
		contentPane.add(nickField);
		nickField.setColumns(10);
		
		JLabel lblLevel = new JLabel("Dificuldade:");
		lblLevel.setFont(new Font("Top Secret", Font.PLAIN, 14));
		lblLevel.setBounds(114, 248, 113, 14);
		contentPane.add(lblLevel);
		
		JButton btnBack = new JButton("Voltar");
		btnBack.setFont(new Font("Top Secret", Font.PLAIN, 11));
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MainMenu main = new MainMenu();
				main.setVisible(true);
				dispose();
			}
		});
		btnBack.setBounds(10, 315, 89, 23);
		contentPane.add(btnBack);
		
		JButton btnExit = new JButton("Sair");
		btnExit.setFont(new Font("Top Secret", Font.PLAIN, 11));
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnExit.setBounds(459, 315, 89, 23);
		contentPane.add(btnExit);
		
		JButton btnJogar = new JButton("Jogar");
		btnJogar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				FileChooser fc = new FileChooser();
//				fc.setVisible(true);
//				dispose();
				FileChooser filechooser = new FileChooser();
				filechooser.setVisible(true);
			}
		});
		btnJogar.setFont(new Font("Top Secret", Font.PLAIN, 11));
		btnJogar.setBounds(216, 315, 89, 23);
		contentPane.add(btnJogar);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Iniciante", "Experiente", "Insano"}));
		comboBox.setBounds(216, 242, 188, 20);
		contentPane.add(comboBox);
	}
}
