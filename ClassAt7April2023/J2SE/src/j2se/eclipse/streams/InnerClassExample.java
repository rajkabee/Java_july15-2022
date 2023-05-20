package j2se.eclipse.streams;

import j2se.eclipse.streams.OuterClass.InnerClass;

public class InnerClassExample {
	public static void main(String[] args) {
		OuterClass oc = new OuterClass();
		InnerClass ic = oc.new InnerClass(); 
		ic.sn=123;
		ic.name="Inner Class Name";
		ic.display();
		oc.setColor("Green");
		System.out.println(ic.getColor());
	}
}

class OuterClass{
	private String color;
	class InnerClass{
		int sn;
		String name;
		public void display() {
			System.out.println("InnerClass...");
		}
		String getColor(){
			return color;
		}
	}
	void setColor(String color) {
		this.color=color;
	}
}
