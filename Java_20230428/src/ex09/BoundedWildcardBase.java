package ex09;

// extends -> get 기능, 하위클래스만 가능 , extends + get 세트
// super -> set 기능, 상위클래스만 가능 , super + set 세트

class Box<T> {  // T 는 Object -> 최상위 클래스
	private T ob;
	public T getOb() {
		return ob;
	}
	public void setOb(T ob) {
		this.ob = ob;
	}
}


//개발자 실수가 있는 부분을 컴파일 과정에서 발견될 수 있도록 매개변수를 수정하자.
public class BoundedWildcardBase {
	
	public static void addBox(Box<? super Integer> b1, Box<? extends Integer> b2, Box<? extends Integer> b3) {
		b1.setOb(b2.getOb()+b3.getOb()); // 개발자의 실수가 있는 부분
	}

	public static void main(String[] args) {
		
		Box<Integer> box1 = new Box<>();
		box1.setOb(24);
		Box<Integer> box2 = new Box<>();
		box2.setOb(37);
		Box<Integer> result = new Box<>();
		result.setOb(0);
		
		addBox(result, box1, box2);  //result에 24+37의 결과 저장
		System.out.println(result.getOb());  //61출력
		

	}

}
