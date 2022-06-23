package com;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CustomLinkedList {

    class Node {
        int data;
        Node next;
    }

    Node head;
    int size;

    public boolean contains(int key) {
        if (null == head) {
            return false;
        }
        Node temp = head;

        while (null != temp) {
            if (temp.data == key) {
                return true;
            } else {
                temp = temp.next;
            }
        }
        return false;

    }

    public void addElementInTheBeginning(int val) {
        if (null == head) {
            head = new Node();
            head.data = val;
            size++;
            return;
        }

        Node temp = new Node();
        temp.data = val;
        temp.next = head;
        head = temp;
        size++;
    }

    public void addElementInTheEnd(int val) {
        Node last = new Node();
        last.data = val;

        if (null == head) {
            head = last;
            size++;
            return;
        }

        Node temp = head;

        while (null != temp.next) {
            temp = temp.next;
        }
        temp.next = last;
        size++;
    }


    public boolean addElementInTheGivenPosition(int val, int pos) {
        if (pos < 0 || pos > size) {
            return false;
        }

        if (null == head || pos == 0) {
            addElementInTheBeginning(val);
        }
        if (pos == size) {
            addElementInTheEnd(val);
        }

        int count = 0;

        Node temp = head;

        while (count < pos - 1) {
            temp = temp.next;
            count++;
        }

        Node nodeToInsert = new Node();
        nodeToInsert.data = val;
        nodeToInsert.next = temp.next;
        temp.next = nodeToInsert;

        return true;

    }

    public boolean removeAnElementAtTheBeginning() {
        if (null == head) {
            return false;
        }
        head = head.next;
        size--;
        return true;

    }

    public boolean removeAnElementAtTheEnd() {
        if (null == head) {
            return false;
        }

        Node temp = head;

        while (null != (temp.next).next) {
            temp = temp.next;
        }

        temp.next = null;
        size--;
        return true;

    }

    public boolean removeElementAtAGivenPosition(int pos) {
        if (null == head || pos >= size || pos < 0) {
            return false;
        }
        if (pos == 0) {
            removeAnElementAtTheBeginning();
        }
        if (pos == size - 1) {
            removeAnElementAtTheEnd();
        }

        Node temp = head;
        int count = 0;
        while (count < pos - 1) {
            temp = temp.next;
            count++;
        }

        temp.next = temp.next.next;
        size--;
        return true;
    }


    public boolean removeAKeyFromTheList(int key) {
        if (null == head) {
            return false;
        }
        if (head.data == key) {
            removeAnElementAtTheBeginning();
        }
        Node temp = head;

        while (null != (temp.next).next) {
            if ((temp.next).data == key) {
                temp.next = temp.next.next;
                size--;
                return true;
            }
            temp = temp.next;
        }
        return false;
    }


    public void printAllValuesInOrder() {
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


