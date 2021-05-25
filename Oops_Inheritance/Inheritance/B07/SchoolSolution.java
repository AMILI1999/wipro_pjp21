class Person {
    String name, dateOfBirth;
    
    Person(String name, String dateOfBirth) {
    	this.name = name;
    	this.dateOfBirth = dateOfBirth;
    }
    
}

class Teacher extends Person {
	double salary;
    String subject;

    Teacher(String name, String dateOfBirth, String subject, double salary) {
    	super(name, dateOfBirth);
        this.subject = subject;
        this.salary = salary;
    }
    void display() {
        System.out.println("Teacher -" + " Name: " + name + ", Date of Birth: " + dateOfBirth + ", Subject: " + subject + ", Salary: " + salary);
    }
    
}

class Student extends Person {
	int studentId;
	
    Student(String name, String dateOfBirth, int studentId) {
    	super(name, dateOfBirth);
    	this.studentId = studentId;
	}

}

class CollegeStudent extends Student {
	String collegeName;
	String year;

    CollegeStudent(String name, String dateOfBirth, int studentId, String year, String CollegeName) {
    	super(name, dateOfBirth, studentId);
        this.year = year;
        this.collegeName = CollegeName;
    }
    
    void display() {
        System.out.println("Student -" + " Name: " + name + ", Date of Birth: " + dateOfBirth + ", Student ID: " + studentId + ", Year: " + year + ", College: " + collegeName);
    }

}

public class SchoolSolution {

	public static void main(String[] args) {
		
		Teacher teacher = new Teacher(" Prof.Chandra","27/01/1985", "Data Structures", 50000);
		CollegeStudent collegeStudent = new CollegeStudent("Amili","14/04/1999", 112016410, "Forth", "Sandip Foundation's");
        
		teacher.display();
		collegeStudent.display();
	}

}