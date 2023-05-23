import java.util.HashSet;
import java.util.TreeSet;

public class SetExample {
	public static void main(String[] args) {
//		HashSet<String> students = new HashSet<>();
//		students.add("Rahul");
//		students.add("Sharmila");
//		students.add("Dilip");
//		students.add("Mahesh");
//		students.add("Rajesh");
//		students.add("Prabin");
//		students.add("Mahesh");
//		students.add("Rajesh");
//		students.add("Prabin");
//		students.forEach(System.out::println);
		
		TreeSet<String> names = new TreeSet<>();
		names.add("Rahul");
		names.add("Sharmila");
		names.add("Dilip");
		names.add("Mahesh");
		names.add("Rajesh");
		names.add("Prabin");
		names.add("Mahesh");
		names.add("Rajesh");
		names.add("Prabin");
		names.forEach(System.out::println);
		
	}
}
