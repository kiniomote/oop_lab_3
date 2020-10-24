import java.awt.EventQueue;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.Window.Type;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JToggleButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class OptionsRectForm {

	private JFrame frame;
	private JTextField topLeftXField;
	private JTextField topLeftYField;
	private JTextField botRightXField;
	private JTextField botRightYField;
	
	public int x1 = 0;
	public int y1 = 0;
	public int x2 = 0;
	public int y2 = 0;
	
	public Color borderColor = Color.black;
	public Color fillColor = Color.white;

	public boolean fill = false;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OptionsRectForm window = new OptionsRectForm();
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
	public OptionsRectForm() {
		initialize();
	}
	
	public void Show(boolean show) {
		frame.setVisible(show);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 267, 222);
		
		JLabel lblTopLeft = new JLabel("Top left");
		lblTopLeft.setBounds(10, 10, 62, 30);
		
		JLabel lblBottomRight = new JLabel("Bot right");
		lblBottomRight.setBounds(10, 41, 62, 30);
		
		topLeftXField = new JTextField();
		topLeftXField.setBounds(82, 15, 68, 20);
		topLeftXField.setColumns(10);
		
		topLeftYField = new JTextField();
		topLeftYField.setBounds(160, 15, 68, 20);
		topLeftYField.setColumns(10);
		
		botRightXField = new JTextField();
		botRightXField.setBounds(82, 46, 68, 20);
		botRightXField.setColumns(10);
		
		botRightYField = new JTextField();
		botRightYField.setBounds(160, 46, 68, 20);
		botRightYField.setColumns(10);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(lblTopLeft);
		frame.getContentPane().add(lblBottomRight);
		frame.getContentPane().add(topLeftXField);
		frame.getContentPane().add(topLeftYField);
		frame.getContentPane().add(botRightXField);
		frame.getContentPane().add(botRightYField);
		
		final JToggleButton tglbtnFilled = new JToggleButton("Filled");
		tglbtnFilled.setBounds(62, 82, 121, 23);
		frame.getContentPane().add(tglbtnFilled);
		
		JButton btnBorder = new JButton("Border");
		btnBorder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				borderColor = JColorChooser.showDialog(null, "Border color", Color.BLACK);
			}
		});
		btnBorder.setBounds(10, 116, 89, 23);
		frame.getContentPane().add(btnBorder);
		
		JButton btnFill = new JButton("Fill");
		btnFill.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				fillColor = JColorChooser.showDialog(null, "Fill color", Color.WHITE);
			}
		});
		btnFill.setBounds(139, 116, 89, 23);
		frame.getContentPane().add(btnFill);
		
		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				x1 = Integer.parseInt(topLeftXField.getText());
				y1 = Integer.parseInt(topLeftYField.getText());
				x2 = Integer.parseInt(botRightXField.getText());
				y2 = Integer.parseInt(botRightYField.getText());
				
				fill = tglbtnFilled.isSelected();
				
				frame.setVisible(false);
			}
		});
		btnSave.setBounds(74, 150, 89, 23);
		frame.getContentPane().add(btnSave);
	}
}
