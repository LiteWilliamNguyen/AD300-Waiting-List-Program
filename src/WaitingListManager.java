import java.util.HashSet;
import java.util.LinkedList;


public class WaitingListManager {
    private LinkedList<String> waitingQueue;
    private HashSet<String> waitingSet;

    // Constructor
    public WaitingListManager() {
        this.waitingQueue = new LinkedList<>();
        this.waitingSet = new HashSet<>();
    }

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

    // Serve the person at the front of the queue
    public String servePerson() {
        if (waitingQueue.isEmpty()) {
            return "The waiting list is empty.";
        }
        String servedPerson = waitingQueue.poll();
        waitingSet.remove(servedPerson);
        return servedPerson + " has been served.";
    }

    // Check if a person is in the waiting list
    public boolean isPersonInList(String name) {
        return waitingSet.contains(name);
    }

    // Get the size of the waiting list
    public int waitingListSize() {
        return waitingQueue.size();
    }

    // Display the waiting list
    public void displayWaitingList() {
        if (waitingQueue.isEmpty()) {
            System.out.println("The waiting list is empty.");
        } else {
            System.out.println("Waiting list: " + String.join(", ", waitingQueue));
        }
    }
}
