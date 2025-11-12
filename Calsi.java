import java.util.Scanner;

public class Calsi{

static Scanner s = new Scanner(System.in);
static char op;
static void calculator(){
double result = 0;
while(op != '='){
System.out.println("Enter an Input: ");
int input = s.nextInt();
System.out.println("Enter operator'+,-,/,*,%,^,=': ");
op = s.next().charAt(0);

switch(op){
	case '=':
	System.out.println(result);
        break;
	case '+':
	result = result+input;
        break;
}

}
}

public static void main(String[] args){
calculator();
}
}