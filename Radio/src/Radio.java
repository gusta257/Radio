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
    private String frecA;
    private String eFrec;

    public Radio(String am, String fm){
        this.am = am;
	this.fm = fm;
	}
public String cambioFrecuencia(){

    if(eFrec=="AM"){
        frecA="530";
    }else{
        eFrec="FM";
        frecA="87.90";
    }
    return frecA;
}

    public String frecAdelante(){
        float frecAF=Float.parseFloat(frecA);
        if(eFrec=="AM"){
            if(frecAF==1610){
                frecA="530";
            }else{
                frecAF+=10;
                frecA=frecAF+"";
                frecA = String.format("%.2f", frecAF);
            }
        }
        if(eFrec=="FM"){
            if(frecAF==107.89){
                frecA="87.90";
            }else{
                frecAF+=0.2;
                frecA=frecAF+"";
                frecA = String.format("%.2f", frecAF);
            }
        }
        return frecA;
                
    }
    
    public String frecAtras(){
         float frecAF=Float.parseFloat(frecA);
        if(eFrec=="AM"){
            if(frecAF==530){
                frecA="1610";
            }else{
                frecAF-=10;
                frecA=frecAF+"";
                frecA = String.format("%.2f", frecAF);
            }
        }
        if(eFrec=="FM"){
            if(frecAF==87.90){
                frecA="107.89";
            }else{
                frecAF-=0.2;
                frecA=frecAF+"";
                frecA = String.format("%.2f", frecAF);
            }
        }
        return frecA;
    }
    
    public boolean prender();
    
    public boolean apagar();
    
 
    
    public void guardarEstacionActual(int pos);
    
    public String obtenerEstacion(int pos);
    
    public String mostrarEstacion();
    
    public boolean estaPrendido();
    
    public String obtenerEstado();
    
}
