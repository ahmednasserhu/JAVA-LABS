import java.util.*;

public class Main {
    public static void displayMenu() {
        System.out.println("\n------ Dictionary Menu ------");
        System.out.println("1. Insert Words");
        System.out.println("2. Remove Word");
        System.out.println("3. Remove All Words by Key");
        System.out.println("4. Display Dictionary");
        System.out.println("5. Search Word");
        System.out.println("6. Display Key and Values");
        System.out.println("0. Exit");
    }

    public static void main(String[] args) {
        TreeMap<Character, TreeSet<String>> dictionaryData = new TreeMap<>();
        Dictionary dictionary = new Dictionary(dictionaryData);

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            displayMenu();
            System.out.print("Enter your choice: ");

            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a valid integer choice.");
                System.out.print("Enter your choice: ");
                scanner.next();
            }

            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter words (separated by spaces): ");
                    String wordsInput = scanner.nextLine();
                    String[] words = wordsInput.split("\\s+");
                    dictionary.insertIntoTree(words);
                    break;

                case 2:
                    System.out.print("Enter word to remove: ");
                    String wordToRemove = scanner.nextLine();
                    dictionary.removeWord(wordToRemove);
                    break;

                case 3:
                    System.out.print("Enter key to remove all words: ");
                    char keyToRemove = Character.toUpperCase(scanner.next().charAt(0));
                    dictionary.removeall(keyToRemove);
                    break;

                case 4:
                    System.out.println(dictionary);
                    break;
                case 5:
                    System.out.print("Enter regex pattern to search: ");
                    String regexPattern = scanner.nextLine();
                    dictionary.search(regexPattern);
                    break;

                case 6:
                    System.out.print("Enter key to display values: ");
                    char keyToDisplay = Character.toUpperCase(scanner.next().charAt(0));
                    dictionary.getKey(keyToDisplay);
                    break;

                case 0:
                    System.out.println("Exiting the program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }

        } while (choice != 0);

        scanner.close();
    }
}
