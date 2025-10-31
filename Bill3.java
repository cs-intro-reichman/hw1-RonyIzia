// Splits a restaurant bill evenly among three diners.
public class Bill3 {
	public static void main(String[] args) {
		// To get you started, here is the first line in the program:
	     String name1 = args[0]; // Dana	
	     String name2 = args[1]; // Rony
	     String name3 = args[2]; // Shaked
		 double amount = Double.parseDouble(args[3]); // bill amount
		 double check = amount / 3; // each diner's share
		 double FinalCheck = Math.ceil(check);
		 System.out.println("Dear " + name3 + ", " + name2 + " and " + name1 + ": pay " + FinalCheck + " Shekels each.");

	}
}
