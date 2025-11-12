import java.util.Scanner;

public class Stng{

static Scanner s = new Scanner(System.in);

static void opn(){

//1
System.out.println("Display each character of 'Learning'.");
String word = "Learning";
for(int i = 0; i < word.length(); i++){
char ch = word.charAt(i);
System.out.println(ch);
}

//2
System.out.println ("Print the first and last character of 'Programming'. ");
String w = "Programming";
System.out.println("The first character is: " + w.charAt(0) + " and The last character is: " + w.charAt(w.length()-1));

//3
System.out.println ("Convert 'java is fun' to uppercase.");
String a = "java is fun";
String uppercase = a.toUpperCase();
System.out.println(uppercase);

//4
System.out.println ("Convert 'HELLO WORLD' to lowercase.");
String b = "HELLO WORLD";
String lowercase = b.toLowerCase();
System.out.println(lowercase);

//5
System.out.println("Count how many words are in 'Motivity Labs Hyderabad'.");
String c = "Motivity Labs Hyderabad ";
int count = 0;
for(int i=0; i<c.length(); i++){
if(c.charAt(i)==' ' || i == c.length()-1){
count = count+1;
}
}
System.out.println(count);

//6
System.out.println("Replace 'bad' with 'good' in 'This is a bad example'.");
String d = "This is a bad example";
String e = d.replace("bad" , "good");
System.out.println(e);


}

public static void main(String[] args){

opn();
}

}