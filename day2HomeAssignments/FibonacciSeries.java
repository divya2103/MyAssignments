package day2HomeAssignments;


public class FibonacciSeries {

	public static void main(String[] args) {
		int a=0,b=1,s,n=8;

		for(int i=0;i<n;i++)
		{
		    System.out.println(a);
		    s=a+b;
		    a=b;
		    b=s;	    
		}
	}
}
