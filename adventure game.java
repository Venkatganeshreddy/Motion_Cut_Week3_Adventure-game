import java.util.Scanner;

public class TextAdventureGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Text Adventure Game!");
        System.out.println("You find yourself in a mysterious forest...");

        // Game loop
        while (true) {
            System.out.println("\nChoose your action:");
            System.out.println("1. Explore the forest");
            System.out.println("2. Go deeper into the forest");
            System.out.println("3. Rest for a while");

            // Get user input
            String choice = scanner.nextLine();

            // Process user input
            switch (choice) {
                case "1":
                    System.out.println("You find a hidden treasure! Congratulations!");
                    endGame();
                    break;
                case "2":
                    System.out.println("You encounter a fork in the path. Which way do you go?");
                    System.out.println("A. Take the left path");
                    System.out.println("B. Take the right path");

                    String pathChoice = scanner.nextLine();
                    if (pathChoice.equalsIgnoreCase("A")) {
                        System.out.println("You discover an ancient temple.");
                        exploreTemple(scanner);
                    } else if (pathChoice.equalsIgnoreCase("B")) {
                        System.out.println("You stumble upon a magical waterfall.");
                        exploreWaterfall(scanner);
                    } else {
                        handleInvalidInput();
                    }
                    break;
                case "3":
                    System.out.println("You rest for a while and regain your energy.");
                    endGame();
                    break;
                default:
                    handleInvalidInput();
            }
        }
    }

    private static void exploreTemple(Scanner scanner) {
        System.out.println("As you enter the temple, you see three doors.");
        System.out.println("1. Enter the golden door");
        System.out.println("2. Enter the silver door");
        System.out.println("3. Enter the bronze door");

        String doorChoice = scanner.nextLine();
        if (doorChoice.equalsIgnoreCase("1")) {
            System.out.println("You find a room full of riches. You become wealthy!");
            endGame();
        } else if (doorChoice.equalsIgnoreCase("2")) {
            System.out.println("A guardian challenges you to a riddle. Solve it to proceed!");
            solveRiddle(scanner);
        } else if (doorChoice.equalsIgnoreCase("3")) {
            System.out.println("You encounter a cursed room. You narrowly escape!");
            endGame();
        } else {
            handleInvalidInput();
        }
    }

    private static void exploreWaterfall(Scanner scanner) {
        System.out.println("You notice a shimmering object behind the waterfall.");
        System.out.println("1. Investigate the object");
        System.out.println("2. Ignore it and move on");

        String waterfallChoice = scanner.nextLine();
        if (waterfallChoice.equalsIgnoreCase("1")) {
            System.out.println("You find a magical amulet. It grants you special abilities!");
            endGame();
        } else if (waterfallChoice.equalsIgnoreCase("2")) {
            System.out.println("You continue your journey without any distractions.");
            endGame();
        } else {
            handleInvalidInput();
        }
    }

    private static void solveRiddle(Scanner scanner) {
        System.out.println("Riddle: I speak without a mouth and hear without ears. What am I?");
        String answer = scanner.nextLine();

        if (answer.equalsIgnoreCase("an echo")) {
            System.out.println("Correct! The guardian allows you to pass.");
            endGame();
        } else {
            System.out.println("Incorrect! The guardian challenges you again.");
            solveRiddle(scanner);
        }
    }

    // End the game
    private static void endGame() {
        System.out.println("\nThanks for playing the Text Adventure Game! Goodbye.");
        System.exit(0);
    }

    // Handle invalid input
    private static void handleInvalidInput() {
        System.out.println("Invalid input. Please enter a valid option.");
    }
}