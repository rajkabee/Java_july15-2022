package myFirstJavaProject.jdbc.connection;

public class User {
	private int id;
	private String username;
	private String password;
	private String roles;
	private boolean active;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(int id, String username, String password, String roles, boolean active) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.roles = roles;
		this.active = active;
	}
	public User(String username, String password, String roles, boolean active) {
		super();
		this.username = username;
		this.password = password;
		this.roles = roles;
		this.active = active;
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
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", roles=" + roles + ", active="
				+ active + "]";
	}
	
}
