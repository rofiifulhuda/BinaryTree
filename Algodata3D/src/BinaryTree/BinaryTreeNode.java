/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BinaryTree;

/**
 *
 * @author Rofiif
 */
public class BinaryTreeNode {
    
   public Object element;
   public BinaryTreeNode leftChild; // left subtree  
   public  BinaryTreeNode rightChild; // right subtree
    
    public static void visit(BinaryTreeNode t){
        System.out.print(t.element+" ");
    }
    
    public BinaryTreeNode(){
        
    }
    public BinaryTreeNode(Object data){
        this.element = data;
               
    }
    public BinaryTreeNode(Object theElement, BinaryTreeNode theleftChild, BinaryTreeNode therightChild){
        element = theElement;
        leftChild = theleftChild;
        rightChild = therightChild;
       
    }
   
}


