/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gustavo De Leon 17085
 * @author Luis Esturban 17256
 */
public class Radio implements RadioI {
    private boolean am = true;
    private boolean fm = true;
    private boolean encendido = true;
    private String frecA;
    private String frecuenciaA= " ";
    private String eFrec;
    private String[] botones= new String[12];
    private int pos =0;
    
     public String getEFrec() {
        return eFrec;
    }

    public void setEFrec(String eFrec) {
        this.eFrec = eFrec;
    }

public String cambioFrecuencia(){//hola

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
        }else{
            if(eFrec=="FM"){
                System.out.println(frecAF);
                if(frecAF>=107.90){
                    frecA="87.90";
                }else{    
                    frecAF+=0.2;
                    frecA=frecAF+"";
                    frecA = String.format("%.2f", frecAF);
                }
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
            if(frecAF<=88.10){
                frecA="107.89";
            }else{
                frecAF-=0.2;
                frecA=frecAF+"";
                frecA = String.format("%.2f", frecAF);
            }
        }
        return frecA;
    }
    
    public boolean prender(){
        encendido = true;
        frecA = "87.90";
        return encendido;
    }
    
    public boolean apagar(){
        encendido = false;
        return encendido;
}
 
    
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
