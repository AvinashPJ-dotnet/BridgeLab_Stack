package com.bl.stack.storage.test_case;

import com.bl.linked_list.storage.MyNode;
import com.bl.stack.storage.MyStack;
import org.junit.jupiter.api.Test;

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
}
