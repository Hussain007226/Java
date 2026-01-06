import java.util.Scanner;
public class H{


	public static void main(String[] args){

	System.out.println("Taking Input from the user");
	Scanner sc = new Scanner(System.in);

	System.out.println("Enter Number 1");
	int a = sc.nextInt();
	
	System.out.println("Enter Number 2");
	int b = sc.nextInt();
	
	System.out.println("Addition of numbers given is:" +(a+b));
	
	boolean b1 = sc.hasNextInt();
	System.out.println(b1);
	
	String str = sc.nextLine();
	System.out.println(str);


	}

}
