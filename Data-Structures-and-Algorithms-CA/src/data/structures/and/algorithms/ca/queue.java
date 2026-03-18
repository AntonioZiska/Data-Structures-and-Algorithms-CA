/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data.structures.and.algorithms.ca;

import java.util.*;

/**
 *
 * @author anton
 */
public class queue implements QueueInterface {

    private final ArrayList<event> event;

    public queue() {
        event = new ArrayList<>();
    }

    @Override
    public Object dequeue() {
        if (!event.isEmpty()) {
            return event.remove(0);
        } else {
            return null;
        }
    }

    @Override
    public void enqueue(Object newEvent) {
        event.add((event) newEvent);
    }

    @Override
    public Object front() {
        if (!event.isEmpty()) {
            return event.get(0);
        } else {
            return null;
        }
    }

    @Override
    public boolean isEmpty() {
        return event.isEmpty();
    }

    @Override
    public int size() {
        return event.size();
    }

}
