package JavaTraining;

public class ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Printing 1 to 10 using for loop
		for(int i=0; i<=10; i++){
		System.out.println(i);}
		
		// Even numbers from 1 to 10
		for(int even=2; even<=10; even=even+2){
			System.out.println(even);}
		
		// for if
		for (int s=1; s<=15; s++){
			System.out.println(s);
			if (s==5) {
				System.out.println("This is a feature from for loop");}
		}
		
		// Print Java is Fun! after every 5 numbers
		for (int b=1; b<=20; b++){
			System.out.println(b);
			if (b%5==0) {
				System.out.println("Java is Fun!");}
		}
	}

}
