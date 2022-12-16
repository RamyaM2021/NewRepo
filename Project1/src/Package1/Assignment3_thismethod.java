package Package1;

public class Assignment3_thismethod {
	
	public void m1()
	{
		this.m4(1, 2, 3);
		System.out.println("This is a Default method.");
	}
	public void m2(int a)
	{
		this.m1();
		System.out.println("This is One parametized method.");
	}
	public void m3(int b, int c)
	{
		this.m2(5);
		System.out.println("This is a Two parameterized method.");
	}
	public void m4(int a, int b, int c)
	{
		System.out.println("This a Three parameterized method.");
	}
	public void m5(int p, int q, int r, int s)
	{
		this.m3(5,6);
		System.out.println("This a Four parameterized method.");
	}
	public static void main(String[] args) {
		
		Assignment3_thismethod Ramya = new Assignment3_thismethod();
		Ramya.m5(1, 2, 3, 4);
	}
	
	
	
	
	
	

}
