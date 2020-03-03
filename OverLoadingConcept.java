package JavaTraining;

public class OverLoadingConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Overloading Concept is within the same class
		// different methods
		// every method has same names but they have different number/types of parameters
		// many + Forms = Polymorphism
		
		OverLoadingConcept ov = new OverLoadingConcept();
		ov.login();
		ov.login("Bob");
		ov.login(4444444);
		ov.login("test@gmail.com", "test123", "developer");
		
	}
	public void login(){
		System.out.println("0 Parameter Login Method");
	}
	public void login(String userName){ // Same name method - different type
		System.out.println("Username: "+ userName);
	}
	public void login(long phoneNum) {
		System.out.println("1 Parameter Login Method");
	}
	
	public void login (String email, String password, String role){
		System.out.println("3 Parameter Login Method");
	}
	
}
