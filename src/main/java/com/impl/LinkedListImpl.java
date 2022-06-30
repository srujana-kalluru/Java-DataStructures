package com.impl;

import com.LinkedList;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LinkedListImpl implements LinkedList {

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

    @Override
    public boolean addAnElementInTheBeginning(int val) {
        if (null == head) {
            head = new Node();
            head.data = val;
        }

        else {
            Node temp = new Node();
            temp.data = val;
            temp.next = head;
            head = temp;
        }
        size++;
        return true;
    }

    @Override
    public boolean addAnElementInTheEnd(int val) {
        Node last = new Node();
        last.data = val;

        if (null == head) {
            head = last;
        }
        else {
            Node temp = head;

            while (null != temp.next) {
                temp = temp.next;
            }
            temp.next = last;
        }
        size++;
        return true;
    }


    @Override
    public boolean addAnElementAtAGivenPosition(int val, int pos) {
        if (pos < 0 || pos > size) {
            return false;
        }

        if (null == head || pos == 0) {
            addAnElementInTheBeginning(val);
            return true;
        }
        if (pos == size) {
            addAnElementInTheEnd(val);
            return true;
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

    @Override
    public boolean removeAnElementInTheBeginning() {
        if (null == head) {
            return false;
        }
        head = head.next;
        size--;
        return true;

    }

    @Override
    public boolean removeAnElementInTheEnd() {
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

    @Override
    public boolean removeElementAtAGivenPosition(int pos) {
        if (null == head || pos >= size || pos < 0) {
            return false;
        }
        if (pos == 0) {
            removeAnElementInTheBeginning();
        }
        if (pos == size - 1) {
            removeAnElementInTheEnd();
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
        if (null != head) {
            Node temp = head;
            while (null != temp.next) {
                if (temp.next.data == key) {
                    temp.next = temp.next.next;
                    size--;
                    return true;
                }
                temp = temp.next;
            }
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

    @Override
    public String toString() {

        if (null == head) {
            return "[]";
        }

        StringBuilder sb = new StringBuilder();
        sb.append("[");

        Node temp = head;
        while (null != temp) {
            sb.append(temp.data);
            if (null != temp.next) {
                sb.append(", ");
            }
            temp = temp.next;
        }
        sb.append("]");
        return sb.toString();
    }
}


