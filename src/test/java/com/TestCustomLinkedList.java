package com;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

@Slf4j
class TestCustomLinkedList {

    @Test
    void testContains() {
        CustomLinkedList ll = new CustomLinkedList();

        ll.addElementInTheBeginning(10);
        ll.addElementInTheBeginning(20);
        ll.addElementInTheBeginning(30);
        ll.addElementInTheBeginning(40);

        log.info(String.valueOf(ll.contains(40)));
    }

    @Test
    void testAddElementInTheBeginning() {
        CustomLinkedList ll = new CustomLinkedList();
        ll.addElementInTheBeginning(10);
        ll.addElementInTheBeginning(20);
        ll.addElementInTheBeginning(30);
        ll.addElementInTheBeginning(40);

        ll.printAllValuesInOrder();
    }

    @Test
    void testAddElementInTheEnd() {
        CustomLinkedList ll = new CustomLinkedList();
        ll.addElementInTheEnd(50);
        ll.addElementInTheEnd(60);
        ll.addElementInTheEnd(70);
        ll.addElementInTheEnd(80);

        ll.printAllValuesInOrder();
    }

    @Test
    void testAddElementAtAGivenPosition() {
        CustomLinkedList ll = new CustomLinkedList();
        ll.addElementInTheEnd(10);
        ll.addElementInTheEnd(20);
        ll.addElementInTheEnd(30);
        ll.addElementInTheEnd(40);

        log.info(String.valueOf(ll.addElementInTheGivenPosition(100, 2)));
        log.info(String.valueOf(ll.addElementInTheGivenPosition(0, 1)));

        ll.printAllValuesInOrder();
    }

    @Test
    void removeElementInTheBeginning() {
        CustomLinkedList ll = new CustomLinkedList();
        ll.addElementInTheEnd(10);
        ll.addElementInTheEnd(20);
        ll.addElementInTheEnd(30);
        ll.addElementInTheEnd(40);

        ll.removeAnElementAtTheBeginning();

        ll.printAllValuesInOrder();
        Assertions.assertFalse(ll.contains(10));
    }

    @Test
    void removeElementInTheEnd() {
        CustomLinkedList ll = new CustomLinkedList();
        ll.addElementInTheEnd(10);
        ll.addElementInTheEnd(20);
        ll.addElementInTheEnd(30);
        ll.addElementInTheEnd(40);

        ll.removeAnElementAtTheEnd();
        Assertions.assertFalse(ll.contains(40));

        ll.printAllValuesInOrder();
    }

    @Test
    void testRemoveElementAtAGivenPosition() {
        CustomLinkedList ll = new CustomLinkedList();
        ll.addElementInTheEnd(10);
        ll.addElementInTheEnd(20);
        ll.addElementInTheEnd(30);
        ll.addElementInTheEnd(40);

        log.info(String.valueOf(ll.removeElementAtAGivenPosition(2)));
        Assertions.assertFalse(ll.contains(30));

        ll.printAllValuesInOrder();
    }

    @Test
    void testRemoveElementAtAGivenPositionFail() {
        CustomLinkedList ll = new CustomLinkedList();
        ll.addElementInTheEnd(10);
        ll.addElementInTheEnd(20);
        ll.addElementInTheEnd(30);
        ll.addElementInTheEnd(40);

        log.info(String.valueOf(ll.removeElementAtAGivenPosition(4)));

        ll.printAllValuesInOrder();
    }

    @Test
    void testAddElementAtAGivenPositionFail() {
        CustomLinkedList ll = new CustomLinkedList();
        ll.addElementInTheEnd(10);
        ll.addElementInTheEnd(20);
        ll.addElementInTheEnd(30);
        ll.addElementInTheEnd(40);

        log.info(String.valueOf(ll.addElementInTheGivenPosition(100, 4)));
        Assertions.assertTrue(ll.contains(100));

        ll.printAllValuesInOrder();
    }

    @Test
    void testRemoveAKeyFromTheList() {
        int keyToRemove = 30;
        CustomLinkedList ll = new CustomLinkedList();
        ll.addElementInTheEnd(10);
        ll.addElementInTheEnd(20);
        ll.addElementInTheEnd(30);
        ll.addElementInTheEnd(40);
        ll.removeAKeyFromTheList(keyToRemove);
        Assertions.assertFalse(ll.contains(30));

        ll.printAllValuesInOrder();

    }

}
