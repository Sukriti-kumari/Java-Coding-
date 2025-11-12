import java.util.Scanner;
public class Operations{
	
	static Scanner s = new Scanner(System.in);

	static void length(){

	System.out.println("Enter the string ");
	String st = s.nextLine();
	int len = st.length();
	System.out.println("The length of string is: " + len);

	}
        
	static void isEqual(){
	
	System.out.println("Q. Compare two strings for equality ignoring case.");
	String a= "SUKRITI";
	String b= "sukriti";
	boolean areEqual = a.equalsIgnoreCase(b);
	System.out.println(areEqual);
	}
	
	static void leapYear(){
	
	System.out.println("Q. Write a program to check if a year is a leap year.");
	System.out.println("Enter the year: ");
	int y = s.nextInt();
	y = y%4;
	if(y==0){
	System.out.println("The year is a leap year ");
	}
	else{
	System.out.println("The year is not a leap year: ");
	}
	}


	static void area(){
	System.out.println("Q. Calculate area and perimeter of a rectangle.");
	System.out.println("Enter the length of rectangle: ");
	int l = s.nextInt();
	System.out.println("Enter the width of rectangle: ");
	int w = s.nextInt();
	int area = l * w;
	int perimiter = (2*l)+(2*w);
	System.out.println("area of a rectangle is: " + area + " and Perimiter of a rectangle is: " + perimiter);

	}

	static void sum(){
	System.out.println("Q. Take value from user untill the user enters value zero, print sum of all entered value");
	int add = 0;
	int value;
	int v = 1;
	while(v != 0){
	System.out.println("Enter the number: ");
	value = s.nextInt();
	add = add + value;
	v = value;
	}
	System.out.println("Sum of entered number is: " + add);

	}

	static void numIdentify(){
	System.out.println("Q. Check whether a number is positive, negative, or zero.");
	System.out.println("Enter a number: ");
	int a = s.nextInt();
	if (a == 0){
		System.out.println("The entered value is Zero");
	}
	else if (a > 0){
		System.out.println("The entered value is posetive");
	}
	else{
		System.out.println("The entered value is Negative");
	}	
	}


	static void swap(){
	System.out.println("Q. Write a program to swap two numbers without using a third variable.");
	System.out.println("Enter value of a: ");
	int a = s.nextInt();
	System.out.println("Enter value of b: ");
	int b = s.nextInt();
	a = a+b;
	b = a-b;
	a = a-b;
	System.out.println("Swaped value of a & b is: " + a +(" and ")+ b);	
	}

	static void table(){
	System.out.println("Q. Print Table of given number.");
	System.out.println("Enter the number: ");
	int n = s.nextInt();
	for(int i = 1; i<=10; i++){
 	int table = n * i;
	System.out.println(n + " * "+ i + " = " + table);

	}
	

	}

public static void main(String[] args){

	Operations op = new Operations();
	
	//op.swap();
	//numIdentify();
	//sum();
	//area();
	//leapYear();
	//isEqual();
	//length();
	table();

}
}