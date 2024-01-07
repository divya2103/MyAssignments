package week1.day2;

public class Browser {

	public static void main(String[] args) {
		Browser obj = new Browser();
		String browserDetails = obj.launchBrowser("Browser launched successfully");
		System.out.println(browserDetails);
        obj.loadUrl();
	}
public String launchBrowser(String browserName) {
	return browserName;
}
void loadUrl()
{
	System.out.println("Application url loaded successfully");
}

}
