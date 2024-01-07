package week1.day2;

public class JumpStatement {

	public static void main(String[] args) {
int num =6;
for (int i = 0; i <= num; i++) {
	if(i==5)
	{
		System.out.println("i used break statement " + i);
		break;
	}
	System.out.println(i);
	
}
System.out.println("--------------------------");
for (int i = 0; i < 10; i++) {
	if(i==7)
	{
		System.out.println("It's bug test case:" + i);
		continue;
	}
	System.out.println(i);
	
}
	}

}
