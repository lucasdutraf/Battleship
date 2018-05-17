package ep2_2018_1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MainMenu extends JFrame{
	
	private JButton Play;
	private JButton Instructions;
	private JButton Infos;
	private JLabel Rodape;

	public MainMenu() {
		
		super("Batalha Naval!");
		
		Play = new JButton("JOGAR");
		Instructions = new JButton("INSTRUÇÕES");
		Infos = new JButton("INFORMAÇÕES");
		
		setVisible(true);
		setLayout(new BoxLayout(parent, EXIT_ON_CLOSE));
		setSize(800,800);
		
		Play.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				
			}
		});
		
		Play.setAlignmentX(CENTER_ALIGNMENT);
		Instructions.setAlignmentX(CENTER_ALIGNMENT);
		Infos.setAlignmentX(CENTER_ALIGNMENT);
	 }
	 
}
