package net.developia.oop2;

public class PointTest {

	public static void main(String[] args) {
		//Point2D pt = new Point2D(10, 20);
		
		//Point3D pt3 = new Point3D();
		//System.out.println(pt3);
		
		//ßSystem.out.println(pt);
		//Point2D pt32 = new Point3D();
		
		Point3D pt33 = new Point3D(100, 200, 300);
		
		Point3D pt3 = new Point3D();
		// 이런 경우에는 점점 생성자와 매개변수가 점점 많아짐.
		// 값을 초기화 시킬때 어렵다.
		// 매개변수 3개에서 4개가 넘어가면 build패턴을 쓰라고함.
	}

}
