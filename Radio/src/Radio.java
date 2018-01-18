/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gustavo
 */
public class Radio implements RadioI {
    private String am;
    private String fm;

    public Radio(String am, String fm){
        this.am = am;
	this.fm = fm;
	}

    public void frecAdelante(){
	      System.out.println("...");
	}

    public void frecAtras(){
	      System.out.println("...");
	}

    public void prender(){
	      System.out.println("...");
	}

    public void apagar(){
	      System.out.println("...");
	}

    public void cambioFrecuencia(){
	      System.out.println("...");
	}

    public void guardarFrecAm(){
	      System.out.println("...");
	}

    public void guardarFrecFm(){
	      System.out.println("...");
	}

    public void mostrarEstacion(){
	      System.out.println("...");
	}
    
}
