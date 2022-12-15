
public class ShapeTest {

	public static void main(String[] args) {
		Shape circle = new Circle(2);
		Shape square = new Square(4);
		Shape rectangle = new Rectangle(6, 3);
		Shape triangle = new Triangle(3, 5, 4);

		System.out.println("........Geometric Shapes........");
		circle.draw();
		square.draw();
		rectangle.draw();
		triangle.draw();

		System.out.println("........Area of Shapes......");
		System.out.println("The Area of Circle: " + circle.calculateArea());
		System.out.println("The Area of Square: " + square.calculateArea());
		System.out.println("The Area of Rectangle: " + rectangle.calculateArea());
		System.out.println("The Area of Triangle: " + triangle.calculateArea());
		System.out.println(" ");

		System.out.println(".........Circumference of Shapes.......");
		System.out.println("The Circumference of Circle: " + circle.circumference());
		System.out.println("The Circumference of Square: " + square.circumference());
		System.out.println("The Circumference of Rectangle: " + rectangle.circumference());
		System.out.println("The Circumference of Triangle: " + triangle.circumference());

		Triangle triangle1 = new Triangle(3, 4, 5);

		System.out.println(" ");

		System.out.println("Triangles are equal:  " + triangle.equals(triangle1));

		System.out.println("Triangle hascode: " + triangle.hashCode() + "Triangle1 hascode: " + triangle1.hashCode());

		System.out.println("String " + triangle1.toString());

	}
}
