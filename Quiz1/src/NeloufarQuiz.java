import java.util.Scanner;


public class NeloufarQuiz {
		
		 public static void main(String[] args) {
			 
		 Scanner kbd = new Scanner(System.in);
	     
	     System.out.println("Enter your username: ");
	     
	     String name, password;
	     
	     name = kbd.next();
	   
	     System.out.println("Enter your password: ");
	     
	     password = kbd.next();
	     
	     System.out.println("Hello  " + name + ", Welcome to CSC200 class! and Your password is " + password );
		
		 }
		 
	}