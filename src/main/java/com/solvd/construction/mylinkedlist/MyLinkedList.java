package com.solvd.construction.mylinkedlist;

import java.util.logging.Logger;

public class MyLinkedList {
    private LinkedListElement head;

    private static final Logger LOGGER = Logger.getLogger(String.valueOf(MyLinkedList.class));

    public MyLinkedList() {
        head = null;
    }

    public class LinkedListElement {
        public int information;
        public LinkedListElement next;

        public LinkedListElement(int information) {
            this.information = information;
            next = null;
        }
    }

    public boolean add(int information) {
        LinkedListElement first = new LinkedListElement(information);
        LinkedListElement current = head;

        if (head == null) {
            head = first;
        } else {
            while (current.next != null) {
                current = current.next;
            }
            current.next = first;
        }
        return true;
    }

    public boolean remove(int information) {
        LinkedListElement current = head;
        LinkedListElement previous = null;

        while (current.next != null) {

            if (current.information == information) {
                if (current == head) {
                    head = current.next;
                } else {
                    previous.next = current.next;
                }
            }
            previous = current;
            current = current.next;
        }
        return true;
    }

    public boolean print() {
        LinkedListElement current = head;

        if (head != null) {
            LOGGER.info(String.valueOf(head.information));
        }
        while (current.next != null) {
            current = current.next;
            LOGGER.info(String.valueOf(current.information));
        }
        return true;
    }
}
