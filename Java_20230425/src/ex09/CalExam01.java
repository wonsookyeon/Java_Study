package ex09;

//메인클래스
public class CalExam01 {

	public static void main(String[] args) {
		
		Calculable cal = x -> System.out.println(x*3);
		
		cal.calculate(9);
		cal.calculate(3);
	
	}

}
