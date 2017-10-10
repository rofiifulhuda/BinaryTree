/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DoubleLinkedList;

/**
 *
 * @author Rofiif
 */
public class ChainNodeDouble {
    
    Object element;
    ChainNodeDouble next, prev;
    
    ChainNodeDouble(){
        
    }
    ChainNodeDouble(Object Element){
        this.element = element;
    }
    public ChainNodeDouble(Object element, ChainNodeDouble next, ChainNodeDouble prev) {
        this.element = element;
        this.next = next;
        this.prev = prev;
    }
}


