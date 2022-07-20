package calculator;
import java.util.Scanner;
public class calci {
		public static void main(String[] args)
		{
			try (Scanner Calculator = new Scanner(System.in)) {
				System.out.
				print("Enter the first num = ");
				int a = Calculator.nextInt();
				System.out.print("Enter the secound num = ");
				int b = Calculator.nextInt();
				System.out.print("Choose (+, -, *, /, %) = ");
				char op = Calculator.next().charAt(0);
				solve(a, b, op);
			}
		}
		public static int solve(int a, int b, char op)
		{
			int ans = 0;
			if (op == '+') {
				ans = a + b;
			}
			else if (op == '-') {
				ans = a - b;
			}
			else if (op == '*') {
				ans = a * b;
			}
			else if (op == '%') {
				ans = a % b;
			}
			else if (op == '/') {
				ans = a / b;
			}
			System.out.println("Your answer is = " + ans);
			return ans;
		}
	
}
