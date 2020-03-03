package JavaTraining;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee emp1 = new Employee();
		emp1.firstName = "Mike";
		emp1.email = "mike@gmail.com";
		emp1.jobTitle = "Scrum Master";
		emp1.hourlySalary = 65.50;

		emp1.work();
		System.out.println("First Name: " + emp1.firstName);
		System.out.println("Email: " + emp1.email);
		System.out.println("Job: " + emp1.jobTitle);
		System.out.println("Hourly Salary: " + emp1.hourlySalary);
	}

}
