import java.util.Scanner;
public class DigitStripping
	{

		public static void main(String[] args)
			{
			Scanner userIntInput = new Scanner(System.in);
			System.out.println("Type a random number");
			int number = userIntInput.nextInt();
			int reversed = 0;
			
			while(number != 0)
				{
				int remanider = number % 10;
				reversed = reversed * 10 + remanider;
				number /=  10;
					
				}
			System.out.println("The reversed is " + reversed + " ");

			}

	}
