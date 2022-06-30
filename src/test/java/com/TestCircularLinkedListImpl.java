package com;

import com.impl.CircularLinkedListImpl;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
class TestCircularLinkedListImpl {
    @Test
    void testAddElementInTheBeginning() {
        CircularLinkedListImpl cll = new CircularLinkedListImpl();
        cll.addAnElementInTheBeginning(10);
        cll.addAnElementInTheBeginning(20);
        cll.addAnElementInTheBeginning(30);
        cll.addAnElementInTheBeginning(40);

        log.info(cll.toString());
    }

    @Test
    void testAddElementInTheEnd() {
        CircularLinkedListImpl cll = new CircularLinkedListImpl();
        cll.addAnElementInTheEnd(10);
        cll.addAnElementInTheEnd(20);
        cll.addAnElementInTheEnd(30);
        cll.addAnElementInTheEnd(40);

        log.info(cll.toString());

    }

    @Test
    void testAddElementAtAGivenPosition() {
        CircularLinkedListImpl cll = new CircularLinkedListImpl();
        cll.addAnElementInTheEnd(10);
        cll.addAnElementInTheEnd(20);
        cll.addAnElementInTheEnd(30);
        cll.addAnElementInTheEnd(40);

        cll.addAnElementAtAGivenPosition(100, 2);
        cll.addAnElementAtAGivenPosition(0, 1);

        log.info(cll.toString());
    }

    @Test
    void removeElementInTheBeginning() {
        CircularLinkedListImpl cll = new CircularLinkedListImpl();
        cll.addAnElementInTheEnd(10);
        cll.addAnElementInTheEnd(20);
        cll.addAnElementInTheEnd(30);
        cll.addAnElementInTheEnd(40);

        cll.removeAnElementInTheBeginning();

        log.info(cll.toString());

    }

    @Test
    void removeElementInTheEnd() {
        CircularLinkedListImpl cll = new CircularLinkedListImpl();
        cll.addAnElementInTheEnd(10);
        cll.addAnElementInTheEnd(20);
        cll.addAnElementInTheEnd(30);
        cll.addAnElementInTheEnd(40);

        cll.removeAnElementInTheEnd();

        log.info(cll.toString());
    }

    @Test
    void testRemoveElementAtAGivenPosition() {
        CircularLinkedListImpl cll = new CircularLinkedListImpl();
        cll.addAnElementInTheEnd(10);
        cll.addAnElementInTheEnd(20);
        cll.addAnElementInTheEnd(30);
        cll.addAnElementInTheEnd(40);
        cll.addAnElementInTheEnd(50);
        cll.addAnElementInTheEnd(60);
        cll.addAnElementInTheEnd(70);

        cll.removeElementAtAGivenPosition(5);

        log.info(cll.toString());
    }

    @Test
    void testRemoveAKeyFromTheList() {
        int keyToRemove = 10;
        CircularLinkedListImpl cll = new CircularLinkedListImpl();
        cll.addAnElementInTheEnd(10);
        cll.addAnElementInTheEnd(20);
        cll.addAnElementInTheEnd(30);
        cll.addAnElementInTheEnd(40);
        cll.removeAKeyFromTheList(keyToRemove);

        log.info(cll.toString());
    }
}
