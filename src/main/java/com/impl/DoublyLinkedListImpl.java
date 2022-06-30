package com.impl;

import com.DoublyLinkedList;

public class DoublyLinkedListImpl implements DoublyLinkedList {

    class Node {
        int data;
        Node prev;
        Node next;
    }

    Node head;
    int size;

    public boolean addAnElementInTheBeginning(int val) {
        Node temp = new Node();
        temp.data = val;

        if (null == head) {
            head = temp;
        } else {
            head.prev = temp;
            temp.next = head;
            head = temp;
        }
        size++;
        return true;
    }

    @Override
    public boolean addAnElementInTheEnd(int val) {
        Node temp = new Node();
        temp.data = val;
        if (null == head) {
            head = temp;
        } else {
            Node last = head;
            while (null != last.next) {
                last = last.next;
            }
            temp.prev = last;
            last.next = temp;
        }
        size++;
        return true;
    }

    @Override
    public boolean addAnElementAtAGivenPosition(int val, int pos) {
        if (pos < 0 || pos > size) {
            return false;
        } else if (pos == 0) {
            return addAnElementInTheBeginning(val);
        } else if (pos == size) {
            return addAnElementInTheEnd(val);
        } else {
            Node temp = new Node();
            temp.data = val;
            int count = 0;

            Node last = head;

            while (count < pos - 1) {
                count++;
                last = last.next;
            }

            temp.next = last.next;
            temp.prev = last;

            last.next.prev = temp;
            last.next = temp;

            size++;
            return true;
        }


    }

    @Override
    public boolean removeAnElementInTheBeginning() {
        if (null != head) {
            head = head.next;
            head.prev = null;
            size--;
            return true;
        }
        return false;
    }

    @Override
    public boolean removeAnElementInTheEnd() {
        if (null != head) {
            Node temp = head;
            while (null != temp.next.next) {
                temp = temp.next;
            }

            temp.next = null;
            size--;
            return true;
        }
        return false;
    }

    @Override
    public boolean removeElementAtAGivenPosition(int pos) {
        if (pos < 0 || pos > size) {
            return false;
        }

        if (pos == 0) {
            return removeAnElementInTheBeginning();
        } else if (pos == size) {
            return removeAnElementInTheEnd();
        } else {
            int count = 0;
            Node temp = head;
            while (count < pos - 1) {
                count++;
                temp = temp.next;
            }
            temp.next = temp.next.next;
            temp.next.prev = temp;
            size--;
            return true;
        }
    }

    public void removeAKeyFromTheList(int key) {
        if (null != head) {
            Node temp = head;
            while (null != temp.next) {
                if (temp.next.data == key) {
                    temp.next = temp.next.next;
                    if (null != temp.next) temp.next.prev = temp;
                    size--;
                    return;
                }
                temp = temp.next;
            }
        }
    }

    public boolean contains(int key) {
        Node temp = head;

        while (null != temp.next) {
            if (key == temp.data) {
                return true;
            }
            temp = temp.next;
        }

        return false;
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

    public String toReverseString() {
        if (null == head) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Node temp = head;
        while (null != temp.next) {
            temp = temp.next;
        }
        while (null != temp) {
            sb.append(temp.data);
            if (null != temp.prev) {
                sb.append(", ");
            }
            temp = temp.prev;
        }
        sb.append("]");
        return sb.toString();

    }
}