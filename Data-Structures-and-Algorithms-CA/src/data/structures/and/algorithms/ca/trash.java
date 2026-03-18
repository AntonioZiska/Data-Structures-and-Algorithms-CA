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
public class trash implements StackInterface {

    private final ArrayList<String> stack;

    public trash(ArrayList stack) {
        this.stack = stack;
    }

    @Override
    public Object pop() {
        if (!(stack.isEmpty())) {
            return stack.remove(0);
        } else {
            return null;
        }
    }

    @Override
    public void emptyStack() {
        while (!stack.isEmpty()) {
            pop();
        }
    }

    @Override
    public String displayStack() {
        int iCount;
        String Message = "";
        if (stack.isEmpty()) {
            Message = Message.concat("The stack is empty, there is nothing to display.");
        } else {
            Message = "The stack contains: ";
            for (iCount = 0; iCount < stack.size(); iCount++) {
                Message = Message.concat(stack.get(iCount) + ", ");
            }
        }
        return Message;
    }

    @Override
    public void push(Object newelement) {
        stack.add(0, (String) newelement);
    }

    @Override
    public Object peek() {
        if (!(stack.isEmpty())) {
            return stack.get(0);
        } else {
            return null;
        }
    }

    @Override
    public int size() {
        return stack.size();
    }

    @Override
    public boolean isEmpty() {
        return stack.isEmpty();
    }

}
