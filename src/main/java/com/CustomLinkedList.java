package com;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CustomLinkedList {
    Node head;
    int size;

    boolean addElementInTheBeginning(int val) {
        if (null == head) {
            head = new Node();
            head.data = val;
            size++;
            return true;
        }

        Node temp = new Node();
        temp.data = val;
        temp.next = head;
        head = temp;
        size++;
        return true;
    }

    boolean addElementInTheEnd(int val) {
        Node last = new Node();
        last.data = val;

        if (null == head) {
            head = last;
            size++;
            return true;
        }

        Node temp = head;

        while (null != temp.next) {
            temp = temp.next;
        }
        temp.next = last;
        size++;
        return true;
    }

    boolean addElementInTheGivenPosition(int val, int pos) {
        int count = 0;
        if (pos == 0 || null == head) {
            addElementInTheBeginning(val);
            return true;
        }
        if (pos == size) {
            addElementInTheEnd(val);
            return true;
        }

        if (pos < 0 || pos > size) {
            return false;
        }

        Node temp = head;
        Node nodeToInsert = new Node();
        nodeToInsert.data = val;

        while (count < pos-1) {
            temp = temp.next;
            count++;
        }

        nodeToInsert.next = temp.next;
        temp.next = nodeToInsert;

        return true;
    }

    void printAllValuesInOrder() {
        if (null == head) {
            log.info("Empty list!");
            return;
        }
        Node temp = head;
        while (temp != null) {
            log.info("{}", temp.data);
            temp = temp.next;
        }
    }
}

class Node {
    int data;
    Node next;
}
