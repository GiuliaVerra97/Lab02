package it.polito.tdp.alien;

import java.util.*;

public class AlienDictionary {

	private List<Word> listaParole;
	
	public AlienDictionary() {
		this.listaParole=new LinkedList<Word>();
	}
	
	public void addWord(String alienWord, String translation) {
		
		Word parolaNuova=new Word(alienWord, translation);
		
		for(int i=0; i<listaParole.size();i++) {
			Word wLista=listaParole.get(i);
			String alienLista=wLista.getAlienWord();
			
			if(alienLista.equals(alienWord)) {		//se la parola che si vuole aggiungere nella lista è gia presente nella lista, aggiorno
				listaParole.remove(i);
				listaParole.add(parolaNuova);
			}
			
		}
		
		listaParole.add(parolaNuova);

		
	}
	
	
	public String traslateWord(String alienWord) {
		
		for(int i=0; i<listaParole.size();i++) {
			Word wLista=listaParole.get(i);
			String alienLista=wLista.getAlienWord();
			if(alienLista.equals(alienWord)) {
				return wLista.getTranslation();
			}
		}
		
		return null;
	}

	public void reset() {
		listaParole.clear();//resetta tutta la lista
		// TODO Auto-generated method stub
	}
	
}
