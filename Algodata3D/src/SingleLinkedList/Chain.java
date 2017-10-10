/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SingleLinkedList;

public class Chain implements LinearList {
    // data members

    protected ChainNode firstNode;
    protected int size;

    //constructors
    public Chain(int initialCapacity) {
        // the default initial value
    }

    public Chain() {
        this(0);

    }
    //methods

    public boolean isEmpty() {
        return size == 0;
    }
    // return current number of elements in list

    public int size() {
        return size;
    }

    void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("index = " + index + " size : " + size);
        }
    }
    public Object get(int index){
        checkIndex(index);
        ChainNode currentNode = firstNode;
        for(int i = 0; i <index; i++)
            currentNode= currentNode.next;
        
        return currentNode.element;
    }
    public int indexOf(Object theElement){
        // untuk mencari chain TheElement
        ChainNode currentNode = firstNode;
        int index = 0;// index currentNode
        while(currentNode != null && !currentNode.element.equals(theElement)){
            // move to next node
            currentNode = currentNode.next;
            index++;
        }
        // make sure we found matching element
        
        if (currentNode == null)
            return -1;
        else
            return index;
    }
    public Object remove(int index){
        checkIndex(index);
        Object removedElement;
        if(index ==0)// remove first node
        {removedElement = firstNode.element;
         firstNode =firstNode.next;
        }
        else{
            ChainNode q = firstNode;
            for(int i = 0 ; i <index -1; i++)
                q = q.next;
            
            removedElement = q.next.element;
            q.next = q.next.next;
            
        }
        size --;
        return removedElement;
        
    }
    public void add(int index, Object theElement){
        if (index <0 || index >size)
            throw new IndexOutOfBoundsException("INDEX = "+index+" size = "+size);
        if (index ==0)
            firstNode = new ChainNode(theElement, firstNode);
        else{
            ChainNode p = firstNode;
            for(int i = 0; i< index -1; i++)
                p = p.next;
            
           //insert after p
           p.next = new ChainNode(theElement, p.next);
           
        }
        size++;
    }
    @Override
    public String toString(){
        StringBuffer s = new StringBuffer("[");
        //put elements into buffer
        ChainNode currentNode = firstNode;
        while(currentNode!= null){
            if (currentNode.element ==null)
            s.append("null,");
            else
                s.append(currentNode.element.toString()+", ");
            currentNode = currentNode.next;
                
        }
        if(size > 0)
            s.delete(s.length()-2,s.length()); //remove last ","
            s.append("]");
            
            //create equivalent String
            return new String(s);
            
    }
    
}
