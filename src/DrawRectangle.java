import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Color;
import javax.swing.*;

public class DrawRectangle extends JPanel {
    private DrawableRect rectangle;
    
    public DrawRectangle(DrawableRect rectangle) {
		this.rectangle = rectangle;
	}

	@Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        rectangle.draw(g);
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(rectangle.x2 + 2 * rectangle.x1, rectangle.y2 + 2 * rectangle.y1);
    }

    public void createAndShowGui() {
        JFrame frame = new JFrame("DrawRect");
        frame.getContentPane().add(this);
        frame.pack();
        frame.setLocationByPlatform(true);
        frame.setVisible(true);
    }
}
