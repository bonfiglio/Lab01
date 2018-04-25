package it.polito.tdp.parole;

/**
 * Sample Skeleton for 'Parole.fxml' Controller Class
 */


import it.polito.tdp.parole.model.Parole;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import java.util.*;
public class ParoleController {
	
	Parole elenco = new Parole();
	List <String> tempi = new ArrayList<String>();

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="txtParola"
    private TextField txtParola; // Value injected by FXMLLoader

    @FXML // fx:id="txtResult"
    private TextArea txtResult; // Value injected by FXMLLoader
    
    @FXML
    private Button btnReset;

    @FXML // fx:id="btnInserisci"
    private Button btnInserisci; // Value injected by FXMLLoader
    
    @FXML
    private Button btnCanc;
    @FXML
    private TextArea txtTime;


    @FXML
    void doInsert(ActionEvent event) {
    	// TODO
    	
    	double start = System.nanoTime();
    	String p = txtParola.getText();
    	
    	String result = "";
    	String tms = "";
    	elenco.addParola(p);
    	txtParola.clear();
    	double finish = System.nanoTime();
    	for(String s : elenco.getElenco()) {
    		result +=s +"\n";
    	}
    	txtResult.setText(result);
    	
    	tempi.add("aggiunta:"+(finish-start));
    	txtTime.clear();
    	for(String d: tempi) {
    		tms +=  d+"\n";
    	}
    	
    	txtTime.setText(tms);
    }
    
    @FXML
    void doReset(ActionEvent event) {
    	// TODO
    	
    	String tms = "";
    	double start = System.nanoTime();
    	txtResult.clear();
    	double finish = System.nanoTime();
    	
    	tempi.add("reset:"+(finish-start));
    	txtTime.clear();
    	
    	for(String d: tempi) {
    		tms += d+"\n";
    	}
    	txtTime.setText(tms);
    }
    
    @FXML
    void handleCanc(ActionEvent event) {
    	
    	String tms = "";
    	double start = System.nanoTime();
    	elenco.cancella(txtResult.selectedTextProperty().get());
    	double finish = System.nanoTime();
    	
    	String result ="";
    	for(String s : elenco.getElenco()) {
    		result += s +"\n";
    	}
    	txtResult.setText(result);
    	
    	tempi.add("cancella:"+(finish-start));
    	txtTime.clear();
    	for(String d: tempi) {
    		tms +=  d+"\n";
    	}
    	
    	txtTime.setText(tms);
    	
    	
    }
    

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert txtParola != null : "fx:id=\"txtParola\" was not injected: check your FXML file 'Parole.fxml'.";
        assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'Parole.fxml'.";
        assert btnInserisci != null : "fx:id=\"btnInserisci\" was not injected: check your FXML file 'Parole.fxml'.";
        assert btnCanc != null : "fx:id=\"btnCanc\" was not injected: check your FXML file 'Parole.fxml'.";
        assert txtTime != null : "fx:id=\"txtTime\" was not injected: check your FXML file 'Parole.fxml'.";
        
        elenco = new Parole() ;
        
    }
}
