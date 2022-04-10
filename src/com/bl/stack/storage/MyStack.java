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

    public INode peak(){
        return myLinkedList.head;
    }

    public INode pop(){
        return myLinkedList.pop();
    }

    public void printStack() {
        myLinkedList.printMyNode();
    }

    public boolean isEmpty(){
        return myLinkedList.isEmpty();
    }
}
