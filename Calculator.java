import java.util.Scanner;
public class Calculator{

	public void cal(double a, char c, double b){
		
		double result;
		switch(c){
			case 'q':
			System.out.println("Thank You, Bye");
                    	break;
			case '+':
			result = a+b;
			System.out.println(result);
                    	break;
			case '-':
			result = a-b;
			System.out.println(result);
                    	break;
			case '*':
			result = a*b;
			System.out.println(result);
                    	break;
			case '/':
			result = a/b;
			System.out.println(result);
                    	break;
			case '%':
			result = a%b;
			System.out.println(result);
                    	break;
		}
	}



	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter first number");
		double a = s.nextDouble();
		System.out.println("Enter Operator '+/-%*' or q to quit ");
		char c = s.next().charAt(0);
		System.out.println("Enter second number");
		double b = s.nextDouble();

		Calculator calsi = new Calculator();
		calsi.cal(a, c, b);
		
	}
}