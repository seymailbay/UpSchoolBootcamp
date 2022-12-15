import java.util.Objects;

public class Triangle extends Shape {
	protected int base;
	protected int edge;
	protected int height;

	public Triangle(int base, int edge, int height) {
		super("This is right triangle");
		this.base = base;
		this.edge = edge;
		this.height = height;
	}

	@Override
	public String toString() {
		return "Triangle [base=" + base + ", edge=" + edge + ", height=" + height + "]";
	}

	@Override
	void draw() {
		System.out.println(" Triangle ");
		super.draw();
	}

	@Override
	public int hashCode() {
		return Objects.hash(base, edge, height);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Triangle other = (Triangle) obj;
		return base == other.base && edge == other.edge && height == other.height;
	}

	@Override
	void erase() {
		System.out.println("The triangle is erased. ");
		super.erase();
	}

	@Override
	double calculateArea() {
		area = (base * height) / 2;
		return super.calculateArea();
	}

	@Override
	double circumference() {
		circumference = base + edge + height;
		return super.circumference();
	}

	@Override
	void printInfo() {
		// TODO Auto-generated method stub
		super.printInfo();
	}

}
