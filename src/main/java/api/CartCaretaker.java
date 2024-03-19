package api;

import java.util.*;

public class CartCaretaker {
    private Stack<CartMemento> history = new Stack<>();

    public void save(Cart cart){
        history.push(cart.save());
    }

    public void undo(Cart cart){
        if(!history.isEmpty()){
            cart.undo(history.pop());
        }
        else{
            System.out.println("The cart is already empty!!!");
        }
    }
}
