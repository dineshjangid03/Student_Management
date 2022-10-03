package module;

public class Student {
	private int id;
	private String name;
	private String mobile;
	private String address;
	private int age;
	Student(){
		
	}
	public Student( String name, String mobile, String address, int age) {
		super();
		this.name = name;
		this.mobile = mobile;
		this.address = address;
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Student(int id, String name, String mobile, String address, int age) {
		super();
		this.id = id;
		this.name = name;
		this.mobile = mobile;
		this.address = address;
		this.age = age;
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
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", mobile=" + mobile + ", address=" + address + ", age=" + age
				+ "]";
	}
	
	
	

}
