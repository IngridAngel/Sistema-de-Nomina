/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author jany-yin
 */
public  abstract class Empleado {
    
    private String primerNombre;
    private String apellidoPaterno;
    private String numeroSeguroSocial;
    
    //Constructor ·con tres argumentos
    //nss ---> numero de seguro social
    public Empleado(String nombre, String apellido, String nss){
      primerNombre= nombre;
      apellidoPaterno=apellido;
      numeroSeguroSocial= nss;
    }
    
    //setter establecer el primer nombre
    public void setPrimerNombre(String nombre){
        primerNombre= nombre; //deberia validar
    }
    //getters devuele el primer nombre
    public String getPrimerNombre(){
        return primerNombre;
    }
     //setter establecer el apellidoPaterno
    public void setApellidoPaterno(String apellido){
        apellidoPaterno= apellido; //deberia validar
    }
    //getters devuele el apellidoPaterno
    public String getApellidoPaterno(){
        return apellidoPaterno;
    }   
    public void setNumeroSeguroSocial(String nss){
        numeroSeguroSocial= nss; //deberia validar
    }
    //getters devuele el apellidoPaterno
    public String getNumeroSeguroSocial(){
       return numeroSeguroSocial;
    }    
    //Devuelve representacion String de un objeto empleado
    @Override
    public String toString()
    {
        return String.format("%s %s\nnumero de seguro social: %s",
        getPrimerNombre(), getApellidoPaterno(), getNumeroSeguroSocial() );
    }
    
    //metodo abstracto sobreescrito por las subclases concretas
    public abstract double ingresos();
    
    
}
