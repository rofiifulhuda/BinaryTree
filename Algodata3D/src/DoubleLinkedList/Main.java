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
public class Main {
    public static void main(String[] args) {
        ChainDouble c = new ChainDouble();
        System.out.println("Apakah kosong?\t\t\t\t"+c.isEmpty());
        c.add(0, 0);
        c.add(1, 1);
        c.add(2, 2);
        c.add(3, 3);
        c.add(0, 5);
        c.add(4, 4);
        c.add(5, 6);
        System.out.println("isi elemen \t\t"+c.toString());
        System.out.println("Element di index 4 =\t\t\t"+c.get(4));
        System.out.println("Index dari elemen E = \t\t\t"+c.indexOf(3));
        c.remove(0);
        System.out.println("isi elemen setelah index 0 di hapus = \t"+c.toString());
        c.clear();
        System.out.println("isi elemen setelah di clear =\t\t"+c.toString());
    }
}
    

