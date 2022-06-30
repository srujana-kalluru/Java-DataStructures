package com;

import com.impl.DoublyLinkedListImpl;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@Slf4j
class TestDoublyLinkedListImpl {

    @Test
    void testEmptyList() {
        DoublyLinkedListImpl dll = new DoublyLinkedListImpl();
        log.info(dll.toString());
        log.info(dll.toReverseString());
    }

    @Test
    void testAddElementInTheBeginning() {
        DoublyLinkedListImpl dll = new DoublyLinkedListImpl();
        dll.addAnElementInTheBeginning(10);
        dll.addAnElementInTheBeginning(20);
        dll.addAnElementInTheBeginning(30);
        dll.addAnElementInTheBeginning(40);

        log.info(dll.toString());
        log.info(dll.toReverseString());

    }

    @Test
    void testAddElementInTheEnd() {
        DoublyLinkedListImpl dll = new DoublyLinkedListImpl();
        dll.addAnElementInTheEnd(10);
        dll.addAnElementInTheEnd(20);
        dll.addAnElementInTheEnd(30);
        dll.addAnElementInTheEnd(40);

        log.info(dll.toString());
        log.info(dll.toReverseString());

    }

    @Test
    void testAddElementAtAGivenPosition() {
        DoublyLinkedListImpl dll = new DoublyLinkedListImpl();
        dll.addAnElementInTheEnd(10);
        dll.addAnElementInTheEnd(20);
        dll.addAnElementInTheEnd(30);
        dll.addAnElementInTheEnd(40);

        dll.addAnElementAtAGivenPosition(100, 2);

        assertTrue(dll.contains(100));

        log.info(dll.toString());
        log.info(dll.toReverseString());
    }

    @Test
    void testRemoveAnElementInTheBeginning() {
        DoublyLinkedListImpl dll = new DoublyLinkedListImpl();
        dll.addAnElementInTheEnd(10);
        dll.addAnElementInTheEnd(20);
        dll.addAnElementInTheEnd(30);
        dll.addAnElementInTheEnd(40);

        dll.removeAnElementInTheBeginning();

        assertFalse(dll.contains(10));

        log.info(dll.toString());
        log.info(dll.toReverseString());
    }

    @Test
    void testRemoveAnElementInTheEnd() {
        DoublyLinkedListImpl dll = new DoublyLinkedListImpl();
        dll.addAnElementInTheEnd(10);
        dll.addAnElementInTheEnd(20);
        dll.addAnElementInTheEnd(30);
        dll.addAnElementInTheEnd(40);

        dll.removeAnElementInTheEnd();
        assertFalse(dll.contains(40));

        log.info(dll.toString());
        log.info(dll.toReverseString());
    }

    @Test
    void testRemoveElementAtAGivenPosition() {
        DoublyLinkedListImpl dll = new DoublyLinkedListImpl();
        dll.addAnElementInTheEnd(10);
        dll.addAnElementInTheEnd(20);
        dll.addAnElementInTheEnd(30);
        dll.addAnElementInTheEnd(40);

        dll.removeElementAtAGivenPosition(2);
        assertFalse(dll.contains(30));

        log.info(dll.toString());
        log.info(dll.toReverseString());
    }

    @Test
    void testRemoveAKeyFromTheList() {
        DoublyLinkedListImpl dll = new DoublyLinkedListImpl();
        dll.addAnElementInTheEnd(10);
        dll.addAnElementInTheEnd(20);
        dll.addAnElementInTheEnd(30);
        dll.addAnElementInTheEnd(40);
        dll.addAnElementInTheEnd(50);
        dll.addAnElementInTheEnd(60);
        dll.addAnElementInTheEnd(70);

        dll.removeAKeyFromTheList(20);
        dll.removeAKeyFromTheList(70);

        assertFalse(dll.contains(20));
        assertFalse(dll.contains(70));


        log.info(dll.toString());
        log.info(dll.toReverseString());

    }

    @Test
    void testContains() {
        DoublyLinkedListImpl dll = new DoublyLinkedListImpl();
        dll.addAnElementInTheEnd(10);
        dll.addAnElementInTheEnd(20);
        dll.addAnElementInTheEnd(30);
        dll.addAnElementInTheEnd(40);
        dll.addAnElementInTheEnd(50);
        dll.addAnElementInTheEnd(60);
        dll.addAnElementInTheEnd(70);

        assertFalse(dll.contains(80));
        assertTrue(dll.contains(50));

        log.info(dll.toString());
        log.info(dll.toReverseString());

    }
}
