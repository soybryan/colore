package botoncolor;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.BevelBorder;

public class color {

	private JFrame frame;
	private JCheckBox chkrojo;
	private JCheckBox chkverde;
	private JCheckBox chkazul;
	private JLabel lblColor;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					color window = new color();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public color() {
		initialize();
	}
public void asignarColor() {
	int r=(chkrojo.isSelected())?255:0;
	int g=(chkverde.isSelected())?255:0;
	int b=(chkazul.isSelected())?255:0;
	lblColor.setBackground(new Color(r,g,b));


}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 644, 429);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		chkrojo = new JCheckBox("rojo");
		chkrojo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				asignarColor();
				
				
		}
		});
		chkrojo.setBounds(43, 34, 97, 23);
		frame.getContentPane().add(chkrojo);
		
		chkverde = new JCheckBox("verde");
		chkverde.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				asignarColor();
			}
		});
		chkverde.setBounds(43, 88, 97, 23);
		frame.getContentPane().add(chkverde);
		
		chkazul = new JCheckBox("azul");
		chkazul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				asignarColor();
			}
		});
		chkazul.setBounds(43, 155, 97, 23);
		frame.getContentPane().add(chkazul);
		
		lblColor = new JLabel("");
		lblColor.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		lblColor.setOpaque(true);
		lblColor.setBounds(335, 48, 228, 215);
		frame.getContentPane().add(lblColor);
	}

}
