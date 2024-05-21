package net.developia.oop1;

public class PointTest {

	public static void main(String[] args) {
		Point3D pt = new Point3D();
		//pt.x = 100;
		//pt.y = 200;
		pt.setX(100);
		pt.setY(200);
		pt.setZ(300);
		
		pt.print();
	}

}
