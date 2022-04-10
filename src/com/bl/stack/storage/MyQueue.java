package com.bl.stack.storage;

import com.bl.linked_list.storage.INode;
import com.bl.linked_list.storage.MyLinkedList;

public class MyQueue {
    private final MyLinkedList myLinkedList;

    public MyQueue() {
        this.myLinkedList = new MyLinkedList();
    }

    public void enQueue(INode newNode){
        myLinkedList.append(newNode);
    }

    public void deQueue(){
        myLinkedList.pop();
    }

    public INode getTop(){
        return myLinkedList.head;
    }

    public void printQueue(){
        myLinkedList.printMyNode();
    }
}
