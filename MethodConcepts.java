package JavaTraining;

import java.util.jar.Attributes.Name;

public class MethodConcepts {

	// String name = "Bob"; // public variable
	
	public static void main(String[] args) { // You cannot create a method here since it is also a method
		// TODO Auto-generated method stub
		
		MethodConcepts obj = new MethodConcepts(); // Object - created using new
		obj.test(); // Calling Method - name is test
		obj.getName(); // Calling getName Method
		String nString = obj.getTrainerName(); // Calling Another Method
		System.out.println(nString); // 1st printing way
		System.out.println(obj.getTrainerName()); // 2nd printing way
		
		System.out.println(obj.addition(11, 22));
		
		// double grades = obj.getStudentGrades("Bob"); // There is no Bob in the method below
		double grades = obj.getStudentGrades("Tom");
		// System.out.println(grades);
		System.out.println(grades);
		
		if (obj.isUSCitizen("John")) {
			System.out.println("Free Medical");
		}
		
	}
	
	// Creating a Method in Class and Calling it from anywhere
	// You need to create a method in class
	// Simple Method - No Input No Return
	
	// void means no return data
	public void test() {
		System.out.println("First Simple Method");
	}
	
	public void getName() {
		System.out.println("United States");
		String name = "Bob";
		System.out.println(name); // local variable
	}

	public String getTrainerName(){ // return method
		String name = "Bob";
		return name;
	}
	
	public int addition (int x, int y) {
		System.out.println("Addition Method:");
		int m = x + y;
		return m;
	}
	
	public double getStudentGrades(String student){
		System.out.println("Get Student's Grade: ");
		
		if (student.equals("Tom")) {
			return 90;
		} else if (student.equals("Smith")){
			return 99;
		} else if (student.equals("Jack")) {
			return 99;
		} else {
			System.out.println(student + " is not defined.");
		}
		return 0;
	}
	
	public boolean isUSCitizen(String personName){
		System.out.println("is a US citizen");
		
		if (personName.equals("Kim")) {
		return false;
		} else if (personName.equals("John")){
			return true;
		}
		return false;
	}
	
}
