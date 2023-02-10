package extras;

public class User{
	int id;
	String username;
	private String password;
	String roles;
	boolean active;
	
	public User() {
	}

	public User(int id, String username, String password, String roles, boolean active) {
		this.id=id;
		this.username=username;
		this.password=password;
		this.roles=roles;
		this.active=active;
	}
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRoles() {
		return roles;
	}

	public void setRoles(String roles) {
		this.roles = roles;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	void show(){
		System.out.println(username+": "+roles);
	}
}
