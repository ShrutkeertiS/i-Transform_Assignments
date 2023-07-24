package intermediateOOPS;

abstract class ShapeDrawing {
	public abstract void draw();
}

class Line extends ShapeDrawing{
	private int length;
	
	public Line(int length) {
		this.length = length;
	}
	
	@Override
	public void draw() {
		System.out.println("Drawing the line with length: " + length);
	}
}

class Rectangle extends ShapeDrawing{
	private int length;
	private int breadth;
	
	public Rectangle(int length, int breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}
	
	@Override
	public void draw() {
		System.out.println("Drawing the rectangle with length: " + length + " and breadth: " + breadth);
	}
}

class Cube extends ShapeDrawing{
	private int side;

	public Cube(int side) {
		super();
		this.side = side;
	}
	
	@Override
	public void draw() {
		System.out.println("Drawing the cube with side: " + side);
	}
}

public class Shape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ShapeDrawing line = new Line(10);
		ShapeDrawing rectangle = new Rectangle(10, 15);
		ShapeDrawing cube = new Cube(12);
		
		line.draw();
		rectangle.draw();
		cube.draw();
	}

}
