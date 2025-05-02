import javax.swing.SwingUtilities;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
        	MainFrame mainFrame = new MainFrame();
        	Controller controller = new Controller(mainFrame);
        	mainFrame.setVisible(true);
        });
    }
}
