package day.two.one;

public class StringBufferDemo {

	public static void main(String[] args) {

		StringBuffer start = new StringBuffer("Hello");
		StringBuffer end = start.append(" World!");	
		
		System.out.println(start);
		System.out.println(end);
		
	}

}
