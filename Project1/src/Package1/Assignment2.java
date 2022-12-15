package Package1;

public class Assignment2 {
	
	public int sum(int a, int b)
	{
		
		int c;
		c=a+b;
		System.out.println("Sum is "+c);
		return c;	
		
	}
	
	public int sub(int i, int j)
	{
		int k;
		k=i-j;
		System.out.println("Difference is "+k);	
		return k;
	}
	
	public int multi(int p, int q)
	{
		int r;
		r=p*q;
		System.out.println("Product is "+r);
		return r;
	}
	
	public void div(int x, int y)
	{
		int z;
		z=x/y;
		System.out.println("Division is "+z);
		
	}
	public static void main(String[] args) {
		
		Assignment2 book = new Assignment2();
		int multiresult = book.multi(10,2);
		int subresult1 = book.sub(multiresult, 2);
		int sumresult = book.sum(subresult1, 2);
		int subresult2 = book.sub(sumresult, 2);
		book.div(subresult2, 2);
		
	}

}
