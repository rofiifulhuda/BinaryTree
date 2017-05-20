package com.toy.anagrams.ui;

public class Coc{
	private String nama;
	private String rank;
	private String level;
	private String score;
	private String nomor;
	
	public Coc(String Nomor,String Nama, String Rank, String Level, String Score){
		this.setNomor(Nomor);
		this.setNama(Nama);
		this.setRank(Rank);
		this.setLevel(Level);
		this.setScore(Score);
		}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public String getScore() {
		return score;
	}

	public void setScore(String score) {
		this.score = score;
	}
	public String getNomor() {
		return nomor;
	}

	public void setNomor(String nomor) {
		this.nomor = nomor;
	}
	
}


