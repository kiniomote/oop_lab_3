
public class Test {

	public static void main(String[] args) {
		Rectangle rect1 = new Rectangle(2,3,5,1);
		Rectangle rect2 = new Rectangle(3,4);
		Rectangle rect3 = new Rectangle();
		rect1.rect_print();
		rect2.rect_print();
		rect3.rect_print();
		rect1.move(4, 2);
		rect2.move(4, 8);
		rect3.move(1, 3);
		rect1.rect_print();
		rect2.rect_print();
		rect3.rect_print();
		Rectangle rect12 = rect1.Union(rect2);
		rect12.rect_print();
	}

}
