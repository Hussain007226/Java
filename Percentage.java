import java.util.Scanner;
public class Percentage{


	public static void main(String[] args){

	System.out.println("****Taking Input from the Student of CBSE Bard for calculating their percentage****");
	System.out.println();

	Scanner sc = new Scanner(System.in);      
	System.out.println("Enter Marks out of 100 for each subject!");	
	
	System.out.print("Enter Marks in Subject1:");
	int a = sc.nextInt();                   
	
	System.out.print("Enter Marks in Subject2:");
	int b = sc.nextInt();   

	System.out.print("Enter Marks in Subject3:");
	int c = sc.nextInt();                   

	System.out.print("Enter Marks in Subject4:");
	int d = sc.nextInt();                   

	System.out.print("Enter Marks in Subject5:");
	int e = sc.nextInt();   

	float Total_marks = a + b + c + d + e;
	System.out.println("Addition of numbers given is:" +(Total_marks));

	//int p = a+b+c+d+e/500

	float Percentage = (Total_marks / 500)*100f;
	System.out.print("Percentage you got:"+(Percentage));
	System.out.println("%");

	}
}