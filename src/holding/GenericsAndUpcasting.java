package holding;
import java.util.*;

class GrannySmith extends Apple {}
class Gala extends Apple {}
class Fuji extends Apple {}
class Braeburn extends Apple {}
/**
 * 泛型和向上转型
 * @author sa
 *
 */
public class GenericsAndUpcasting {
	public static void main(String[] args) {
		  // 向上转型
	    List<Apple> apples = new ArrayList<Apple>();
	    apples.add(new GrannySmith());
	    apples.add(new Gala());
	    apples.add(new Fuji());
	    apples.add(new Braeburn());
	    for(Apple c : apples)
	      System.out.println(c);
	}
} /* Output: (Sample)
GrannySmith@7d772e
Gala@11b86e7
Fuji@35ce36
Braeburn@757aef
*///:~
