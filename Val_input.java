import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.SpringLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class Val_input extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Val_input dialog = new Val_input();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Val_input() {
		setTitle("Input value");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		SpringLayout sl_contentPanel = new SpringLayout();
		contentPanel.setLayout(sl_contentPanel);
		
		JLabel lblValue = new JLabel("Value:");
		sl_contentPanel.putConstraint(SpringLayout.WEST, lblValue, 123, SpringLayout.WEST, contentPanel);
		contentPanel.add(lblValue);
		
		textField = new JTextField();
		sl_contentPanel.putConstraint(SpringLayout.SOUTH, lblValue, 0, SpringLayout.SOUTH, textField);
		sl_contentPanel.putConstraint(SpringLayout.EAST, lblValue, -34, SpringLayout.WEST, textField);
		sl_contentPanel.putConstraint(SpringLayout.WEST, textField, 215, SpringLayout.WEST, contentPanel);
		sl_contentPanel.putConstraint(SpringLayout.SOUTH, textField, -122, SpringLayout.SOUTH, contentPanel);
		contentPanel.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Calculate");
		sl_contentPanel.putConstraint(SpringLayout.NORTH, btnNewButton, 45, SpringLayout.SOUTH, lblValue);
		sl_contentPanel.putConstraint(SpringLayout.WEST, btnNewButton, 57, SpringLayout.WEST, contentPanel);
		contentPanel.add(btnNewButton);
		
		JButton btnClear = new JButton("Clear");
		sl_contentPanel.putConstraint(SpringLayout.EAST, btnNewButton, -59, SpringLayout.WEST, btnClear);
		sl_contentPanel.putConstraint(SpringLayout.NORTH, btnClear, 0, SpringLayout.NORTH, btnNewButton);
		sl_contentPanel.putConstraint(SpringLayout.WEST, btnClear, -167, SpringLayout.EAST, contentPanel);
		sl_contentPanel.putConstraint(SpringLayout.EAST, btnClear, -28, SpringLayout.EAST, contentPanel);
		contentPanel.add(btnClear);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
		}
	}
}
