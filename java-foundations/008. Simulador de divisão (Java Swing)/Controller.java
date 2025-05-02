import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class Controller {
	private MainFrame view;
	
	public Controller(MainFrame view) {
		this.view = view;
		
		initControllers();
	}
	
	public void initControllers() {
		view.getDivideButton().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				calcularDivisao();
			}
		});
	}
	
	public void calcularDivisao() {
		try {
			String input1 = view.getInputNum1().getText().trim();
		    String input2 = view.getInputNum2().getText().trim();

		    if (input1.isEmpty() || input2.isEmpty())
		        throw new IllegalArgumentException("empty");
		    
		    float num1 = Float.parseFloat(input1);
		    float num2 = Float.parseFloat(input2);
		    
		    float quotient = num1 / num2;
		    float remainder = num1 % num2;
		    
		    view.getLblQuotient().setText(Float.toString(quotient));
		    view.getLblRemainder().setText(Float.toString(remainder));
		}
		catch(NumberFormatException ex) {
			JOptionPane.showMessageDialog(view, "Non numeric values detected. Insert valid numbers.", "Error", JOptionPane.ERROR_MESSAGE);
		}
		catch(IllegalArgumentException ex) {
			JOptionPane.showMessageDialog(view, "Fill out all fields.", "Error", JOptionPane.ERROR_MESSAGE);
		}
	}
}
