
public class Square extends Shape {
	protected int edge;

	@Override
	void draw() {
		System.out.println(" Square ");
		super.draw();
	}

	@Override
	void erase() {
		System.out.println("The square is erased. ");
		super.erase();
	}

	@Override
	double calculateArea() {
		area = edge * edge;
		return super.calculateArea();
	}

	@Override
	double circumference() {
		circumference = 4 * edge;
		return super.circumference();
	}

	@Override
	void printInfo() {
		// TODO Auto-generated method stub
		super.printInfo();
	}

	public Square(int edge) {
		super("This is a square");
		this.edge = edge;
	}

	public int getEdge() {
		return edge;
	}

	public void setEdge(int edge) {
		this.edge = edge;
	}

}
