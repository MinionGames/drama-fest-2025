import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {
	
	public Window() {
		// Init
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Drama Fest 2025 Sound System");
		setSize(500, 500);
		setLayout(new FlowLayout());
		
		// Body
		JButton[] buttons = new JButton[10];
		JPanel buttonPanel = new JPanel();
		buttonPanel.setLayout(new GridLayout(0, 1));
		for (int i = 0; i < 10; i++) {
			buttons[i] = new JButton();
			buttons[i].setText("File" + i);
			buttons[i].setSize(new Dimension(5, 20));
			buttonPanel.add(buttons[i]);
		}
		JScrollPane audioFileSelector = new JScrollPane(buttonPanel);
		audioFileSelector.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		audioFileSelector.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		getContentPane().add(audioFileSelector);
		
		// End
		setVisible(true);
	}
	
}
