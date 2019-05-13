/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concursos;

import java.util.ArrayList;


public class concurso {
    
    private String nombre;
    private  int numero;
    private  int Tiempo;
    private ArrayList<String> Conjunto;
    private ArrayList<String> Soluciones;
    private ArrayList<String> Envios;
    private boolean Iniciado=false;

    public concurso(String nombre, int numero, int Tiempo) {
        this.nombre = nombre;
        this.numero = numero;
        this.Tiempo = Tiempo;
        this.Conjunto = new ArrayList<>();
        this.Soluciones = new ArrayList<>();
        this.Envios = new ArrayList<>();
    }
    
    public void AñadirEquipos(String... nombre){
        this.Conjunto.add(nombre);
    }
    
    public boolean EliminarEquipo(String nombre){
        boolean pudo=false;
        for(String to: conjunto){
            if(nombre==Conjunto.get(to)){
            this.Conjunto.remove(to);
            pudo=true;
            }
        }
        return pudo;
    }
    
    
    public void soluciones(String... solucion){
        for(int i=0; i<numero; i++){
            Soluciones.add("solucion");
            
        }
    }

    public boolean ConsultarSolucion(){
        if(Soluciones == null || Soluciones.size() == 0){
                return false;
            }else{
                return true;
            } 
    }
    
   public boolean iniciar(){
       if(ConsultarSolucion()==true){
       Iniciado=true;
       }
       
       
       return false;
   }
    
    
    public String getNombre() {
        return nombre;
    }
    public int getNumero() {
        return numero;
    }
    public int getTiempo() {
        return Tiempo;
    }
    public ArrayList<String> getConjunto() {
        return Conjunto;
    }
    public ArrayList<String> getSoluciones() {
        return Soluciones;
    }
    public ArrayList<String> getEnvios() {
        return Envios;
    }
    public boolean isIniciado() {
        return Iniciado;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
