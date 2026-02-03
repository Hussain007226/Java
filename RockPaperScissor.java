import java.util.Scanner;

public class RockPaperScissor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("User1 - Enter rock, paper, or scissors: ");
        String u1 = scanner.nextLine().toLowerCase();

        System.out.print("User2 - Enter rock, paper, or scissors: ");
        String u2 = scanner.nextLine().toLowerCase();

        if (!isValid(u1) || !isValid(u2)) {
            System.out.println("Invalid input! Please enter rock, paper, or scissors only.");
            return;
        }

        if (u1.equals(u2)) {
            System.out.println("It's a tie!");
        } else if (
            (u1.equals("rock") && u2.equals("scissors")) ||
            (u1.equals("paper") && u2.equals("rock")) ||
            (u1.equals("scissors") && u2.equals("paper"))
        ) {
            System.out.println("User1 wins!");
        } else {
            System.out.println("User2 wins!");
        }

    }
	
	static boolean isValid(String choice) {
    	return choice.equals("rock") || choice.equals("paper") || choice.equals("scissors");
	}


}
