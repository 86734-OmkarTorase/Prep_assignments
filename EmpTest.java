package asignment;

public class EmpTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1=new Employee();
		e1.setFname("Omkar");
		e1.setLname("Torase");
		e1.setSalary(10000);
		System.out.println(e1.getFname()+" "+e1.getLname()+" "+e1.getSalary());
		
		

	}

}
class Employee{
	String Fname,Lname;
	int Salary;
	public String getFname() {
		return Fname;
	}
	public void setFname(String fname) {
		Fname = fname;
	}
	public String getLname() {
		return Lname;
	}
	public void setLname(String lname) {
		Lname = lname;
	}
	public int getSalary() {
		return Salary;
	}
	public void setSalary(int salary) {
		Salary = salary;
	}
	
	
}
