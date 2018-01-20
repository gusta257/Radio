/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gustavo De Leon 17085
 * @author Luis Esturban 17256
 * Algoritmos y Estructura de Datos
 * 19/01/2018
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
    
    /**
    * @return eFrec
    */
     public String getEFrec() {
        return eFrec;
    }
    /**
    * @param eFrec the eFrec to set
    */
    public void setEFrec(String eFrec) {
        this.eFrec = eFrec;
    }
    /**
    * @return frecA
    */
    public String getFrecA(){
        return frecA;
    }
    /**
    * @param frecA the frecA to set
    */
    public void setFrecA(String frecA){
        this.frecA= frecA;
    }
    /**
    * cambia la frecuencia para poder colocarse en AM o FM
    * Si esta en AM su frecuencia cambiara a 530 y si esta en FM sera de 87.90
    * @return frecA
    */
    public String cambioFrecuencia(){
        if(eFrec=="AM"){
            frecA="530";
        }else{
            eFrec="FM";
            frecA="87.90";
        }
        return frecA;
    }
    /**
    * cambia la frecuencia para poder adelantar las estaciones
    * sube de estacion y cuando llega a la mas alta se reinicia
    * @return frecA
    */
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
    /**
    * cambia la frecuencia para poder atrazar las estaciones
    * baja de estacion y cuando llega a la mas alta se reinicia
    * @return frecA
    */
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
    /**
    *Enciende la radio y coloca la estacion por defecto
    * @return encendido
    */
    public boolean prender(){
        encendido = true;
        frecA = "87.90";
        return encendido;
    }
    /**
    * Apaga la radio y no la deja funcionar
    * @return encendido
    */
    public boolean apagar(){
        encendido = false;
        return encendido;
}
    /**
    * Guarda la estacion selecionada en su respectivo espacio
    */
     public void guardarEstacionActual(int pos){
        // System.out.println("funciona");
         botones[pos-1]=frecA;
    }
    /**
    * Busca la estacion para colocarla en la frecuencia actual
    * @return estacion
    */
    public String obtenerEstacion(int pos){
        String estacion=botones[pos-1];
        frecA = botones[pos-1];
        return estacion;
    }
    /**
    * Mira cual es la estacion actual selecionada
    * @return estado
    */
    public String mostrarEstacion(){
        String estado = this.frecA;
        return estado;
    }
    /**
    * verifica si el radio esta activo
    * @return encendido
    */
    public boolean estaPrendido(){
        encendido = true;
        return encendido;
    }
    /**
    * Verifica si la radio se encuentra en AM o FM y la muestra
    * @return estado
    */
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
}
