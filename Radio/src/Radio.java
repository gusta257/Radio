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
    private boolean am = true;
    private boolean fm = true;
    private boolean encendido = true;
    private String frecA;
    private String frecuenciaA= " ";
    private String eFrec;
    private String[] botones= new String[12];

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
    
 
    
     public void guardarEstacionActual(int pos){
        
    }
    
    public String obtenerEstacion(int pos){
        String estacion = botones[pos];
        return estacion;
    }
    
    public String mostrarEstacion(){
        String estado = obtenerEstacion(pos);
        return estado;
    }
    
    public boolean estaPrendido(){
        encendido = true;
        return encendido;
    }
    
    public String obtenerEstado(){
        String estado = "";
        if(cambioFrecuencia()== "am"){
            estado = "am";
        }
        else{
            estado = "fm";        
        }
        return estado;
    }
    public void guardar(int posicion, String frecuenciaA){
        if(posicion<11){
            botones[posicion] = frecuenciaA;
        }
        
    }
    
}
