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
public class EmpleadoAsalariado extends Empleado {
      
    
    private double salarioSemanal;
    
    //Constructor
    public EmpleadoAsalariado( String nombre, String apellido, String nss, double salario){
        super (nombre,apellido,nss);
        setSalarioSemanal(salario);
    }


    public void setSalarioSemanal(double salario) {
        if(salario >=0.0)
            salarioSemanal=salario;
        else
            throw new IllegalArgumentException("El salario semanal debe ser >=0.0");
    }
    //devuelve el salario;
    public double getSalarioSemanal(){
        return salarioSemanal;
    }
    
    //Calcula los ingresos; sobreescribe el metodo abstracto 
    @Override
    public double ingresos()
    {
    return getSalarioSemanal();
    }
    
    //devuelve representacion String de un objeti¡o
    
    @Override
    public String toString()
    {
        return String.format("empleadoasalariado: %s\n%s: $%,.2f",super.toString(), "salario semanal ",getSalarioSemanal() );
    }
          

   
}
