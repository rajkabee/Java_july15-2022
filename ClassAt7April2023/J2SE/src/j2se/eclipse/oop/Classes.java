package j2se.eclipse.oop;

public class Classes {
	public static void main(String[] args) {
		Dog dog1 = new Dog();
		dog1.age=3;
		dog1.breed="Japanese Spitz";
		dog1.color="white";
		Dog dog2 = new Dog(2, "Golden Retriever", "golden");
		dog1.pet();
		dog1.kick();
		dog1.display();
		dog2.display();
	}
	
	
	
	static class Dog{
		int age;
		String breed;
		String color;
		public Dog(int age, String breed, String color) {
			this.age = age;
			this.breed = breed;
			this.color=color;
		}
		public Dog(String breed, String color) {
			this.breed = breed;
			this.color=color;
		}
		public Dog() {
		}
		
		public void pet() {
			System.out.println("Wagging tail!");
		}
		public void kick() {
			System.out.println("Bark and bite!");
		}
		public void display() {
			System.out.println(this.breed+" "+this.age+"years "+this.color);	
		}
		
	}
	
	
	
	
}


/*
	main  concepts of oop
	inheritance
	Encapsulation
	abstraction
	polymorphism

 */
