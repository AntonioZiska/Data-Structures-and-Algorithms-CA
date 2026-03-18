/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package data.structures.and.algorithms.ca;

/**
 *
 * @author anton
 */
public interface LinearListInterface {

    public Object remove(int index);

    public void add(int index, Object e);

    public void add(Object e);

    public boolean isEmpty();

    public Object get(int index);

    public String printList();

    public int size();

}
