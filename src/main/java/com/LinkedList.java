package com;

public interface LinkedList {
    boolean addAnElementInTheBeginning(int val);
    boolean addAnElementInTheEnd(int val);

    boolean addAnElementAtAGivenPosition(int val, int pos);
    boolean removeAnElementInTheBeginning();
    boolean removeAnElementInTheEnd();

    boolean removeElementAtAGivenPosition(int pos);

    String toString();

}
