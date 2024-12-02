import java.util.HashSet;
import java.util.LinkedList;

//This class will manage the waiting list using a Queue and a Set.
public class WaitingListManager {
    private LinkedList<String> waitingQueue;
    private HashSet<String> waitingSet;

    // Constructor
    public WaitingListManager() {
        this.waitingQueue = new LinkedList<>();
        this.waitingSet = new HashSet<>();
    }
    //void addPerson(String name): Adds a person to the waiting list.
    // If the person is already in the list, print a message indicating that the person is already in the waiting list.
    // Add a person to the waiting list
    public void addPerson(String name) {
        if (waitingSet.contains(name)) {
            System.out.println(name + " is already in the waiting list.");
        } else {
            waitingQueue.add(name);
            waitingSet.add(name);
            System.out.println(name + " has been added to the waiting list.");
        }
    }
    //String servePerson(): Removes and returns the name of the person at the front of the waiting list.
    // If the waiting list is empty, return a message indicating that the waiting list is empty.
    // Serve the person at the front of the queue
    public String servePerson() {
        if (waitingQueue.isEmpty()) {
            return "The waiting list is empty.";
        }
        String servedPerson = waitingQueue.poll();
        waitingSet.remove(servedPerson);
        return servedPerson + " has been served.";
    }
    //boolean isPersonInList(String name): Checks if a person is already in the waiting list.
    // Check if a person is in the waiting list
    public boolean isPersonInList(String name) {
        return waitingSet.contains(name);
    }
    //int waitingListSize(): Returns the number of people in the waiting list.
    // Get the size of the waiting list
    public int waitingListSize() {
        return waitingQueue.size();
    }
    //void displayWaitingList(): Displays the names of people in the waiting list in the order they will be served.
    // Display the waiting list
    public void displayWaitingList() {
        if (waitingQueue.isEmpty()) {
            System.out.println("The waiting list is empty.");
        } else {
            System.out.println("Waiting list: " + String.join(", ", waitingQueue));
        }
    }
}
