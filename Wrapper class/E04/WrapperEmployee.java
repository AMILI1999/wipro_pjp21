public class WrapperEmployee implements Cloneable {
	private String name;
	
	public WrapperEmployee(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public WrapperEmployee clone() {
		try {
			return (Employee) super.clone();
		} catch (CloneNotSupportedException e) {
			System.out.println("Cloning Not Allowed");
			return this;
		}		
	}
	public static void main(String[] args) {
		
		WrapperEmployee emp = new WrapperEmployee("Amili Pal");
		WrapperEmployee empClone = emp.clone();
		
		empClone.setName("Tanaya");
		
		System.out.println(empClone.getName());
		System.out.println(emp.getName());
	}

}