
import java.util.Scanner;

public class Conversation {

    public static void main(String[] args) {
        String simulatedInput = "I'm good\nNothing\n";
        Scanner scanner = new Scanner(System.in);

        System.out.println("Greetings! How are you doing?");
        String first = scanner.nextLine();
        System.out.println("Oh, how interesting. Tell me more!");
        String second = scanner.nextLine();
        System.out.println("Thanks for sharing!");

        scanner.close();

    }
}
