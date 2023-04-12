package ex01;

/*
 * 1. int 배열 10개 생성
 * 2. 랜덤함수 이용해서 10개 초기화
 * 3. 최대값, 최소값 출력
 */
public class Exam05 {

	public static void main(String[] args) {

		int num[] = new int[10];

		for (int i = 0; i < num.length; i++)
			num[i] = (int) (Math.random() * 100) + 1;
		
		for(int i=0; i<num.length; i++)
			
			System.out.print(num[i] + ",");
		System.out.println();

//--------------------------- <랜덤으로 숫자 받아줌>
		
		int max, min;
		max = num[0];
		min = num[0];

		for (int i = 0; i < num.length; i++) {
			if (max < num[i])
				max = num[i];

			if (min > num[i])
				min = num[i];
		}

		System.out.println("max = " + max);
		System.out.println("min = " + min);
		
			
		}

}
