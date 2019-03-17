package it.polito.tdp.alien;

import java.util.*;

public class AlienDictionary {

	private List<WordEnhanced> listaParole;
	
	public AlienDictionary() {
		this.listaParole=new LinkedList<WordEnhanced>();
	}
	
	public void addWord(String alienWord, String translation) {
		
			for(int i=0; i<listaParole.size();i++) {
				if(listaParole.get(i).getAlienWord().equals(alienWord)) {
					if(listaParole.get(i).elencoTraduzioni().contains(translation)) {
						return;
					}else {
						listaParole.get(i).aggiungiTraduzione(translation);
						return;
					}
				}
			}
			
			WordEnhanced nuovaParola=new WordEnhanced(alienWord);
			nuovaParola.aggiungiTraduzione(translation);
			listaParole.add(nuovaParola);
	}
	
	
	public List<String> traslateWord(String alienWord) {
		
		for(int i=0; i<listaParole.size();i++) {
			WordEnhanced wLista=listaParole.get(i);
			String alienLista=wLista.getAlienWord();
			if(alienLista.equals(alienWord)) {
				return wLista.elencoTraduzioni();
			}
		}
		
		return null;
	}

	public void reset() {
		listaParole.clear();//resetta tutta la lista
	}
	
}
