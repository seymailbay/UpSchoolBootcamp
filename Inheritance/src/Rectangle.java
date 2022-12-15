
public class Rectangle extends Shape {

	protected int edge1;
	protected int edge2;

	public Rectangle(int edge1, int edge2) {
		super("This is a rectangle");
		this.edge1 = edge1;
		this.edge2 = edge2;
	}

	@Override
	void draw() {
		System.out.println(" Rectangle ");
		super.draw();
	}

	@Override
	void erase() {
		System.out.println("The regtangle is erased. ");
		super.erase();
	}

	@Override
	double calculateArea() {
		area = edge1 * edge2;
		return super.calculateArea();
	}

	@Override
	double circumference() {
		circumference = 2 * (edge1 + edge2);
		return super.circumference();
	}

	@Override
	public String toString() {
		return "Rectangle [edge1=" + edge1 + ", edge2=" + edge2 + "]";
	}

	@Override
	void printInfo() {
		// TODO Auto-generated method stub
		super.printInfo();
	}

}
