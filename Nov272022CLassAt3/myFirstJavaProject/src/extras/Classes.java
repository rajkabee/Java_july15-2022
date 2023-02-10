package extras;

public class Classes {
	public static void main(String[] args) {
		User pradip = new User();
		pradip.id=123;
		pradip.username="pradip";
		pradip.setPassword("pradip234");
		pradip.roles="manager";
		pradip.active=true;
		User sangita=new User();
		sangita.id=1234;
		sangita.username="sangita";
		sangita.setPassword("sangita234");
		sangita.roles="Admin";
		sangita.active=true;
		sangita.show();
		User prity = new User(321,"prity", "prity3454", "moderator", true);
		prity.show();
	}
	
	
	
	
}
