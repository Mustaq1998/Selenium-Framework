package Automation.Selenium_Framework;

public class Reverse_String {

	public static void main(String[] args) {
		String name = "Zakriya";
		String reverse = "";
		
		int length=name.length();
		
		for (int i=length-1; i>=0; i--)
		{
			reverse=reverse+name.charAt(i);
		}
		
		System.out.println("Reverse string is: "+ reverse);

	}

}
