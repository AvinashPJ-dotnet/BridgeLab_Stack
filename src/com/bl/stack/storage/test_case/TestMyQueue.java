package com.bl.stack.storage.test_case;

import com.bl.linked_list.storage.INode;
import com.bl.linked_list.storage.MyNode;
import com.bl.stack.storage.MyQueue;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestMyQueue {
    //UC3
    @Test
    public void given3NumberWhenPushedInQueueShouldPass(){
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        MyQueue myQueue = new MyQueue();
        myQueue.enQueue(myFirstNode);
        myQueue.enQueue(mySecondNode);
        myQueue.enQueue(myThirdNode);
        myQueue.printQueue();
        INode topNode=myQueue.getTop();
        boolean result= topNode == myFirstNode;
        Assertions.assertTrue(result);
    }

    //UC4
    @Test
    public void given3NumberWhenDeletedLastElementShouldPassTheResult(){
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        MyQueue myQueue = new MyQueue();
        myQueue.enQueue(myFirstNode);
        myQueue.enQueue(mySecondNode);
        myQueue.enQueue(myThirdNode);
        myQueue.printQueue();

        myQueue.deQueue();
        myQueue.printQueue();
        INode topNode=myQueue.getTop();
        boolean result= topNode == mySecondNode;
        Assertions.assertTrue(result);
    }
}
