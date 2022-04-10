package com.bl.linked_list.storage;

public class MyLinkedList {
    public INode head;
    public INode tail;

    public MyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void add(INode newNode) {
        if (this.tail == null)
            this.tail = newNode;
        if (this.head == null)
            this.head = newNode;
        else {
            INode tempNode = this.head;
            this.head = newNode;
            this.head.setNext(tempNode);
        }
    }

    public void append(INode newNode) {
        if (head == null)
            head = newNode;
        if (tail == null)
            tail = newNode;
        else {
            tail.setNext(newNode);
            tail = newNode;
        }
    }

    public void insert(INode myNode, INode newNode) {
        INode tempNode = myNode.getNext();
        myNode.setNext(newNode);
        newNode.setNext(tempNode);
    }

    public void addSortedList(INode newNode) {
        INode current;

        if (head == null) {
            newNode.setNext(null);
            head = newNode;
            return;
        }
        if (head.getKey().toString().compareTo(newNode.getKey().toString()) >= 0) {
            newNode.setNext(head);
            head = newNode;
        } else {
            current = head;
            while (current.getNext() != null && current.getNext().getKey().toString().compareTo(newNode.getKey().toString()) <= 0) {
                current = current.getNext();
            }
            newNode.setNext(current.getNext());
            current.setNext(newNode);
            tail=newNode;
        }
    }

    public INode pop() {
        INode tempNode = head;
        head = head.getNext();
        return tempNode;
    }

    public INode popLast() {
        INode tempNode = head;
        while (!tempNode.getNext().equals(tail)) {
            tempNode = tempNode.getNext();
        }
        this.tail = tempNode;
        return tail;
    }

    public void remove(INode removeNode) {
        INode tempNode = head, prev = null;

        if (tempNode != null && tempNode == removeNode) {
            head = tempNode.getNext(); // Changed head
            return;
        }

        while (tempNode != null && tempNode != removeNode) {
            prev = tempNode;
            tempNode = tempNode.getNext();
        }
        if (tempNode == null)
            return;
        if (tempNode.getNext() == null && tempNode == removeNode) {
            prev.setNext(null);
            tail = prev; // Changed tail
            return;
        }
        prev.setNext(tempNode.getNext());
    }

    public int search(INode searchNode) {
        INode tempNode = head;
        int countPosition = 0;
        while (tempNode != null) {
            if (tempNode == searchNode)
                return countPosition;
            tempNode = tempNode.getNext();
            countPosition++;
        }
        return -1;
    }

    public int size() {
        INode temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.getNext();
        }
        return count;
    }

    public void printMyNode() {
        StringBuffer myNode = new StringBuffer("My Node: ");
        INode tempNode = head;
        while (tempNode.getNext() != null) {
            myNode.append(tempNode.getKey());
            if (!tempNode.equals(tail))
                myNode.append("->");
            tempNode = tempNode.getNext();
        }
        myNode.append(tempNode.getKey());
        System.out.println(myNode);
    }
}
