/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SingleLinkedList;

import Algodat3D.LinearList;

public class ChainNode {
    
    // package visible data members
    
    Object element;
    ChainNode next;
    
    // package visible constructors
    
    ChainNode(){
        
    }
    ChainNode(Object element){
        this.element = element;
        
    }
    
    ChainNode(Object element, ChainNode next){
        this.element = element;
        this.next    = next;
    }
   
}
