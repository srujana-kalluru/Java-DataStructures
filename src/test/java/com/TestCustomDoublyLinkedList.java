package com;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@Slf4j
class TestCustomDoublyLinkedList {

    @Test
    void testEmptyList() {
        CustomDoublyLinkedList dll = new CustomDoublyLinkedList();
        log.info(dll.toString());
        log.info(dll.toReverseString());
    }

    @Test
    void testAddElementInTheBeginning() {
        CustomDoublyLinkedList dll = new CustomDoublyLinkedList();
        dll.addAnElementInTheBeginning(10);
        dll.addAnElementInTheBeginning(20);
        dll.addAnElementInTheBeginning(30);
        dll.addAnElementInTheBeginning(40);

        log.info(dll.toString());
        log.info(dll.toReverseString());

    }

    @Test
    void testAddElementInTheEnd() {
        CustomDoublyLinkedList dll = new CustomDoublyLinkedList();
        dll.addAnElementInTheEnd(10);
        dll.addAnElementInTheEnd(20);
        dll.addAnElementInTheEnd(30);
        dll.addAnElementInTheEnd(40);

        log.info(dll.toString());
        log.info(dll.toReverseString());

    }

    @Test
    void testAddElementAtAGivenPosition() {
        CustomDoublyLinkedList dll = new CustomDoublyLinkedList();
        dll.addAnElementInTheEnd(10);
        dll.addAnElementInTheEnd(20);
        dll.addAnElementInTheEnd(30);
        dll.addAnElementInTheEnd(40);

        dll.addElementInTheGivenPosition(100, 2);

        assertTrue(dll.contains(100));

        log.info(dll.toString());
        log.info(dll.toReverseString());
    }

    @Test
    void testRemoveAnElementInTheBeginning() {
        CustomDoublyLinkedList dll = new CustomDoublyLinkedList();
        dll.addAnElementInTheEnd(10);
        dll.addAnElementInTheEnd(20);
        dll.addAnElementInTheEnd(30);
        dll.addAnElementInTheEnd(40);

        dll.removeAnElementAtTheBeginning();

        assertFalse(dll.contains(10));

        log.info(dll.toString());
        log.info(dll.toReverseString());
    }

    @Test
    void testRemoveAnElementInTheEnd() {
        CustomDoublyLinkedList dll = new CustomDoublyLinkedList();
        dll.addAnElementInTheEnd(10);
        dll.addAnElementInTheEnd(20);
        dll.addAnElementInTheEnd(30);
        dll.addAnElementInTheEnd(40);

        dll.removeAnElementAtTheEnd();
        assertFalse(dll.contains(40));

        log.info(dll.toString());
        log.info(dll.toReverseString());
    }

    @Test
    void testRemoveElementAtAGivenPosition() {
        CustomDoublyLinkedList dll = new CustomDoublyLinkedList();
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
        CustomDoublyLinkedList dll = new CustomDoublyLinkedList();
        dll.addAnElementInTheEnd(10);
        dll.addAnElementInTheEnd(20);
        dll.addAnElementInTheEnd(30);
        dll.addAnElementInTheEnd(40);
        dll.addAnElementInTheEnd(50);
        dll.addAnElementInTheEnd(60);
        dll.addAnElementInTheEnd(70);

        dll.removeAKeyFromTheList(20);
        assertFalse(dll.contains(20));


        log.info(dll.toString());
        log.info(dll.toReverseString());

    }

    @Test
    void testContains() {
        CustomDoublyLinkedList dll = new CustomDoublyLinkedList();
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
