# Waiting List Program
Description:
a program that simulates a waiting list for a service (e.g., a restaurant, a doctor's office). The program will use a Queue to manage the order of people in the waiting list and a Set to ensure that no person is added to the waiting list more than once.

Tasks:
Create a WaitingListManager class

This class will manage the waiting list using a Queue and a Set.
Implement the Following Methods:

void addPerson(String name): Adds a person to the waiting list. If the person is already in the list, print a message indicating that the person is already in the waiting list.
String servePerson(): Removes and returns the name of the person at the front of the waiting list. If the waiting list is empty, return a message indicating that the waiting list is empty.
boolean isPersonInList(String name): Checks if a person is already in the waiting list.
int waitingListSize(): Returns the number of people in the waiting list.
void displayWaitingList(): Displays the names of people in the waiting list in the order they will be served.

Requirements:

Use a LinkedList for the Queue implementation.
Use a HashSet for the Set implementation.
Ensure no duplicate names are added to the waiting list.
Provide a simple text-based user interface to interact with the WaitingListManager.

Test Case Descriptions:

Normal Cases

Adding and Serving a Single Person:

Add a person, verify the size of the list, serve the person, and confirm the list is empty.

Adding Multiple People and Serving Them in Order:

Add three names, verify the size, and serve them in FIFO order.

Checking if a Person is in the List:

Add one name, check its presence, and confirm a non-added name is absent.

Edge Cases

Adding a Duplicate Name:

Add the same person twice, confirm the size remains 1, and verify the queue's correctness.

Serving When the List is Empty:

Attempt to serve from an empty queue and check for the correct message.

Displaying an Empty Waiting List:

Ensure calling displayWaitingList on an empty queue doesn't crash and behaves as expected.