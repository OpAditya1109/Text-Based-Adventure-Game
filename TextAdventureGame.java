import java.util.Scanner;

public class TextAdventureGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Text Adventure Game!");
        System.out.println("You find yourself in a mysterious forest.");

        System.out.println("As you walk deeper into the forest, you encounter two paths: ");
        System.out.println("1. The path through the dense trees.");
        System.out.println("2. The path along the sparkling stream.");

        int pathChoice = scanner.nextInt();

        if (pathChoice == 1) {
            System.out.println("You chose the path through the dense trees.");
            System.out.println("You hear strange noises coming from the bushes. What will you do?");
            System.out.println("1. Investigate the noise.");
            System.out.println("2. Ignore the noise and continue on.");

            int treeChoice = scanner.nextInt();

            if (treeChoice == 1) {
                System.out.println("You investigate the noise and find a family of rabbits. They lead you to a hidden path.");
                System.out.println("Do you follow the rabbits? (yes/no)");

                String followRabbits = scanner.next();
                if (followRabbits.equalsIgnoreCase("yes")) {
                    System.out.println("You follow the rabbits and discover a magical clearing with a fountain.");
                    System.out.println("Congratulations! You've found the secret sanctuary!");
                } else {
                    System.out.println("You decide not to follow the rabbits and continue on your path.");
                    System.out.println("Unfortunately, you get lost in the forest and cannot find your way out.");
                    System.out.println("Game over!");
                }
            } else if (treeChoice == 2) {
                System.out.println("You ignore the noise and continue on the path.");
                System.out.println("You encounter a wise old owl who offers you guidance.");
                System.out.println("What will you ask the owl? (Ask about the forest/Ask about the exit)");

                String owlQuestion = scanner.next();
                if (owlQuestion.equalsIgnoreCase("Ask about the forest")) {
                    System.out.println("The owl tells you about the forest's magical properties and its dangers.");
                    System.out.println("You thank the owl for its wisdom and continue your journey.");
                } else if (owlQuestion.equalsIgnoreCase("Ask about the exit")) {
                    System.out.println("The owl guides you to the nearest exit.");
                    System.out.println("You thank the owl and head towards the exit.");
                    System.out.println("Congratulations! You've successfully navigated through the forest!");
                } else {
                    System.out.println("The owl doesn't understand your question and flies away.");
                }
            } else {
                System.out.println("Invalid input. Please try again.");
            }

        } else if (pathChoice == 2) {
            System.out.println("You chose the path along the sparkling stream.");
            System.out.println("You hear the sound of running water and birds chirping in the distance.");
            System.out.println("As you follow the stream, you notice a shiny object on the ground.");

            System.out.println("What will you do? (Pick it up/Ignore it)");
            String shinyObjectChoice = scanner.next();

            if (shinyObjectChoice.equalsIgnoreCase("Pick it up")) {
                System.out.println("You pick up the shiny object and discover it's a magical amulet.");
                System.out.println("The amulet gives you protection and guidance throughout your journey.");
                System.out.println("You continue along the stream with newfound confidence.");
                System.out.println("You reach the end of the stream and find a beautiful waterfall.");
                System.out.println("Congratulations! You've discovered the hidden waterfall!");
            } else if (shinyObjectChoice.equalsIgnoreCase("Ignore it")) {
                System.out.println("You ignore the shiny object and continue along the stream.");
                System.out.println("You encounter a group of friendly woodland creatures who lead you to a hidden path.");
                System.out.println("You follow the creatures and find a secret grove filled with flowers.");
                System.out.println("Congratulations! You've discovered the hidden grove!");
            } else {
                System.out.println("Invalid input. Please try again.");
            }
        } else {
            System.out.println("Invalid input. Please try again.");
        }

        scanner.close();
    }
}
