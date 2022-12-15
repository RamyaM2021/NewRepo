package Package1;

public class Assignment1 {
	
	public int sum (int a, int b) 
	{
		int c;
		c = a+b;
		System.out.println("Sum is "+c);
		
		return c;
		
	}

	public int sub (int p, int q)
	{
		int r;
		r = p-q;
		System.out.println("Sub is "+r);
		
		return r;
	}
	
	public int multi (int i, int j)
	{
		int k;
		k = i*j;
		System.out.println("Product is "+k);
		
		return k;
		
	}
	
	public void div (int x, int y)
	{
		int z;
		z = x/y;
		System.out.println("Division is "+z);
	}
	
	public static void main(String[] args) {
		
		Assignment1 act = new Assignment1();
		int sumresult1 = act.sum(10, 2);
		int sumresult2 = act.sum(sumresult1, 2);
		int subresult = act.sub(sumresult2, 2);	
		int multiresult = act.multi(subresult, 2);
	    act.div(multiresult, 2);
	   
	}
	
	
	
}
