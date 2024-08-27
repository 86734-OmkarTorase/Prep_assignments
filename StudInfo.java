package asignment;

public class StudInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1,s2,s3;
		s1=new Student("Omkar","20UGCS19453",590);
		s1.result();

	}

}

class Student{
	String name;
	String rollno;
	int marks;
	public Student(String name,String rollno,int marks) {
		this.name=name;
		this.rollno=rollno;
		this.marks=marks;
	}
	public void result() {
		System.out.print("Name = "+name+"\nRollno = "+rollno+"\nMarks = "+marks);
	}
	
}