import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.Period;

public class Controller {
	private Frame view;
	
	public Controller(Frame view) {
		this.view = view;
		
		initControllers();
	}
	
	public void initControllers() {
		view.getBtnCalculateAge().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				calcularIdade();
			}
		});
	}
	
	private void calcularIdade() {
		LocalDate todaysDate = LocalDate.now();
		LocalDate birthDate = (LocalDate)view.getDateField().getValue();
		
		int age = Period.between(birthDate, todaysDate).getYears();
		
		view.getLblAge().setText(age + " anos");
	}
}