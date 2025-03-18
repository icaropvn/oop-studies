package view;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
	public MainFrame() {
		setTitle("Calculadora");
		setSize(362, 560);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		initComponents();
	}
	
	public void initComponents() {
		JPanel mainPanel = new JPanel();
		mainPanel.setLayout(new BorderLayout());
		
		JPanel displayContainer = new JPanel();
		displayContainer.setLayout(new BoxLayout(displayContainer, BoxLayout.Y_AXIS));
		displayContainer.setPreferredSize(new Dimension(WIDTH, 100));
		displayContainer.setBorder(BorderFactory.createEmptyBorder(0, 10, 0, 10));
		
		displayContainer.add(Box.createVerticalGlue());
		
		JLabel historyDisplay = new JLabel("12 + 3 =");
		historyDisplay.setFont(new Font("Arial", Font.PLAIN, 16));
		historyDisplay.setHorizontalAlignment(JLabel.RIGHT);
		historyDisplay.setMaximumSize(new Dimension(Integer.MAX_VALUE, historyDisplay.getPreferredSize().height));
		displayContainer.add(historyDisplay);
		
		JLabel display = new JLabel("0");
		display.setFont(new Font("Arial", Font.PLAIN, 34));
		display.setHorizontalAlignment(JLabel.RIGHT);
		display.setMaximumSize(new Dimension(Integer.MAX_VALUE, display.getPreferredSize().height));
		display.setBorder(BorderFactory.createEmptyBorder(5, 0, 0, 0));
		displayContainer.add(display);
		
		displayContainer.add(Box.createVerticalGlue());
		
		mainPanel.add(displayContainer, BorderLayout.NORTH);
		
		JPanel buttonsGrid = new JPanel();
		buttonsGrid.setLayout(new GridLayout(5, 4, 10, 10));
		buttonsGrid.setBorder(BorderFactory.createCompoundBorder(buttonsGrid.getBorder(), BorderFactory.createEmptyBorder(10, 10, 10, 10)));
		
		String[] buttonsText = {"", "C", "<-X", "+",
								"7", "8", "9", "-",
								"4", "5", "6", "×",
								"1", "2", "3", "÷",
								"+/-", "0", ",", "="};
		
		for(String text : buttonsText) {
			JButton button = new JButton(text);
			button.setFont(new Font("Arial", Font.PLAIN, 20));
			buttonsGrid.add(button);
		}
		
		mainPanel.add(buttonsGrid, BorderLayout.CENTER);
		
		add(mainPanel);
	}
}
