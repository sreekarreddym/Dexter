package Employee;

public class TestInheritance //extends Person 

{	public static void main(String[] args) {
		
		Person m = new Manager();
		m.getName();
		
		System.out.println("Manager Name: " + m.getName());
		
		Person l = new Lead();
		//l.getAge();
		l.name();
		System.out.println("Lead minimum age: " + l.getAge());
		
		Person j = new Junior();
	    //j.getId();
	    j.age();
	    System.out.println("Junior Id starts from: " + j.getId());
		
		
	    
	    Manager s = new Manager();
	    s.getOrganization();
	    System.out.println("Organization name is : " + s.getOrganization());
		

	}

}
