package asignment;

public class EmpSal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee1 e1=new Employee1("Omkar",400000);
		Employee1 e2=new Employee1("Nil",450000);
		System.out.println("Information before giving raise");
		System.out.println("Name= "+e1.getName()+"\nYearly salary= "+e1.getYearsal());
		System.out.println("Name= "+e2.getName()+"\nYearly salary= "+e2.getYearsal());
		System.out.println("Salary after raise");
		e1.raise(30);
		e2.raise(40);
		
		
		System.out.println("Name= "+e1.getName()+"\nYearly salary= "+e1.getYearsal());
		System.out.println("Name= "+e2.getName()+"\nYearly salary= "+e2.getYearsal());
	}

}
class Employee1{
	String name;
	double yearsal;
	public Employee1(String name, double yearsal) {
		
		this.name = name;
		this.yearsal = yearsal;
	}
	public String getName() {
		return name;
	}
	
	public double getYearsal() {
		return yearsal;
	}
	public void raise(double per) {
		yearsal+=(yearsal*per/100);
	}
	
	
	
}