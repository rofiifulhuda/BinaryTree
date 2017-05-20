package com.toy.anagrams.ui;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class Driver {

	public static <T> void main(String []sembarangwes) {
	    ArrayList<Coc> FT = new ArrayList<Coc>();
		FT.add(new Coc("1","Rudi","Guild Master","11","202"));
		FT.add(new Coc("2","Amin","Staff","10","100"));
		FT.add(new Coc("3","Irhaz","Staff","12","100"));
		FT.add(new Coc("4","Gilang","Member","12","101"));
		FT.add(new Coc("5","Aris","Member","12","99"));
		FT.add(new Coc("6","Mino","Member","12","88"));
		FT.add(new Coc("7","Farid","Staff","12","100"));
		FT.add(new Coc("8","Rofif","Member","12","101"));
		FT.add(new Coc("9","Koko","Member","12","99"));
		FT.add(new Coc("10","Keke","Member","10","80"));
		
		ArrayList<Coc> FKIP = new ArrayList<Coc>();
		FKIP.add(new Coc("1","Rudi","Guild Master","11","202"));
		FKIP.add(new Coc("2","Amin","Staff","10","100"));
		FKIP.add(new Coc("3","Irhaz","Staff","12","100"));
		FKIP.add(new Coc("4","Gilang","Member","12","101"));
		FKIP.add(new Coc("5","Aris","Member","12","99"));
		FKIP.add(new Coc("6","Mino","Member","12","88"));
		FKIP.add(new Coc("7","Farid","Staff","12","100"));
		FKIP.add(new Coc("8","Rofif","Member","12","101"));
		FKIP.add(new Coc("9","Koko","Member","12","99"));
		FKIP.add(new Coc("10","Keke","Member","10","80"));
		
		ArrayList<Coc> FIKES = new ArrayList<Coc>();
		FIKES.add(new Coc("1","Rudi","Guild Master","11","202"));
		FIKES.add(new Coc("2","Amin","Staff","10","100"));
		FIKES.add(new Coc("3","Irhaz","Staff","12","100"));
		FIKES.add(new Coc("4","Gilang","Member","12","101"));
		FIKES.add(new Coc("5","Aris","Member","12","99"));
		FIKES.add(new Coc("6","Mino","Member","12","88"));
		FIKES.add(new Coc("7","Farid","Staff","12","100"));
		FIKES.add(new Coc("8","Rofif","Member","12","101"));
		FIKES.add(new Coc("9","Koko","Member","12","99"));
		FIKES.add(new Coc("10","Keke","Member","10","80"));

		
		for(Coc c:FT){
			System.out.println(c.getNama());
		
                Stack<ArrayList> Clan = new Stack<ArrayList>();
		for(Coc d: FT)
			System.out.println("Nomor    : "+c.getNomor()+
							   " Nama    : "+c.getNama()+
							   " Ranking : "+c.getRank()+
							   " Level   : "+c.getLevel()+
							   " Score   : "+c.getScore());
		
		
		}
	
	}

}

