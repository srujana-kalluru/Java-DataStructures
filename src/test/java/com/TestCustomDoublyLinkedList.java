package com;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
class TestCustomDoublyLinkedList {

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
        CustomDoublyLinkedList ll = new CustomDoublyLinkedList();
        ll.addAnElementInTheEnd(10);
        ll.addAnElementInTheEnd(20);
        ll.addAnElementInTheEnd(30);
        ll.addAnElementInTheEnd(40);

        ll.addElementInTheGivenPosition(100, 2);

        log.info(ll.toString());
        log.info(ll.toReverseString());
    }

    @Test
    void testRemoveAnElementInTheBeginning() {
        CustomDoublyLinkedList dll = new CustomDoublyLinkedList();
        dll.addAnElementInTheEnd(10);
        dll.addAnElementInTheEnd(20);
        dll.addAnElementInTheEnd(30);
        dll.addAnElementInTheEnd(40);

        dll.removeAnElementAtTheBeginning();

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

        log.info(dll.toString());
        log.info(dll.toReverseString());

    }

    @Test
    void testRemoveElementAtAGivenPosition(){
        CustomDoublyLinkedList dll = new CustomDoublyLinkedList();
        dll.addAnElementInTheEnd(10);
        dll.addAnElementInTheEnd(20);
        dll.addAnElementInTheEnd(30);
        dll.addAnElementInTheEnd(40);
        dll.removeElementAtAGivenPosition(2);

        log.info(dll.toString());
        log.info(dll.toReverseString());
    }
}
