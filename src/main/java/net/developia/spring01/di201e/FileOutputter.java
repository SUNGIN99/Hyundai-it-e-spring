package net.developia.spring01.di201e;

public interface FileOutputter {
	public void output(String msg) throws Exception;
	// 함수 내부에서 예외를 처리하게된다면 => 콘솔에서만 사용할 수 있음
	// throws를 쓰면 함수 호출을 하는 곳에서 모듈화를 통해 더 다양한 동작이 가능함.
	
	
}
