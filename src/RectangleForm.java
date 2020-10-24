import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class RectangleForm {

	private JFrame frame;
	private OptionsRectForm optionRect1Form = new OptionsRectForm();
	private OptionsRectForm optionRect2Form = new OptionsRectForm();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RectangleForm window = new RectangleForm();
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
	public RectangleForm() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnDraw = new JButton("Option 1 rect");
		btnDraw.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				optionRect1Form.Show(true);
			}
		});
		btnDraw.setBounds(310, 227, 114, 23);
		frame.getContentPane().add(btnDraw);
		
		JButton btnDraw_1 = new JButton("Draw union");
		btnDraw_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				DrawableRect rectangle;
	        	if(optionRect1Form.fill) {
	        		rectangle = new DrawableRect();
	        	 }
	        	else {
	        		rectangle = new ColoredRect(optionRect1Form.fillColor);
	        	}
        		rectangle.outColor = optionRect1Form.borderColor;
        		
	        	rectangle.Set(optionRect1Form.x1, optionRect1Form.y1, optionRect1Form.x2, optionRect1Form.y2);
	        	
				DrawableRect rectangle2;
	        	if(optionRect2Form.fill) {
	        		rectangle2 = new DrawableRect();
	        	 }
	        	else {
	        		rectangle2 = new ColoredRect(optionRect2Form.fillColor);
	        	}
	        	rectangle2.outColor = optionRect2Form.borderColor;
        		
        		rectangle2.Set(optionRect2Form.x1, optionRect2Form.y1, optionRect2Form.x2, optionRect2Form.y2);
        		
	            DrawRectangle rectangleForm = new DrawRectangle(rectangle.Union(rectangle2));
	            rectangleForm.createAndShowGui();
			}
		});
		btnDraw_1.setBounds(132, 227, 101, 23);
		frame.getContentPane().add(btnDraw_1);
		
		JButton btnOptionRect = new JButton("Option 2 rect");
		btnOptionRect.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				optionRect2Form.Show(true);
			}
		});
		btnOptionRect.setBounds(10, 227, 114, 23);
		frame.getContentPane().add(btnOptionRect);
		
		JButton button = new JButton("Draw");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				DrawableRect rectangle;
	        	if(optionRect1Form.fill) {
	        		rectangle = new DrawableRect();
	        	 }
	        	else {
	        		rectangle = new ColoredRect(optionRect1Form.fillColor);
	        	}
        		rectangle.outColor = optionRect1Form.borderColor;
        		
	        	rectangle.Set(optionRect1Form.x1, optionRect1Form.y1, optionRect1Form.x2, optionRect1Form.y2);
	            DrawRectangle rectangleForm = new DrawRectangle(rectangle);
	            rectangleForm.createAndShowGui();
			}
		});
		button.setBounds(243, 227, 57, 23);
		frame.getContentPane().add(button);
	}
}
