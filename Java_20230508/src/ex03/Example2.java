package ex03;

import java.util.AbstractSequentialList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Member{
	private String name;
	private String job;
	
	public Member(String name, String job) {
		this.name = name;
		this.job = job;
	}

	public String getName() {
		return name;
	}

	public String getJob() {
		return job;
	}

	@Override
	public String toString() {
		return "{name:" + name + ", job:" + job + "}";
	}
	

	
}

public class Example2 {

	public static void main(String[] args) {
		
		List<Member> list = Arrays.asList(
				new Member("홍길동", "개발자"),
				new Member("김나리", "디자이너"),
				new Member("신용권", "개발자")
				);
		
		Map<String,List<Member>> groupingMap = list.stream().
				
		
		System.out.println("[개발자]");
		
		
		System.out.println();
		System.out.println("[디자이너]");
		
		

	}

}
