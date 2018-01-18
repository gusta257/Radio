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

    public String frecAdelante();
    
    public String frecAtras();
    
    public boolean prender();
    
    public boolean apagar();
    
    public String cambioFrecuencia();
    
    public void guardarEstacionActual(int pos);
    
    public String obtenerEstacion(int pos);
    
    public String mostrarEstacion();
    
    public boolean estaPrendido();
    
    public String obtenerEstado();
    
}
