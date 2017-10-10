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
public class ChainDouble {
     protected ChainNodeDouble firstNode;
    protected int size;
    
    public ChainDouble(int initialcapacity){
        
    }
    public ChainDouble(){
        this(0);
    }
    
    
    
    public boolean isEmpty() {
        return size == 0;
    }

    
    public int size() {
        return size;
    }

    public void checkIndex(int index){
        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException(
            "index = "+ index + " size = "+size);
        }
    }
    
    
    public Object get(int index) {
        checkIndex(index);
        
        ChainNodeDouble currentNode = firstNode;
        for(int i = 0; i < index; i++){
            currentNode = currentNode.next;
        }
        return currentNode.element;
    }

   
    public int indexOf(Object theElement) {
        ChainNodeDouble currentNode = firstNode;
        int index = 0;
        while(currentNode != null && !currentNode.element.equals(theElement)){
            currentNode = currentNode.next;
            index++;
        }
        if(currentNode == null){
            return -1;
        }
        else{
            return index;
        }
    }

    
    public Object remove(int index) {
        checkIndex(index);
        Object removedElement, removedElement2;
        if(index == 0){
            removedElement = firstNode.element;
            firstNode = firstNode.next;
        }
        else{
            ChainNodeDouble q = firstNode;
            ChainNodeDouble r = firstNode;
            for(int i = 0; i<index-1; i++){
                q = q.next;
            }
            removedElement = q.next.element;
            removedElement2 = r.prev.element;
            q.next = q.next.next;
            r.prev = r.prev.prev;
        }
        size--;
        return removedElement;
    }

   
    public void add(int index, Object theElement) {
        if (index < 0 ||index > size){
            throw new IndexOutOfBoundsException("index = "+ index+" size = "+size);
        }
        if(index == 0){
            ChainNodeDouble a = firstNode;
            firstNode = new ChainNodeDouble(theElement, firstNode, null);
            firstNode.prev = a;
        }
        else{
            ChainNodeDouble p = firstNode;
            ChainNodeDouble q = firstNode;
            for(int i = 0; i<index-2;i++){
                q = q.next;
            }
            for(int i = 0; i < index - 1; i++){
                p = p.next;
            }
            p.prev = q;
            p.next = new ChainNodeDouble(theElement, p.next, p.prev);
        }
        
        size++;
    }
    
    @Override
    public String toString(){
        StringBuffer s = new StringBuffer("[");
         
        ChainNodeDouble currentNode = firstNode;
        while(currentNode != null){
            if(currentNode.element == null){
                s.append("null, ");
            }
            else{
                s.append(currentNode.element.toString()+", ");
            }
            currentNode = currentNode.next;
        }
        if(size>0){
            s.delete(s.length() - 2, s.length());
        }
        s.append("]");
        
        return new String(s);
    }
    
   
    public void clear(){
        firstNode = null;
        size = 0;
    }
}

