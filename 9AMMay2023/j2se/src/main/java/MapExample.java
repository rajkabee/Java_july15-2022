import java.util.HashMap;
import java.util.Map;

public class MapExample {
	public static void main(String[] args) {
		HashMap<String, Integer> age = new HashMap<>();
		//TreeMap<String, Integer> age = new TreeMap<>();
		age.put("Ramesh", 23);
		age.put("Prajwol", 34);
		age.put("Puskar", 29);
		age.put("Aashish", 35);
		age.put("Ankit", 16);
		age.put("Ramita", 45);
		//String name="Ramesh";
		//System.out.println(age.get(name));
//		for(int x:nums) {
//			System.out.println(x);
//		}
		
		for(Map.Entry<String, Integer> x: age.entrySet()) {
			System.out.println(x.getKey()+" : "+x.getValue());
		}
		
		
	}
}
