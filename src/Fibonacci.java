
public class Fibonacci {

	public static void main(String[] args) {
		int number=1;
		int number2=1;
		int interNumber=0;
		System.out.println(" " + 0);
		System.out.println(" " + number);
		System.out.println(" " + number2);
		
		for (int i = 1; i < 20; i++) {
			
			
			interNumber = number2 + number; //calcule n3 = n1 + n2
			System.out.println(" " + interNumber);
			number2 = number;
			number = interNumber;
			
			
			}
		}

	}
