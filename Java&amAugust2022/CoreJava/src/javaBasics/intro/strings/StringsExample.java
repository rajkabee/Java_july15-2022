package javaBasics.intro.strings;

public class StringsExample {
	public static void main(String[] args) {
		char ch = 'r';
		char[] name = {'s','a','m','e','e','r'};
		String person = new String("Sameer is a good person!");
		System.out.println(ch);
		System.out.println(name);
		System.out.println(person);
		System.out.println(name.length);
		System.out.println(person.length());
		System.out.println(person.charAt(0));
		System.out.println(person.compareTo("Rzzzzzzzzzz"));
		System.out.println(person.concat(" Khadka"));
		System.out.println(person+" Khadka");
		System.out.println(person.endsWith("re"));
		String str = "You are %d years old";
		System.out.println(str.formatted(27));
		System.out.println(String.format("You are %d years old", 22));
		System.out.println(person.equals("sameer"));
		System.out.println(person.equalsIgnoreCase("sameer"));
		System.out.println(person.indexOf('e'));
		System.out.println(person.lastIndexOf('e'));
		System.out.println(person.indexOf('e', 6));
		System.out.println(person.replace("good", "sincere"));
		str="        sameer is a goood boy     ";
		System.out.println(str+"end");
		System.out.println(str.trim()+" end");
		System.out.println(person.toUpperCase());
		System.out.println(person.toLowerCase());
		
		
	}
}
