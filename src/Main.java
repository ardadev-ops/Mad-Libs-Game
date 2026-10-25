import java.util.Scanner;

public class Main {

    // Stellt eine Frage und gibt die Eingabe zurueck
    static String ask(Scanner scanner, String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== MAD LIBS: A DAY AT THE ZOO ===");
        System.out.println();

        String name        = ask(scanner, "Enter a friend's name: ");
        String adjective1  = ask(scanner, "Enter an adjective (e.g. sunny, weird): ");
        String number      = ask(scanner, "Enter a number: ");
        String food        = ask(scanner, "Enter a food in plural (e.g. pretzels): ");
        String animal      = ask(scanner, "Enter an animal: ");
        String adjective2  = ask(scanner, "Enter an adjective (e.g. fluffy, huge): ");
        String verb1       = ask(scanner, "Enter a verb ending in -ing (e.g. dancing): ");
        String color       = ask(scanner, "Enter a color: ");
        String sound       = ask(scanner, "Enter a sound (e.g. BOOM, squeak): ");
        String verb2       = ask(scanner, "Enter another verb ending in -ing: ");
        String exclamation = ask(scanner, "Enter an exclamation (e.g. Oh no, Wow): ");
        String bodyPart    = ask(scanner, "Enter a body part: ");
        String adverb      = ask(scanner, "Enter an adverb (e.g. quickly, loudly): ");
        String place       = ask(scanner, "Enter a place in a zoo (e.g. aquarium): ");
        String adjective3  = ask(scanner, "Enter an adjective (e.g. amazing): ");
        String adjective4  = ask(scanner, "Enter a feeling (e.g. happy, tired): ");

        System.out.println();
        System.out.println("=== YOUR STORY ===");
        System.out.println();

        System.out.println("Today I went to the zoo with my friend " + name + ".");
        System.out.println("It was a " + adjective1 + " day, and the line at the entrance was " + number + " meters long.");
        System.out.println("When we finally got in, " + name + " bought us a bag of " + food + " to share.");
        System.out.println("At the first exhibit, I saw a giant " + animal + ".");
        System.out.println("The " + animal + " was " + adjective2 + " and was " + verb1 + " right in front of us.");
        System.out.println(name + " laughed so hard that " + food + " flew out of their mouth.");
        System.out.println();
        System.out.println("Suddenly, the " + animal + " looked at us with its " + color + " eyes and made a loud " + sound + ".");
        System.out.println("Everybody in the crowd froze.");
        System.out.println("Then it started " + verb2 + " toward the fence!");
        System.out.println("A zookeeper ran over, shouting \"" + exclamation + "!\" and waving their " + bodyPart + " in the air.");
        System.out.println("Luckily, the " + animal + " just wanted some of our " + food + ".");
        System.out.println("We threw the whole bag over the fence, and the " + animal + " ate it " + adverb + ".");
        System.out.println();
        System.out.println("After that, we visited the " + place + ", but nothing could beat the " + animal + ".");
        System.out.println("On the way home, " + name + " said it was the most " + adjective3 + " day ever.");
        System.out.println("I felt " + adjective4 + " for the rest of the evening!");
        System.out.println();
        System.out.println("THE END");

        scanner.close();
    }
}