import java.awt.*;


public class DrawableRect extends Rectangle {
	public Color outColor;
	
	@Override
	public void draw(Graphics g) {
		g.setColor(outColor);
		g.drawRect(this.x1, this.y2, this.x2 - this.x1, this.y2 - this.y1);
	}
	
	@Override
	public DrawableRect Union(Rectangle rectangle) {
		int x1 = this.x1;
		int y1 = this.y1;
		int x2 = this.x2;
		int y2 = this.y2;
		if (this.x1 < rectangle.x1) x1 = rectangle.x1;
		if (this.y1 > rectangle.y1) y1 = rectangle.y1;
		if (this.x2 > rectangle.x2) x2 = rectangle.x2;
		if (this.y2 < rectangle.y2) y2 = rectangle.y2;
		DrawableRect rect = new DrawableRect();
		rect.Set(x1, y1, x2, y2);
		rect.outColor = this.outColor;
        return rect;
	}
}
