package com.bl.stack.storage;

import com.bl.linked_list.storage.INode;
import com.bl.linked_list.storage.MyLinkedList;

public class MyStack {
    private MyLinkedList myLinkedList;

    public MyStack(){
        this.myLinkedList = new MyLinkedList();
    }

    public void push(INode newNode){
        myLinkedList.add(newNode);
    }

    public void printStack() {
        myLinkedList.printMyNode();
    }
}
