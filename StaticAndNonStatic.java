package JavaTraining;

public class StaticAndNonStatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	// When calling a static method, no need to create an object
	// When calling a non static method, we need to create objects
	StaticAndNonStatic stat = new StaticAndNonStatic();
	stat.getName(); // Calling the non static method
	
	StaticAndNonStatic.getSchoolName(); // Calling static method - 1st way
	getSchoolName(); // Calling static method - 2nd way - calling it directly

	}

	public void getName(){ //non static method + return type is void - no return
		System.out.println("Get Name Method");
		System.out.println("This is non static method");
	}
	public static void getSchoolName() {
		System.out.println("Get School Name Method");
		System.out.println("This is static method");
		
	}
	
}
