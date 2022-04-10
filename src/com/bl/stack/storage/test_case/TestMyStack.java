package com.bl.stack.storage.test_case;

import com.bl.linked_list.storage.INode;
import com.bl.linked_list.storage.MyNode;
import com.bl.stack.storage.MyStack;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.omg.PortableInterceptor.INACTIVE;

public class TestMyStack {

    @Test
    public void given3NumbersWhenPushedToStackShouldAddedToStack() {
        MyNode<Object> myFirstNode = new MyNode<>(70);
        MyNode<Object> mySecondNode = new MyNode<>(30);
        MyNode<Object> myThirdNode = new MyNode<>(56);
        MyStack myStack = new MyStack();
        myStack.push(myFirstNode);
        myStack.push(mySecondNode);
        myStack.push(myThirdNode);
        myStack.printStack();
    }

    //UC2
    @Test
    public void given3NumbersWhenPopUntilShouldReachEmptyStackNode() {
        MyNode<Object> myFirstNode = new MyNode<>(56);
        MyNode<Object> mySecondNode = new MyNode<>(30);
        MyNode<Object> myThirdNode = new MyNode<>(70);
        MyStack myStack = new MyStack();
        myStack.push(myFirstNode);
        myStack.push(mySecondNode);
        myStack.push(myThirdNode);
        myStack.pop();
        myStack.pop();
        myStack.pop();
        myStack.printStack();
        Assertions.assertTrue(myStack.isEmpty());
    }
}
