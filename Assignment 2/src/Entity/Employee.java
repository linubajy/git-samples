package Entity;

public class Employee 
{
	private int id;
	private String name;
	private String track;
	private String phone;
	private String role;
	public Employee() 
	{
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int id, String name, String track, String phone, String role) {
		super();
		this.id = id;
		this.name = name;
		this.track = track;
		
		this.phone = phone;
		this.role = role;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTrack() {
		return track;
	}
	public void setTrack(String track) {
		this.track = track;
	}
	
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	
	
}
