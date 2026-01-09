 import java.util.Scanner;
public class ifelse{
	public static void main(String[] args){

		System.out.println("All this so that I can score 100 in JAVA and 95 percent in 4 Sem");
		System.out.println(" ");
		System.out.println(" ");

		
		System.out.println("Enter the weak day");
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		switch(a){
		case 1:
			System.out.println("Today is Monday");
			break;
		case 2:
			System.out.println("Today is Tuesday");
			break;  
		case 3:
			System.out.println("Today is Wednesday"); 
			break;
		case 4:
			System.out.println("Today is Thursday");
			break; 
		case 5:
			System.out.println("Today is Friday"); 
			break;
		case 6:
			System.out.println("Today is Saturday"); 
			break;
		case 7:
			System.out.println("Today is Sunday"); 
			break;
	
		default:
			System.out.println("There is no weak day as the number you gave!");


		}
		


		System.out.println("Enter two numbers Num1 and Num2");
		Scanner w = new Scanner(System.in);
		
		int Num1 = w.nextInt();
		int Num2 = w.nextInt();
		
		if(Num1 > Num2){
		System.out.println("Num1 is greater then Num2");
		}
		else if(Num1 < Num2){
		System.out.println("Num2 is greater then Num1");
		}			
     		else{
		System.out.println("they are equal");
		}
		

	}


}
