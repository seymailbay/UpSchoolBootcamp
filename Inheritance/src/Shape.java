
public class Shape {
	protected String name;
	protected double area;
	protected double circumference;

	public Shape(String name) {
		this.name = name;

	}

	void draw() {

	}

	void erase() {

	}

	double calculateArea() {

		return area;
	}

	double circumference() {

		return circumference;
	}

	void printInfo() {
		System.out.println(area + " and " + circumference);
	}

}
