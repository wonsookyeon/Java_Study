package ex04_01;

class Box<T> {
	private T ob;
	
	public T getOb() {
		return ob;
	}
	
	public void setOb(T ob) {
		this.ob = ob;
	}
}

//class SwapBox{   // 40줄과 같이
//	public static <T> T swapBox(Box<T>box1,Box<T>box2) {
//		T tmp = box1.getOb();
//		box1.setOb(box2.getOb());
//		box2.setOb(tmp);
//		
//		return box1.getOb();
//				
//	}
//	
//}



public class GenericExam01 {

	public static void main(String[] args) {
		
		Box<Integer> box1 = new Box<>();
		box1.setOb(99);
		Box<Integer> box2 = new Box<>();
		box2.setOb(55);
		
		System.out.println(box1.getOb() + "&" + box2.getOb());
		swapBox(box1,box2);
		//SwapBox.swapBox(box1,box2);
		System.out.println(box1.getOb() + "&" + box2.getOb());
		
	}
	static <T> void swapBox(Box<T> box1, Box<T> box2) {
		Box<T> tmp = new Box<T>();
		
		tmp.setOb(box1.getOb());
		box1.setOb(box2.getOb());
		box2.setOb(tmp.getOb());
		
//		tmp = box1;     이렇게 하면 값이 참조하고있는 값이 바뀌지않고 주소값 값들끼리만 바뀌는거라 안됨
//		box1 = box2;
//		box2 = tmp;
		
	}




}
