package myFirstJavaProject.classAndObjects.Encapsulation;

public class Post {
	private int id;
	private String title;
	private String body;
	public void setId(int id){
		this.id=id;
	}
	public int getId() {
		return this.id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	
}