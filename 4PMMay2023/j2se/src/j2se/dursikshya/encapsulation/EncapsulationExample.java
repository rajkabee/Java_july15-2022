package j2se.dursikshya.encapsulation;

public class EncapsulationExample {
	public static void main(String[] args) {
		Person p = new Person();
//		p.id=123;
//		p.name="Ratan Tata";
//		p.address="Mumbai";
		p.setId(123);
		p.setName("Ratan Tata");
		p.setAddress("Mumbai");
		System.out.println(p.getId()+". "+p.getName()+"\t"+p.getAddress());
	}
}
