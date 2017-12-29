
public class A11dot2 {

	public static void main(String[] args) {

		Person p1 = new Person("Bob", "123 Main","555-1234", "bob@bob.com");
		System.out.println(p1);

		Student s = new Student("Ann", "223 South", "555-2345", "ann@ann.com", 3);
		System.out.println(s);

		Employee e = new Employee("Gerald", "345 W", "532-8625", "ger14@ger.com", "STC 123", 5000,
				new MyDate(2012, 6, 1));
		System.out.println(e);
		
		Faculty f = new Faculty("Sue", "456 North", "555-8946", "sue@sue.com", "SMI 234",150000,
				new MyDate(2005, 9, 10),"3-4", 4);
		System.out.println(f);
		
		Staff t = new Staff("Fred", "573 West", "555-9461", "fred@fred.com", "MAN 456",
				380000, new MyDate(2000, 1, 15), "Chief Cook and Bottle Washer");
		System.out.println(t);

	}

}

class Person{
	String name;
	String address;
	String phoneNumber;
	String email;

	Person(String name, String address, String phoneNumber, String email){
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.email = email;

	}
	public String toString(){
		return "Person - " + name;
	}

}

class Student extends Person{
	int status;

	Student(String name, String address, String phoneNumber, String email, int status){
		super(name, address, phoneNumber, email);
		this.status = status;
	}
	public String toString(){
		return "Student - " + name + " - " + status;
	}
}
class Employee extends Person{
	String office;
	int salary;
	MyDate dateHired;

	Employee(String name, String address, String phoneNumber, String email, String office, 
			int salary, MyDate dateHired){
		super(name, address, phoneNumber, email);
		this.office = office;
		this.salary = salary;
		this.dateHired = dateHired;	
	}
	public String toString(){
		return "Employee - " + name + " - " + dateHired;
	}
}
	class Faculty extends Employee{
		String officeHours;
		int rank;
		Faculty(String name, String address, String phoneNumber, String email, String office, 
				int salary, MyDate dateHired, String officeHours, int rank){
			super(name, address, phoneNumber, email, office, salary, dateHired);
			this.officeHours = officeHours;
			this.rank = rank;

		}
	
		public String toString(){
			return "Faculty - " + name + " - " + String.format("$%d", salary);
		}
	}

class Staff extends Employee{
	String title;
	Staff(String name, String address, String phoneNumber, String email, String office, 
			int salary, MyDate dateHired, String title){
		super(name, address, phoneNumber, email, office, salary, dateHired);
		this.title = title;	
}
	public String toString(){
		return "Staff - " + name + " - " + title;
	}
}
	class MyDate{
		int year;
		int month;
		int day;

		MyDate(int year, int month, int day){
			this.year = year;
			this.month = month;
			this.day = day;
		}

		public String toString(){
			return month + "/" + day + "/" + year;


		}
	
}


