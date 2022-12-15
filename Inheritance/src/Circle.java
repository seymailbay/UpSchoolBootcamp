
public class Circle extends Shape {
	protected int r;

	public Circle(int r) {
		super("This is a circle");
		this.r = r;

	}

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}

	@Override
	void draw() {
		System.out.println(" Circle ");
		super.draw();
	}

	@Override
	void erase() {
		System.out.println("The circle is erased. ");
		super.erase();
	}

	@Override
	double calculateArea() {
		area = Math.PI * r * r;
		return super.calculateArea();
	}

	@Override
	double circumference() {
		circumference = 2 * Math.PI * r;
		return super.circumference();
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

}
