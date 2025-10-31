// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
	int max = Integer.parseInt(args[0]);
	int min = 0;
	int rand1 = (int)(Math.random() * (max - min + 1) + min);
	int rand2 = (int)(Math.random() * (max - min + 1) + min);
	int rand3 = (int)(Math.random() * (max - min + 1) + min);
	System.out.println(rand1 + " " + rand2 + " " + rand3);

	
	}
}
