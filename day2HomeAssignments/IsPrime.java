package day2HomeAssignments;

public class IsPrime {

	public static void main(String[] args) {

		int num = 114;
		 boolean prime = false;
			
		for(int i=2; i< num/2; i++)
		{
			if(num%i==0)
			{
				prime=true;
				break;
			}
		}
		if(prime)
		{
			System.out.println("Not a Prime Number");
		}
		else
		{
			System.out.println("Prime Number");
		}
		
	}

}
