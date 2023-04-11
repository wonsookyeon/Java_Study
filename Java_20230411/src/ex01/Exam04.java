package ex01;

/*
     +
    ++
   +++
  ++++
 +++++ 출력
 행 : i 5
 열 : 
 */

public class Exam04 {

	public static void main(String[] args) {

		for(int i=0; i<5; i++) {  // i는 0,1,2,3,4 이므로
			for(int j=0; j<i+5; j++) {
				if(i==j)
					System.out.print("+");
				else{}    //  j는 
			}
//				System.out.print("+");  
			System.out.println();  
			
			 
		}
	}

}
