import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import javax.swing.*;

public class Tela extends JFrame {
	public Tela() {
		setTitle("Hora atual");
		setSize(600, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		
		initComponents();
	}
	
	public void initComponents() {
		ImageIcon imagemRelogio = new ImageIcon(getClass().getResource("/imagens/relogio-3d.png"));
		Image imagemRelogioResized = imagemRelogio.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
		imagemRelogio = new ImageIcon(imagemRelogioResized);
		
		JLabel labelImagemRelogio = new JLabel(imagemRelogio);
		labelImagemRelogio.setBorder(BorderFactory.createEmptyBorder(0, 20, 0, 40));
		
		JPanel painelDireita = new JPanel();
		painelDireita.setLayout(new BoxLayout(painelDireita, BoxLayout.Y_AXIS));
		
		JLabel titulo = new JLabel("A hora atual do sistema é:");
		titulo.setFont(new Font("SansSerif", Font.PLAIN, 22));
		titulo.setBorder(BorderFactory.createEmptyBorder(30, 0, 0, 0));
		
		JLabel horaSistema = new JLabel("--h --m --s");
		horaSistema.setFont(new Font("SansSerif", Font.BOLD, 32));
		horaSistema.setBorder(BorderFactory.createEmptyBorder(20, 0, 70, 0));
		horaSistema.setForeground(Color.decode("#c9c9c9"));
		
		JButton botaoCapturarHora = new JButton("Capturar hora do sistema");
		botaoCapturarHora.setFont(new Font("SansSerif", Font.PLAIN, 16));
		
		botaoCapturarHora.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				LocalTime horaAtual = LocalTime.now();
				DateTimeFormatter formatador = DateTimeFormatter.ofPattern("HH'h' mm'm' ss's'");
				horaSistema.setText(horaAtual.format(formatador));
				horaSistema.setForeground(Color.decode("#404040"));
			}
		});
		
		add(labelImagemRelogio, BorderLayout.WEST);
		
		painelDireita.add(titulo);
		painelDireita.add(horaSistema);
		painelDireita.add(botaoCapturarHora);
		add(painelDireita, BorderLayout.CENTER);
	}
}
