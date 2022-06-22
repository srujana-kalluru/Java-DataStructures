package com;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
class TestCustomLinkedList {
    @Test
    void testAddElementInTheBeginning (){
        CustomLinkedList ll = new CustomLinkedList();
        log.info(String.valueOf(ll.addElementInTheBeginning(10)));
        log.info(String.valueOf(ll.addElementInTheBeginning(20)));
        log.info(String.valueOf(ll.addElementInTheBeginning(30)));
        log.info(String.valueOf(ll.addElementInTheBeginning(40)));

        ll.printAllValuesInOrder();
    }

    @Test
    void testAddElementInTheEnd (){
        CustomLinkedList ll = new CustomLinkedList();
        log.info(String.valueOf(ll.addElementInTheEnd(50)));
        log.info(String.valueOf(ll.addElementInTheEnd(60)));
        log.info(String.valueOf(ll.addElementInTheEnd(70)));
        log.info(String.valueOf(ll.addElementInTheEnd(80)));

        ll.printAllValuesInOrder();
    }

    @Test
    void testAddElementAtAGivenPosition (){
        CustomLinkedList ll = new CustomLinkedList();
        ll.addElementInTheBeginning(10);
        ll.addElementInTheBeginning(20);
        ll.addElementInTheBeginning(30);
        ll.addElementInTheBeginning(40);

        log.info(String.valueOf(ll.addElementInTheGivenPosition(100,2)));

        ll.printAllValuesInOrder();
    }

    @Test
    void testAddElementAtAGivenPositionFail (){
        CustomLinkedList ll = new CustomLinkedList();
        ll.addElementInTheBeginning(10);
        ll.addElementInTheBeginning(20);
        ll.addElementInTheBeginning(30);
        ll.addElementInTheBeginning(40);

        log.info(String.valueOf(ll.addElementInTheGivenPosition(100,4)));

        ll.printAllValuesInOrder();
    }
}
