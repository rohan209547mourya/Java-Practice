package question3;

public class Main {

	public static void main(String[] args) {
		
		Area a1 = new Area();
		
		int circle = a1.circleArea(5);
		int rectangle = a1.rectangleArea(4, 6);
		int square = a1.squareArea(8);
		
		System.out.println("Area of circle is " + circle + " Unit");
		System.out.println("Area of Rectangle " + rectangle + " Unit");
		System.out.println("Area of Square " + square + " Unit");
		
	}
}
