package Package1;

public class Arithmetic {
	public int sum(int a, int b)
	{
		int c;
		c = a + b;
		System.out.println("Sum is " +c);
		System.out.println("Trying once again.");
		
		return c;
	}
	
	public int sub(int x, int y)
	{
		int z;
		z = x - y;
		System.out.println("Difference is " +z);
		
		return z;
		
	}
	
	public void multi(int p, int q)
	{
		int r;
		r = p * q;
		System.out.println("Product is " +r);
		
	}
	
	public static void main(String[] args) {
		
		Arithmetic cal = new Arithmetic();
		int sumresult = cal.sum(10,2);
		int subresult = cal.sub(10, 2);
		cal.multi(sumresult, subresult);
		System.out.println("Yay! I am learning JAVA finally...");
		
	}
	

}
