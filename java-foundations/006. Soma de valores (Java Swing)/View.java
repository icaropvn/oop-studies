import java.awt.*;
import javax.swing.*;

public class View extends JFrame {
	private JTextField inputNum1;
	private JTextField inputNum2;
	private JButton resultButton;
	private JLabel resultLabel;
	
	public View() {
		setTitle("Somar Valores");
		setSize(500, 250);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridBagLayout());
		
		initComponents();
	}
	
	public void initComponents() {
		JPanel mainPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 20, 0));
		
		inputNum1 = new JTextField(3);
		inputNum1.setMargin(new Insets(3, 3, 3, 3));
		
		JLabel plusLabel = new JLabel("+");
		plusLabel.setFont(new Font("SansSerif", Font.PLAIN, 18));
		
		inputNum2 = new JTextField(3);
		inputNum2.setMargin(new Insets(3, 3, 3, 3));
		
		resultButton = new JButton("=");
		
		resultLabel = new JLabel("0");
		resultLabel.setFont(new Font("SansSerif", Font.PLAIN, 18));
		
		mainPanel.add(inputNum1);
		mainPanel.add(plusLabel);
		mainPanel.add(inputNum2);
		mainPanel.add(resultButton);
		mainPanel.add(resultLabel);
		
		GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        
        add(mainPanel, gbc);
	}
	
	public JTextField getInputNum1() {
		return inputNum1;
	}
	
	public JTextField getInputNum2() {
		return inputNum2;
	}
	
	public JButton getResultButton() {
		return resultButton;
	}
	
	public JLabel getResultLabel() {
		return resultLabel;
	}
}