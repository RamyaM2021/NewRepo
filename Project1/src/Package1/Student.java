package Package1;

public class Student {
	int rollno; int age;
	public void Display1()
	{
	System.out.println("Welcome to all of you.");		
	}
	public void Display2 ()
	{
		System.out.println("Automation is very easy.");
	}
	public static void main(String[] args) {
		
		Student Ramya = new Student();
		Ramya.rollno=20;
		System.out.println("Roll number = " +Ramya.rollno);
		Ramya.age=18;
		System.out.println("Age = " +Ramya.age);
		System.out.println("Age = " +Ramya.age);
		System.out.println("Age = " +Ramya.age);
		Ramya.Display1();
		Ramya.Display2();
		
		
	}

}
