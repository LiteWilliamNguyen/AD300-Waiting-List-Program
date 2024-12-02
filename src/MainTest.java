import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class WaitingListManagerTest {
    private WaitingListManager manager;

    @BeforeEach
    void setUp() {
        manager = new WaitingListManager();
    }

    // Normal Case 1: Adding and Serving a Single Person
    @Test
    void testAddAndServeSinglePerson() {
        manager.addPerson("John");
        assertEquals(1, manager.waitingListSize());
        assertEquals("John has been served.", manager.servePerson());
        assertEquals(0, manager.waitingListSize());
    }

    // Normal Case 2: Adding Multiple People and Serving Them in Order
    @Test
    void testAddAndServeMultiplePeople() {
        manager.addPerson("John");
        manager.addPerson("Sarah");
        manager.addPerson("Mike");
        assertEquals(3, manager.waitingListSize());
        assertEquals("John has been served.", manager.servePerson());
        assertEquals("Sarah has been served.", manager.servePerson());
        assertEquals(1, manager.waitingListSize());
    }

    // Normal Case 3: Checking if a Person is in the List
    @Test
    void testIsPersonInList() {
        manager.addPerson("Alice");
        assertTrue(manager.isPersonInList("Alice"));
        assertFalse(manager.isPersonInList("Bob"));
    }

    // Edge Case 1: Adding a Duplicate Name
    @Test
    void testAddDuplicatePerson() {
        manager.addPerson("Eve");
        manager.addPerson("Eve"); // Duplicate
        assertEquals(1, manager.waitingListSize());
        assertEquals("Eve has been served.", manager.servePerson());
        assertEquals("The waiting list is empty.", manager.servePerson());
    }

    // Edge Case 2: Serving When List is Empty
    @Test
    void testServeEmptyList() {
        assertEquals("The waiting list is empty.", manager.servePerson());
    }

    // Edge Case 3: Displaying an Empty Waiting List
    @Test
    void testDisplayEmptyList() {
        manager.displayWaitingList(); // Expect no exception or crash
    }
}