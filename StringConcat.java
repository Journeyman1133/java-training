package JavaTraining;

public class StringConcat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String myString = ".com";
		String mystr = "www.google".concat(myString);
		System.out.println(mystr);
		
		String str = "Great";
		str = str.concat(" Ammar");
		System.out.println(str);
		
		System.out.println("Age of Tom is " + 25);
		
		int age = 24;
		System.out.println("Age of Jim is " + age);
		
		int foodBill = 25;
		int gasBill = 100;
		int totalBill = foodBill + gasBill;
		System.out.println(totalBill);
		System.out.println("Total bill is " + totalBill);
		System.out.println("Total bill is " + foodBill + gasBill);
		System.out.println("Total bill is " + (foodBill + gasBill));
	}

}
