import java.awt.*;
import javax.swing.*;
import javax.swing.text.DateFormatter;
import javax.swing.text.DefaultFormatterFactory;

import java.text.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Frame extends JFrame {
	private JFormattedTextField dateField;
	private JButton btnCalculateAge;
	private JLabel lblAge;
	
	public Frame() {
		setTitle("Calculadora de Idade");
		setSize(650, 330);
		setLayout(new BorderLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		initComponents();
	}
	
	public void initComponents() {
		JPanel leftPanel = new JPanel(new GridBagLayout());
		leftPanel.setBorder(BorderFactory.createEmptyBorder(0, 40, 0, 0));
		GridBagConstraints c = new GridBagConstraints();
		c.gridx = 0;
		c.anchor = GridBagConstraints.WEST;
		c.insets = new Insets(0, 0, 10, 0);
		
		JPanel topLine = new JPanel(new FlowLayout());
		
		JLabel lblInsertBirthDate = new JLabel("Insira a sua data de nascimento:");
		lblInsertBirthDate.setFont(new Font("SansSerif", Font.PLAIN, 14));
		lblInsertBirthDate.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 10));
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		JFormattedTextField.AbstractFormatter localDateFormatter = new JFormattedTextField.AbstractFormatter() {
		    @Override
		    public Object stringToValue(String text) throws ParseException {
		        try {
		            return LocalDate.parse(text, dtf);
		        }
		        catch (DateTimeParseException ex) {
		            throw new ParseException("Formato inválido", ex.getErrorIndex());
		        }
		    }

		    @Override
		    public String valueToString(Object value) throws ParseException {
		        if(value instanceof LocalDate) {
		            return ((LocalDate) value).format(dtf);
		        }
		        else if(value == null) {
		            return "";
		        }
		        else {
		            throw new ParseException("Tipo não suportado: " + value.getClass(), 0);
		        }
		    }
		};

		DefaultFormatterFactory factory = new DefaultFormatterFactory(localDateFormatter);
		dateField = new JFormattedTextField(factory);
		dateField.setFont(new Font("SansSerif", Font.PLAIN, 14));
		dateField.setColumns(10);
		dateField.setValue(LocalDate.now());
		
		btnCalculateAge = new JButton("Calcular");
		btnCalculateAge.setFont(new Font("SansSerif", Font.PLAIN, 14));
		
		JPanel bottomLine = new JPanel(new FlowLayout());
		
		JLabel lblDescriptionAge = new JLabel("Hoje você tem:");
		lblDescriptionAge.setFont(new Font("SansSerif", Font.PLAIN, 16));
		lblAge = new JLabel("-- anos");
		lblAge.setFont(new Font("SansSerif", Font.BOLD, 16));
		
		topLine.add(lblInsertBirthDate);
		topLine.add(dateField);
		
		bottomLine.add(lblDescriptionAge);
		bottomLine.add(lblAge);
		
		c.gridy = 0;
		leftPanel.add(topLine, c);
		
		c.gridy = 1;
		c.insets = new Insets(0, 5, 10, 0);
		leftPanel.add(btnCalculateAge, c);
		
		c.gridy = 2;
		c.insets = new Insets(30, 0, 0, 0);
		leftPanel.add(bottomLine, c);
		
		ImageIcon icon = new ImageIcon(getClass().getResource("images/tempo.jpg"));
        Image img = icon.getImage();
		
        JPanel imagePanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
            }
        };
        
        imagePanel.setPreferredSize(new Dimension(200, 0));
        
		add(leftPanel, BorderLayout.WEST);
		add(imagePanel, BorderLayout.EAST);
	}
	
	public JFormattedTextField getDateField() {
		return dateField;
	}
	
	public JButton getBtnCalculateAge() {
		return btnCalculateAge;
	}
	
	public JLabel getLblAge() {
		return lblAge;
	}
}
