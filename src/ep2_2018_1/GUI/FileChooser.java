package ep2_2018_1.GUI;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;

public class FileChooser extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldPath;
	
	public static String PathLoader = " ";
	
	public FileReaderClass fileclass = new FileReaderClass();
	public GameCanvas gg = new GameCanvas();

	
	public FileChooser() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 594, 388);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBackground(new Color(127, 255, 212));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);

		
		JLabel lblChooseMap = new JLabel("New label");
		lblChooseMap.setIcon(new ImageIcon(FileChooser.class.getResource("/ep2_2018_1/assets/chooseyourmap.jpg")));
		lblChooseMap.setBounds(25, 11, 521, 157);
		contentPane.add(lblChooseMap);
		
		textFieldPath = new JTextField();
		textFieldPath.setBounds(68, 232, 369, 20);
		contentPane.add(textFieldPath);
		textFieldPath.setColumns(10);
		
		JButton btnChoose = new JButton("Escolher");
		btnChoose.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnChooseActionPerformed(evt);
			}

			private void btnChooseActionPerformed(ActionEvent evt) {
				setPathInfo();
			}
		});

		btnChoose.setBounds(447, 231, 89, 23);
		contentPane.add(btnChoose);
		
		JButton btnAdvance = new JButton("Avançar");
		btnAdvance.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Login login = new Login();
				login.setVisible(true);
				dispose();
			}
		});
		btnAdvance.setBounds(412, 315, 89, 23);
		contentPane.add(btnAdvance);
		
		JButton btnBack = new JButton("Voltar");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainMenu mainmenu = new MainMenu();
				mainmenu.setVisible(true);
				dispose();
			}
		});
		btnBack.setBounds(25, 315, 89, 23);
		contentPane.add(btnBack);
		
		JButton btnpProccess = new JButton("Processar");
		btnpProccess.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println(PathLoader);
				fileclass.setPath(PathLoader);
				System.out.println(fileclass.getPath());
				fileclass.readFile(PathLoader);
				System.out.println("ALTURAAAAA" + gg.getHeight());
				System.out.println("SERA" + gg.getWidth());

			}
		});
		btnpProccess.setBounds(221, 315, 99, 23);
		contentPane.add(btnpProccess);
		
	}
	
	public void setPathInfo() {
		JFileChooser choosingFile = new JFileChooser();
		choosingFile.setFileSelectionMode(JFileChooser.FILES_ONLY);
		choosingFile.showOpenDialog(this);
		File file = choosingFile.getSelectedFile();
		textFieldPath.setText(file.getAbsolutePath());
		PathLoader = file.getAbsolutePath();
		System.out.println("TESTEEEEEE");
		System.out.println(PathLoader);


		
	}
}
