package j2se.eclipse.streams;

public class Person {
	private int sn;
	private String name;
	private int age;
	private Gender gender;
	public Person() {
		super();
	}
	public Person(int sn, String name, int age, Gender gender) {
		super();
		this.sn = sn;
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	public int getSn() {
		return sn;
	}
	public void setSn(int sn) {
		this.sn = sn;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Person [sn=" + sn + ", name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
	
	
	
}
