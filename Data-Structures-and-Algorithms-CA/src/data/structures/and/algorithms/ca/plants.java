/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data.structures.and.algorithms.ca;

/**
 *
 * @author anton
 */
public class plants implements LinearListInterface {

    private String name;
    private int quantity;
    private String type;

    @Override
    public String toString() {
        return "plants{" + "name=" + name + ", quantity=" + quantity + ", type=" + type + '}';
    }

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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public Node getPrev() {
        return prev;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }

    public Node getCurr() {
        return curr;
    }

    public void setCurr(Node curr) {
        this.curr = curr;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public plants(String name, int quantity, String type, Node head, Node prev, Node curr, int size) {
        this.name = name;
        this.quantity = quantity;
        this.type = type;
        this.head = head;
        this.prev = prev;
        this.curr = curr;
        this.size = size;
    }
    private Node head;
    private Node prev;
    private Node curr;
    private int size;

    public plants() {
        this.head = null;
        this.prev = null;
        this.curr = null;
        this.size = 0;
    }

    @Override
    public Object remove(int index) {
        Object temp;
        if (index == 1) {
            temp = head;
            head = head.getNext();

        } else {
            temp = get(index);
            setCurrent(index);
            prev.setNext(curr.getNext());

        }
        size -= 1;
        return temp;
    }

    private void setCurrent(int index) {
        int i;
        prev = null;
        curr = head;
        for (i = 1; i < index; i++) {
            prev = curr;
            curr = curr.getNext();
        }
    }

    @Override
    public void add(int index, Object e) {
        if (index == 1) {
            Node newNode = new Node(e, head);
            head = newNode;
        } else {
            setCurrent(index);
            Node newNode = new Node(e, curr);
            prev.setNext(newNode);
        }
        size += 1;
    }

    @Override
    public void add(Object e) {
        Node newNode = new Node(e, null);
        if (head == null) {
            head = newNode;
        } else {
            setCurrent(size);
            curr.setNext(newNode);
        }
        size += 1;
    }

    //if size is 0 return true else false i.e. size == 0
    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public Object get(int index) {
        setCurrent(index);
        return curr;
    }

    @Override
    public String printList() {
        String Message = "";

        Node tempNode = head;
        while (tempNode != null) {
            Message = Message.concat(tempNode.toString());
            tempNode = tempNode.getNext();
        }
        return Message;
    }

    @Override
    public int size() {
        return size;
    }

}
