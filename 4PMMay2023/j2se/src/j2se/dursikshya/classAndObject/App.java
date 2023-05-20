package j2se.dursikshya.classAndObject;

public class App {
	public static void main(String[] args) {
		//Dog dog = new Dog();
		Dog dog = new Dog(2, "German Shepherd", "brown and black");
		//dog.age=3;
		//dog.breed="Golden Retriever";
		//dog.color="Golden";
		System.out.println(dog.breed+"\t"+dog.color+"\t"+dog.age);
		dog.feed();
		dog.kick();
		
		
	}
}
