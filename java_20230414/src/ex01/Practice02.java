package ex01;

//합수 
/*
*  함수를 호출하면서 인자값 하나 전달(정수)하면 함수는 1부터 전달한 인자값까지 더해서
*  더한 결과값을 호출함수에게 반환해서 출력
*/

public class Practice02 {

	public static void main(String[] args) {
		
		int total = sumFunction(10);
		
		System.out.println("Total : " +total);
		
		if(total%2==0)
			System.out.println("짝수");
		else
			System.out.println("홀수");
		
		
	}
		static int sumFunction(int num) {
		int sum=0;
		for (int i=0; i<=num; i++)
			sum+=i;
		
		return sum;
		}
}
