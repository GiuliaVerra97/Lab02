package it.polito.tdp.alien;

import java.util.*;

public class WordEnhanced {

	private String  alienWord;
	//private String translation;
	private List<String> listaTraduzioni;
	
	public WordEnhanced(String alienWord) {
		super();
		this.alienWord = alienWord;
		//this.translation = translation;
		this.listaTraduzioni=new LinkedList<String>();
	}
	
	
	public String getAlienWord() {
		return alienWord;
	}

/*
	public String getTranslation() {
		return translation;
	}


	public void setTraslation(String traslation) {
		this.translation=traslation;
	}*/
	
	
	public void aggiungiTraduzione(String traduzione) {
		if(listaTraduzioni.contains(traduzione)) {
			return;
		}else {
			listaTraduzioni.add(traduzione);
		}
	}
	
	public List<String> elencoTraduzioni(){
		return listaTraduzioni;
	}

	/*@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((alienWord == null) ? 0 : alienWord.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Word other = (Word) obj;
		if (alienWord == null) {
			if (other.alienWord != null)
				return false;
		} else if (!alienWord.equals(other.alienWord))
			return false;
		return true;
	}*/
	
	




	/*public boolean equals() {
		
	}*/
	
	
	
	
	
}
