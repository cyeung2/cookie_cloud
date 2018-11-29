
public class Circle {
	private final static double PI = 3.14159;
	private double radius;

	public Circle() {
		radius = 0.0;
	}
	private static double setRadius;

	public void setRadius(double n) {
		Circle.setRadius = n;
	}
	public double getRadius(double n) {
		return Circle.setRadius;
	}
	public static double getArea(double n) {
		double area = PI*n*n;
		return area;
	}
	public static double getCircumference(double n) {
		double circumference = 2*n*PI;
		return circumference;
	}
	public static double getDiameter(double n) {
		double diameter = n * 2;
		return diameter;
	}
	}

