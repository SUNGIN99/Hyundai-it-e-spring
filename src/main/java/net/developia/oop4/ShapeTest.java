package net.developia.oop4;

public class ShapeTest {

	public static void main(String[] args) {
		printArea(new Circle());
		printArea(new Rectangle());
		printArea(new Triangle());

	}

	private static void printArea(Shape s) {
		s.area();
		System.out.println(s.res);
		
		if(s instanceof Circle) {
			Circle c = (Circle) s;
			System.out.println("반지름이 " + c.r + "인 원의 넓이는 " + c.res + "입니다.");
		} else if(s instanceof Rectangle) {
			Rectangle c = (Rectangle) s;
			System.out.println("높이 " + c.h + ", 밑변 " + c.w + "인 직사각형의 넓이는 " + c.res + "입니다.");
		} else if(s instanceof Triangle) {
			Triangle c = (Triangle) s;
			System.out.println("높이 " + c.h + ", 밑변 " + c.w + "인 삼각형의 넓이는 " + c.res + "입니다.");
		}
	}
	

}
