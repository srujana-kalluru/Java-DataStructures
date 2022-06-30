package com.impl;

import com.LinkedList;

public class CircularLinkedListImpl implements LinkedList {

    class Node {
        int data;
        Node next;
    }

    Node head;
    int size;

    @Override
    public boolean addAnElementInTheBeginning(int val) {
        Node temp = new Node();
        temp.data = val;

        if (null == head) {
            head = temp;
            head.next = temp;
        } else {
            Node last = head;
            while (!last.next.equals(head)) {
                last = last.next;
            }

            temp.next = head;
            last.next = temp;
            head = temp;
        }

        size++;
        return true;
    }

    @Override
    public boolean addAnElementInTheEnd(int val) {
        Node node = new Node();
        node.data = val;

        if (null == head) {
            head = node;
            head.next = head;
        } else {
            if (head.next.equals(head)) {
                head.next = node;
            } else {
                Node temp = head;
                while (!head.equals(temp.next)) {
                    temp = temp.next;
                }
                temp.next = node;
            }
            node.next = head;
        }
        size++;
        return true;
    }

    @Override
    public boolean addAnElementAtAGivenPosition(int val, int pos) {
        if (pos < 0 || pos > size) {
            return false;
        } else if (null == head || pos == 0) {
            return addAnElementInTheBeginning(val);
        } else if (pos == size) {
            return addAnElementInTheEnd(val);
        } else {
            Node nodeToInsert = new Node();
            nodeToInsert.data = val;

            Node temp = head;
            int count = 0;


            while (!head.equals(temp.next) && count < pos - 1) {
                count++;
                temp = temp.next;
            }
            nodeToInsert.next = temp.next;
            temp.next = nodeToInsert;
            size++;
            return true;
        }
    }

    @Override
    public boolean removeAnElementInTheBeginning() {
        if (null != head) {
            Node last = head;

            while (!head.equals(last.next)) {
                last = last.next;
            }
            head = head.next;
            last.next = head;
            size--;
            return true;
        }
        return false;
    }

    @Override
    public boolean removeAnElementInTheEnd() {
        if (null != head) {
            Node temp = head;

            while (!head.equals(temp.next.next)) {
                temp = temp.next;
            }
            temp.next = head;
            size--;
            return true;
        }
        return false;
    }

    @Override
    public boolean removeElementAtAGivenPosition(int pos) {
        if (null == head) {
            return false;
        }
        else if (pos == 0) {
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
            size--;
            return true;
        }

    }

    public void removeAKeyFromTheList(int keyToRemove) {
        if (null != head) {
            if (head.data == keyToRemove) {
                removeAnElementInTheBeginning();
            } else {
                Node temp = head;
                while (!head.equals(temp.next)) {
                    if (temp.next.data == keyToRemove) {
                        temp.next = temp.next.next;
                        size--;
                    }
                    temp = temp.next;
                }

            }
        }
    }

    @Override
    public String toString() {
        if (null == head) {
            return "[]";
        }
        if (size == 1) {
            return "[" + head.data + "]";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        sb.append(head.data);
        sb.append(", ");
        Node temp = head.next;


        while (!temp.equals(head)) {
            sb.append(temp.data);
            if (!temp.next.equals(head)) {
                sb.append(", ");
            }
            temp = temp.next;
        }

        sb.append("]");
        return sb.toString();
    }
}
