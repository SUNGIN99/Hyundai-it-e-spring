package net.developia.oop3;

public class AnimalTest {

	public static void main(String[] args) {
		/*Animal a = new Animal();
		
		System.out.println(a);
		
		// 다운캐스팅은 확인하는 경우가 많음
		if(a instanceof Bird) {
			Bird b = (Bird) a; // 다운캐스팅은 되지만, classexception
			System.out.println(b);
		}else {
			System.out.println("다운 캐스팅 불가");
		}*/
		
		Bird b = new Bird();
		
		if( b instanceof Animal) {
			Animal a = b;
			System.out.println(a);
			
			if(a instanceof Bird) {
				Bird b2 = (Bird)a;
				System.out.println(b2);
				if(b2 instanceof Condor) {
					//ClassCastException;
					Condor c = (Condor)b2;
					System.out.println(c);
				}else {
					System.out.println("err3");
				}
			}else {
				System.out.println("err2");
			}
			
		}else {
			System.out.println("err");
		}
		
	}

}
