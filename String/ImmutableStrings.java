package day.two.one;

public class ImmutableStrings {
	public static void main(String[] args) {
		
		String start = "Hello";
		String end = start.concat(" World!");
		System.out.println(start == end);
		end = start.concat("");
		System.out.println(start == end);

	}
}
