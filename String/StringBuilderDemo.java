package day.two.one;

public class StringBuilderDemo {

	public static void main(String[] args) {

		StringBuilder start = new StringBuilder("Hello");
		StringBuilder end = start.append(" World!");	
		
		System.out.println(start);
		System.out.println(end);

	}

}
