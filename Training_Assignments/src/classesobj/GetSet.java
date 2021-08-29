package classesobj;

public class GetSet {

	private int id;
	private String name;
	private double salary;
	
	
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


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}


	public static void main(String[] args) {
		GetSet gs=new GetSet();
		
		gs.setId(1);
		gs.setName("MSD");
		gs.setSalary(7777);
		
		System.out.println("id::"+gs.getId());
		System.out.println("Name::"+gs.getName());
		System.out.println("Salary::"+gs.getSalary());
		
	}

}
