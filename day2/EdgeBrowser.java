package week1.day2;

public class EdgeBrowser {

	public static void main(String[] args) {

		Browser obj = new Browser();
	String browserDet =	obj.launchBrowser("Browser launched successfully");
	System.out.println(browserDet);
		obj.loadUrl();
		
	}

}
