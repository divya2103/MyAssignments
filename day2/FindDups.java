package week1.day2;


public class FindDups {

	public static void main(String[] args) {
int[] age = {12,23,65,34,65,12};

for (int i = 0; i < age.length; i++) {
	for (int j = i+1; j < age.length; j++) 
	{
		if(age[i] == age[j])
		{
			System.out.println("Duplicated element is " + age[j]);
		}
		
	}
	
}
	}

}
