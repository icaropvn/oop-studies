import java.awt.*;
import javax.swing.*;

public class MainFrame extends JFrame {
	private JTextField inputNum1;
	private JTextField inputNum2;
	private JButton divideButton;
	private JLabel lblQuotient;
	private JLabel lblRemainder;
	
	public MainFrame() {
		setTitle("Division simulator");
		setSize(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridBagLayout());
		
		initComponents();
	}
	
	public void initComponents() {		
		JPanel firstLine = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 0));
		JLabel lblNum1 = new JLabel("Value 01:");
		lblNum1.setFont(new Font("SansSerif", Font.PLAIN, 18));
		lblNum1.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 10));
		inputNum1 = new JTextField(6);
		inputNum1.setFont(new Font("SansSerif", Font.PLAIN, 18));
		
		JPanel secondLine = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 0));
		JLabel lblNum2 = new JLabel("Value 02:");
		lblNum2.setFont(new Font("SansSerif", Font.PLAIN, 18));
		lblNum2.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 10));
		inputNum2 = new JTextField(6);
		inputNum2.setFont(new Font("SansSerif", Font.PLAIN, 18));
		
		JPanel thirdLine = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 0));
		divideButton = new JButton("Divide");
		divideButton.setFont(new Font("SansSerif", Font.PLAIN, 16));
		
		JPanel fourthLine = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 0));
		JLabel lblIdentifierQuotient = new JLabel("Quotient:");
		lblIdentifierQuotient.setFont(new Font("SansSerif", Font.BOLD, 20));
		lblIdentifierQuotient.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 10));
		lblQuotient = new JLabel("-");
		lblQuotient.setFont(new Font("SansSerif", Font.PLAIN, 20));
		
		JPanel fifthLine = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 0));
		JLabel lblIdentifierRemainder = new JLabel("Remainder:");
		lblIdentifierRemainder.setFont(new Font("SansSerif", Font.BOLD, 20));
		lblIdentifierRemainder.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 10));
		lblRemainder = new JLabel("-");
		lblRemainder.setFont(new Font("SansSerif", Font.PLAIN, 20));
		
		firstLine.add(lblNum1);
		firstLine.add(inputNum1);
		
		secondLine.add(lblNum2);
		secondLine.add(inputNum2);
		
		thirdLine.add(divideButton);
		
		fourthLine.add(lblIdentifierQuotient);
		fourthLine.add(lblQuotient);
		
		fifthLine.add(lblIdentifierRemainder);
		fifthLine.add(lblRemainder);
		
		GridBagConstraints gbc = new GridBagConstraints();
		
		gbc.gridy = 0;
		gbc.insets = new Insets(0, 0, 20, 0);
		add(firstLine, gbc);
		
		gbc.gridy = 1;
		add(secondLine, gbc);
		
		gbc.gridy = 2;
		gbc.insets = new Insets(0, 0, 40, 0);
		add(thirdLine, gbc);
		
		gbc.gridy = 3;
		gbc.insets = new Insets(0, 0, 20, 0);
		add(fourthLine, gbc);
		
		gbc.gridy = 4;
		add(fifthLine, gbc);
	}
	
	public JTextField getInputNum1() {
		return inputNum1;
	}
	
	public JTextField getInputNum2() {
		return inputNum2;
	}
	
	public JButton getDivideButton() {
		return divideButton;
	}
	
	public JLabel getLblQuotient() {
		return lblQuotient;
	}
	
	public JLabel getLblRemainder() {
		return lblRemainder;
	}
}