package com;

public class CustomDoublyLinkedList {

    class Node {
        int data;
        Node prev;
        Node next;
    }

    Node head;
    int size;

    public void addAnElementInTheBeginning(int val) {
        Node temp = new Node();
        temp.data = val;

        if (null == head) {
            head = temp;
            return;
        } else {
            head.prev = temp;
            temp.next = head;
            head = temp;
        }
        size++;
    }

    public void addAnElementInTheEnd(int val) {
        Node temp = new Node();
        temp.data = val;
        if (null == head) {
            head = temp;
            return;
        } else {
            Node last = head;
            while (null != last.next) {
                last = last.next;
            }
            temp.prev = last;
            last.next = temp;

        }
        size++;
    }

    public void addElementInTheGivenPosition(int val, int pos) {
        if (pos < 0 || pos > size) {
            return;
        }
        if (pos == 0) {
            addAnElementInTheBeginning(val);
            return;
        }
        if (pos == size) {
            addAnElementInTheEnd(val);
            return;
        }

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
    }

    public void removeAnElementAtTheBeginning() {
        if (null != head) {
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    public void removeAnElementAtTheEnd() {
        if (null != head) {
            Node temp = head;
            while (null != temp.next.next) {
                temp = temp.next;
            }

            temp.next = null;
            size--;
        }
    }

    public void removeElementAtAGivenPosition(int pos) {
        if (pos < 0 || pos > size) {
            return;
        }

        if (pos == 0) {
            removeAnElementAtTheBeginning();
        } else if (pos == size) {
            removeAnElementAtTheEnd();
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
        }
    }

    public void removeAKeyFromTheList(int key) {
        if (null != head) {
            Node temp = head;
            while (null != temp.next) {
                if (temp.next.data == key) {
                    temp.next = temp.next.next;
                    temp.next.prev = temp;
                    size--;
                    return;
                }
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