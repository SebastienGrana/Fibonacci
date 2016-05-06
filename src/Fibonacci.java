
public class Fibonacci {

	public static void main(String[] args) {
		int number=1;
		int lastnumber = 0;
		for (int i = 1; i < 20; i++) {
			lastnumber = number;
			System.out.println(" " + number);
			number = lastnumber + number;
			
			}
		}

	}
