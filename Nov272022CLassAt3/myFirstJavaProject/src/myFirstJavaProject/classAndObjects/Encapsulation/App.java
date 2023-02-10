package myFirstJavaProject.classAndObjects.Encapsulation;

public class App {
	public static void main(String[] args) {
		Post post = new Post();
		post.setId(123);
		post.setTitle("World Cup Update");
		post.setBody("Argentina went to finals by defeating Croatia!");
		System.out.println(post.getId()+". "+post.getTitle()+"\n"+post.getBody());
	}
}
