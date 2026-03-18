/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data.structures.and.algorithms.ca;

/**
 *
 * @author anton
 */
public class trash {

    private String name;
    private int quantity;
    private int value;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "trash{" + "name=" + name + ", quantity=" + quantity + ", value=" + value + '}';
    }

    public trash(String name, int quantity, int value) {
        this.name = name;
        this.quantity = quantity;
        this.value = value;
    }

}
