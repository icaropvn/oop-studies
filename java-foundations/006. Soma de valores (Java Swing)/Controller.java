import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class Controller {
	private View view;
	private float num1, num2;
	
	public Controller(View view) {
		this.view = view;
		
		initControllers();
	}
	
	public void initControllers() {
		view.getResultButton().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(checkSum()) {
					String result = Float.toString(sum());
					view.getResultLabel().setText(result);
					return;
				}
				
				JOptionPane.showMessageDialog(view, "O número inserido não é válido.", "Número inválido", JOptionPane.ERROR_MESSAGE);
			}
		});
	}
	
	public boolean checkSum() {
		try {
			num1 = Float.parseFloat(view.getInputNum1().getText());
			num2 = Float.parseFloat(view.getInputNum2().getText());
			
			return true;
		}
		catch(NumberFormatException e) {
			return false;
		}
	}
	
	public float sum() {
		return num1 + num2;
	}
}