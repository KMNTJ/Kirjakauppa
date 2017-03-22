package com.tuomasnurminen.beans;

public class Kirja {
	// title, author, year, isbn, price

	String kirjanNimi;
	String kirjoittaja;
	String isbn;
	int vuosi;
	double hinta;
	
	public Kirja(){
	}
	
	public Kirja(String kirjanNimi, String kirjoittaja, String isbn, int vuosi, double hinta){
		kirjanNimi = this.kirjanNimi;
		kirjoittaja = this.kirjoittaja;
		isbn = this.isbn;
		vuosi = this.vuosi;
		hinta = this.hinta;
	}
	
	public String getKirjanNimi() {
		return kirjanNimi;
	}
	public void setKirjanNimi(String kirjanNimi) {
		this.kirjanNimi = kirjanNimi;
	}
	public String getKirjoittaja() {
		return kirjoittaja;
	}
	public void setKirjoittaja(String kirjoittaja) {
		this.kirjoittaja = kirjoittaja;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public int getVuosi() {
		return vuosi;
	}
	public void setVuosi(int vuosi) {
		this.vuosi = vuosi;
	}
	public double getHinta() {
		return hinta;
	}
	public void setHinta(double hinta) {
		this.hinta = hinta;
	}
	
}
