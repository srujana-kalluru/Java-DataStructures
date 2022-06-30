package com;

import com.impl.LinkedListImpl;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

@Slf4j
class TestLinkedListImpl {

    @Test
    void testContains() {
        LinkedListImpl ll = new LinkedListImpl();

        ll.addAnElementInTheBeginning(10);
        ll.addAnElementInTheBeginning(20);
        ll.addAnElementInTheBeginning(30);
        ll.addAnElementInTheBeginning(40);

        log.info(String.valueOf(ll.contains(40)));
    }

    @Test
    void testAddElementInTheBeginning() {
        LinkedListImpl ll = new LinkedListImpl();
        ll.addAnElementInTheBeginning(10);
        ll.addAnElementInTheBeginning(20);
        ll.addAnElementInTheBeginning(30);
        ll.addAnElementInTheBeginning(40);

        log.info(ll.toString());
    }

    @Test
    void testAddElementInTheEnd() {
        LinkedListImpl ll = new LinkedListImpl();
        ll.addAnElementInTheEnd(50);
        ll.addAnElementInTheEnd(60);
        ll.addAnElementInTheEnd(70);
        ll.addAnElementInTheEnd(80);

        log.info(ll.toString());
    }

    @Test
    void testAddElementAtAGivenPosition() {
        LinkedListImpl ll = new LinkedListImpl();
        ll.addAnElementInTheEnd(10);
        ll.addAnElementInTheEnd(20);
        ll.addAnElementInTheEnd(30);
        ll.addAnElementInTheEnd(40);

        log.info(String.valueOf(ll.addAnElementAtAGivenPosition(100, 2)));
        log.info(String.valueOf(ll.addAnElementAtAGivenPosition(0, 1)));

        log.info(ll.toString());
    }

    @Test
    void removeElementInTheBeginning() {
        LinkedListImpl ll = new LinkedListImpl();
        ll.addAnElementInTheEnd(10);
        ll.addAnElementInTheEnd(20);
        ll.addAnElementInTheEnd(30);
        ll.addAnElementInTheEnd(40);

        ll.removeAnElementInTheBeginning();

        log.info(ll.toString());
        Assertions.assertFalse(ll.contains(10));
    }

    @Test
    void removeElementInTheEnd() {
        LinkedListImpl ll = new LinkedListImpl();
        ll.addAnElementInTheEnd(10);
        ll.addAnElementInTheEnd(20);
        ll.addAnElementInTheEnd(30);
        ll.addAnElementInTheEnd(40);

        ll.removeAnElementInTheEnd();
        Assertions.assertFalse(ll.contains(40));

        log.info(ll.toString());
    }

    @Test
    void testRemoveElementAtAGivenPosition() {
        LinkedListImpl ll = new LinkedListImpl();
        ll.addAnElementInTheEnd(10);
        ll.addAnElementInTheEnd(20);
        ll.addAnElementInTheEnd(30);
        ll.addAnElementInTheEnd(40);
        ll.addAnElementInTheEnd(50);
        ll.addAnElementInTheEnd(60);
        ll.addAnElementInTheEnd(70);

        log.info(String.valueOf(ll.removeElementAtAGivenPosition(5)));
        Assertions.assertFalse(ll.contains(60));

        log.info(ll.toString());
    }

    @Test
    void testRemoveElementAtAGivenPositionFail() {
        LinkedListImpl ll = new LinkedListImpl();
        ll.addAnElementInTheEnd(10);
        ll.addAnElementInTheEnd(20);
        ll.addAnElementInTheEnd(30);
        ll.addAnElementInTheEnd(40);

        log.info(String.valueOf(ll.removeElementAtAGivenPosition(4)));

        log.info(ll.toString());
    }

    @Test
    void testAddElementAtAGivenPositionFail() {
        LinkedListImpl ll = new LinkedListImpl();
        ll.addAnElementInTheEnd(10);
        ll.addAnElementInTheEnd(20);
        ll.addAnElementInTheEnd(30);
        ll.addAnElementInTheEnd(40);

        log.info(String.valueOf(ll.addAnElementAtAGivenPosition(100, 4)));
        Assertions.assertTrue(ll.contains(100));

        log.info(ll.toString());
    }

    @Test
    void testRemoveAKeyFromTheList() {
        int keyToRemove = 40;
        LinkedListImpl ll = new LinkedListImpl();
        ll.addAnElementInTheEnd(10);
        ll.addAnElementInTheEnd(20);
        ll.addAnElementInTheEnd(30);
        ll.addAnElementInTheEnd(40);
        ll.removeAKeyFromTheList(keyToRemove);
        Assertions.assertFalse(ll.contains(keyToRemove));

        log.info(ll.toString());
    }
}