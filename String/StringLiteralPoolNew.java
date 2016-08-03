package day.two.one;

public class StringLiteralPoolNew {

	public static void main(String[] args) {

		String three = new String("someString");
        String four = new String("someString");
        
        System.out.println(three.equals(four));
        System.out.println(three == four);

	}

}
