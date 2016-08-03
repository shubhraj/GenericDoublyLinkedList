package day.two.one;

public class StringLiteralPool {

	public static void main(String[] args) {

		String one = "someString";
        String two = "someString";
        
        System.out.println(one.equals(two));
        System.out.println(one == two);
        
        String three = new String("someString");
        String four = new String("someString");
        
        System.out.println(three.equals(four));
        System.out.println(three == four);
		
		
	}

}
