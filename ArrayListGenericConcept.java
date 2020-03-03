package JavaTraining;

import java.util.ArrayList;

public class ArrayListGenericConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> marklist = new ArrayList<Integer>();
		marklist.add(100);
		
		ArrayList<Double> bmiList = new ArrayList<Double>();
		bmiList.add(12.33);
		
		ArrayList<String> studentList = new ArrayList<String>();
		studentList.add("Tom");
		studentList.add("Jerry");
		
		ArrayList<String> loginPageLinkList = new ArrayList<String>();
		loginPageLinkList.add("Login");
		loginPageLinkList.add("Sign Up");
		loginPageLinkList.add("Forgot Password");
		loginPageLinkList.add("Privacy Policy");
		loginPageLinkList.add("Contact Us");
		
		System.out.println("Total links are on the login page is " + loginPageLinkList.size());
		
		for (int numLink = 0; numLink < loginPageLinkList.size(); numLink++) {
			System.out.println(loginPageLinkList.get(numLink));
			if (loginPageLinkList.get(numLink).equals("Privacy Policy")){
				System.out.println("Click on: " + loginPageLinkList.get(numLink));
				break;
			}
		}
	}
}