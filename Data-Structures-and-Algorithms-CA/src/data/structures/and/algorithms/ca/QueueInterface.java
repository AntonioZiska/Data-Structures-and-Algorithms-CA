/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package data.structures.and.algorithms.ca;

/**
 *
 * @author anton
 */
public interface QueueInterface {

    public Object dequeue();

    public void enqueue(Object newItem);

    public Object front();

    public boolean isEmpty();

    public int size();
}
