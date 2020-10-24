import java.awt.*;

public class Rectangle {
	protected int x1;
	protected int y1;
	
	protected int x2;
	protected int y2;
	
	public Rectangle(int x1, int y1, int x2, int y2) {
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}
	
	public Rectangle(int width, int height) {
		x1 = 0;
		y1 = 0;
		x2 = width;
		y2 = -height;
	}
	
	public Rectangle() {
		x1 = 0;
		y1 = 0;
		x2 = 0;
		y2 = 0;
	}
	
	public void Set(int x1, int y1, int x2, int y2) {
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}
	
	public void rect_print() {
		System.out.println("top left: " + x1 + ", " + y1 + " bot right: " + x2 + ", " + y2);
	}
	
	public void move(int dx, int dy) {
		x1 += dx;
		x2 += dx;
		y1 += dy;
		y2 += dy;
	}
	
	public Rectangle Union(Rectangle rectangle) {
		int x1 = this.x1;
		int y1 = this.y1;
		int x2 = this.x2;
		int y2 = this.y2;
		if (this.x1 < rectangle.x1) x1 = rectangle.x1;
		if (this.y1 > rectangle.y1) y1 = rectangle.y1;
		if (this.x2 > rectangle.x2) x2 = rectangle.x2;
		if (this.y2 < rectangle.y2) y2 = rectangle.y2;
        return new Rectangle(x1, y1, x2, y2);
	}
	
	public void draw(Graphics g) {
		
	}
}
