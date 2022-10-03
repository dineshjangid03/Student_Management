package module;

public class Course {
	private int id;
	private String name;
	private int fees;
	private String duration;
	Course(){
		
	}
	public Course(int id, String name, int fees, String duration) {
		super();
		this.id = id;
		this.name = name;
		this.fees = fees;
		this.duration = duration;
	}
	public Course(String name, int fees, String duration) {
		super();
		this.name = name;
		this.fees = fees;
		this.duration = duration;
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
	public int getFees() {
		return fees;
	}
	public void setFees(int fees) {
		this.fees = fees;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", fees=" + fees + ", duration=" + duration + "]";
	}
	

}
