package BinaryTree;

import java.lang.reflect.InvocationTargetException;

public class Driver_Linked
{
    public static void main(String[] args) throws InvocationTargetException {
        LinkedBinaryTree at = new LinkedBinaryTree();
        at.root = new BinaryTreeNode(1);
        at.root.leftChild = new BinaryTreeNode(2);
        at.root.rightChild = new BinaryTreeNode(3);
        
        System.out.println("");
        System.out.println();
        LinkedBinaryTree atb = new LinkedBinaryTree();
        atb.root = new BinaryTreeNode(1);
        atb.root.leftChild = new BinaryTreeNode(2);
        atb.root.rightChild = new BinaryTreeNode(3);
        System.out.println("\nPre order : ");
        atb.preOrderOutput();
        System.out.println("\nIn order : ");
        atb.inOrderOutput();
        System.out.println("\nPost order : ");
        atb.postOrderOutput();
 
       
        
        System.out.println();
        System.out.print("Setelah Clone ");
        LinkedBinaryTree atbb = (LinkedBinaryTree) atb.clone();
        System.out.println("\nPre order : ");
        atbb.preOrderOutput();
        System.out.println("\nIn order : ");
        atbb.inOrderOutput();
        System.out.println("\nPost order : ");
        atbb.postOrderOutput();
        
        System.out.println("Setelah di Swap ");
        atbb.swapSubtrees(atbb.root);
        System.out.println("\nPre order : ");
        atbb.preOrderOutput();
        System.out.println("\nIn order : ");
        atbb.inOrderOutput();
        System.out.println("\nPost order : ");
        atbb.postOrderOutput();
    }
}