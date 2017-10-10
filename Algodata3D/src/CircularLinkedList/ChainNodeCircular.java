/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CircularLinkedList;

/**
 *
 * @author Rofiif
 */
public class ChainNodeCircular {
    Object element;
    ChainNodeCircular next;
    
    ChainNodeCircular(){
        
    }
    ChainNodeCircular(Object Element){
        this.element = element;
    }
    public ChainNodeCircular(Object element, ChainNodeCircular next) {
        this.element = element;
        this.next = next;
    }
}
