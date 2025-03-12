import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import java.awt.Component;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel layout;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
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
	public Main() {
		setTitle("Meu primeiro app em Java Swing");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 300);
		layout = new JPanel();
		layout.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(layout);
		layout.setLayout(new BoxLayout(layout, BoxLayout.Y_AXIS));
		layout.setBorder(BorderFactory.createEmptyBorder(20, 30, 20, 30));
		
		// criação da label, configuração de fonte e adição ao frame
		JLabel lblMensagem = new JLabel("A nossa mensagem irá aparecer aqui!");
		lblMensagem.setFont(new Font("Inter", Font.PLAIN, 20));
		layout.add(lblMensagem);
		
		layout.add(Box.createVerticalStrut(20)); // espaçamento entre a label e o botão
		
		/*
		 * criação de botão,
		 * adição de actionListener para disparar um evento,
		 * configuração de fonte e margem,
		 * adição do botão ao frame
		 */
		JButton btnBotao = new JButton("Clique em mim!");
		btnBotao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblMensagem.setText("Olá, Mundo!");
			}
		});
		btnBotao.setFont(new Font("Inter", Font.PLAIN, 12));
		btnBotao.setMargin(new Insets(5, 12, 5, 12));
		btnBotao.setContentAreaFilled(false);
		btnBotao.setFocusPainted(false);
		layout.add(btnBotao);
	}

}
