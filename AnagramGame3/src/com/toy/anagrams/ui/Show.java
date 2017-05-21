package com.toy.anagrams.ui;

import java.util.ArrayList;
import java.util.Scanner;

public class Show{
	static int insert = 0;
	Scanner scan = new Scanner(System.in);
	
	public void show() {
		System.out.println("Welcome to COC!");
		System.out.println("1. Daftar CLAN");
		System.out.println("2. War");
		System.out.print("Masukan Pilihan : ");
		
		insert = scan.nextInt();
		if(insert == 1) {
			System.out.println();
			nameClan();
		}
		else if(insert == 2) {
			War method = new War();
			method.Wars();
		}
		else 
			System.out.println("Pilihan tidak tersedia!");
	}
	
	public void nameClan() {
		System.out.println("Daftar Clan");
		System.out.println("1. Fakultas Teknik");
		System.out.println("2. Fakultas Keguruan dan Pendidikan");
		System.out.println("3. Fakultas Kesehatan");
		System.out.print("Masukan Pilihan : ");			
	}
}
