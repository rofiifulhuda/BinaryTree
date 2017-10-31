/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BinaryTree;

import java.util.Scanner;

/**
 *
 * @author Rofiif
 */
public class Driver_BinaryTree {
     public static void main(String[] args)
    {            
        Scanner scan = new Scanner(System.in);
        /* Creating object of BT */
        BinaryTreeTrav bt = new BinaryTreeTrav(); 
        /*  Perform tree operations  */
        System.out.println("Binary Tree Test\n");    
        bt.insert(0);
        bt.insert(1);
        bt.insert(2);
        bt.postOrder();
        System.out.println();
        BinaryTreeTrav ba = (BinaryTreeTrav) bt.clone(); 
        ba.postOrder();
        
    }
}