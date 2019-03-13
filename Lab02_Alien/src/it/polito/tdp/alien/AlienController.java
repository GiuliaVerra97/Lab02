package it.polito.tdp.alien;

/**
 * Sample Skeleton for 'Alien.fxml' Controller Class
 */



import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class AlienController {
	
    @FXML
    private ResourceBundle resources;
    @FXML
    private URL location;
    @FXML
    private TextField txtWord;
    @FXML
    private TextArea txtResult;
    @FXML
    private Button btnTranslate;
    @FXML
    private Button btnReset;
           
    private AlienDictionary dizionario;
    
    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
    	assert txtWord != null : "fx:id=\"txtWord\" was not injected: check your FXML file 'Alien.fxml'.";
    	assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'Alien.fxml'.";
    	assert btnTranslate != null : "fx:id=\"bntTranslate\" was not injected: check your FXML file 'Alien.fxml'.";
    	assert btnReset != null : "fx:id=\"btnReset\" was not injected: check your FXML file 'Alien.fxml'.";
    	dizionario = new AlienDictionary();		//devo inizializzare
    }
  
    
    @FXML
    void doTranslate(ActionEvent event) {
    	    	String s=txtWord.getText().trim();
    	    	/*String pAliena=s.substring(0, s.indexOf(" ")).toLowerCase(); //posso usare anche lo split
    	    	String pTradotta=s.substring(s.indexOf(" ")+1).toLowerCase();
    	    	*/
    	    	
    	    	String pInserita[]=s.split(" ");
    	    	String pAliena=pInserita[0];
    	    	
    	    	if(!pInserita[0].matches("[a-zA-Z]+") || (pInserita.length>1 && !pInserita[1].matches("[a-zA-Z]+"))) {
    	    		txtResult.setText("Errore nel formato, i caratteri devono essere compresi tra a e z o tra A e Z");
    	    		
    	    	}else {
    	    		if(pInserita.length>1) {
    	    			dizionario.addWord(pAliena, pInserita[1]);
    	    			txtWord.clear();
    	    			btnReset.setDisable(false);
    	    		}else {
    	    			String traduzione=dizionario.traslateWord(pAliena);
    	    			
    	    			if(traduzione==null) {
    	    				txtResult.setText("La parola cercata non è presente nel dizionario");
    	    				return;
    	    			}
    	    			
    	    			txtResult.setText(traduzione);
    	    			txtWord.clear();
    	    		}
    	    	}
    	    	
    }
    
    
    @FXML
    void doReset(ActionEvent event) {
    	dizionario.reset();
    	btnReset.setDisable(true);
    }
    
}
