import java.util.*;
public class Test {

	public static void main(String[] args) {
		Scanner cookie = new Scanner(System.in);
	    System.out.print("Enter the radius");
	    double rad = cookie.nextDouble();
	    System.out.println("Area is " + Circle.getArea(rad));
	    System.out.println("Diameter is " + Circle.getDiameter(rad));
	    System.out.println("Circumference is " + Circle.getCircumference(rad));
	}

}
