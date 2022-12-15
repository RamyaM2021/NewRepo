package Package1;

public class Construct {
	
	public Construct()
	{	this (1,2,3);
		System.out.println("This is Default Constructor.");
	}
	public Construct(int a)
	{	this();                                                                   // This will call the Default Constructor.
		System.out.println("This is One parametrized Constructor.");
	}
	
	public Construct (int a, int b)
	{	this(3);                                                                  // This will call the 1 parameterized Constructor.
		System.out.println("This is 2 parametrized Constructor.");
		System.out.println("Trial1");
	}
	public Construct (int a, int b, int c)
	{		
		System.out.println("This is 3 parametrized Constructor.");
	}
	public Construct (int a, int b, int c, int d)
	{	this(1, 2);
		System.out.println("This is 4 paramaterized Constructor.");
	}
	public static void main(String[] args) {
		Construct obj = new Construct(1, 2, 3, 4);                                 //The arguments inside the obj declaration will call the 2 parameterized Constructor directly.
	}
	
	
}
