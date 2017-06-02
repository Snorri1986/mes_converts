import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.factories.FormFactory;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Scanner;
import javax.swing.JDialog;


public class GUI_Desktop {

	private JFrame frmMeasurementsConvertor;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI_Desktop window = new GUI_Desktop();
					window.frmMeasurementsConvertor.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUI_Desktop() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMeasurementsConvertor = new JFrame();
		frmMeasurementsConvertor.setTitle("Measurements convertor");
		frmMeasurementsConvertor.setBounds(100, 100, 450, 300);
		frmMeasurementsConvertor.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMeasurementsConvertor.getContentPane().setLayout(new FormLayout(new ColumnSpec[] {
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,},
			new RowSpec[] {
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,}));
		
		JLabel lblNewLabel = new JLabel("Temperature ");
		frmMeasurementsConvertor.getContentPane().add(lblNewLabel, "10, 2");
		
		JButton btnNewButton = new JButton("C -> F");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				// actions via console(temporary)
				/*int grade = 0;
				WeatherTemp wt = new WeatherTemp();
				Scanner sc = new Scanner(System.in);
				System.out.print("Please enter your grade value in Celcius: ");
				grade = sc.nextInt();
				wt.showFaringeith(grade);*/
				
				// via dialog window
				
				final JDialog frame = new JDialog(frmMeasurementsConvertor, "Input C->F", true);
				frame.getContentPane().add(frame);
				frame.pack();
				frame.setVisible(true);
				
			   
			}
		});
		frmMeasurementsConvertor.getContentPane().add(btnNewButton, "4, 4");
		
		JButton btnFC = new JButton("F -> C");
		frmMeasurementsConvertor.getContentPane().add(btnFC, "10, 4");
		
		JButton btnK = new JButton("K - > C");
		frmMeasurementsConvertor.getContentPane().add(btnK, "16, 4");
		
		JLabel lblDistance = new JLabel("Distance");
		frmMeasurementsConvertor.getContentPane().add(lblDistance, "10, 8");
		
		JButton btnMilesKm = new JButton("Miles -> KM");
		frmMeasurementsConvertor.getContentPane().add(btnMilesKm, "4, 10");
		
		JButton btnKmMiles = new JButton("KM -> Miles");
		frmMeasurementsConvertor.getContentPane().add(btnKmMiles, "10, 10");
		
		JButton btnInchMiter = new JButton("Inch -> Meter");
		frmMeasurementsConvertor.getContentPane().add(btnInchMiter, "16, 10");
		
		JLabel lblFlui = new JLabel("Fluids ->");
		frmMeasurementsConvertor.getContentPane().add(lblFlui, "4, 14");
		
		JButton btnLiterGal = new JButton("Liter -> Gal");
		frmMeasurementsConvertor.getContentPane().add(btnLiterGal, "10, 14");
		
		JLabel label = new JLabel("<- Fluids");
		frmMeasurementsConvertor.getContentPane().add(label, "16, 14");
		
		JButton btnGalLiter = new JButton("Gal -> Liter");
		frmMeasurementsConvertor.getContentPane().add(btnGalLiter, "4, 16");
		
		JButton btnYardMeter = new JButton("Yard -> Meter");
		frmMeasurementsConvertor.getContentPane().add(btnYardMeter, "16, 16");
		
		JButton btnNewButton_1 = new JButton("EXIT");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		frmMeasurementsConvertor.getContentPane().add(btnNewButton_1, "10, 18");
		
		JLabel lblMoreDistance = new JLabel("More distance:)");
		frmMeasurementsConvertor.getContentPane().add(lblMoreDistance, "16, 18");
	}

}
