package com.solvd.construction.mylinkedlist;

public class LinkedListElement<T> {
    private T current;
    private LinkedListElement previous;
    private LinkedListElement next;
    private LinkedListElement first;
    private LinkedListElement last;

    public LinkedListElement(T current) {
        this.current = current;
    }

    public T getValue() {
        return current;
    }

    public LinkedListElement getNext() {
        return next;
    }

    public void setNext(LinkedListElement next) {
        this.next = next;
    }

    public LinkedListElement getPrevious() {
        return previous;
    }

    public void setPrevious(LinkedListElement previous) {
        this.previous = previous;
    }

    public LinkedListElement getFirst() {
        return first;
    }

    public void setFirst(LinkedListElement first) {
        this.first = first;
    }

    public LinkedListElement getLast() {
        return last;
    }

    public void setLast(LinkedListElement last) {
        this.last = last;
    }
}

