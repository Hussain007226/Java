 import java.util.Scanner;
public class ifelse{
	public static void main(String[] args){

		System.out.println("All this so that I can score 100 in JAVA and 95 percent in 4 Sem");
		System.out.println(" ");
		System.out.println(" ");

		
		System.out.println("Enter A and B:");
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		
		if(a>b){
		System.out.println("A is greater then B");
		}
		else if(a<b){
		System.out.println("A is smaller then B");
		}			
     		else{
		System.out.println("they are equal");
		}


	}

}