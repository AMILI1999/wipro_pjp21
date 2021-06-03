import java.util.HashSet;
import java.util.Iterator;

public class SetNames {

	public static void main(String[] args) {
		
		HashSet<String> set = new HashSet<>();
		
		set.add("Amili");
		set.add("Balaji");
		set.add("Chandra");
		set.add("Riya");
		
		Iterator<String> itr = set.iterator();
		while (itr.hasNext())
			System.out.println(itr.next());
	}

}