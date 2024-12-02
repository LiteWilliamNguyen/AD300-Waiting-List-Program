import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        WaitingListManager manager = new WaitingListManager();
        Scanner scanner = new Scanner(System.in);
        int choice;
        //Ensure no duplicate names are added to the waiting list.
        //Provide a simple text-based user interface to interact with the WaitingListManager.
        do {
            System.out.println("\n--- Waiting List Manager ---");
            System.out.println("1. Add Person");
            System.out.println("2. Serve Person");
            System.out.println("3. Check if Person is in List");
            System.out.println("4. Display Waiting List");
            System.out.println("5. Get Waiting List Size");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter name to add: ");
                    String nameToAdd = scanner.nextLine();
                    manager.addPerson(nameToAdd);
                    break;

                case 2:
                    System.out.println(manager.servePerson());
                    break;

                case 3:
                    System.out.print("Enter name to check: ");
                    String nameToCheck = scanner.nextLine();
                    if (manager.isPersonInList(nameToCheck)) {
                        System.out.println(nameToCheck + " is in the waiting list.");
                    } else {
                        System.out.println(nameToCheck + " is not in the waiting list.");
                    }
                    break;

                case 4:
                    manager.displayWaitingList();
                    break;

                case 5:
                    System.out.println("Waiting list size: " + manager.waitingListSize());
                    break;

                case 0:
                    System.out.println("Exiting... Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
                    break;
            }
        } while (choice != 0);

        scanner.close();
    }
}
