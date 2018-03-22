package holding;
// Simple container example (produces compiler warnings).
// {ThrowsException}
import java.util.*;



class Apple {
	private static long counter;
	private final long id = counter++;
	public long id() { return id;}
}

class Orange {}	

public class ApplesAndOrangesWithoutGenerics {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		ArrayList apples = new ArrayList();
		for (int i = 0; i < 3; i++) {
			apples.add(new Apple());
		}
		apples.add(new Orange());
		for (int i = 0; i < apples.size(); i++) {
			((Apple)apples.get(i)).id();
			// Exception in thread "main" java.lang.ClassCastException: holding.Orange cannot be cast to holding.Apple
			// at holding.ApplesAndOrangesWithoutGenerics.main(ApplesAndOrangesWithoutGenerics.java:25)
		}
	}
}

