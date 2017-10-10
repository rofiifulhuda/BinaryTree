/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SingleLinkedList;

/**
 *
 * @author Rofiif
 */
public class Main {
    public static void main(String[] args) {
         Chain c = new Chain();
        c.add(0, 1);
        c.add(1, 2);
        c.add(2, 3);
        System.out.println(c.toString());
        c.remove(1);
        System.out.println(c.toString());
    }
    }
