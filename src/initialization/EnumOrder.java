package initialization;

/**
 * Enum排序
 * 
 * @author weishikai
 *
 */
public class EnumOrder {
	public static void main(String[] args) {
//		for (Spiciness s : Spiciness.values())
//			System.out.println(s + ", ordinal " + s.ordinal());
		// ordinal()方法 static values()方法
		for(Spiciness s : Spiciness.values()) {
			System.out.println(s + ",ordianl " + s.ordinal());
		}
	}
} /*
	 * Output: NOT, ordinal 0 MILD, ordinal 1 MEDIUM, ordinal 2 HOT, ordinal 3
	 * FLAMING, ordinal 4
	 */// :~
