package com.leony.home;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class CollectionsWithModificationOrder {
    public void playWithQueues() {
        Queue<Person> queue = new LinkedList<>();

        try {
            queue.add(PersonFixtures.me);
            System.out.println("Add an element to queue via add() method. Will throw exception if queue is full");
        } catch (Exception e) {
            System.out.println("queue is full");
        }
        boolean success = queue.offer(PersonFixtures.nelly);
        System.out.println("Add an element to queue via offer() method. Will throw exception if queue is full. " + success);

        try {
            queue.remove(PersonFixtures.me);
            System.out.println("Remove an element from queue via remove() method. Will throw exception if queue is empty");
        } catch (Exception e) {
            System.out.println("queue is empty");
        }
        Person nelly = queue.poll();
        System.out.println("Remove an element from queue via poll() method. Will throw exception if queue is empty. " + nelly);

        try {
            queue.add(PersonFixtures.lisa);

            Person lisa = queue.element();
            System.out.println("Read an element without removing it from queue via element() method. Will throw exception if queue is empty");
        } catch (Exception e) {
            System.out.println("queue is empty");
        }
        Person lisa = queue.peek();
        System.out.println("Read an element from queue without removing it via peek() method. Will throw exception if queue is empty. " + lisa);
    }

    public void playWithDeques() {
        Deque<Person> deque = new ArrayDeque<>();

        try {
            deque.addFirst(PersonFixtures.me);
            deque.addFirst(PersonFixtures.lisa);
            System.out.println("Add first and last elements to queue via addFirst() and addLast() methods. Will throw exception if queue is full");
        } catch (Exception e) {
            System.out.println("queue is full");
        }
        boolean successFirst = deque.offerFirst(PersonFixtures.nelly);
        boolean successLast = deque.offerLast(PersonFixtures.nelly);
        System.out.println("Add first and last elements to queue via offerFirst() and offerLast() methods. Will throw exception if queue is full"
                + successFirst + " " + successLast);

        try {
            deque.removeFirst();
            deque.removeLast();
            System.out.println("Remove first and last elements from queue via removeFirst() and removeLast() methods. Will throw exception if queue is empty");
        } catch (Exception e) {
            System.out.println("queue is empty");
        }
        Person removedFirst = deque.pollFirst();
        Person removedLast = deque.pollLast();
        System.out.println("Remove first and last elements from queue via offerFirst() and offerLast() methods. Will throw exception if queue is empty"
                + removedFirst + " " + removedLast);

        try {
            deque.addFirst(PersonFixtures.me);
            deque.addLast(PersonFixtures.nelly);

            deque.getFirst();
            deque.getLast();
            System.out.println("Get first and last without removing elements from queue via getFirst() and getLast() methods. Will throw exception if queue is empty");
        } catch (Exception e) {
            System.out.println("queue is empty");
        }
        Person getFirst = deque.peekFirst();
        Person getLast = deque.peekLast();
        System.out.println("Get first and last without removing elements from queue via peekFirst() and peekLast() methods. Will throw exception if queue is empty"
                + getFirst + " " + getLast);

        // stack behavior
        deque.push(PersonFixtures.mom);
        Person poppedPerson = deque.pop();
        System.out.println("Use push() and pop() deque stack methods " + poppedPerson);
        System.out.println("-= TDD =- run the CalculatorWithStackTest");
    }
}
